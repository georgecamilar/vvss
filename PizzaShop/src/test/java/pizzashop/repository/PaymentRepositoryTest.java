package pizzashop.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pizzashop.model.Payment;

import static pizzashop.model.PaymentType.Cash;

public class PaymentRepositoryTest {

    private static PaymentRepository repository;

    @BeforeAll
    static void initialize() {
        repository = new PaymentRepository();
    }

    @Test
    void testGetAll() {
        Assertions.assertNotEquals(repository.getAll(), null);
        Assertions.assertNotEquals(repository.getAll().size(), 0);
    }

    @Test
    void addPayment() {
        Integer initialSize = repository.getAll().size();
        Payment payment = new Payment(4, Cash, 15d);
        repository.add(payment);
        Assertions.assertNotEquals(repository.getAll().size(), initialSize);
        Assertions.assertEquals(repository.getAll().get(repository.getAll().size() - 1), payment);
    }

}
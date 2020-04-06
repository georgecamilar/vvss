package pizzashop.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {

    Payment payment;

    @BeforeEach
    void initialize() {
        payment = new Payment(1, PaymentType.Card, 20.5);
    }

    @Test
    void getTableNumber() {
        assertEquals(1, payment.getTableNumber());
    }

    @Test
    void setTableNumber() {
        assertEquals(1, payment.getTableNumber());
        payment.setTableNumber(2);
        assertEquals(2, payment.getTableNumber());
    }

    @Test
    void getType() {
        assertEquals(PaymentType.Card, payment.getType());
    }

    @Test
    void setType() {
        assertEquals(PaymentType.Card, payment.getType());
        payment.setType(PaymentType.Cash);
        assertEquals(PaymentType.Cash , payment.getType());
    }

    @Test
    void getAmount() {
        assertEquals(20.5, payment.getAmount());
    }

    @Test
    void setAmount() {
        assertEquals(20.5, payment.getAmount());
        payment.setAmount(30.0);
        assertEquals(30d, payment.getAmount());
    }

    @Test
    void testToString() {
        assert(true);
    }
}
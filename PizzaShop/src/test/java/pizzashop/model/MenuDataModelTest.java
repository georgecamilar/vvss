package pizzashop.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class MenuDataModelTest {
    private MenuDataModel testObj = new MenuDataModel("testItem", 10, 15.00);

    @Test
    public void testGetMenyItem() {
        assertEquals(testObj.getMenuItem(), "testItem");
    }

    @Test
    public void testGetQuantity() {
        assertEquals((int)testObj.getQuantity(), 10);
    }

    @Test
    public void testGetPrice() {
        assertEquals((Object)testObj.getPrice(), 15.00);
    }

    @Test
    public void testSetMenuItem() {
        testObj.setMenuItem("item2");
        assertEquals(testObj.getMenuItem(), "item2");
    }

    @Test
    public void testSetQuantity() {
        testObj.setQuantity(15);
        assertEquals((int)testObj.getQuantity(), 15);
    }

    @Test
    public void testSetPrice() {
        testObj.setPrice(20.00);
        assertEquals((Object)testObj.getPrice(), 20.00);
    }
}

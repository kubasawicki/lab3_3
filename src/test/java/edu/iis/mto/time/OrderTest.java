package edu.iis.mto.time;

import edu.iis.mto.time.example.FakeTime;
import org.junit.Before;
import org.junit.Test;

public class OrderTest {

    OrderItem orderItem;
    Order order;

    @Before
    public void setUp() {
    }

    @Test(expected = OrderExpiredException.class)
    public void testConfirmShouldThrowOrderExpiredException() {
        order = new Order( new FakeTime().addHours(25) );
        orderItem = new OrderItem();
        order.addItem( orderItem );
        order.submit();
        order.confirm();
    }

}
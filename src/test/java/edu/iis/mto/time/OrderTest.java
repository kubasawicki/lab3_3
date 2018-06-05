package edu.iis.mto.time;

import edu.iis.mto.time.example.FakeTime;
import org.junit.Before;
import org.junit.Test;

public class OrderTest {

    OrderItem orderItem;
    Order order;
    FakeTime time = new FakeTime();
    @Before
    public void setUp() {
    }

    @Test(expected = OrderExpiredException.class)
    public void testConfirmShouldThrowOrderExpiredException() {

        order = new Order( time );
        orderItem = new OrderItem();
        order.addItem( orderItem );
        order.submit();
        time.addHours( 25 );
        order.confirm();
    }

}
package edu.iis.mto.time;

import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderTest {

    Order order;
    OrderItem item;

    @Before public void setUp() throws Exception {
        order = new Order();
        item = new OrderItem();

        order.addItem(item);
        order.submit();
    }

    @Test(expected = OrderExpiredException.class)
    public void expiredOrderShouldThrowOrderExpiredException(){
        DateTimeUtils.setCurrentMillisFixed(new DateTime().getMillis() + Integer.MAX_VALUE);
        order.confirm();

    }

}

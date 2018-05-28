package edu.iis.mto.time;

import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;


@RunWith(PowerMockRunner.class)
public class OrderTest {

    private Order order;
    @Before
    public void initTest() {
        order = new Order();
        order.addItem(new OrderItem());
        order.submit();
    }

    @Test(expected = OrderExpiredException.class)
    public void throwExpiredExceptionAfter24Hours() {
        DateTimeUtils.setCurrentMillisFixed(new DateTime().getMillis()+90000000);
        order.confirm();
    }

    @Test
    public void orderCorrectlyConfirmed() {
        order.confirm();
        Assert.assertEquals(order.getOrderState(), Order.State.SUBMITTED);
    }
}
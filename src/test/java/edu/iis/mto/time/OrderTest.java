package edu.iis.mto.time;

import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class OrderTest {

    FakeDateTime fakeClock = new FakeDateTime();
    @Mock
    DateTime currentDate = new DateTime(fakeClock.instant().toString());

    @InjectMocks
    Order order = new Order();

    @Test(expected = OrderExpiredException.class)
    public void throwExpiredExceptionAfter24Hours() {
        order.addItem(new OrderItem());
        order.submit();
        DateTime fakeDate = new DateTime(System.currentTimeMillis());
        order.confirm();
    }

    @Test
    public void orderCorrectlyConfirmed() {
        currentDate = null;
        order.addItem(new OrderItem());
        order.submit();
        order.confirm();
        Assert.assertEquals(order.getOrderState(), Order.State.SUBMITTED);
    }
}
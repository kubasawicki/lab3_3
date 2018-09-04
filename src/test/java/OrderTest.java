import edu.iis.mto.time.ExtraDataTime;
import edu.iis.mto.time.Order;
import edu.iis.mto.time.OrderExpiredException;
import edu.iis.mto.time.OrderItem;
import org.junit.Test;

public class OrderTest {
    @Test(expected = OrderExpiredException.class)
    public void check(){
        ExtraDataTime extraDataTime = new ExtraDataTime();
        Order order = new Order(extraDataTime);
        order.addItem(new OrderItem());

        order.submit();
        final int milisecondsInSecond = 1000;
        final int secondsInHour = 3600;
        final int periodHoursWithDelay = order.VALID_PERIOD_HOURS+1;
        extraDataTime.setMilliseconds(periodHoursWithDelay*secondsInHour*milisecondsInSecond);
        order.confirm();
    }

}

import edu.iis.mto.time.Order;
import edu.iis.mto.time.OrderExpiredException;
import edu.iis.mto.time.OrderItem;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class OrderTest {
    private Order order;
    private OrderItem item;
    @Before
    public void initTest()
    {
        order = new Order();
        item = new OrderItem();
        order.addItem(item);
        order.submit();
        DateTimeUtils.setCurrentMillisFixed(new DateTime().getMillis()+108000000);
    }

    @Test (expected = OrderExpiredException.class)
    public void expiredOrderConfirmationShouldThrowException()
    {
        order.confirm();
    }
}

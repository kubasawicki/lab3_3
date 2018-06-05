import edu.iis.mto.time.Order;
import edu.iis.mto.time.OrderExpiredException;
import edu.iis.mto.time.OrderItem;
import org.junit.Before;
import org.junit.Test;

public class OrderTest {
    private Order order;
    private OrderItem item;
    @Before
    public void initTest()
    {
        order = new Order();
        item = new OrderItem();
    }

    @Test (expected = OrderExpiredException.class)
    public void expiredOrderConfirmationShouldThrowException()
    {
        
    }
}

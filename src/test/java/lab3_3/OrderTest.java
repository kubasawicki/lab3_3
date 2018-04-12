package lab3_3;

import org.junit.Before;
import org.junit.Test;

import edu.iis.mto.time.Order;
import edu.iis.mto.time.OrderExpiredException;
import edu.iis.mto.time.OrderItem;

public class OrderTest {
	Order order;
	OrderItem item;

	@Before
	public void setUp() {

	}

	@Test(expected = OrderExpiredException.class)
	public void OrderExpiredExceptionTest() {
		order = new Order();
		order.addItem(item);
		order.submit();
		order.confirm();
	}
}

package lab3_3;

import org.junit.Test;

import edu.iis.mto.time.DateTimeImpl;
import edu.iis.mto.time.Order;
import edu.iis.mto.time.OrderExpiredException;
import edu.iis.mto.time.OrderItem;

public class OrderTest {
	Order order;
	OrderItem item;

	@Test(expected = OrderExpiredException.class)
	public void OrderExpiredExceptionTest() {
		order = new Order();
		item = new OrderItem();
		order.setDateTimeImpl(DateTimeImpl.getTimeSource());
		order.addItem(item);
		order.submit();
		order.getDateTime().getForwardTime(25);
		order.confirm();
	}
}

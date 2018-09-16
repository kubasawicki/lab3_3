package lab3_3;

import org.junit.Test;

import edu.iis.mto.time.DateTimeClass;
import edu.iis.mto.time.Order;
import edu.iis.mto.time.OrderExpiredException;
import edu.iis.mto.time.OrderItem;
import edu.iis.mto.time.Time;

public class OrderTest {
	Order order;
	OrderItem item;

	@Test(expected = OrderExpiredException.class)
	public void OrderExpiredExceptionTest() {
		Time timesource = DateTimeClass.getTimeSource();
		order = new Order();
		item = new OrderItem();
		order.setDateTimeClass(timesource);
		order.addItem(item);
		order.submit();
		timesource.AddTimeInHours(25);
		order.confirm();
	}
}
package lab3_3;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iis.mto.time.*;
import edu.iis.mto.time.Order.State;

import static org.hamcrest.core.Is.is;

public class OrderTests {

	@Test(expected = OrderExpiredException.class)
	public void confirmOrderShouldThrowOrderExpiredException() {
		
		Order order = new Order();
		order.submit();
		order.confirm(new FakeClock());
	}
}

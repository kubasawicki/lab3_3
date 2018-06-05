package lab3_3;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iis.mto.time.*;
import edu.iis.mto.time.Order.State;

import java.time.Clock;

import static org.hamcrest.core.Is.is;

public class OrderTests {

	@Test(expected = OrderExpiredException.class)
	public void confirmOrderShouldThrowOrderExpiredException() {

		TrueClock clock = new TrueClock();
		Order order = new Order(clock);
		order.submit();
		clock.addHours(25);
		order.confirm();
	}
}

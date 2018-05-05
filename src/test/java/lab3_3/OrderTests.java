package lab3_3;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iis.mto.time.*;

public class OrderTests {

	@Test(expected = OrderExpiredException.class)
	public void confirmOrderShouldThrowOrderExpiredException() {
		
		Order order = new Order();
		order.submit();
		order.confirm(new FakeClock());
	}

}

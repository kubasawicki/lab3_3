package edu.iis.mto.time;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.joda.time.DateTime;

public class FakeClock implements ClockInterface {

	private DateTime dateTime = DateTime.now().plusHours(48);
	
	@Override
	public DateTime getDateTime() {
		return dateTime;
	}
}

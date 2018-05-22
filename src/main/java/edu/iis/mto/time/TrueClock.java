package edu.iis.mto.time;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.joda.time.DateTime;

public class TrueClock implements ClockInterface {

	private DateTime dateTime = DateTime.now();
	
	@Override
	public DateTime getDateTime() {
		return dateTime;
	}

}

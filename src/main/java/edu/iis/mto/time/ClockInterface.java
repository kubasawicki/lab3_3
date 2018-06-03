package edu.iis.mto.time;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.joda.time.DateTime;

public interface ClockInterface {
	
	DateTime dateTime = new DateTime();
	
	DateTime getDateTime();
	
	void addHours(int i);
}

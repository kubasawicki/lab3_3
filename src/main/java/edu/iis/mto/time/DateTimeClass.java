package edu.iis.mto.time;

import org.joda.time.DateTime;

public class DateTimeClass implements Time {
	private static DateTimeClass instance;
	private static DateTime dateTime;

	public DateTimeClass() {
		dateTime = new DateTime();
	}

	public static DateTimeClass getTimeSource() {
		if (instance == null)
			instance = new DateTimeClass();
		return instance;
	}

	@Override
	public DateTime getCurrentTime() {
		return dateTime;
	}

	@Override
	public DateTime getForwardTime(int hours) {
		dateTime = DateTime.now().plusHours(hours);
		return dateTime;
	}
}
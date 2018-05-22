package edu.iis.mto.time;

import org.joda.time.DateTime;

public class DateTimeImpl implements TimeSrc {
	private static DateTimeImpl instance;
	private static DateTime dateTime;

	public DateTimeImpl() {
		dateTime = new DateTime();
	}

	public static DateTimeImpl getTimeSource() {
		if (instance == null)
			instance = new DateTimeImpl();
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

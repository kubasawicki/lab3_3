package edu.iis.mto.time;

import org.joda.time.DateTime;

public class FakeTime {
	public static DateTime getTime() {
		return new DateTime().plusHours(25);
	}
}

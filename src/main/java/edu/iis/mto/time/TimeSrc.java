package edu.iis.mto.time;

import org.joda.time.DateTime;

public interface TimeSrc {
	DateTime getCurrentTime();

	DateTime getForwardTime(int hours);
}

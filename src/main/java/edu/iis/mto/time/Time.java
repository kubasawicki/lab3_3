package edu.iis.mto.time;

 import org.joda.time.DateTime;

 public interface Time {
 	public DateTime getCurrentTime();
 	public DateTime AddTimeInHours(int hours);
 }
package edu.iis.mto.time.example;

import org.joda.time.DateTime;

public interface TimeSource {

    Long getCurrentMillis();

}

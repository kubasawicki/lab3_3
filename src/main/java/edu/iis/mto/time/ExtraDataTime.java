package edu.iis.mto.time;

import org.joda.time.DateTime;

public class ExtraDataTime implements ExtraDateTimeI {
    private int milliseconds;
    @Override
    public DateTime getTime() {
        return new DateTime().plusMillis(milliseconds);
    }

    public int getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(int milliseconds) {
        this.milliseconds = milliseconds;
    }
}

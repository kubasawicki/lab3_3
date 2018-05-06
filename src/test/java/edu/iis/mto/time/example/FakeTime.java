package edu.iis.mto.time.example;

import org.joda.time.DateTime;

public class FakeTime implements TimeSource {

    private Long hours;

    public FakeTime(){
        this.hours = 0L;
    }
    public FakeTime addHours(long hours) {
        this.hours += hours;
        return this;
    }

    @Override
    public Long getCurrentMillis() {
        return new DateTime().getMillis()+60*60*1000*hours;
    }
}

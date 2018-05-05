package edu.iis.mto.time;

public class FakeClock implements ClockInterface {

	private static final long TWO_DAYS = 48*60*60*1000;
	
	@Override
	public long currentTimeMillis() {		
		return System.currentTimeMillis() + TWO_DAYS;
	}

}

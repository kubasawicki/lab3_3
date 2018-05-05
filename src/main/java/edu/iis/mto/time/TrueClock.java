package edu.iis.mto.time;

public class TrueClock implements ClockInterface {

	@Override
	public long currentTimeMillis() {		
		return System.currentTimeMillis();
	}

}

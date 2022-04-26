package Time;

public class Time implements Comparable<Time>{
	
	private int hours, minutes, seconds;	

	final Time MIDDAY = new Time(12, 0, 0);
	final Time MIDNIGHT = new Time(0, 0, 0);
	
	public Time(int hours, int minutes, int seconds) {
		if(hours < 24 && minutes < 60 && seconds < 60) {
			this.hours = hours;
			this.minutes = minutes;
			this.seconds = seconds;
		}
		else 
			throw new IllegalArgumentException();
	}
	
	public Time minus(Time x) throws Exception {
		
		Time newTime = new Time(0, 0, 0);
		newTime.hours = this.hours - x.hours;
		newTime.minutes = this.minutes - x.minutes;
		newTime.seconds = this.minutes - x.minutes;
		if(newTime.hours < 0 || newTime.minutes < 0 || newTime.seconds < 0)
			throw new Exception();
		
		
		return newTime;
	}
	
	//Sarebbe bene implementarla per permettere una stampa decente dell'orario secondo il formato
	//hh:mm:ss
	@Override
	public String toString() {
		String result = new String();
		return result;
	}
	

	@Override
	public int compareTo(Time t) {
		int res = Integer.compare(this.hours, t.hours);
		if(res == 0) {
			res = Integer.compare(this.minutes, t.minutes);
			if(res == 0) {
				res = Integer.compare(this.seconds, t.seconds);
			}
		}
			
		return res;
	}
}

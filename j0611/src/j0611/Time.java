package j0611;

public class Time {
	// iv 
	private int hour; // 0~23
	private int minute; // 0~60
	private int second; //0~60
	boolean a ; // a = false 
	
	// 생성자 
	Time(){} // 기본생성자 
	Time(int hour, int minute, int second){
		//this.hour = hour; this.minute = minute;	this.second = second;
		setHour(hour); setMinute(minute); setSecond(second);
	}
	public void printTime() {
		
		System.out.printf("%2d:%2d:%2d \n",this.hour, minute, second);
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if( checkHour(hour) ) return; // 메서드의 종료 
		this.hour = hour;
	}
	private boolean checkHour(int hour) {
		if( hour < 0 || hour > 23 ) return true; // 시간이 유효하지 않음 ->true
		else return false; 
	}
	
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if( minute<0 || minute > 60) return;
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if( second<0 || second > 60) return;
		this.second = second;
	}
	
	
	
	
}

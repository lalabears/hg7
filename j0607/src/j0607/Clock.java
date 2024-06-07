package j0607;

public class Clock {
	// 변수 : hour, min, sec 
	int hour; 
	int min; 
	double sec; 
	// 생성자 
	Clock(){} // 기본생성자 
	Clock(int h){
		 hour = h; 
	}
	Clock(int h, int m){
		hour =h;
		min = m;
	}
	Clock(int h, int m, double s){
		hour = h;
		min = m; 
		sec = s;
	}
	// 메서드 : 시간 출력하는 메서드 
	void printTime() {
		System.out.printf(
		"%2d:%2d:%.2f\n",hour,min,sec);
	}

}

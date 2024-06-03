package j0603;

public class Students {
	// 1. 변수
	int stuNo;
	String name; 
	int kor, eng, math, total; 
	double avg;
	// 2. 생성자
	// 3. 메서드 
	void total() {
		total = kor+eng+math;
	}
	void avg() {
		avg = (kor+eng+math)/3.0;
	}
	void print() { // 학생 성적을 출력해주는 메서드 
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
				stuNo, name, kor, eng, math,total,avg);
	}
	
}

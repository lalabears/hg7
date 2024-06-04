package j0604;

public class Students {
	// 인스턴스변수 
	int no;
	String name; 
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	// 클래스변수 
	static String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	// 메서드
	void sum() {
		total = kor+eng+math;
	}
	void average() {
		avg = (kor+eng+math)/3.0;
	}
	
}

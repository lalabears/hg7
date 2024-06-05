package j0605;
public class Stu {
	// 1. 변수
	// 1-1 클래스변수 - 모든객체에 공통적인 변수. 객체선언없이 사용가능  클래스명.변수명
	static String[] title = {"번호","이름","국어","영어","수학","총점","평균","등수"};
	// 1-2 인스턴스변수 - 객체마다 다른 값을 가질수있는 변수  참조변수명.인스턴스변수명
	//                 객체 생성 후에만 사용할 수 있다. 
	//                 클래스메서드에서는 사용이 불가능 
	int stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg; 
	int rank; 
	// 2. 생성자  :    클래스명()  return이 없음. 
	// 2-1 기본생성자 - 생성자가 없을때는 자동생성되나 다른생성자가 존재할 경우 
	//                만들어야 사용가능
	Stu(){} 
	// 2-2 이름, 국,영,수를 전달받는 생성자 
	// 객체 생성 시 전달 받은 값들로 객체를 초기화 해라. 
	Stu(String name, int kor, int eng, int math){
		this(100, name, kor, eng, math);
	}
	Stu(int stuNo, String name, int kor, int eng, int math){
		this.stuNo = stuNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng; 
		this.math = math; 
		this.total = kor+eng+math; 
		this.avg = this.total/3.0; 
	}
	
	// 3. 메서드
	// 3-1 인스턴스메서드
	void printAttr() {
		System.out.printf("%s %d %d %d %d %.2f\n",name,kor,eng,math,total,avg);
	}
	
	

}

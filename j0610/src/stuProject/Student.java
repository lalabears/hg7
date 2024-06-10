package stuProject;

public class Student {
	static String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
	static int count = 1000; // 클래스변수. 
	private int stuNo;
	private String name ;
	private int kor;
	private int eng;
	private int math; 
	private int total; 
	private double avg;
	int rank ; 
	// 학번은 학생이 생성될때마다 하나씩 증가하게 만들어주세요 1001, 1002, 1003.. 
	{ // 초기화 블럭을 사용함. 
		++count; 
		stuNo = count; 
	}
	// 생성자를 통해서 이름, 국,영,수를 입력받아 각각 총점과 평균이 계산됩니다. 
	public Student(){} // 기본생성자 
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math; 
		this.total = kor+eng+math; 
		this.avg = this.total/3.0;
	}
	
	// 학생정보를 출력해주는 메서드도 만들어보세요 
	public void printStuInfo() {
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
			stuNo, name, kor, eng, math, total, avg, rank	
				);
	}
	

}

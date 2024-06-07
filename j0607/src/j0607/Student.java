package j0607;

// Student 클래스를 만들어 보세요.
public class Student {
// iv : no, name, kor, eng, math, total, avg, rank 
	int no, kor, eng, math, total, rank; 
	String name;
	double avg; 
// 1. 생성자를 통해서 total, avg를 넣기.
	Student(){} // 기본생성자 
	Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0; 
	}
// 2. printStu()를 만들어 학생 객체의 정보전체 출력
	// System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d",
	//	no,name,kor,eng,math,total,avg,rank);
	void printStu() {
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					no,name,kor,eng,math,total,avg,rank);
	}
// 3. sum(), average()메서드를 만들어서 
//   iv의 total, avg 값 넣기 
	void sum() {
		this.total = this.kor+this.eng+this.math;
	}
	void average() {
		this.avg = (this.kor+this.eng+this.math)/3.0;
	}

} // Student 

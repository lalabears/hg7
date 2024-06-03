package j0603;

public class C0603_03 {

	public static void main(String[] args) {
		// 학생성적 
		int stuNo = 1; 
		String name = "홍길동";
		int kor = 100;  int eng = 100;	int math = 90;
		int total = kor+eng+math; double avg = total/3.0; 
		int stuNo2 = 2; 
		String name2 = "유관순";
		int kor2 = 100;  int eng2 = 90;	int math2 = 95;
		int total2 = kor2+eng2+math2; double avg2 = total2/3.0; 
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
				stuNo, name, kor, eng, math, total, avg);
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
				stuNo2, name2, kor2, eng2, math2, total2, avg2);
		System.out.println("--------------------------------------------");
		// Students 라는 클래스를 만들어 위와같은 학생 2명의 정보를 출력해보세요 
		
		Students stu1 = new Students();
		stu1.stuNo = 1; 
		stu1.name = "홍길동";
		stu1.kor = 100;  stu1.eng = 100; stu1.math = 90;
		stu1.total(); 
		stu1.avg(); 
		Students stu2 = new Students();
		stu2.stuNo = 2; 
		stu2.name = "이순신";
		stu2.kor = 100;  stu2.eng = 90; stu2.math = 95;
		stu2.total();
		stu2.avg();
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		stu1.print();
		stu2.print();
		

	}

}

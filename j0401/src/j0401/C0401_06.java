package j0401;

import java.util.Scanner;

public class C0401_06 {

	public static void main(String[] args) {
		//
		Scanner scan = new Scanner(System.in);
		// 이름, 나이를 입력받아서
		// 출력 : 제이름은 홍길동, 내년에 21살입니다
		String name="";
		int age =0;
		System.out.print("이름을 입력하세요 >> ");
		name = scan.nextLine();
		System.out.print("나이를 입력하세요 >> ");
		age = scan.nextInt();
		
		System.out.printf("제이름은 %s, 내년에 %d살입니다\n",name, (age+1) );
		// 국어, 영어, 수학 점수를 입력받아서
		// 출력: 홍길동님 총점은 : 300점입니다. 
		int kor, eng, math;
		System.out.print("국어점수를 입력하세요 >> ");
		kor = scan.nextInt();
		System.out.print("영어점수를 입력하세요 >> ");
		eng = scan.nextInt();
		System.out.print("수학점수를 입력하세요 >> ");
		math = scan.nextInt();
		
		System.out.printf("%s님 총점은 : %d점입니다.\n",
				name, (kor+eng+math) );

		
	}

}

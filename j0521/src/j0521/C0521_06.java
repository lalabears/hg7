package j0521;

import java.util.Scanner;

public class C0521_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* 
		 변수 : 번호 아이디, 비밀번호, 이름 
		번호 :정수	아이디 : 문자열 	비밀번호 : 실수형    이름 : 문자열 
		번호, 아이디, 비밀번호, 이름 순으로 
		입력을 받아서 
		-----------------------------------------
		번호   아이디     패스워드     이름
		-----------------------------------------
  		1      aaa      11.22    홍길동 
		*/
		
		// 입력 
		// 1. 변수 선언하기 
		int num; 
		String id, name; 
		double pw ; 
		//번호, 아이디, 비밀번호, 이름 순으로
		System.out.println("번호를 입력하세요");
		num = scan.nextInt(); // 1 + enter key를 입력 
		System.out.println("아이디를 입력하세요");
		id = scan.next(); // id : enter key 값이 들어감
		System.out.println("비밀번호를 입력하세요");
		pw = scan.nextDouble();
		System.out.println("이름을 입력하세요");
		scan.nextLine(); // 방법2 . enter key 값이 들어감
		name = scan.nextLine();
		
		// 출력 
		System.out.println("--------------------------------");
		System.out.println("번호\t아이디\t패스워드\t이름");
		System.out.println("--------------------------------");
		System.out.printf("%d\t%s\t%.2f\t%s\n",num, id,pw,name );
		
		
		
		// 사각형의 가로와 세로의 길이를 입력받아 면적과 둘레를 구하세요 double type
		
		// 변수선언 및 입력
		double garo, sero; 
		System.out.println("가로의 길이를 입력해주세요 ");
		garo = scan.nextDouble();
		System.out.println("세로의 길이를 입력해주세요 ");
		sero = scan.nextDouble(); 
		
		// 출력 
		System.out.println("면적 : " + ( garo * sero ));
		System.out.println("둘레 : " + ( (garo+sero) * 2 ));
		
		//System.out.print("줄바꿈없는 출력");
		//System.out.println("줄바꿈있는 출력");
		//System.out.printf("형식을 정할 수 있는 출력%s","문자열");
	
		
	}

}

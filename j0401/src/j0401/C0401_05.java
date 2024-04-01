package j0401;

import java.util.Scanner;

public class C0401_05 {

	public static void main(String[] args) {
		// nextLine() 문장
		// nextInt() 정수
		// nextDouble() 실수 
		
		// scanner + ctrl + spacebar + enter => import 
		// Scanner scan = new Scanner(System.in);
		
		// 아이디, 비밀번호를 입력받아 출력해보세요 
		// 변수 2개 id, pwd (id : String, pwd : int)
		// 출력
		// 아이디  : aaaa
		// 비밀번호 : 1111
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디를 입력해주세요 >> ");
		String id = scan.nextLine();
		System.out.print("비밀번호를 입력해주세요 >> ");
		int pwd=scan.nextInt(); 
		System.out.println("아이디  : " + id);
		System.out.println("비밀번호 : "+pwd);
		
		

	}

}

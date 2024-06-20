package j0620;

import java.util.Scanner;

public class C0620_04 {
	public static void main(String[] args) {

		// 런타임에러 - 컴파일러는 잡지는 못하는데 실행시켯을때 실행이안됨
		// System.out.println(0/0);
		
		System.out.println("프로그램 시작" );
		try { // 예외가 발생할 수 있는 코드를 try문안에 넣는다 
		//	System.out.println(10/0); // 예외사항발생
			System.out.println(args[0]); // 예외사항발생
			System.out.println(2);
		}catch (ArithmeticException ae) {
			System.out.println("산술적 예외사항 발생!");
			ae.printStackTrace();
			System.out.println(ae.getMessage());
		} catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("배열범위 예외사항 발생!!");
			ae.printStackTrace();
			System.out.println(ae.getMessage());
		} catch(Exception e) {
			System.out.println("예외사항의 조상 (모든예외사항)");
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			System.out.println("예외가 있던 없던 무조건 실행됨");
		}
		System.out.println("프로그램 종료 ");
		
		System.out.println("=============================");
		
		Exception error = new Exception("고의로 예외 발생");
		// throw 를 사용해서 오류를 발생시킬 수 있다. 
		System.out.println("프로그램 시작 (고의로 예외 발생)");
		try {
			System.out.println("프로그램 진행 중..... ");
			throw error ; // 고의로 예외를 발생시킴
		}
		//catch (ArithmeticException e) { 
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("프로그램을 종료합니다... ");
		}
		System.out.println("=============================");
		
		
		// 숫자 두개를 입력받아서 나눗셈결과를 보여주는데 (무한반복, 만약 첫번째 0 > 종료)
		// 0으로 나누어도 오류없이 계속 입력을 받아 결과를 보여주는 코드를 만들어보세요

		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("첫번째 숫자입력 : (종료 0)");
			int n1 = scan.nextInt();
			if(n1==0) {
				System.out.println("프로그램이 종료됩니다");
				break;
			}
			System.out.println("두번째 숫자입력 :");
			int n2 = scan.nextInt();
			try {
				System.out.println("나눗셈의 결과는 : " + n1/n2);
			}catch(ArithmeticException e) {
				System.out.println("프로그램에 오류가 있습니다.. 다시 입력해주세요");
				e.printStackTrace();
			}catch(Exception e) {
				System.out.println("프로그램에 오류가 있습니다.. 다시 입력해주세요");
				e.printStackTrace();
			}
			System.out.println();
		}
		
		
	}

}

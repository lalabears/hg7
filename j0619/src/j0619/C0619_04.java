package j0619;

import java.io.IOException;
import java.util.Scanner;

public class C0619_04 {
	public static void main(String[] args) {
		// 예외처리 	
		// 1. 컴파일 에러 - 실행시키기전에 빨간줄이 그어져서 실행조차 못하는 에러 
		// system.out.println();
		// 2. 런타임 에러 - 실행할때 발생하는에러 - 실행은했는데 프로그램이 종료됨. 
		// System.out.println(args[0]);
		// 3. 논리적 에러 - 실행도되고 종료도안되는데 원하는대로 되지 않는에러 
		//                작성의도와는다르게 동작 
		
		// 에러 - 프로그램코드에 의해서 수습될수 없는 오류 
		// 예외 - 프로그램코드에 의해서 수습될 수 있는 미약한 오류 
		
		// 예외처리 : 프로그램실행시 발생할 수 있는 예외발생에 대비해 코드를 작성하는것.
		//          프로그램의 비정상적인 종료를막고 실행상태를 유지하는것이다. 
		
		// 예외 : Exception 클래스        - 사용자의실수같은 외부요인에의해 발생
		//       RuntimeException 클래스 - 프로그래머의 실수로 발생
		
		/*  try-catch문 : 한줄이어도 {}중괄호를 생략할 수 없습니다.  
		    try {
		  			예외를 처리하길 원하는 코드 ;
		    } catch(e1) {
		    		e1 예외가 발생할 경우 실행될 코드 ;
		    } catch(e2) {
		    		e2 예외가 발생할 경우 실행될 코드 ;
		    }
		 
		*/
		
		// 1. 예외가 없을때 . - 출력 : 1,2,4
		System.out.println(1);
		try {
			System.out.println(2);
		} catch (Exception e) {
			System.out.println(3);
		}
		System.out.println(4);
		System.out.println("------------------");
		// 2. 예외 발생 : 숫자를 0으로 나누는것은 예외가 발생하는것이다 
		System.out.println(1);
		try {
			System.out.println(9/0);  // 예외발생 !! 
			System.out.println(2);
		} catch (Exception e) {
			System.out.println(3);
			System.out.println("예외 : "+e);
		}
		System.out.println(4);
		// 출력 1 3 예외 4 
		
		System.out.println("------------------");
		System.out.println(1);
		try {
			System.out.println(9/0);  // 예외발생 !! 
			System.out.println(2);
		} catch(ArithmeticException ae) {
			System.out.println("Arithmetic 오류가 있습니다 !! ");
			System.out.println(ae);
		} catch (Exception e) {
			System.out.println(3);
			System.out.println("예외 : "+e);
		}
		System.out.println(4);
		// Exception - 모든 예외를 처리할 수 있음. catch블럭 마지막에 두어야함. 
		System.out.println("------------------");
		System.out.println(1);
		try {
			System.out.println(args[0]);  // 산술적인 예외가 아님  
			System.out.println(2);
		} catch(ArithmeticException ae) {  // 산술적인 예외를 처리함. 
			System.out.println("Arithmetic 오류가 있습니다 !! ");
			System.out.println(ae);
		} catch(ArrayIndexOutOfBoundsException ae) {  // 산술적인 예외를 처리함. 
			System.out.println("ArrayIndexOutOfBoundsException 오류가 있습니다 !! ");
			System.out.println(ae);
		} catch (Exception e) {
			System.out.println(3);
			System.out.println("예외 : "+e);
		}
		System.out.println(4);
		System.out.println("------------------");
		
	/*	try {
			// 예외가 있을지도 모르는 코드를 이곳에 작성합니다. 
			
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다");
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다 ");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다");
		} catch(IOException e) {
			System.out.println("입력값이 잘못되었습니다");
		} catch(Exception e) {
			System.out.println("모든 예외를 처리합니다 ");
		} */
		
		
		
		// Exception 으로 다 처리하면되지 않나요 ? 
		// 모든예외를 잡으려면 특정 오류를 식별하고 처리하기 어려워져서 
		// 코드의 잠재적 문제와 예기치 않은 동작이 발생할 수 있음. 
		// 예상하는 특정예외를 잡고 적절하게 처리하는것이 더 좋습니다. 
		
		int a = 10; 
		Scanner scan = new Scanner(System.in);
		System.out.println("10을 나누고자 하는 수를입력해주세요 ");
		int b = scan.nextInt();
		
		try {
			System.out.println("나누기의 결과는 "+ a/b );
		
		} catch(ArithmeticException e) {
			System.out.println("Arithmetic 오류가 있습니다 !! ");
			System.out.println(e);
			System.out.println("0으로 나누셨군요.. 1로나눈값을 출력해드리겟습니다");
			System.out.println("나누기의 결과는 "+ a/1 );
		} catch (Exception e) {
			System.out.println(3);
			System.out.println("예외 : "+e);
		}
		
		
		// printStackTrace() : 예외발생당시 메서드의 정보외 예외메세지 화면출력
		// getMessage()      : 발생한 예외클래스의 인스턴스에 저장된 메세지를 얻을 수 있다. 
		
		
		System.out.println("------------------");
		System.out.println(1);
		try {
			System.out.println(9/0);  // 예외발생 !! 
			System.out.println(2);
		} catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("예외메세지 : "+ ae.getMessage());
		} catch (Exception e) {
			System.out.println(3);
			System.out.println("예외 : "+e);
		}
		
		// 멀티캐치블럭 
		System.out.println("------------------");
		System.out.println(1);
		try {
			System.out.println(args[0]);  // 예외발생 !! 
			System.out.println(10/0);  // 예외발생 !! 
			System.out.println(2);
		} catch(ArithmeticException | ArrayIndexOutOfBoundsException  ae ) {
			ae.printStackTrace();
			System.out.println("예외메세지 : "+ ae.getMessage());
		} catch (Exception e) {
			System.out.println(3);
			System.out.println("예외 : "+e);
		}
		

	}

}

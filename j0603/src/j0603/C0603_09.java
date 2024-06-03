package j0603;
import java.util.Scanner;
public class C0603_09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 계산함수를 위해 객체선언 및 생성
		Calculate2 cal2 = new Calculate2(); 
		long num1 = 5L, num2 = 3L; // 계산에 사용될 변수 
		// iv 값 초기화 
		cal2.n1 = 5L;
		cal2.n2 = 3L; 
		System.out.println(cal2.add());
		System.out.println(cal2.sub());
		System.out.println(cal2.mul());
		System.out.println(cal2.div());
		System.out.println(cal2.remain());
		Calculate2 cal3 = new Calculate2(); 
		cal3.n1 = 10; 
		cal3.n2 = 3; 
		System.out.println(cal3.add());
		System.out.println(cal3.sub());
		System.out.println(cal3.mul());
		System.out.println(cal3.div());
		System.out.println(cal3.remain());
		
		Calculate cal = new Calculate(); 
		
		
		// 수식을 입력받아 (+,-,*,/,%) 
		// + 인경우 5 + 3 = 8 을 출력해보세요.
		// 함수를 사용해야함. switch문을 사용해야함. 
		System.out.println("수식을 입력해주세요((+,-,*,/,%)");
		String c = scan.next();
//		if(c.equals("+"))
		switch(c) {
		case "+": 
			System.out.printf("%d+%d=%d\n",num1,num2, cal.add(num1, num2));
			break;
		case "-":
			System.out.printf("%d-%d=%d\n",num1,num2, cal.sub(num1, num2));
			break;
		case "*":
			System.out.printf("%d*%d=%d\n",num1,num2, cal.mul(num1, num2));
			break;
		case "/":
			System.out.printf("%d/%d=%.2f\n",num1,num2,cal.div(num1, num2));
			break;
		case "%":
			System.out.printf("%d 나머지 %d=%d\n",num1,num2, cal.remain(num1, num2));
			break;
		default: System.out.println("잘못입력하셨습니다");
		}
		
		
		
		/*
		Calculate cal = new Calculate(); 
		// 두 수를 입력받아. 합과 차를 출력해보세요
		System.out.println("첫번째 수입력:");
		int n1 = scan.nextInt();
		System.out.println("두번째 수입력:");
		int n2 = scan.nextInt(); 
		int r1 = cal.add(n1, n2);
		System.out.println(r1);
		int r2 = cal.sub(n1, n2);
		System.out.println(r2);*/
	}

}

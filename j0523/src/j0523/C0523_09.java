package j0523;

import java.util.Scanner;

public class C0523_09 {

	public static void main(String[] args) {
		// Math
		double n1 = 12.598;
		double n2 = 2.321; 
		// 소수점 첫째 자리에서 반올림, 올림 내림을 한다. 
		System.out.println( Math.round(n1) ); // 소수점 첫째자리 반올림
		System.out.println( Math.ceil(n1) );  // 소수점 첫째자리 올림
		System.out.println( Math.floor(n1) ); // 소수점 첫째자리 버림 
		
		System.out.println( Math.round(n2) );
		System.out.println( Math.ceil(n2) );
		System.out.println( Math.floor(n2) );
		
		// 소수점 둘째 자리에서 반올림 : Math.round()함수를 가지고 
		double n = Math.round(n1*10)/10.0;
		System.out.println(n1 + "을 소수점 둘째자리에서 반올림한 값 " + n);
		/* n1    12.598 
		 10*n1   125.98 
		 round(126)/10 > 12.6
		 */
		// 소수점 네째자리에서 반올림 
		double a = 156.7854294;
		//             1234
		//1. a를 소수점 첫째자리에서 반올림한 값 출력해보기  : 157
		System.out.println( Math.round(a)  );
		//2. a를 소수점 둘째자리에서 반올림한 값 출력해보기  : 156.8
		System.out.println( a * 10  ); // 1567.854294
		System.out.println( Math.round( a * 10 ));
		System.out.println( Math.round( a * 10 ) / 10.0 );
		//3. a를 소수점 네째자리에서 반올림한 값 출력해보기  : 156.785
		System.out.println( a * 1000  ); // 156785.4294
		System.out.println( Math.round( a * 1000)  ); // 156785
		System.out.println( Math.round( a * 1000)/1000.0  ); // 156.785
		
		// 버림을 해봅시다. 
		double pi = 3.141592;
		// 소수점 첫째자리부터 버림 
		// 1. Math.floor(pi)
		// 2. (int)pi
		System.out.println((int)pi); // 3
		// 소수 둘째자리부터 버림 3.1  // 31.415
		System.out.println ( (int)(pi*10) / 10.0   );
		
		double temp = Math.random(); 
		System.out.println(temp);
		// 0 <= math.random() < 1 : 랜덤한 숫자를 생성함 
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		// 1 - 10 사이의 랜덤한 숫자를 생성을 하고싶다 
		/*
		 0 <= math.random() < 1
		 * 10   * 10          *10
		 0 <=   10 * Math.random()   < 10  
		 0 <= (int)(Math.random()*10) <10 
		 +1         +1                 +1
		 1 <= (int)(Math.random()*10) + 1 < 11 
		*/
			
		System.out.println((int)(Math.random()*10) + 1 );
		System.out.println((int)(Math.random()*10) + 1 );
		System.out.println((int)(Math.random()*10) + 1 );
		System.out.println((int)(Math.random()*10) + 1 );

		// 1- 3 사이의 랜덤한 숫자는 어떻게 발생시킬까요 ? 
		 // 1 <= (int)(Math.random()*3)+1 < 4
		System.out.println((int)(Math.random()*3)+1);
		System.out.println((int)(Math.random()*3)+1);
		System.out.println((int)(Math.random()*3)+1);
		System.out.println((int)(Math.random()*3)+1);
		System.out.println((int)(Math.random()*3)+1);
		System.out.println((int)(Math.random()*3)+1);
		System.out.println((int)(Math.random()*3)+1);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("가위(1) 바위(2) 보(3) 중 하나를 입력하세요 ");
		int user = scan.nextInt(); 
		// 랜덤한 숫자생성 
		int com = (int)(Math.random() * 3) + 1; 
		System.out.println("당신은 : " + user);
		System.out.println("컴퓨터는 : "+ com );
		// user - com 뺀 값을 가지고 케이스를 만들어보세요 
		// 당신이 이겼습니다. 당신이 졌습니다, 비겼습니다 를 출력해보세요 
		// 가위(1) - 가위(1) 비김
		// 가위(1) - 바위(2) 짐  바위(2) - 보(3)    보(3)-가위(1)
		// 가위(1) - 보(3)  이김  바위(2) - 가위(1)   보(3) - 바위(2)
		switch( user-com ) {
		case 1: case -2: 
			System.out.println("당신이 이겼습니다");
			break;
		case -1: case 2:
			System.out.println("당신이 졌습니다. ");
			break;
		case 0:
			System.out.println("비김");
			break;
		}
		
		
		
		
		
	}

}

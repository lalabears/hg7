package j0401;

public class C0401_01 {

	public static void main(String[] args) {
		/*
		 변수 선언. 
		 변수타입  변수명 ; 
		 변수타입  변수명 = 값 ; 
		 
		 변수명을 만들때는 , 영문자, 숫자, _,$ 만 사용이 가능하다. 
		 공백을 포함할 수 없으며, 예약어를 사용할 수 없다. 
		 숫자로 시작할 수 없다.  
		 */
		int n1, n2; 
		double n3 = 12.1234;
		int n4 = 1, n5 = 3; 
		
		/* 자바에서는 8가지 종류의 기본변수 타입을 제공
		 
		  정수형 : byte short int long
		  실수형 : float double 
		  문자형 : char
		  논리형 : boolean
		  
		 + 참조형 
		  문자열 : String 
		 */
		
		String str = "문자";
		
		boolean b = true; // false
		char ch = 'A'; 
		int n = 100; 
		long l = 123456789L;
		float f = 1.123F;
		double d = 1.123456789; // 접미사 d 생략가능 
		
		// 출력 
		// print("") : 줄바꿈을 포함하지 않음 + "\n(%n)" 
		// println() : 줄바꿈을 포함
		// printf() : 줄바꿈을 포함하지 않지만 형식 지정 출력 
		
		System.out.print("자바");
		System.out.print("어렵다");
		System.out.println("문장");
		System.out.println(3.125);
		System.out.println(10*2);
		System.out.println("10*2");
		System.out.println("문자열 "+"+로 연결");
		System.out.println("숫자 "+ 10 + "\n입니다");
		int age = 20 ; 
		String name ="홍길동";
		
		System.out.println("안녕하세요"+" 제 이름은 "+"홍길동"+"이고, 나이는 "+20+"입니다");
		System.out.println("안녕하세요"+" 제 이름은 "+name+"이고, 나이는 "+age+"입니다");

		
		// System.out.printf("문장들", 변수)
		
		System.out.printf("%d\n", 10); // 정수 %d
		System.out.printf("%.2f\n", 3.1234); // 실수 %f
		System.out.printf("%s\n", "안녕하세요"); // 문자열 %s 
		
		int price = 1000;
		System.out.printf("붕어빵 한개의 가격은 %d원 입니다 \n",price);
		double pi = 3.14;
		System.out.printf("pi : %.2f \n", pi);
		String hi = "안녕하세요";
		System.out.printf("hello 는 %s \n", hi);
		
		int num1 = 1, num2 = 2; 
		System.out.printf("%d+%d=%d \n", 1,2,1+2);
		System.out.printf("%d+%d=%d \n", num1,num2,num1+num2);
		
		// 변수 3개를 만들어서 (변수명 : name1, city, fruit)
		// 출력:
		// 저의 이름은 홍길동 입니다. 
		// 저는 부산에서 태어났습니다.
		// 저는 딸기를 좋아합니다. 
		String name1 = "홍길동", city = "부산", fruit = "딸기"; 
		System.out.println("저의 이름은 "+ name1 +" 입니다. ");
		System.out.printf("저의 이름은 %s 입니다. \n",name1);
		System.out.println("저는 "+city+"에서 태어났습니다.");
		System.out.printf("저는 %s에서 태어났습니다. \n", city);
		System.out.println("저는 "+fruit+"를 좋아합니다.");
		System.out.printf("저는 %s를 좋아합니다.\n", fruit);
		
		// 숫자 하나 변수를 선언해서 구구단을 출력해보세요 ( *5 까지)
		// 출력 : 8 * 1 = 8
		//    .. 8 * 5 = 40 
		int i = 8 ;
		System.out.println(i+"*"+1+"="+(i*1));
		System.out.printf("%d * %d = %d \n", i, 1, i*1);
		System.out.printf("%d * %d = %d \n", i, 2, i*2);
		System.out.printf("%d * %d = %d \n", i, 3, i*3);
		System.out.printf("%d * %d = %d \n", i, 4, i*4);
		System.out.printf("%d * %d = %d \n", i, 5, i*5);
		
		
		
		
	}

}

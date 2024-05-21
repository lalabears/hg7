package j0521;

public class C0521_01 {

	public static void main(String[] args) {
		
		// print, println
		System.out.println("안녕");
		System.out.println("하세요");
		System.out.print("반갑");
		System.out.print("습니다");
		System.out.print("줄바꿈이 없습니다");
		System.out.print("줄바꿈을 넣고싶으면 \n"); 
		System.out.println("\n은 줄바꿈입니다. 줄바꿔졋음을 확인할 수있습니다.");
		// 숫자 (정수, 실수)
		System.out.println(1000);
		System.out.println(10.1234);
		// 문자열
		System.out.println("문자열을 넣을 수 있음");
		System.out.println("제 이름은 "+"홍길동입니다");
		// 변수 
		int n = 10 ; 
		System.out.println(n);
		String abc ="문자열";
		System.out.println(abc);
		System.out.println("abc");
		String name = "홍길동"; 
		System.out.println("제 이름은 홍길동입니다.");
		System.out.println("제 이름은 "+"홍길동"+"입니다.");
		System.out.println("제 이름은 "+ name +"입니다.");
		
		// 변수 선언 
		int val ; // 변수 선언하기. 
		int val1, val2; // 같은 타입이면 여러개를 동시에 선언 할 수 있다. 
		// 초기화 해주기 (처음으로 값 대입해주기)
		val = 40; // 40이라는 값을 val이라는 변수에 대입해준다. 
		val = 50; 
		// 한번에 여러개 초기화는 불가능
		// val1 = 20, val2 = 30; 
		// 초기화는 한줄씩 해주어야한다. 
		val1 = 20; 
		val2 = 30;
		
		// 변수선언과 동시에 초기화하기 
		int val3 = 22; 
		// 같은 타입의 변수라면 여러개를 동시에 선언과 초기화가능
		int val4 = 9, val5 =7, val6 =10; 
		
		
		// 변수는 총 8가지 기본형이 있습니다. 
		/* 논리형 : boolean 
		 * 문자형 : char 
		 * 정수형 : byte short int long
		 * 실수형 : float double 
		 * 
		 * +
		 * 문자열형 : String 
		 * */
		// 논리형 
		boolean b1 = true; 
		boolean b2 = false; 
		// 문자형 
		char ch = 'a'; // 작은따옴표안에 사용, 한글자만 들어올 수 잇다
		char ch1 = ' '; // '' 사이에 아무것도 입력하지 않으면 오류 . 한칸띄어야함. 
		// A - 65, a = 97, 0 - 48 
		char ch2 = 65; 
		System.out.println(ch2);
		char ch3 = 48;
		System.out.println(ch3);
		
		// 정수형 
		byte n1 = 127 ;  
		short n2 = 32767;
		int n3 = 220 ; // 약 21억까지 사용할 수 있다. 
		long n4 = 1000000000000L; // 접미사 l, L을 붙여줘야한다. 
		
		// 실수형 
		float n5 = 4.123f;    // 접미사 f, F 를 붙여줘야함. 
		double n6 = 91.123456789; // 접미사 d, D를 생략해도 사용할 수 있음. 
		
		// 문자열 형 
		String str =""; // 큰따옴표를 사용, 내용없이 사용이 가능함. 
		String str1 = "문자열을 입력하는 공간입니다. 길게 입력이 가능합니다";
		String str2 = "안녕" + "하세요";
		String str3 = "저는" + 7 + "살입니다";
		int a = 10; 
		String str4 = "저는" + a + "살입니다";
		
		// 형 변환 
		int n7 = (int)7.98;
		System.out.println("7.98을 int로 형변환 한 값: "+ n7);
		float n8 = (float)3; 
		System.out.println("3을 float로 형변환 한 값 : "+n8);
		
		// 자동 형변환 (작은값을 큰 자료형에 담을때 자동형변환됨)
		double n9 = 6; 
		System.out.println(n9);
		double n10 = 6.15f; 
		System.out.println(n10);
		long n11 = 500; 
		System.out.println(n11);
		double n12 = 6L;
		System.out.println(n12);
		
		// int보다 작은 애들을 연산을 할때 연산의 최소단위가 int 
		
		// 문자(숫자로 보이는 문자) > 숫자로 변환하기
		//  [  - '0'  ] 을 해주면된다. 
		// '0' - 48  ,'8'
		char c1 = '8'; // 56 
		int c2 = c1 - '0'; 
		       //56 - 48  = 8 
		System.out.println( c2 * 10 ); //80
		
		// 숫자  > 문자로 바꾸려면.. 
		int c3 = 2 ; // '0' - 48, '2' - 50
		char c4 =(char)(c3 + '0');
		//               2 + 48 => 50 -> '2' 
		
		
		String s1 = "0" ; // 문자열
		
		// 숫자 >  문자열로 변환하기.
		// 앞이나 뒤에 "" 를 더해주면된다. 
		// 문자열 + 숫자 = 문자열 
		String s2 = "7"+10; //  "710"
		String s3 = "" + 10 ; // "10"
		String s4 = 9 + "" ; // "9" 
		
		// 문자열 > 숫자로 바꾸기. 
		String s5 = "8";
		int s6 = Integer.parseInt(s5);
		System.out.println("문자열 8을 숫자로 바꾼값 : "+ s6);
		String s7 = "3.1234";
		double s8 = Double.parseDouble(s7);
		System.out.println("문자열 "+s7+"을 숫자로 바꾼값 : "+ s8);
		
		String s9 = "5"; 
		char s10 = s9.charAt(0);
		System.out.println(s10); // '5'
		int s11 = s10-'0';
		System.out.println(s11); // 5  
		
		
		String s12 = "123";
		char s13 = s12.charAt(0);
		System.out.println(s13); // '2'
		
		// s14에서 문자 5를 가져와서 숫자 5로 변경해보세요 
		String s14 = "876.5";
		//            01234
		char s15;
		int s16; 
		
		s15 = s14.charAt(4);
		s16 = s15 -'0';
		System.out.println("문자 "+s15+"를 숫자로 변경한 값: "+s16);
		

	}

}

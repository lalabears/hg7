package j0522;

import java.util.Scanner;

public class C0522_05 {

	public static void main(String[] args) {
		/*
		 연산자 : 연산을 수행하는기호 
		     	피연산자 연산자 피연산자
		     	   1     +     2
		 1. 증감연산자 (단항연산자) : 피연산자를 1씩 증가 혹은 감소시키는 연산자
		    ++n  : 먼저 피연산자를 1 증가 시킨후 나머지 연산수행 
		    n++  : 연산 수행 후 피연산자를 1 증가 
		    --n  : 먼저 피연산자를 1 감소 시킨후 나머지 연산수행
		    n--  : 연산 수행 후 피연산자를 1 감소  
	    */
		// 독립적으로 사용했을때 전위형, 후위형은 차이가 없다 
		int a = 10 , b = 10 ; 
		a++;  // a 11
		b--;  // b 9 
		--a;  // a 10 
		++b;  // b 10 
		System.out.println(a);
		System.out.println(b);
		// 다만, 다른 연산자와 함께 사용했을때. 
        // 전위형은 먼저 증가시키고 다른연산에 사용 후위형은 다른연산을 먼저 수행하고 증가시킴
		// a = 10, b = 10 
		int c = ++a + b++;
	    //       11 + 10  => c: 21 
		//            11
		System.out.printf("a: %d  b: %d  c: %d \n", a,b,c);
		// 부호연산자 -는 피연산자 부호를 반대로 변경, +는 아무일도 일어나지 않음 
		int d = -11; 
		d = +d;
		System.out.println(d);
		d = -d;  // - -11 > 11 
		System.out.println(d);
		
		// 산술연산자  + - * / %(나머지연산자) : 피연산자로나누고 남은 나머지를 반환 
		int n1 = 10, n2 = 4; 
		System.out.printf("더하기 연산자 : %d + %d = %d \n", n1,n2,n1+n2);
		System.out.printf("빼기 연산자  : %d - %d = %d \n", n1,n2,n1-n2);
		System.out.printf("곱하기 연산자 : %d * %d = %d \n", n1,n2,n1*n2);
		System.out.printf("나누기 값 : %d / %d = %.3f \n", n1,n2,(double)n1/n2);
		System.out.printf("나누기 몫 : %d / %d = %d \n", n1,n2,n1/n2);
		System.out.printf("나누기 나머지 : %d / %d = %d \n", n1,n2,n1%n2);
		
		// 비교연산자 
		/*
		  == (같다) ,  != (같지않다) ,	  >  ,	  >=  ,  <  ,  <=
		  
		  연산결과는 true , false
		   
		*/
		a = 5; 		b = 2; 		c = 5;
		System.out.println( a == b ); // false
		boolean result = (a != b); 
		System.out.println(result);  // true (같지 않기 때문에)
		System.out.println( a == c );
		System.out.println( a != c );  // false : 같기때문에 
		System.out.println( a >= b);
		System.out.println( a > c);  // false 
		System.out.println( a < b );
		System.out.println( a <= c ); // true
		char c1 = 'A', c2 = 'B'; 
		System.out.printf("10 == 10.0f 결과: %b  \n", 10 == 10.0f );
		System.out.printf("'0' == 0 결과: %b    \n ", '0' == 0 );
		System.out.printf("%c == 65 결과: %b    \n ",c1,c1 == 65); 
		System.out.printf("%c > %c 결과: %b  \n ",c1,c2, c1>c2 );
		System.out.printf("%c+1 == %c 결과: %b \n" , c1,c2, c1+1 == c2 );
		System.out.printf(" ++%c != %c 결과: %b \n" , c1,c2, ++c1 != c2 );
		// 문자열을 비교할때는 == 로 비교할 수 없고 대신 equals를 사용해야한다. 
		String str1 = "java";
		String str2 = new String("java"); 
		System.out.printf(" %s  %s \n",str1, str2);
		System.out.printf(" %s == %s : %b \n",str1, str2, str1==str2);
		System.out.printf(" %s == %s : %b \n",str1, str2, str1.equals(str2));
		/* 논리연산자 : 주어진 논리식을 판단해 참, 거짓을 결정하는 연산자 
		 	&& (and)  :  논리식 모두 참이면 참 (하나라도 거짓이면 거짓)
		 	|| (or)   :  논리식 중 하나라도 참이면 참 (둘다 거짓이면 거짓)
		 	!  (not)  :  논리식결과가 참이면 거짓, 거짓이면 참 
		*/
		// 현재 들어 있는 값 : a = 5; 		b = 2; 		c = 5;
		System.out.println( (a > b) &&  (a == b)  );   // 참&&거짓 : 거짓
//                        5>2 : true     5 == 2 : false    
		System.out.println( (a > b) ||  (a == b)  );   // 참||거짓 : 참 
		
		System.out.println( !(a>b) );
		System.out.println( !(a==b) );
		
		a = 5;	b = 0;
		// a,b 출력
		System.out.printf("%d %d \n",a,b);
		// a != 0 || ++b!=0 의 결과값
		System.out.printf(" %b \n", (a != 0) || ( ++b != 0 )  );
		
		//                            true        1  != 0 true
		// a,b 출력
		System.out.println(b);
		// a == 0 && b--!=0 의 결과값
		// System.out.printf(" %b \n", (a != 0) && ( --b == 0)   );
		//                            true         -1 == 0 false  > false 
		System.out.printf(" %b \n", (a != 0) && ( b-- == 0)   );
		//                             true       0 == 0 true
		// a,b 출력
		 // 0 <=  a  <= 10
		System.out.println( (0 <= a) && ( a <= 10 ) );
		// 3의 배수이거나 4의 배수인 수 
		System.out.println( ( a % 3 == 0 ) || (a % 4 == 0));
		
		/* 대입연산자 :   = : 오른쪽 피연산자를 왼쪽피연산자에 대입
		         a = 10  : 10을 a에 대입 
		   += , -=, *=, /=, %= 
		*/
		int n = 7;
		n = n + 2 ; // 7 + 2 값을 n에 대입 
		n += 2;   // 9 + 2 > 11 을 n에 대입 
		n =+ 3 ;  // n에  3을대입
		n -= 2;   // n = 1
		n =-2;    //n에 -2값을 넣는다. 
		// 삼항연산자. 
		// ( 조건식 )  ?  참일때반환값 : 거짓일때반환값 
		System.out.println( (10 > 2) ?  10 : 2  );
		System.out.println( (10 < 2) ?  "참" : "거짓"  );
		System.out.println( (10 == 2) ?  'A' : 'B'  );
		int r1 =  (10 > 2) ?  10 : 2 ;
		String r2 = (10 < 2) ?  "참" : "거짓" ;
		char r3 = (10 == 2) ?  'A' : 'B' ;
		
		int x=13, y=25; 
		// 두 수 중 작은 수 반환 하는 삼항연산식  
		int res1 = ( x < y ) ? x : y ;
		System.out.printf("%d와 %d 중 더 작은 숫자는 %d 입니다 \n", x, y, res1);
		
		// Q. 절대값으로 만드는 삼항식 만들어보기 :음수면 양수로 양수면 그대로 
		int z = -10 ; // -10,  -10 > 10 이 되도록 
		int absz= ( z >= 0 ) ? z : -z ;
		System.out.printf("%d의 절대값은 %d입니다 \n", z, absz);
		
		// Q. 삼항식을 이용해서 입력받은 문자가 영문자이면 영문자입니다 아니면 아닙니다 라고 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자를 입력해주세요");
		String ch = scan.nextLine(); // "a"
		char ch1 = ch.charAt(0);     // 'a'
		              //97                       65
		String res2 = (('a'<=ch1 && ch1<='z') || ('A'<=ch1 && ch1 <='Z')) ? "영문자": "영문자가아님";
		System.out.println(res2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

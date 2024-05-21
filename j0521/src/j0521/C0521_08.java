package j0521;
public class C0521_08 {
	public static void main(String[] args) {
		// 연산자 : 연산을 수행하는 기호 . 
		
		// 산술연산자, 비교연산자, 논리연산자, 대입연산자 =
		
		int a = 9 * 5 - 2 ; // 연산자가 3개 피연산자가 4개 
		
		// 증감 연산자 
		// 피연산자를 1씩 증가 혹은 감소시킬 때 사용하는 연산자 
		/*			++  -- 
		1. ++n   : 먼저 피연산자 값을 1 증가 시킨후 해당 연산을 수행 
		2. n++   : 해당 연산을 수행 후, 피연산자를 1 증가 
		3. --n   : 먼저 피연산자 값을 1 감소 후 해당 연산을 수행 
		4. n--   : 먼저 연산을 수행 후, 피연산자를 1 감소 */
		// 독립적으로 사용했을 경우, 전위형과 후위형은 차이가 없다. 
		int n = 1; 
		// ++ 는 1씩증가
		n++;  // 후위형
		System.out.println(n);
		++n;  // 전위형 
		System.out.println(n);
		n++; //4
		n++; //5
		n++; //6
		n++; //7
		++n; //8
		++n; //9
		System.out.println(n); // n은 얼마일까요 ? 
		// -- 1씩 감소 
		n--; // 8
		--n; // 7
		--n;  //6
		n--;  //5
		n--;  //4 
		System.out.println(n); // n은 얼마일까요 ? 
		int j=0, k=0; 
		k = 3; 
		j = ++k ; // 먼저 피연산자 값을 1 증가 시킨후 해당 연산을 수행
		System.out.println("전위형 ++n ");
		System.out.printf("k: %d \t j : %d \n",k,j);
		j=0;
		k=3; 
		j = k++; // 해당 연산을 수행 후, 피연산자를 1 증가 
		System.out.println("후위형 n++ ");
		System.out.printf("k: %d \t j : %d \n",k,j);
		
		// 전위형 후위형이 어려우면 따로 떼어내서 생각하면된다. 
		// j = ++ k ; (전위형)
		j=0; 
		k=3;
		++k;
		j = k;
		
		// j = k++ (후위형)
		j=0;
		k=3; 
		j =k;
		k++; 
		
		// 증감연산자는 피연산자의 어느쪽에 위치하는가에따라 연산 순서가 달라짐
		int x = 10;
		int y = x-- + 5 + --x; 
		// 첫번째 감소연산자는 피연산자의 뒤쪽에 위치함. 덧셈연산이 먼저 수행됨. 
		// 덧셈 연산 수행 후 감소 연산자 수행 (x = 9) (y = 10+5 )
		// 두번째 감소 연산자는 피연산자 앞에 위치함. 덧셈연산자보다 먼저 수행 
		// 즉 감소연산 수행후 덧셈 진행. (x=8) (y = 10 + 5 + 8 )
		System.out.printf("x: %d, y: %d \n",x,y);
		
		int n1 = 3, n2 = 4; 
		int n3 = 2 + n1-- + ++n2;
		//       2 + 3    +  5
		//           2       5
		System.out.printf("n1: %d, n2: %d, n3: %d \n ",n1, n2 , n3 );
		
		int m = 1;
		m = m + 1; 
		m += 1; 
		m++;
		
		// 부호 연산자.  -는 피연산자의 부호를 반대로 변경, +는 아무일도일어나지않음
		int c = -3; 
		c = +c; 
		System.out.println(c);
		int d = -3; 
		d = -d;
		System.out.println(d);
		// 형변환 연산자 : 변수 또는 상수의 타입을 다른타입으로 변환하는것. 
		// (자료형)피연산자 
		double h1 = 11.1234;
		int h2 = (int)h1;
		System.out.println(h1+"을 int로 형변환: "+h2);
		System.out.println(  (char)65  ); // 'A'
		System.out.println(  (int)'a'  ); //  97
		System.out.println(  (float)6  ); // 6.0
		System.out.println(  (int)3.14 ); // 3
		// 자동형변환 
		float f = 123; 	// (float)123; (float)가 생략됨 
		System.out.println(f); // 123.0
		
		// int f2 = 4.12f; // 자료손실이 생김. 소수점이하 사라지니까. 
		int f2 = (int)4.12f;
		System.out.println(f2); // 4 
		// 즉, 기존의 값을 최대한 보존할 수 있는 타입으로 자동형변환이 된다. 
		
		// double > float > long > int > 나머지.. 
		char ch1 ='A';
		char ch2 ='a';
		System.out.println(ch1+ch2);
		// 연산의 최소단위는 int 타입이다. 
		// 65+97로 자동변환 연산이 되여서 162가 결과로 나온다
		
		byte t1 = 100;
		byte t2 = 3; 
		int t3 = t1+t2; 
		byte t4 = (byte)(t1+t2); 
		//  
		int num1 = 1000000;
		int num2 = 2000000;
		int num3 = num1 * num2 ;  // int * int = int
		long num4 = num1 * num2 ; // int * int = int int값을 long에 넣어준것이됨
		// 오버플로우발생. int는 21억까지만 담을 수 있음
		System.out.println(num4); 
				
		int num5 = 1000000;
		int num6 = 2000000;
		long num7 = (long)num5 * num6; // long * int , int * long = long 
		System.out.println(num7); // 원하는 값을 출력할 수 있음. 
		// float / int  = float 
		
		char c1 = 'a';
		System.out.println(c1);
		char c2 = 97;
		System.out.println(c2);
		char c3 = 65;
		System.out.println(c3);
		char c4 = (char)(c2+1);
		System.out.println(c4);
		char c5 = ++c2;
		System.out.println(c5);
	    char c6 = c3++;
	    System.out.println(c3);  // c6에 값을 대입후 1증가 'B'
	    System.out.println(c6);  // 1증가 전 값이 대입됨 'A'
		
		

	}

}

package j0521;

public class C0521_11 {

	public static void main(String[] args) {
		// 대입연산자  = : 오른쪽피연산자를 왼쪽피연산자에 대입함
		/*
		 =  : 오른쪽피연산자를 왼쪽피연산자에 대입함.  
		 += : 왼쪽피연산자에 오른쪽 피연산자를 더한 후 그 결과값을 왼쪽피연산자에 대입
		 -= : 왼쪽피연산자에 오른쪽 피연산자를 뺀 후 그 결과값을 왼쪽피연산자에 대입
		 *= : 왼쪽피연산자에 오른쪽 피연산자를 곱한 후 그 결과값을 왼쪽피연산자에 대입
		 /= : 왼쪽피연산자에 오른쪽 피연산자를 나눈 후 그 결과값을 왼쪽피연산자에 대입
		 %= : 왼쪽피연산자에 오른쪽 피연산자를 나눈 후 그 나머지값을 왼쪽피연산자에 대입
		*/
		int num = 10 ; // 10을 num에 대입 
		System.out.println(num); // 대입된 값 10이 출력됨 
		System.out.println( num = 20 ); // num에 20을 대입해서 20이 출력 
		System.out.println(num); // 확인해보면 20이 있다는 것을 알 수 있다.
		// num = num + 2;  
		num += 2 ; // num에 2를 더한 후 그 값을 다시 num에 대입 
		System.out.println("num+=2 : "+num);  // 20+2 > 22 를 num에 대입 
		num -= 3 ; // num(22)에 3을 뺀 후 (19) 그 값을 다시 num에 대입 
		// num = num - 3
		System.out.println("num-=3 : "+num);  // 22-3 = 19  
		num *= 5 ; // num = num * 5
		System.out.println("num*=5 : "+num);
		num /= 7 ; // num = num / 7
		System.out.println("num/=7 : " + num);
		num %= 3 ;  // num = num % 3 
		System.out.println("num/=3 : " + num);
		
		// 연산자의 순서가 매우 중요함. 다른의미가 될 수 있음 
		int n1 = 5, n2 = 5 , n3 = 5; 
		n1 = n1 - 2 ; 
		n2 -= 2 ; 
		n3 =-2;  // -2 값을 n3에 대입해줌 
		System.out.printf("n1: %d, n2: %d, n3: %d \n",n1,n2,n3 );
		
		
	}

}

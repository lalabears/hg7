package j0527;

import java.util.Scanner;

public class C0527_02 {

	public static void main(String[] args) {
		/* 반복문 - for, while, do-while 
		for( 초기식 ; 조건식 ; 증감식 ){
			조건식이 참인동안 실행되는 코드 
		}
		초기식 > 조건식(참) > 실행코드 > 중괄호끝 
		증감식 > 조건식(참) > 실행코드 > 중괄호끝 
		증감식 > 조건식(거짓) > for문 종료 
		
		초기식;
		while(조건식){
			조건식이 참인동안 반복적으로 실행되는 코드;
			증감식;
		}
		조건식(참)  > 실행코드 (증감식이 보통 내부에있음) > 중괄호끝 
		조건식(거짓) > while 종료  
		 
		초기식;
		do{
			조건식이 참인동안 반복적으로 실행되는 코드(최초1회는 무조건실행)
			증감식;
		} while(조건식) ;   // 세미콜론 ; 은 필수 
		실행코드 (증감식은 보통 내부에있음) > 중괄호끝
		조건식(참) > 실행구문 (증감식) > 중괄호끝
		조건식(거짓) > do-while 종료  
		
		*/
		for(int i = 0 ; i < 5 ; i ++ ) {
			System.out.printf("for문이 %d번째 반복중 \n",i);
		}
		// System.out.printf("for문이 종료된 후 i 값 : %d",i);
		// i는 for문안에서만 사용하는 변수 이므로 출력이 불가능하다.
		int k = 0;  //초기식
		while(k<5) {  // 조건식
			System.out.printf("while문이 %d번째 반복중\n",k);
			k++; // 증감식, 생략하게되면 언제나 5보다 작은것을 만족하므로 무한루프
		}
		System.out.printf("while문이 종료된 후 k 값 : %d \n",k);
		int m = 0; // 초기식
		do {
			System.out.printf("do-while문이 %d번째 반복중\n",m);
			m++; //증감식 
		} while(m<5);  // 조건식 반드시 ;으로 끝마쳐야함
		System.out.printf("do-while문이 종료된 후 n 값 :%d\n",m);
		
		int p = 7 ; // 초기식
		while(p<5) { // 조건식  (조건을 만족하지 않아 while문 실행x)
			System.out.println("p : "+p);
			p++; // 증감식
		}
		int q = 7; // 초기식
		do {
			System.out.println("q : "+q);
			q++; // 증감식
		} while(q<5); // 조건식 (조건을 만족하지 않아 dowhile종료)
		
		// 1 - 10 까지의 합. 
		int sum = 0 ; 
		for(int i = 1; i<11;i++) {
			// System.out.println(i);
			sum = sum + i; 
		}
		System.out.println("1-10까지의  합 : " + sum );
		int j = 1;
		sum = 0 ; 
		while(j<11) {
			// System.out.println(j);
			sum += j;
			j++;
		}
		System.out.println("1-10까지의  합 : " + sum );
		
		// 1 - 100 까지 홀수의 합을 for문을 사용해서 출력해보세요 
		int sum100 = 0 ;
		// 1. 증감식 사용해서 
		for(int i = 1 ; i <= 100 ; i+=2 ){
			//System.out.println(i);
			sum100 += i ; 
		}
		System.out.println("1-100까지의  홀수합 : " + sum100 );
		// 2. if문 사용해서 
		sum100 = 0 ;
		for(int i = 1 ; i <=100 ; i++) {
			if (i%2 == 1) {
				// System.out.println(i);
				sum100 += i ; 
			}
		}
		System.out.println("1-100까지의  홀수합 : " + sum100 );
		
		Scanner scan = new Scanner(System.in);
		// 입력받은 모든 수를 더하기. (while 문 을 사용해서)
		// 입력 : 1 2 3 4 5 0 > 출력 15
		// 입력 : 1 3 5 0 > 출력 9 
		int n = 1, sumn=0;
		while( n != 0 ) { 
			System.out.println("입력받은 모든 수를 더하세요(종료:0)");
			n =scan.nextInt();
			sumn += n ;
		}
		System.out.println("입력받은 숫자의 합: "+sumn);
		boolean run = true; 
		sumn=0;
		while( run ) { 
			System.out.println("입력받은 모든 수를 더하세요(종료:0)");
			n =scan.nextInt();
			if ( n == 0 ) {
				run = false; 
			}
			sumn += n ;
		}
		System.out.println("입력받은 숫자의 합: "+sumn);
		
		
		
		
		
		
		
		// 1. 숫자 두개를 입력받아 n1에서부터 n2까지의 합을 구해보세요 . 
		int n1=0, n2=0, sum12=0;
		System.out.println("첫번째숫자를입력해주세요");
		n1 = scan.nextInt();
		System.out.println("두번째숫자를입력해주세요");
		n2 = scan.nextInt();
		// n1은 작은값 n2는 큰값이 들어가도록 해야함 . 
		int temp=0; //임의의 변수를 만듦
		if(n2<n1) {
			//n1과 n2의 값을 서로 바꿔주어야함. 
			temp = n1 ; // temp에 n1의 값을 넣어둠. 
			n1 = n2;    // n1에는 n2값이 들어감  
			n2 = temp;  // n2에  n1값을 넣어줌 
		}
		// for문에서 조건식 생략하면 true로 간주해 무한루프
		for(int i = n1 ; i<= n2 ; i++) { 
			sum12 += i ; 
		}
		System.out.printf("%d ~ %d 숫자의 합은 %d\n",n1,n2,sum12);

	}

}

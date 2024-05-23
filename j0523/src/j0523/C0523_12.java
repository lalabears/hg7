package j0523;

public class C0523_12 {

	public static void main(String[] args) {
		// 반복문 : 조건을 만족하는 동안 { } 수행 (0~n번)
		/*
		for 문은 실행구문을 반복적으로 수행하는 반복 제어문으로 일반적으로 반복 횟수가정해짐
		for( 초기식 ; 조건식 ; 증감식 ) {
			조건의 결과가 참인동안 반복적으로 실행하고자 하는 코드들 
		}
		for문은 반드시 세미콜론이 두개 있어야 함. 
		초기식: for문이 시작될때 딱 한번만 실행되고 다시는 실행되지 않음 
		      for문안에서만 사용하는 변수는 주로 초기식에서 초기화함.
		조건식: 이 조건식의 결과가 true인 동안 실행구문을 계속 반복함
		      만약 조건식의 결과가 false가 나오면 더이상 반복하지 않고 for문 종료
		증감식: for문의 실행구문이 모두 수행된 후 중괄호를 만나면 다음번 반복을위해 
		      다시 이동하는 위치. 매회 반복이 수행될때마다 호출됨 
		초기식 > 조건식(참) > 실행구문
		중괄호끝 > 증감식 > 조건식(참) > 실행구문
		중괄호끝 > 증감식 > 조건식(참) > 실행구문
		중괄호끝 > 증감식 > 조건식(거짓) > for문 종료 
		*/
		// i 는 for문안에서만 사용하는 변수 > 조건식, 증감식을 위해 사용하는 변수 
		for (int i = 0 ; i < 3 ; i ++) {  // for문안에서만 사용할 변수 i 선언
			System.out.println("출력");
		}
		
		// main에서 사용할 변수로 j 선언 
		int j = 0 ; // 자료형 변수명 = 값;  

		for (j = 0 ; j < 3 ; j ++) {
			System.out.println( j + "출력");
		}
		System.out.println("j 값은 " + j);
		for (int i = 1 ; i <= 3 ; i ++ ) {
			System.out.println( i + "출력");
			j++; 
		}
		System.out.println("j 값은 " + j);
		// 초기식과 증감식은 쉼표로 구분해 여러개 동시에 사용 할 수 있다 
		for (int i = 0, k = 0 ; ( i + k ) < 10 ; i++, k++) {
			System.out.printf("i: %d, k: %d, (i+k): %d\n",i,k,i+k);
		}
		/*
			for (초기식 ; ; 증감식 ){
				실행구문
			}
			보통 조건식을 생략하면 true로 간주하고 무한루프가 된다 > 사용에 주의해야함 
			그래서 이럴 경우에는 특정부분에 break를 두어 빠져나가게 한다. 
		*/
		for (int i = 0; ;i++) {
			if(i==3) break;
			System.out.println(i);
		}
		int m = 0 ; 
		for(;;m++) {
			if(m==2) break;
			System.out.println(m);
		}
		m=0;
		for(;;) {
			if(m==2) break;
			System.out.println(m);
			m++;
		}
		
		// 1. for 문을 사용해서 1에서 부터 100까지 옆으로 출력해주세요 
		// 1 2 3 4 5 
		for (int i = 1 ; i <= 100 ; i++ ) {
			System.out.print(i + " ");
			// if(i==100) System.out.print("\n");
		}
		System.out.println();
		// 2. [자바수업입니다]를 5번 출력해주세요 
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("자바수업입니다");
		}
		// 3. 1-100까지의 5의 배수를 출력해보세요 
		// for문 + if문써서 
		for (int i = 1 ; i <= 100 ; i++ ) {
			if ( i % 5 == 0 ) {
				System.out.print(i + " ");
			}
		}
		System.out.println(); // 줄바꿈
		for (int i = 0 ; i <= 100 ; i+=5)
			System.out.print(i+" ");
		System.out.println(); // 줄바꿈
		// 10에서부터 1까지 역순으로 출력해보세요 
		for (int i = 10 ; i >= 1 ; i--) {
			System.out.println(i);
		}
		
		
		for (int i = 0;i<5;i++) {
			System.out.println( (i+1) +" 번째 반복 실행중 " );
		}
		
		
		
	} // main 

}

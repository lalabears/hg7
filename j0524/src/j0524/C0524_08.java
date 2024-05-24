package j0524;

import java.util.Scanner;

public class C0524_08 {

	public static void main(String[] args) {
		// 반복문 while 
		/*
		while 도 중괄호안 { } 의 실행구문을 반복적으로 실행하는 반복문으로 
		조건식이 true인 동안 반복이 지속됨 
		초기식;
		while(조건식){
			조건식이 참인동한 반복적으로 실행되는 코드들 ;
			보통 증감식은 while안에 위치함. ;
		}
		조건식(참) > 실행구문 > 증감식 > 중괄호끝
		조건식(참) > 실행구문 > 증감식 > 중괄호끝
		조건식(거짓) > while문종료 
		*/
		int i = 0 ; // 초기식
		while( i < 5 ) {  // 조건식 
			System.out.printf("while문이 %d번째 반복중입니다.\n",i);
			i++; // 증감식 > 증감식을 삭제하면 무한루프에빠질수 도 있다. 
		}
		System.out.printf("while문이 종료된 후 i값은 : %d 입니다.\n",i);
		
		// 1 -10 까지 출력 
		System.out.println("for 1-10출력");
		for(int j = 1 ; j<11;j++) {
	   // for( 초기식 ; 조건식 ; 증감식)
			System.out.println(j);
		}
		System.out.println("while 1-10출력");
		int j = 1; // 초기식
		while (j<11) { // 조건식
			System.out.println(j);
			j++; // 증감식 
		}
		
		// while 문을 사용해서 10 > 1 까지 역순으로 출력해보세요 
		System.out.println("while 카운트다운");
		int countDown=10; 
		while( countDown > 0 ) {
			System.out.println(countDown);
			countDown--;
		}
		// while문을 사용해서 1-100까지의 짝수합, 홀수합, 전체합 구하기
		//                            2550  2500   5050
		i = 0 ;
		
//		System.out.println("-----------------");
//		while( i < 5 ) {
//			//i = 0 ;  // 초기식을 while안에 넣는경우 > 무한루프
//			System.out.println(i);
//			//i++; // 증감식 생략 > 무한루프
//		}
//		
		int sume=0, sumo=0; 
		i = 1 ;
		while( i < 101) {
			if(i%2==0) {
				sume += i ;
			}else {
				sumo += i; 
			}
			i++;
		}
		
		
		System.out.printf("짝수합:%d, 홀수합:%d, 전체합:%d\n", sume,sumo,sume+sumo);
		
		
		Scanner scan = new Scanner(System.in);
		//원하는 구구단을 입력받아서 4
		//while을 사용해서 4단을 출력해보세요 
		System.out.println("원하시는 단을 입력해주세요: ");
		int dan = scan.nextInt();
		int gob = 1; 
		while(gob<10) {
			System.out.println(dan +"*"+gob+"="+(dan*gob));
			gob++;
		}
		
		
		
		
		// 숫자를 5개 입력받아 숫자 5개의 합을 구하세요 while문을 사용해서 
		// 입력을 1,2,3,4,5 (사용자가입력)
		// 출력 : 합은 : 15 
		// 1. 변수선언
		int n = 0, sum = 0 ; // sum 0 + 1  -> 1 
		// 2. while 문 사용
		i = 0 ; 
		while (i<5) {
			System.out.println("숫자를 입력: ");
			n = scan.nextInt();
			sum = sum + n; 
			i++;
		}
		// 3. 출력
		System.out.println("합은 : " + sum);
		
		
		
		

	}

}

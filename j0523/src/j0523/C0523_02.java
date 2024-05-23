package j0523;

import java.util.Scanner;

public class C0523_02 {

	public static void main(String[] args) {
		// 두 수를 입력받아 두수의 곱을 맞추는 프로그램을 구현하세요
		// 1. 두수를 입력받아 출력.
		// 2. 두수의 곱의 정답을 입력받아 맞으면 정답 틀리면 오답이라고 출력하기 
		Scanner scan = new Scanner(System.in);
		int n1=0, n2=0, res=0; 
		System.out.println("첫번째 수를 입력해주세요");
		n1 = scan.nextInt();
		System.out.println("두번째 수를 입력해주세요");
		n2 = scan.nextInt();
		// 큰수 작은수 출력해보기 
		/*10, 12를 입력받는다면 
		큰수 : 12		작은수: 10
		40, 20 을입력 받는다면
		큰수 : 40 		작은수 : 20
		23, 23 을 입력받는다면		두수가 같습니다 
		라고 출력하기. */
		// 두 수 비교하기 
		if(n1 > n2) {
			System.out.println("큰수 : "+n1);
			System.out.println("작은수 : "+n2);
		}else if( n1<n2) {
			System.out.println("큰수 : "+n2);
			System.out.println("작은수 : "+n1);
		}else {
			System.out.println("두수가 같습니다");
		}
				
		
		
		// 오답입니다, 정답입니다 가 출력 
		System.out.printf("[%d * %d]는 얼마일까요 ? : ",n1,n2);
		res = scan.nextInt();
		if( n1*n2 == res ) {
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}
		
		
	
		
		
	}

}

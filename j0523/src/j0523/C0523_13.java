package j0523;

import java.util.Scanner;

public class C0523_13 {

	public static void main(String[] args) {
		// 1-45 랜덤한 숫자를 생성합니다.  
		// 5번의 기회를 줍니다 (입력할 수 있는 기회) 
		// 만약 정답이면 정답입니다 하고 for문 종료 
		// 오답이면 5번의 기회를 주고 그래도 맞추지 못하면 
		// for문 종료이후 정답을 출력해서 보여주기 
		Scanner scan = new Scanner(System.in);
		// 1. 변수 선언 및 입력
		int randnum = 0, inputnum = 0; 
		randnum = (int)(Math.random()*45)+1; 
		// 2. 연산
		for(int i = 0 ; i < 5 ; i++ ) {
			// 5번을 반복하겟다
			System.out.println((i+1)+"번째 입력입니다.(5번기회, 1-45사이의 숫자)");
			inputnum = scan.nextInt();
			if(randnum == inputnum) {
				System.out.println("정답입니다!!!");
				break; 
			}else {
				System.out.println("오답입니다 다시입력해주세요 ");
			}
		}
		
		// 3. 출력 
		System.out.println("정답은 : " + randnum );
	}

}

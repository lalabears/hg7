package j0528;

import java.util.Arrays;
import java.util.Scanner;

public class C0528_06 {

	public static void main(String[] args) {
		// 1 - 100 사이의 랜덤한 숫자 하나를 발생시켜 맞추는 프로그램
		// 총기회는 10번
		// 입력했던 모든 수를 배열에 저장함. 
		// 입력한 숫자가 랜덤숫자보다크면 [더 작은수를 입력해주세요]
		// 입력한 숫자가 랜덤숫자보다작으면 [더 큰수를 입력해주세요] 라고 출력 
		// 무한 반복문으로 만들기. 
		Scanner scan = new Scanner(System.in);  
		//1. 변수선언
		int rNum; // 1 - 100 사이 랜덤한 숫자. 
		int uNum ; // 사용자가 입력할 숫자. 
		int[] nums = new int[10]; // 사용자가 입력햇던 숫자들 
		
		int cnt = 0; // 몇번째인지 세는 0 번부터~9번까지 셀예정
		// 랜덤숫자
		rNum = (int)(Math.random()*100)+1; // 1-100사이의 랜덤한숫자
		
		//2. 무한루프
		loop: while(true) {
			System.out.println("숫자를 입력해주세요 (기회10번 중 )"+(cnt+1)+"번째");
			// 숫자 입력 받기
			uNum = scan.nextInt();
			
			nums[cnt] = uNum;
			if(cnt==9) { 
				if ( rNum == uNum) {
					// 랜덤숫자와같은경우
					System.out.println("정답입니다!");
					break loop; 
				}
				System.out.println("기회를 전부 소진하셨습니다. ");
				break; 
			}
			// 숫자 비교 하기
			if ( rNum == uNum) {
				// 랜덤숫자와같은경우
				System.out.println("정답입니다!");
				break; 
			}else if(uNum > rNum) {
				// 랜덤숫자보다 큰경우
				System.out.println("입력하신 숫자보다 더 작은수를 입력해주세요");
			} else {
				// 랜덤숫자보다 작은경우
				System.out.println("입력하신 숫자보다 더 큰수를 입력해주세요");
			}
			cnt++;
			
		}// while

		System.out.println("총 도전횟수는 : "+ (cnt+1) );
		System.out.println("입력하신 숫자들은 ");
		for(int i = 0 ; i <= cnt; i ++ ) {
			if (i == 0 ) System.out.print(nums[i]);
			else System.out.print(", " +nums[i]);
		}
			
		
	}// main

}//class

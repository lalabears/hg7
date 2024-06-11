package lottopkg;
import java.util.Scanner;
public class Lotto {
	static Scanner scan = new Scanner(System.in);
	// 2. 1-45 사이의 숫자 넣기
	void lottoInput(int[] arr) {
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = i+1;
		}
	} 
	// 3. 숫자 랜덤하게 섞기 
	void lottoShuffle(int[] lotto) {
		int temp, n ; 
		for(int i = 0 ; i< 500 ; i++) {
			n=(int)(Math.random()*45);
			temp = lotto[0];
			lotto[0] = lotto[n];
			lotto[n] = temp; 
		}
	}
	// 4. 6개 번호 넣기 
	void myInput(int[] input) {
		for(int i = 0; i <input.length;i++) {
			System.out.println((i+1)+"번째숫자입력:");
			input[i] = scan.nextInt();
		}
		
	}
	// 5. 당첨번호 6개 출력 - 6개의 랜덤한 숫자 
	void lottoPrint(int[] lotto) {
		System.out.println("로또 당첨 번호 : ");
		for(int i = 0; i<6 ; i++) {
			System.out.print(lotto[i]+ " ");
		}
		System.out.println();
	}
	// 6. 자신번호 6개 출력
	void myNumPrint(int[] input){
		System.out.println("입력한 번호 : ");
		for(int i = 0; i<input.length ; i++) {
			System.out.print(input[i]+ " ");
		}
		System.out.println();
		
	}
	// 7. 당첨번호 개수확인 : - win 배열 채우기 
	int lottoCnt(int[] lotto, int[] input, int[] win) {
		int num=0;
		for(int i = 0 ; i < 6 ; i++ ) {
			for(int j = 0; j< 6 ; j++) {
				if(lotto[i]==input[j]) {
					win[num]= lotto[i];
					num++; 
					break; // j-for 탈출 
				}
			}
		}
		return num; 
	}
	// 8 당첨번호 개수, 번호 출력 : lottoNo() - 최종결과 출력하기
	void lottoNo(int num,int[] win) {
		System.out.println("당첨 개수 : "+ num);
		System.out.println("당첨된 번호:");
		if(num==0) {
			System.out.println("당첨번호가 없습니다.");
		}else {
			for(int i =0 ; i <num ; i++) {
				System.out.print(win[i]+" ");
			} // for
		} // if
		System.out.println();
	} // lottoNo
}

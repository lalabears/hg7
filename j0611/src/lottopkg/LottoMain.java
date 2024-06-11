package lottopkg;
import java.util.Arrays;
import java.util.Scanner;

import lottopkg.Lotto;
public class LottoMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 객체선언 및 변수 생성 
		Lotto lo = new Lotto(); 
		int[] lotto = new int[45]; //{0,0,..0}
		int[] input = new int[6]; // 내가입력한숫자
		int[] win = new int[6];   // 당첨된번호
		int count = 0 ;           // 입력 횟수
		int num = 0;              // 당첨개수 
		// 2. 1-45 사이의 숫자 넣기
		lo.lottoInput(lotto); 
		// 3. 숫자 랜덤하게 섞기 
		lo.lottoShuffle(lotto);
		// 4. 6개 번호 넣기 
		lo.myInput(input);
		// 5. 당첨번호 6개 출력 - 6개의 랜덤한 숫자 
		lo.lottoPrint(lotto);
		// 6. 자신번호 6개 출력
		lo.myNumPrint(input);
		// 7. 당첨번호 개수확인 : lottoCnt() - win배열 채우기
		num = lo.lottoCnt(lotto,input,win);
		// 8 당첨번호 개수, 번호 출력 : lottoNo() - 최종결과 출력하기
		lo.lottoNo(num, win);
		
		
		
		
	}

}

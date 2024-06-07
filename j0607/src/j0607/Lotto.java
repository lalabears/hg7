package j0607;

import java.util.Arrays;

public class Lotto {
	// 1. 변수 
	// 로또6개를 담을수 있는 변수 []
	int[] lotto6 = new int[6]; 
	int bonus ;   // 보너스 번호 용 인스턴스 변수
	
	// 3. 메서드 
	// generateLotto 메서드를 만들어서 6개의 로또번호를
	// lotto6에 넣어보세요. 
	void generateLotto() {
		// 1-45 배열생성.
		int[] lotto45 = new int[45];
		for(int i = 0 ; i < lotto45.length; i++) {
			lotto45[i] = i+1; 
		}
		// 랜덤하게 섞기 
		for(int i = 0 ; i<500; i ++) {
			int n = (int)(Math.random()*45);
			int temp = lotto45[0];
			lotto45[0] = lotto45[n];
			lotto45[n] = temp;
		}
		// lotto6 배열 채우기 
		for(int i = 0 ; i<lotto6.length; i++) {
			lotto6[i] = lotto45[i];
		}
		// 보너스 번호 추가 
		bonus = lotto45[6]; 
	} // generateLotto
	
	
	void generateLotto( int a ) {
		// 1-45 배열생성.
		int[] lotto45 = new int[45];
		for(int i = 0 ; i < lotto45.length; i++) {
			lotto45[i] = i+1; 
		}
		// 랜덤하게 섞기 
		for(int i = 0 ; i<500; i ++) {
			int n = (int)(Math.random()*45);
			int temp = lotto45[0];
			lotto45[0] = lotto45[n];
			lotto45[n] = temp;
		}
		
		lotto6[0] = a;
		// lotto6 배열 채우기 
		int j = 1 ; 
		for(int i = 0 ; i< 10 ; i++) {
			if ( lotto45[i] == a ) continue;
			lotto6[j] = lotto45[i];
			j++;
			if(j == 6) {
				// 보너스 번호 추가 
				bonus = lotto45[i]; 
				break; 
			}
		}
	} // generateLotto
	
	
	
	int lottoWin(int[] myNum) { // 매개변수: 배열. 사용자로또입력값
		int count = 0;
		for(int i = 0 ; i < lotto6.length ; i++) {
			for(int j = 0 ; j <myNum.length ; j++) {
				if(lotto6[i]== myNum[j]) {
					count++;
				}
			}
		}
		return count;
	} // lottoWin
	int lottoWinBonus(int[] myNum) {
		int rank = 0,  count = 0, bck = 0;
		for(int i = 0 ; i < lotto6.length ; i++) {
			for(int j = 0 ; j <myNum.length ; j++) {
				if(lotto6[i]== myNum[j]) {
					count++;
				}
			}
		}
		// 내가 입력한 값에 보너스가 있는지 없는지 확인 
		for(int i = 0 ; i < myNum.length ; i++) {
			if(myNum[i]==bonus) bck = 1; 
		}
		// 1등 6개.  2등 5개+보너스1 . 3등 5개. 4등 4개. 5등 3개
		// bck = 1 보너스숫자가 있음 bck =0 보너스 숫자가 없음 
		if(count == 6) rank = 1; 
		else if (count ==5 ) {
			if(bck == 1) rank =2;
			else rank = 3;
		}
		else if(count == 4) rank = 4; 
		else if(count == 3) rank = 5; 
		
		return rank;
	} // lottoWin
	
	
	// printLotto 메서드를 만들어서 로또6개 번호를 출력해주기
	void printLotto() {
		System.out.println(Arrays.toString(lotto6));
	} // printLotto
	

}// Lotto class 

package j0607;
import java.util.Arrays;
import java.util.Scanner;
public class C0607_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 로또 프로그램
		// 1. 변수 선언 , 배열생성
		int[] lotto45 = new int[45]; // 1- 45 숫자로 채워진 배열
		int[] lotto6 = new int[6];   // 로또당첨번호들을 저장할 배열
		int[] myNum = new int[6];    // 내가 입력할 로또번호 
		int count = 0 ; // 당첨번호 개수 
		int temp = 0;  // 임시 저장될 값을 위한 변수
		int n = 0 ; // 랜덤 인덱스를 위해 사용될 변수 
		int[] lottoNum = new int[6]; // 당첨된 값들이 저장될 변수 
		// 2. 로또 번호 생성 (1-45사이의 랜덤한숫자 6개)
		// 2-1 . 1-45 숫자로 채워진 배열생성
		for(int i = 0 ; i < lotto45.length ; i++) {
			lotto45[i] = i+1;
		} 
		// 중복이 없는 랜덤한 숫자배열을 만들기위해서 1-45 숫자로 이루어진 배열만들기
		
		// 2-2 . lotto45배열 섞기
		for(int i = 0 ; i< 500 ; i++) { // 배열을 500번정도 섞음 
			n = (int)(Math.random()*45); // 0~44 까지의 랜덤한 숫자생성.
			temp = lotto45[0];
			lotto45[0] = lotto45[n];
			lotto45[n] = temp;
		}
		// 2-3. lotto6 배열 채우기 
		for(int i = 0 ; i< lotto6.length ; i ++) {
			lotto6[i] = lotto45[i];
		}
		// 3. 로또 번호 입력 (사람이 입력한 로또번호 6개 1-45사이의숫자)
		for(int i = 0 ; i<6 ; i++) {
			System.out.println((i+1)+"번째 번호를 입력해주세요 ");
			myNum[i] = scan.nextInt();
		}
		// 4. 로또 번호 확인 (당첨된 숫자, 번호 출력) 
		// lotto6과 myNum 배열을 비교해서 몇개나 당첨되었는지 확인 
		for(int i = 0; i <lotto6.length; i ++ ) {
			for(int j = 0 ; j< myNum.length ; j++) {
				if(lotto6[i] == myNum[j]) {
					// 당첨된 숫자가 있다면 
					lottoNum[count]= lotto6[i];
					count++; 
				}
			}
		}
		// 5. 출력 
		System.out.println("당첨개수 : "+ count);
		System.out.print("당첨번호 : ");
		for(int i = 0 ; i < count ; i++) {
			System.out.print(lottoNum[i]+" ");
		}
		System.out.println();
		System.out.println("로또번호 : " + Arrays.toString(lotto6) );
		System.out.println("나의번호 : " + Arrays.toString(myNum));
	}
}

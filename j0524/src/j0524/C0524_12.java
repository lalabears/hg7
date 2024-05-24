package j0524;
import java.util.Scanner;
public class C0524_12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1-45 사이의 랜덤한 숫자를 생성합니다. 
		// 숫자를 입력받아서 
		// 정답이면 정답. 무한루프 종료 
		// 답을 맞출때까지 무한히 입력을받는데.
		// 랜덤:16일 경우 40 을 입력하면 더 작은값입니다.
		//             10  을 입력하면 더 큰값입니다. 

		//1. 1-45 사이의 랜덤숫자 만들기 
		int randnum = (int)(Math.random()*45)+1;
		// 랜덤한 숫자가 생성되어 randnum에 저장됨. 
		int n; // 숫자를 입력할 변수 
		int count=1; // 5번의 기회를 주기위한변수 
		while (true) {
			// 5번의 기회만 주세요 
			System.out.println("숫자 맞추기게임");
			System.out.println("숫자를 입력해주세요");
			n = scan.nextInt(); // 내가 입력한 값
			// randnum과  n이 같으면 루프탈출 
			if(n == randnum) {
				System.out.println("정답!");
				break;
			} else if ( n > randnum ) {
				System.out.println("더 작은수를 입력해주세요 ");
			} else {
				System.out.println("더 큰수를 입력해주세요 ");
			}
			
		}// while
	}//main
}// class

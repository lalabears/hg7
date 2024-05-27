package j0527;

import java.util.Scanner;

public class C0527_07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1번을 누르면 1- 20 까지의 랜덤숫자 생성 
		// 2번을 누르면 숫자 맞추기게임 총 기회는 3번 
		//      3번이후에 정답을 맞추지 못하면 정답 알려주기. 
		// 3번을 누르면 while 문 종료 
		
		int random=0, input = 0, num = 0, count = 1;
		//   랜덤숫자    1-3선택  맞추기입력숫자   카운드변수
		
		loop: while(true) {
			System.out.println(" [ 숫자맞추기 프로그램 ] ");
			System.out.println(" 1. 랜덤숫자 생성 ");
			System.out.println(" 2. 숫자맞추기 게임 ");
			System.out.println(" 3. 종료 ");
			System.out.println(" ------------------ ");
			System.out.println(" 원하는 번호를 입력하세요 >> ");
			
			// input = scan.nextInt();
			String str = scan.nextLine(); 
			char ch = str.charAt(0);
			if (!Character.isDigit(ch)) {
				continue;
			}
			switch(input) {
			case 1:
				System.out.println("랜덤숫자를 생성하였습니다.");
				random = (int)(Math.random()*20)+1; 
				break;
			case 2:
				System.out.println("숫자 맞추기 게임을 선택하셨습니다(기회 3번)");
				count = 1; 
				while(count<4) {
					// 총 3번의 기회. 
					System.out.println(count+"번째 시도. 1-20사이의 숫자를 입력해주세요");
					num = scan.nextInt();
					if(random == num ) {
						System.out.println("정답!!!");
						break; // while문 종료 
					} else {
						System.out.println("오답입니다. ");
						if(count == 3) {
							System.out.println("정답은 "+random);
						}
					}
					count++;
				}
				break; // switch문 종료 
			case 3:
				System.out.println("프로그램을 종료합니다. ");
				break loop; 
			default:
				System.out.println("잘못입력하셨습니다");
			}
		}
		

	}

}

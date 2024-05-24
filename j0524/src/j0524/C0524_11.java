package j0524;
import java.util.Scanner;
public class C0524_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 통장 프로그램 
		int balance = 0 ; // 잔액
		int money = 0; 
		loop: while(true) {
			System.out.println("-----------------------------");
			System.out.println("1.입금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			int n = scan.nextInt();
			switch(n) {
			case 1:
				System.out.println("입금을 선택하셨습니다.");
				System.out.println("입금하실 금액을 입력해주세요");
				money = scan.nextInt();
				balance = balance + money; 
				break;
			case 2:
				System.out.println("출금을 선택하셨습니다.");
				System.out.println("출금하실 금액을 입력해주세요");
				money = scan.nextInt();
				if(balance<money) {
					System.out.println("잔액이 부족합니다");
				}else {
					balance = balance-money; 
				}
				break;
			case 3:
				System.out.println("잔고조회를 선택하셨습니다.");
				System.out.println("잔액 :  " + balance);
				break;
			case 4:
				System.out.println("프로그램을 종료합니다");
				break loop;
			default:
				System.out.println("없는 메뉴입니다.");
			}
		
		}// while-true
	}//main
}// class

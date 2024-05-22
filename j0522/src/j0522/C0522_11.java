package j0522;

import java.util.Scanner;

public class C0522_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int balance = 10000000; //0이 7개 
		int money; 
		// 인출할금액을 입력받아 
		System.out.println("인출하고싶은 금액을 입력해주세요 ");
		money = scan.nextInt();
		if( money > balance ) {
			// 1. 인출하려는 금액이 현재있는금액보다 크면 잔액이 모자라다고 출력
			System.out.println("잔액이 부족합니다. ");
		} else if ( money % 10000 != 0) {
			// 2. -- 만원단위가 아니면 만원단위만 인출합니다 라고 출력
			System.out.println("만원 단위만 인출합니다. ");
		} else {
			// 3. 그 외의 경우 00원을 출금합니다. 잔액은 00원입니다 라고 출력 
			System.out.println(money +"원을 출금합니다. ");
			System.out.println("잔액은 "+ (balance-money) + "원입니다");
		}
	}

}

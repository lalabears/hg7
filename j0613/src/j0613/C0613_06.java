package j0613;
import java.util.Scanner;
public class C0613_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 구매자. 1000만원들고 포인트 0인 사람 
		Buyer me = new Buyer(1000,0);
		// 기본 객체 생성 
		Tv tv = new Tv();
		Tablet tb = new Tablet();
		Pc pc = new Pc();
		
		loop:while(true) {
			System.out.println("1. 돈 충전 ");
			System.out.println("2. 티비 구매 ");
			System.out.println("3. 테블릿 구매");
			System.out.println("4. 컴퓨터 구매");
			System.out.println("5. 잔액(보너스)확인");
			System.out.println("6. 구매내역");
			System.out.println("0. 종료");
			System.out.println("-------------------");
			System.out.println("원하는 번호 입력: ");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("충전할금액을 입력해주세요");
				int money = scan.nextInt();
				me.addMoney(money);
				break;
			case 2: // 티비
				me.buy(tv);
				break;
			case 3:// 테블릿
				me.buy(tb);
				break;
			case 4://pc
				me.buy(pc);
				break;
			case 5:
				me.printInfo();
				break;
			case 6: 
				me.checkCart();
				break;
			case 0:
				break loop; 
			}
			
			
			
		}
		
		
		
		
	}

}

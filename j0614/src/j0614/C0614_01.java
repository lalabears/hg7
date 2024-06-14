package j0614;
import java.util.Scanner;
public class C0614_01 {
	public static void main(String[] args) {
	/*	int[] a = {1,2,3};
		System.out.println(a); // 배열의주소 [I@15db9742
		System.out.println(a[0]);  // 1
	
		Card c1 = new Card();  // HeartA
		System.out.println(c1); // j0614.Card@15db9742
		System.out.println(c1.kind+c1.number);
		// 클래스 : Card  > 붕어빵틀 
		//  객체 : c1 > 붕어빵
		//  객체의 인스턴스변수 :  c1.kind  > 붕어빵의 팥소
		Card c2 = new Card("Diamond","K"); //DaiK
		// 클래스 : Card  > 붕어빵틀 
		//  객체 : c2 > 붕어빵
		//  객체의 인스턴스변수 :  c2.kind  > 붕어빵의 슈크림소
		
		
		Card[] cc = {c1,c2}; 
		// 객체배열 : cc 붕어빵만 담을수 있는 봉투 
		
		
		System.out.println(cc[0]); // c[0]의 주소 :j0614.Card@6d06d69c
		System.out.println(cc[0].kind); // Heart
		System.out.println(cc[0].number); // A
		System.out.println(cc[0].a); // A

	*/	
		
		Scanner scan = new Scanner(System.in);
		Deck deck = new Deck();
		int choice=0, cnt = 20 ;
		Card[] myCard = new Card[5];
		Card[] comCard = new Card[5];
		loop:while(true) {
			System.out.println("===[포커게임]===");
			System.out.println("1.카드섞기");
			System.out.println("2.카드1장받기");
			System.out.println("3.카드5장받기");
			System.out.println("4.내카드보기");
			System.out.println("5.컴퓨터카드저장하기");
			System.out.println("6.카드교체하기");
			System.out.println("7.승부(컴퓨터카드와비교)");
			System.out.println("0.게임종료");
			System.out.println("===============");
			System.out.println("번호를 선택하세요");
			choice = scan.nextInt();
			switch(choice) {
			case 1: // 카드섞기
				deck.shuffle();
				System.out.println("카드 섞기 완료 ! ");
				break;
			case 2: // 카드 1장뽑기
				Card c = deck.pick(0); 
				System.out.println("뽑으신 카드는 : "+c.kind+c.number);
				break;
			case 3: // 카드 5장 받기 deck의 1번부터 5개 저장 
				for(int i = 0 ; i<myCard.length; i++) {
					myCard[i] = deck.pick(i+1);
				}
				System.out.println("카드 5장을 전달받았습니다");
				break;
			case 4: // 내 카드보기:myCard 출력
				for(int i = 0 ; i<myCard.length; i++) {
					System.out.print(myCard[i].kind+myCard[i].number+" ");
				}
				System.out.println();
				break;
			case 5: // 컴퓨터 카드 저장하기:comCard배열 만들어서 저장 - 
				    // 7번부터5개
				for(int i = 0 ; i<comCard.length; i++) {
					comCard[i] = deck.pick(i+7);
				}
				break;
			case 6: // 카드교체하기 myCard에 n번째 숫자를 입력받아 카드 교체하기
				System.out.println("현재 가지고 계신 카드는 .. ");
				for(int i = 0 ; i<myCard.length; i++) {
					System.out.print(i+"번 "+myCard[i].kind+myCard[i].number+", ");
				}
				System.out.println();
				System.out.println("몇번째 카드를 변경하시겠습니까 ? ");
				int num = scan.nextInt(); 
				myCard[num] = deck.pick(cnt); 
				cnt++; 
				break;
			case 7: // 상대카드 확인해서 승부하기- myCard comCard 서로 공개하기
				System.out.println("내카드");
				for(int i = 0 ; i<myCard.length; i++) {
					System.out.print(myCard[i].kind+myCard[i].number+" ");
				}
				System.out.println();
				System.out.println("컴퓨터카드");
				for(int i = 0 ; i<comCard.length; i++) {
					System.out.print(comCard[i].kind+comCard[i].number+" ");
				}
				System.out.println();
				break;
			case 0: // 종료
				break loop;
				
			}
		}
		
		
		
		
		
		
		
		
		
		
/*		// 카드객체
		Card c1 = new Card();
		System.out.println(c1.kind+c1.number);
		
		Deck deck = new Deck();
		// deck 객체 안에 c[n] 객체들이 존재함
		// c[n]의 객체는 card객체로 kind, number의 객체멤버변수(iv)를 가지고있음
		
		for(int i = 0; i<deck.c.length; i++) {
			System.out.println(deck.c[i].kind+deck.c[i].number);
		}
*/ 
		

		
		
		
	}

}

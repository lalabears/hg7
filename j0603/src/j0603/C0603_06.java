package j0603;
public class C0603_06 {
	public static void main(String[] args) {
		// 객체 선언 및 생성
		Card c1 = new Card();
		c1.kind = "heart"; // 인스턴스변수iv의 경우 객체명.인스턴스변수명
		c1.number = 1; 
		// Diamond3 객체 생성 
		Card c2 = new Card();
		c2.kind = "Diamond";		c2.number = 3;
		// Clover5 객체 생성
		Card c3 = new Card();
		c3.kind = "Clover";  		c3.number = 5;
		// Spade10 객체 생성
		Card c4 = new Card();
		c4.kind = "Spade";  		c4.number = 10;
		// 클래스 변수 cv같은 경우이는 클래스이름.변수명
		System.out.println("card 의 길이 : "+ Card.height);
		System.out.println("card 의 너비 : "+ Card.width);
		System.out.println("c1 카드 : " + c1.kind + c1.number);
		
		// 카드는 총 52장. Spade-13, Clover-13, Heart-13, Diamond-13
		// 카드배열 52칸 을 만들어서 총 52장의 카드를 만들어보세요 + 출력까지 해보세요 
		Card[] c = new Card[52]; // 객체배열 선언 및 생성
		String[] k = {"Spade", "Clover", "Heart", "Diamond"};
		
		for (int i = 0 ; i <c.length ; i++) {
			c[i] = new Card(); //  객체 생성
			c[i].number = (i%13)+1; // 1~13
			c[i].kind = k[i/13];
			// if(0<= i && i<=12 ) c[i].kind = "spade";
			// 0-12 : space, 13-25: clover, 26-38:heart, 39-51:dia
		}
		for (int i = 0 ; i <c.length ; i++) {
			System.out.println(c[i].kind+c[i].number);
		}
		// 카드의 너비랑 높이를 출력해보면. 
		System.out.println(Card.height+", "+Card.width);
		

	}

}

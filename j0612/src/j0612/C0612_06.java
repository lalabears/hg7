package j0612;

public class C0612_06 {

	public static void main(String[] args) {
		Card c1 = new Card();
		System.out.println(c1.kind+c1.number);
		// Heart1
		Card c2 = new Card("Spade","K");
		System.out.println(c2.kind+c2.number);
		// SpadeK
		
		Deck d = new Deck(); 
		for(int i = 0 ; i <52 ; i++) {
			System.out.println(d.c[i].kind+d.c[i].number);
		}
		
		// deck 클래스에서 한장의 카드를 뽑는 메서드를 만들어보세요 
		// d.pick(1) > 첫번째 카드가 나오게 만드는 메서드
		// Spade2
		
		Card c3 = d.pick(0);
		System.out.println(c3.kind+c3.number);// Spade1
		c3 = d.pick(12);
		System.out.println(c3.kind+c3.number);// SpadeK
		c3 = d.pick(52);
		System.out.println(c3.kind+c3.number);// Spade1
		c3 = d.pick(33);
		System.out.println(c3.kind+c3.number);// Heart8
		
		d.shuffle();
		for(int i = 0 ; i <52 ; i++) {
			System.out.println(d.c[i].kind+d.c[i].number);
		}
		
		
	}

}

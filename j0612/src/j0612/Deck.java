package j0612;
public class Deck {
	// iv, 객체 배열로 선언 
	Card[] c = new Card[52]; // 52 개의 카드 
	// 생성자 
	Deck() {
		for(int i = 0 ; i < c.length ; i++ ) {
			c[i] = new Card(); // 객체선언 
			// 카드 숫자 넣기 1~10JQK
			if(i%13==10) {
				c[i].number = "J";
			}else if(i%13 == 11) {
				c[i].number = "Q";
			}else if(i%13 == 12) {
				c[i].number = "K";
			}else {                   // +""는 문자열로 바꿔줌
				c[i].number = ((i%13)+1)+"";
			}
			if(i/13==0) {
				c[i].kind = "Spade";
			}else if(i/13==1) {
				c[i].kind = "Diamond";
			}else if(i/13==2) {
				c[i].kind = "Heart";
			}else {
				c[i].kind = "Clover";
			}
		} //for
	} // Deck()
	
	// 카드 한장을 리턴받는 메서드 
	Card pick(int n) {
		return c[n%52];
	}
	
	// 카드 섞는 메서드를 만들어보세요. 
	void shuffle() {
		Card temp = null; 
		int n = 0 ;
		for(int i = 0; i<500; i++) {
			n= (int)(Math.random()*52);
			temp = c[0];
			c[0]=c[n];
			c[n]=temp;
		}
	}
	
	
}

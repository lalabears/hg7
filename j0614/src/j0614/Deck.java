package j0614;      // Deck은 card를 가지고있음 has-a 관계 
public class Deck { //Deck 클래스 안에 Card 객체를생성해서 사용: 포함관계 
	// 1. 변수
	Card[] c = new Card[52];	// 카드52개를 담을수 있는 배열 생성
	// 2.생성자(기본생성자:매개변수가없음) 
	Deck() {
		for(int i = 0; i < 4 ; i++) { // 카드는 총 4종류
			for (int j = 0 ; j < 13 ; j++ ) { // 번호는 총 13개
				c[i*13+j] = new Card(Card.kinds[i],Card.numbers[j]);
				// c: 배열   
				// c[n] 번째 방에 new Card(kind,number)를 통해서 카드를 생성해라
				// static 변수는 클래스명.변수명으로 사용함
			}//for-j
		}// for - i
	} // 생성자
	// 3. 메서드 
	// 메서드에서 void는 리턴이 없을때 
	void shuffle() { 
		Card temp=null; // 참조형변수는 null
		for(int i = 0; i< 500 ; i++) {
			int ran = (int)(Math.random()*52); // 인덱스
			temp = c[0]; // c배열안에는 Card가 들어있음 
			c[0] = c[ran];
			c[ran] =temp;
		}
	}
	Card pick(int n) {
		return c[n];
	}
	

}

package j0612;
public class Card {
	String kind; // h s c d
	String number; // 1~10 j q k
	Card(){
		this("Heart","1");
	}
	Card(String kind, String number){
		this.kind = kind;
		this.number = number;
	}
}

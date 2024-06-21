package j0621;
public class Card {
	static String[] kinds = {"Spade","Heart","Diamond","Clover"};
	static String[] numbers= {"0","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	private String kind;
	private int number;
	public Card() {} 
	public Card(String kind) {
		this.kind = kind;
	}
	public Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	@Override
	public String toString() {
    	return kind + numbers[number];
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	} 
	
	
	
}

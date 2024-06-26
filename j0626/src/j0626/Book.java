package j0626;
public class Book {
	private String title;
	private int price;
	public Book(String title, int price) {
		this.title = title; 
		this.price = price;
	}
	public String toString() {
		return "제목: "+title+", 가격: "+ price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
class Novel extends Book{
	private String genre;
	Novel(String title, int price, String genre){
		super(title, price);
		this.genre = genre;
	}
	public String toString() {
		return super.toString() + ", 장르 : "+ genre;
	}
}
class Comics extends Book{
	private int sno;
	Comics(String title, int price, int sno){
		super(title, price);
		this.sno = sno;
	}
	public String toString() {
		return super.toString() + ", 권 번호 : "+ sno;
	}
}







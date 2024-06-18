package j0618;
// 책 클래스를 상속하여 소설 클래스를 만들어보세요 Novel
public class Novel extends Book{
	// 변수
	private String name;       //이름
	private String company;    //회사
	private String genre;      //장르
	private String writer;     //작가

	//생성자
	public Novel(String name, String company, String genre, String writer, int totalPageNum) {
		//멤버가 모두 private해서 생성자로 접근해야함
		// super() 부모의 생성자 
		super(totalPageNum); // super는 가장 윗줄에 사용.
		this.name  = name; 
		this.company = company; 
		this.genre = genre;
		this.writer = writer; 
	}
	// 메서드 
	// search(단어);
	public void search(String word) {
		System.out.println(word+"의 내용을 "+this.name+" 소설에서 검색합니다");
	}
	// read() >> 00소설책을 읽습니다. --> 메서드 오버라이딩 
	public void read() {
		System.out.println(this.name+ "소설책을 읽습니다.");
	}
	// toString() 메서드 오버라이딩 
	public String toString() {
		return "소설책 [ 제목: "+name+", 출판사: "+company+", 장르 : "
					+genre+", 작가: "+writer+" ]"
				+ super.toString();
	}
}

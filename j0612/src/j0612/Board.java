package j0612;

public class Board {
	
	// private는 같은 클래스 내에서만 접근이가능함. 
	private String no;
	private String title;
	private String date;
	private String name;
	
	// iv로 참조형변수 
	String[] saveBoard = new String[4];
	// default같은 경우는 같은 패키지 내 접근이 가능 
	Board(){} //기본생성자
	Board(String no,String title,String date,String name){
		this.no = no;
		this.title = title;
		this.date = date;
		this.name = name;
	} 
	// return 타입이 String타입의 배열이기때문에 자료형에 String[]을 사용해야함
	protected String[] save(String no, String title, String date, String name) {
		saveBoard[0] = no;
		saveBoard[1] = title;
		saveBoard[2] = date;
		saveBoard[3] = name;
		System.out.println("배열주소"+ saveBoard);
		return saveBoard;
		
	}
	
	
	
	
	// public은 어디서나 접근이 가능함 
	public void printPost() {
		System.out.printf("%s\t%s\t%s\t%s\n",no,title,date,name);
	}
	
	// getter - setter 자동생성 
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}

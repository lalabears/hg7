package j0618;
// 추상클래스 
public abstract class Book implements Page{
	// 변수
	private int totalPageNum ; // 전체 페이지 번호
	private int currentPageNum;// 현재 페이지 번호
	
	// 생성자 
	Book(){}
	Book(int totalPageNum){
		this.totalPageNum = totalPageNum; 
	}
	// 메서드
	void page() {
		System.out.println(currentPageNum);
	}
	void page(int n) {  // 메서드 오버로딩 (메서드명 같음 매개변수형다름)
		this.currentPageNum = n; 
		System.out.println(currentPageNum);
	}
	void next() {
		this.currentPageNum++; 
	}
	void prev() {
		this.currentPageNum--; 
	}
/*	// 인터페이스 추상 메서드 구현 
	public void read() {
		System.out.println("책을 읽습니다");
	}*/
	// Object 메서드 toString() 오버라이딩 
	public String toString() {
		return "총페이지: "+totalPageNum+" , 현재페이지:  "+currentPageNum;
	}



    
}

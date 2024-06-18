package j0618;
//책 클래스를 상속하여 잡지 클래스를 만들어보세요 Magazine
public class Magazine extends Book{
	//변수
	private String name;  //이름
	private String company;//회사
	private String editor;//에디터
	private String type; //종류 
	// 생성자 new Magazine("좋은생각", "좋은생각", "좋은생각 편집부", "교양", 122);
	Magazine(String name, String company, String editor, String type, int totalPageNum){
		super(totalPageNum); // Book 생성자 호출 
		this.name = name; this.company = company; this.editor = editor;
		this.type = type;
	}
	// 메서드  	
	//QRCapture() >>  QR 캡처해보세요 
	void QRCapture() { // 매거진 클래스만 가지고있는 메서드 
		System.out.println("QR 캡처해보세요 ");
	}
	//	메서드 오버라이딩. 선언부는 부모와 일치를 시켜주어야함. 
	//   접근제한자는 자식이 부모보다 넓은 범위여야함. 
	public void read() {
		System.out.println(name+"잡지를 읽습니다");
	}
	// 메서드 오버라이딩 
	public String toString() {
		return	"잡지 [제목 : "+name+" , 출판사 : "+company
				+" , 에디터 : "+editor+" , 종류 : "+type+" ] "+ super.toString();
	}
}

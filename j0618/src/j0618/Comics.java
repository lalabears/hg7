package j0618;
// 책 클래스를 상속하여 만화 클래스를 만들어보세요 Comics
public class Comics extends Book {
	// 변수
	String name;     // 이름
	String company;  // 회사
	String writer;   // 글작가
	String illuster; // 그림작가
	int limitAge;    // 연령제한
	// 생성자
	// 생성자의 오버로딩 
	Comics(){}
	Comics(String n, String c,String w,String i, int l, int t){
		super(t);
		name = n; company = c ; writer = w; illuster = i ; limitAge = l; 
	}
	// 메서드
	// 메서드 오버라이딩 > 부모(Book) > 부모 Page 에서 옴.
	// 인터페이스의 모든 메서드는 public 타입이기때문에 자손의 메서드는 
	// public 메서드로 만들어주어야함. 
	public void read() {
		System.out.println(name+ "만화책을 읽습니다.");
	}
	// toString() 메서드 오버라이딩 
	// Comics 의 부모는 Book 의 조상은 Object 
	// object 메서드는  :   public String toString()
	// 메서드 오버라이딩은 부모보다 범위가 넓어야함. 
	public String toString() {
		if(limitAge < 20 ) {
			return "만화책 [제목 : "+ name +" , 출판사 : "+company+
					", 글 작가 : "+writer+", 그림 작가 : "+illuster +
			        ", 연령제한 : "+limitAge+" 세 미만 ] " + super.toString();
		}else {
			return "만화책 [제목 : "+ name +" , 출판사 : "+company+
					", 글 작가 : "+writer+", 그림 작가 : "+illuster +
			        ", 연령제한 : "+limitAge+" 세 이상 ] " + super.toString();

		}
	}

/*
toString()  >>
연령제한이 20세 미만일때:
만화책 [제목 : 00 , 출판사 : 00, 글 작가 : 00, 그림 작가 : 00
, 연령제한 : 00 세 미만 ] 총페이지 : 00 , 현재페이지 : 00
만화책 [제목 : 00 , 출판사 : 00, 글 작가 : 00, 그림 작가 : 00
, 연령제한 : 00 세 이상 ] 총페이지 : 00 , 현재페이지 : 00
 */
}

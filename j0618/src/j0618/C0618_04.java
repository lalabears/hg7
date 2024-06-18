package j0618;
public class C0618_04 {
	public static void main(String[] args) {
/*	
		Book b1 = new Book(10);
		b1.next();
		b1.next();
		b1.next();
		b1.next();
		b1.prev();
		b1.page(5); // n페이지를 편다 
		System.out.println(b1);
	*/	
		Novel n1 = new Novel("해리포트 불의 잔", "문학수첩", "판타지", "J.K 롤링", 268);
		n1.read();
		n1.search("지니");
		System.out.println(n1);
		
		Comics c = new Comics("슬램덩크 1", "대원", "이노우에타케히코", "이노우에타케히코", 12, 304);
		System.out.println(c);
		
		Magazine m = new Magazine("좋은생각", "좋은생각", "좋은생각 편집부", "교양", 122);
		m.QRCapture();
		System.out.println(m);
		
		// Book은 추상클래스기때문에 객체를 생성할 수 없음 
//		Book b1 = new Book();// 불가능
		
		
		// 배열 선언         배열생성
		Book[] books = new Book[5]; 
		
		// 다형성으로 인해서.. 
		books[0] = n1; // 소설을 담을 수 있다. 
		books[1] = c; // 만화책을 담을 수 있다. 
		books[2] = m; // 잡지를 담을 수 있다. 
		books[3] = new Comics("슬램덩크 8", "대원", "이노우에타케히코", "이노우에타케히코", 12, 304);
		books[4] = new Novel("해리포터 마법사의돌", "문학수첩", "판타지", "J.K 롤링", 268);
		
		// 부모의 참조변수로 자식을 담을 수있음. 
		Book b1 = new Comics("슬램덩크 8", "대원", "이노우에타케히코", "이노우에타케히코", 12, 304);
		// 부모멤버(변수,메서드) 만 호출가능 
		b1.read(); //슬램덩크 8만화책을 읽습니다. // 오버라이딩: 자식으로호출
		System.out.println(b1);
		//만화책 [제목 : 슬램덩크 8 , 출판사 : 대원, 글 작가 : 이노우에타케히코, 그림 작가 : 이노우에타케히코, 연령제한 : 12 세 미만 ] 총페이지: 304 , 현재페이지:  0

		// 추상클래스 다형성 
		Book b2 = new Novel("해리포터 마법사의돌", "문학수첩", "판타지", "J.K 롤링", 268);
		// b2.search("돌");
		// books[4].search("돌");
		n1.search("돌");
		
		// 인터페이스 다형성 
		Page p = new Comics("슬램덩크 8", "대원", "이노우에타케히코", "이노우에타케히코", 12, 304);
		p.read();
		Object o = new Object();
		// public String toString()
		String str = o.toString();
		System.out.println(str);
		// 같은 결과 
		System.out.println(o);
		System.out.println(o.toString());
		
	}

}

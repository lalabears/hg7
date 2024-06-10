package j0610;
public class Book {
	// public - 어디서나 접근가능
	public String book1 = "책1";
	// private - 같은 클래스 내 접근가능
	private String book2 ="책2";
	// protected 같은 패키지내 + 상속관계 접근가능
	protected String book3 = "책3";
	// default 같은 패키지내 접근가능 
	String book4 = "책4"; 
	
	public Book() {} // public 생성자 
	Book(String b1, String b2, String b3, String b4){// default 생성자 
		book1 = b1;		book2 = b2;		book3 = b3;		book4 = b4; 
	}
	
	public void printBook() {  // public 메서드
		System.out.println(book1);	System.out.println(book2);
		System.out.println(book3);	System.out.println(book4);
	}
	private void printBook2() { // private 메서드
		System.out.println(book1);	System.out.println(book2);
		System.out.println(book3);	System.out.println(book4);
	}
	void printBook3() {// default 메서드
		System.out.println(book1);	System.out.println(book2);
		System.out.println(book3);	System.out.println(book4);
	}
	
	//책2 의 이름을 변경하는 메서드 
	// public - 다른패키지에서도 접근이 가능
	public void chaneBook2title (String title) {
		book2 = title;
		// 이 메서드가 book이라는 클래스에 있기때문에 
		// book2에 접근이 가능함. 
		// 때문에 이름 변경이 가능함. 
	}
	
	
	

}

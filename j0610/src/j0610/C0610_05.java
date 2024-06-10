package j0610;
public class C0610_05 {
	public static void main(String[] args) {
		/*
		   제어자 - 클래스, 변수, 메서드 선언부에 사용되어 부가적 의미를 부여함. 
		   하나의 대상에 여러개 제어자를 조합해서 사용할 수 있으나
		   접근제어자는 단 하나만 사용. 
		   접근제어자 : public, private, default, protected
		   그 외 : static, final, abstract, native,.. 등등 
		*/
		// static 
		// 변수 가져오기 :  클래스명.클래스변수명
		System.out.println(Card.height);
		// 메서드 사용 : 클래스명.메서드명 
		Card.cardinfo();
		
		SameClass sc = new SameClass();
		// private 경우는 클래스가 다르면 접근 불가 
		// sc.str = "안녕하세요";  - 오류
		// sc.getVar();         - 오류
		sc.strPublic = " 변경이가능합니다";
		String str = sc.getVarPublic();
		System.out.println(str);
		// 같은 클래스만 허용됨변경이가능합니다
		
		System.out.println(sc.getVarDefault());
		// 같은패키지까지 접근허용
		System.out.println(sc.getVarProt());
		// 다른패키지의 자식클래스까지허용
		
		// 같은 패키지에 있는 book 클래스 사용 
		Book bk = new Book(); // public 생성자 사용가능 
		// default 생성자 사용 가능 
		Book bk2 = new Book("book1","book2","book3","book4");
		
		bk.printBook(); // public 메서드 사용가능 
		// private를 제외한 변수에 접근이 가능함 (같은 패키지내)
		bk.book1 = "책1이름변경";
		bk.book3 = "책3이름변경";
		bk.book4 = "책4이름변경";
		bk.printBook3(); // default 메서드 사용가능

		// private 메서드를 제외한 메서드에 접근이 가능함 
		bk2.printBook();
		bk2.printBook3();
		
		// 다른 패키지에서도 접근할 수 있는
		// 책2 의 이름을 바꾸는 메서드를 만들어보세요   
		
		
		
		
		
		
	}

}

/*  서로관련있는 클래스들, 인터페이스등 파일들을 하나의 디렉토리에 
    모아놓은 것을 패키지라고 함. 패키지는 코드의 가장 위에 작성함니다.
    장점 : 동일성격, 동일업무와 연관된 클래스를 한 단위로 구성할 수 잇음
          모든클래스들이 한곳에 있다면 클래스이름, 메소드 이름등 서로 충돌하게됨
          다른패키지에 있는 경우 같은 클래스이름이라도 충돌하지 않음
    import를 사용하면 다른패키지의 클래스를 쉽게 사용할 수 있음. 
       - 클래스는 자식이 속한 패키지와 동일한 곳에서는 다른 클래스 사용을 위해 
         특별하게 할 것은 없음. 클래스이름만 사용하면 객체를 생성하고 사용할 수 있음
       - java.lang 은 자바의 기본패키지로 클래스이름만 가지고 사용할 수 있음. 
       - 위 두 경우를 제외하면 [패키지명.클래스명] 의 형식을 사용해야함.
       - 매번 [패키지명.클래스명] 사용이 불편하기때문에 import를 사용.
       - import는 하나의 클래스만 사용할 수 도있고 패키지 전체를 사용할수 도 있음 
*/
package lottopkg;  
import j0611.Point;  // import 패키지명.클래스명 
import java.util.*;  // import 패키지명.*  ; *은 클래스 전체를 의미함 
public class Member {
	Lotto l = new Lotto(); // 같은 패키지 내 존재한다면 그냥 사용하면됨
	java.lang.String str = "hello";
	String str2 = "hello";
	// java.lang 같은 경우는 생략해서 사용할 수 있음	
	// j0611.Car car = new Car(); // 다른패키지라면 [패키지명.클래스명]
	//Point p = new Point(); // import를 했기때문에 다른패키지 클래스를 간단히 사용
	
	/* 접근제한자 - 외부로부터 데이터를 보호하기위해서 사용함. 내부적으로만 사용되는부분 감춤
	   public     - 접근제한이 전혀없음. 어디서나 접근가능
	   default    - 같은 패키지내에서만 접근가능
	   private    - 같은 클래스 내에서만 접근가능
	   protected  - 같은 패키지내, 다른패키지라면 자손클래스에서 접근이가능  
	   
	   제어자. 
	   클래스 - public, (default), final, abstract
	   메서드 - 모든접근제어자, final, static, abstract
	   iv,cv - 모든접근제어자, final, static
	   lv - final
	   초기화블럭 - static	 
	*/
	public String name ; //  어디서나 접근가능한 iv
	private int age ; // 같은 클래스 내에서만 접근 가능한 iv
	String email; // (default) 같은 패키지내에서만 접근 가능한 iv
	protected String position; // 같은패키지내 + 다른패키지 자손
	
	// 생성자 
	Member(){} // (default) 생성자 - 같은 패키지내에서만 접근 가능 
	// public 생성자 - 어디서나 접근가능 : 어느클래스에서나 member를 생성할 수 있음
	public Member(String name, int age, String email, String position) {
		this.name = name; this.age = age; this.email=email; this.position=position;
	}	
	// 메서드 
	public void printName() {   // 어디서나 접근가능한 메서드 
		System.out.println(this.name);
	}
	private void printAge() {  // 같은 클래스내에서만 접근 가능한 메서드
		System.out.println(this.age);
	}
	protected void printPosition() {  // 같은 패키지 + 다른패키지의자손클래스 접근가능 메서드 
		System.out.println(this.position);
	}
	void printEmail() {  // 같은 패키지내에서만 접근가능한 메서드 
		System.out.println(this.email);
	}
	public void printAll() {
		printName(); printAge(); printPosition(); printEmail();
	}
	
	
	

} // member - class 

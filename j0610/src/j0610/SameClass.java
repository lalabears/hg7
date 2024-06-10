package j0610;

public class SameClass {
	
	/* 접근제어자 -  private
	private를 사용해 선언된 클래스 멤버는 외부에 공개되지 않음
	즉, 외부에서 직접접근이 불가함. 
	해당 객체의 public 메서드를 통해서만 접근할 수 있음. 
	*/
	
	// private 변수
	private String str = "같은 클래스만 허용됨";
	
	// private 메서드 
	private String getVar() {
		return this.str;
	}
	
//	private SameClass() {}
	
	/* 접근제어자 -  public 
	  public 접근제어자를 사용해 선언된 클래스 멤버는 외부로 공개
	  해당객체를 사용하는 프로그램 어디서나 접근을 할 수 있다. 
	  자바프로그램은 public메서드를 통해서만 객체의 private 멤버에 접근함.    
	 */
	// public 필드
	public String strPublic = "어디든지 접근가능함"; 
	// public 메서드 
	public String getVarPublic () {
		String str = this.str + this.strPublic;
		//          private 변수 + public 변수 
		// public 메서드를 통해서 private변수에 접근가능
		return str;  
	}
	
	
	/* 접근제어자 -  (default)
	  접근제어자가 지정되지 않으면 자동적으로 default 접근제어를 가지게됨. 
	  같은 클래스멤버, 같은 패키지 멤버에서만 접근이 가능함.  
	 */
	String strDefault = "같은패키지까지 접근허용";
	String getVarDefault() {
		return this.strDefault;
	}
	
	/* 접근제어자 - protected 
	 부모클래스에대해서는 public 처럼 취급되며 외부에서는 private로 취급 
	 
	 접근할 수 있는 영역 : 
	 이 멤버를 선언한 클래스의 멤버. 
	 이 멤버를 선언한 클래스가 속한 패키지의 멤버 
	 이 멤버를 선언한 클래스를 상속받는 자식 클래스의 멤버 
	*/
	protected String strProtected = "다른패키지의 자식클래스까지허용";
	
	protected String getVarProt() {
		return this.strProtected;
	}
	
	
	
	
	
//	public static void main(String[] args) {
//		SameClass sc = new SameClass();
//		// private 경우는 클래스가 다르면 접근 불가 
//		sc.str = "안녕하세요";  
//		sc.getVar();       	
//	}

}

package j0613;
public class Parent {
	/* 접근제어자
	 public - 클래스, 필드, 생성자, 메서드
	        - 접근제한이 없다. 모든클래스에서 접근이 가능하다. 
	 protected - 필드, 생성자, 메서드
	           - 같은패키지내 + 다른패키지면 자손에서 접근가능
	 default - 클래스, 필드, 생성자, 메서드 
	         - 같은 패키지 내에서만 접근이 가능 
	 private - 필드, 생성자, 메서드 
	         - 같은 클래스 내에서만 접근이 가능 
	 접근제어자를 사용하는 이유 :
	 - 외부로부터 데이터 보호를 위해서
	 - 외부로부터 불필요한 내부적으로만 사용되는 내용을 감추기 위해서             
	*/
	// 필드
	public int n1 = 10; 
	protected int n2 = 20; 
	int n3 = 30; 
	private int n4 = 40; 
	
	// 생성자 
	public Parent() {} 
	// 기본생성자는 어디서나 접근하고 객체생성가능하게 만듦
	Parent(int n1,int n2){
		this.n1 = n1; this.n2 = n2; 
	}
	protected Parent(int n1,int n2,int n3, int n4) {
		this.n1 = n1; this.n2 = n2; this.n3 = n3; this.n4 =n4;
	}
	
	// 메서드 
	public void methodA() {
		System.out.println("public 메서드입니다 ");
	}
	protected void methodB() {
		System.out.println("protected 메서드입니다 ");
	}
	void methodC() {
		System.out.println("default 메서드입니다 ");
	}

}

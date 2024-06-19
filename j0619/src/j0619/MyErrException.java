package j0619;
// 사용자정의 예외만들기 
// Exception 부모로부터 상속을 받아서 만들 수 있습니다. 
public class MyErrException extends Exception {
	private String msg; 
	
	// 사용자 예외 클래스 생성자 
	public MyErrException(String msg) {
		super(msg); // 부모 Exception 클래스 생성자 호출 
		this.msg = msg; 
	}
	//사용자 예외클래스 메세지 출력하기 
	public void printMyMessage() {
		System.out.println(this.msg);
	}
}

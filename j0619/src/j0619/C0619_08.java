package j0619;
import java.io.*; // *은 모든 클래스를 가져와라 라는의미 
public class C0619_08 {
	public static void main(String[] args) {
		// 내가만든 예외 클래스 사용하기 
		try {
			// 내가 만든클래스로 예외를 발생시킴. 
			throw new MyErrException("내가만든 예외 메세지");
		}catch (MyErrException e) {
			e.printMyMessage(); // MyErrException내 메서드
			e.printStackTrace(); // 상속한 부모클래스의 메서드
		}catch(Exception e) {
			e.printStackTrace();
		} //****Exception 은 캐치문 가장 밑에 사용해야함 
		System.out.println("프로그램 종료 ");
		
		// 예외처리 
		// File f1 = createFile(args[0]);
		try {
			File f = createFile(args[0]);// 메서드호출
			System.out.println(f.getName()+"파일이 생성되었습니다. ");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println( e.getMessage() + "다시입력해주세요");
		}
		
	} // 메인메서드 
	//     반환형  클래스명 ( 매개변수타입 변수명)  나를 호출한곳에 책임전가하기 
	static File createFile(String fileName) throws Exception{
		if (fileName == null || fileName.equals("")) {
			throw new Exception("파일이름이 유효하지 않습니다");
		}
		// file 클래스의 객체를 만든다
		File f = new File(fileName);
		// file객체를 createNewFile메서드를 이용해 실제 파일을 생성한다. 
		f.createNewFile();
		return f; 
	} // createFile 메서드
	
	
	

}

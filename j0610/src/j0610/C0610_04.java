/*  클래스의 구조 
    package ; 
    import ;
    class 클래스명A{} // 외부클래스 존재할 경우 
    public class 클래스명{ // 클래스명은 파일명과 동일 
    	int a = 0 ; // 필드 
    	double abc(){} // 메서드 
    	클래스명(){} // 생성자 
    }  
    package - 프로젝트를 생성할때 패키지를 지정했다면 반드시 포함해야함
              첫번째 줄에 위치 
              디폴트패키지를 사용하면 생략됨 
    import  - 다른패키지의 클래스를 사용하고자 할때 포함
              이클립스는 ctrl+shift+o 를 이용 외부패키지 자동임포트
    외부클래스 - 클래스외부에 다른클래스를 포함할 수 있음. 
               외부클래스는 public을 붙일 수 없음 
*/
package j0610;
import java.util.Scanner;
public class C0610_04 {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		A a = new A(); 
		/* 패키지 : 클래스들의 집합(서로관련된 클래스를 한곳에 모아놓은것.)	 
		 클래스 - 파일 , 패키지 - 폴더 
		 클래스의 실제 이름은 패키지를 포함함. ex) java.lang.String
		 패키지는 소스파일 첫번째 문장에서 단 한번 선언함. 
		 같은 소스파일의 클래스는 모두 같은 패키지에 속함. 
		 (패키지가없으면 이름없는(default)패키지에 속하게 됨)
		*/
		//
		String str = new String("안녕하세요");
		java.lang.String str1 = new java.lang.String("안녕");
		System.out.println(str);
		System.out.println(str1);
		
		// 같은 패키지 안의 다른 클래스를 호출 
		Point p = new Point(10,20);
		System.out.println(p.x);
		System.out.println(p.y);
		
		
		
		
		
	}

}
class A{
	int x; 
	int y;
}

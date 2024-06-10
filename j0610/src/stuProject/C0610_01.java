package stuProject;
import j0610.Book;
import java.util.*;  // java.util패키지 안 모든 클래스를 사용할것임
import j0610.Point; 
/* import는 패키지와 클래스 사이에 써줌 
   import를 사용하면 클래스 사용시, 패키지명을 생략할 수 있음. 
   java.lang의 경우는 import하지 않고도 사용가능함. 
   import 패키지명.클래스명 
   또는 
   import 패키지명.*;   < *은 클래스 전부를 의미함. 
*/
public class C0610_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(Arrays.toString(new int[]{1,2,3,4}));
		System.out.println("stuProject 패키지입니다");
		// 같은 프로젝트, 다른 패키지안의 클래스 사용 
		j0610.Point p = new j0610.Point(11,12); 
	//  패키지명.클래스명 으로 가져와서 사용할 수 있음. 	
		System.out.println(p.x);
		System.out.println(p.y);
		Point p2 = new Point(30,40); 
		System.out.println(p2.x);
		System.out.println(p2.y);
		
		// Book class 
		Book bk = new Book();
        // 생성자가 public이기때문에 다른 패키지에서 생성가능
		bk.printBook();
		// printBook()메서드가 public이기때문에 다른패키지에서 호출가능	
		bk.book1 = "책1의 이름변경 "; // 변수가 public만 접근가능 
		// bk.book2 = ""; 오류
		// 다른 패키지에서는 default생성자 사용 불가능함.
		// Book bk2 = new Book("1","2","3","4"); 
		bk.chaneBook2title("책2이름변경");
		bk.printBook();
		
		
	}
}

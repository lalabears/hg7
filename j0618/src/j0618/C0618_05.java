package j0618;
import java.util.Scanner;
public class C0618_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
/*		클래스의 구조 
 		- 클래스 밖 : 패키지, 임포트, 외부클래스 
 		- 클래스 안 : 필드, 생성자, 메서드, 내부클래스 
		package 패키지명;
		import 패키지명.클래스명;
		class 클래스명 { // 외부클래스
		}
		public class A{ // 파일명과 동일해야함.  A.java A.class
			int a = 0; //필드
			A(){} //생성자 
			double abc(){} //매서드
			class 클래스명{ } //이너클래스
		}
		내부클래스 : 하나의 클래스 내부에 선언된 또다른 클래스를의미함 
		          주로외부클래스와 내부클래스가 긴밀한 관계를 맺고잇을때 사용함. 
		클래스 : public, default  > 으로만 만들 수 잇다.    
		내부클래스 > 클래스의 멤버  
		     : public, default, protected, private 다 됨.       
		
*/
		
		Outer ou = new Outer(); 
		ou.outA = 10;  // 일반적인 클래스 변수 접근 
		//참조변수명.변수명 
		ou.methodA(); // outer의 메서드 호출
		
		// 외부클래스.내부클래스 참조변수 = 외부클래스참조변수.new 내부클래스();
		Outer.Inner in = ou.new Inner(); 
		in.inA = 100; 
		in.methodA();
		// 내부클래스는 외부클래스객체 내부에 존재한다. 
		// 내부클래스 객체를 생성하려면 외부객체를 생성해야한다. 
		// 이후 이 참조변수를 사용해서 객체 내부에 있는 내부클래스를 호출해야함. 
		// 내부클래스는 단독으로 사용할 수 없다.  
		
		// 1. 인스턴스 이너클래스 : 외부클래스의 멤버변수 선언위치에 선언하며
		//             외부클래스의 인스턴스멤버처럼다룸 
		//             주로 외부클래스의 인스턴스멤버들과 관련작업을 할 목적으로 사용

		
		in.methodB();
		
		// 2. static 이너클래스 :  외부클래스멤버변수 선언위치에 선언하며 
		//         외부클래스의 static멤버처럼 다루어짐. 
		//         주로 외부클래스의 static멤버, 특히 메서드에 사용될 목적으로 선언

		// 인스턴스객체 생성 
		Outer.Inner in1 = ou.new Inner(); 
		ou.outA=10;  // 객체를 생성하고 가져올 수 있음
		// 참조변수명.변수명
		ou.methodA(); // 객체를 생성하고 인스턴스메서드 호출
		// 참조변수명.메서드명
		
		// 클래스 멤버 
		Outer.outE = 20 ; // 클래스변수 가져오기 
		// 클래스명.변수명 
		Outer.methodB();  
		// 클래스명.메서드명 
		// static은 객체를 생성하지 않고 사용함. 
		Outer.InnerS ins = new Outer.InnerS();
		ins.methodS();
		
		// 3. 지역 이너 클래스 (local class) 
		// 외부클래스의 메서드나 초기화 블럭안에 선언. 
		// 선언된 영역내부에서만 사용할 수 있음 
		ou.localMethod();
		
		System.out.println("====");
		ou.methodA();
		System.out.println("====");
		
		// 4. 익명 클래스 (anonymous class) 
		// 클래스 선언과 객체생성을 동시에하는 이름없는 클래스(일회용)
		Anonymous a = new Anonymous();
		// 1. 필드에 익명객체 호출
		a.p1.methodA(); // 익명클래스-자식클래스
		// a의 메서드호출 
		a.method();  // 로컬변수
		
		Anony an = new Anony();
		// 익명객체 필드 사용 
		an.field.wake();
		// 익명객체 로컬변수 사용 
		an.method1();
		// 익명객체 매개값사용
		an.method2( new Person() {
			void study() {
				System.out.println("공부를합니다");
			}
			void wake() {
				System.out.println("8시에 일어납니다");
				study();
			}
		});
		
	}

}

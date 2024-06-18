package j0618;
public class Anonymous {
	// 클래스 선언과 객체생성을 동시에하는 이름없는 클래스(일회용)
	// ParentAn p1 = new ParentAn();
	// 1. 필드에 익명객체를 생성함 . 
	ParentAn p1 = new ParentAn() {
		int chA = 20;
		void methodA() {
			System.out.println("익명클래스-자식클래스");
		} // methodA
	};  // p1 
	// 2. 로컬변수 
	void method() {
		ParentAn p2 = new ParentAn() {
			int chA = 100; 
			void methodA() {
				System.out.println("로컬변수");
			}
		};
		p2.methodA();
	} // method() 

} // Anonymous

// 외부클래스 
class ParentAn{
	int anoA = 10 ; 
	void methodA() {
		System.out.println("익명클래스를 위한 부모클래스 ");
	}
}

package j0618;
public class Person {
	void wake() {
		System.out.println("7시에 일어납니다.");
	}
}
// 익명클래스는 이름을 가지고있지 않습니다.
// 선언함과 동시에 객체를 생성하므로 단 하나의 객체만 생성함(일회용)
// 오로지 단 하나의 클래스나 단 하나의 인터페이스를 상속받거나 구현함. 
class Anony{
	Person field = new Person() {
		void work() {
			System.out.println("출근을합니다.");
		}
		void wake() { // 메서드오버라이딩 
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책을합니다.");
			}
			void wake() { //메서드 오버라이딩 
				System.out.println("6시에 일어납니다");
				walk();
			}
		};
		localVar.wake();
	}
	void method2(Person p) {
		p.wake();
	}
	
	
	
}
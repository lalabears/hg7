package j0531;

public class Person {
	// 이름, 나이, 키, 몸무게 속성을 가진 클래스를 만들어보세요 
	String name; 
	int age;
	double height;
	double weight;
	
	// 메서드 () > 동사 뭔가를 한다. 기능이다. 
	void work() {
		System.out.println("일을합니다.");
	}
	void sleep() {
		System.out.println("잠을잠니다.");
	}
	// print()라는 메서드는 이름, 나이, 키, 몸무게를 출력해줍니다. 
	void print() {
		System.out.printf("이름: %s 나이: %d 키: %.2f 몸무게: %.2f \n",
				this.name, this.age, this.height, this.weight);
	}
	// newYear()라는 메서드는 내년의 나이를 반환해 줍니다. 
	int newYear() {
		int oneyear=1; // 지역변수. 초기화를 해줘야 사용할 수 있습니다. 
		return this.age+oneyear; 
	}
	// 가능하다면 메서드도 만들어보세요 

}

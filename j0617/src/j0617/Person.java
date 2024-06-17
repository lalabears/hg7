package j0617;
public class Person {
	// iv
	protected String name; // protected: 같은패키지내+다른패키지자손
	protected int age;
	// 생성자 
	public Person() {}
	public Person(String name, int age) {
		this.name = name; this.age = age; 
	}
	// 메서드 
	public void printInfo() {
		System.out.println("이름: "+name+" , 나이 : "+age+"살");
	}
	// object 클래스의 메서드 오버라이딩
	// 메서드오버라이딩은 부모와 선언부가일치해야함 
	public String toString() {
		return "이름: "+name+" , 나이 : "+age+"살";
	}
	//메서드 오버라이딩
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			if (this.name == ((Person)obj).name) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	// setter & getter 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
}

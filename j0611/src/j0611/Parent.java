package j0611;
public class Parent {
	String name;
	int age; 
	
	{
		name = "홍길동";
		age = 40; 
	}
	Parent(){}
	Parent(String name, int age){
		this.name = name;
		this.age = age; 
	}
	public void printInfo() {
		System.out.println("이름 : "+name+", 나이 : "+age);
	}
	// 부모클래스의 변경은 자손에게 영향을 끼침
	// 반면 자손클래스 변경은 부모여 영향을끼치지 않음 
}

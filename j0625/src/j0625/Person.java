package j0625;
public class Person implements Comparable<Person>{
// private 이름 + 나이
	private String name;
	private int age; 
// 생성자
	Person(){}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public int compareTo(Person o) {
		if(age == o.age) return 0; 
		else if(age > o.age) return 1;
		else return -1;
	}
	
	
	
// toString
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age ;
	}
	
	// getter & setter 
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

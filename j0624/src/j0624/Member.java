package j0624;
public class Member {
	private String name;
	private int age;
	Member(){}
	Member(String name){
		this.name=name; 
	}
	Member(String name, int age){
		this.name=name; this.age=age;
	}
	public String toString() {
		return name;
	}
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

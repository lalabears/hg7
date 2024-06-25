package j0625;
// Student - person 상속받음 

public class Student extends Person {
// iv:   String school  
	private String school;
// 생성자
// toString
// getter & setter 
	Student() {	super();}
	Student(String name, int age, String school) {
		super(name, age); this.school = school;
	}
	@Override
	public String toString() {
		return super.toString() + ", school=" + school;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	
	
	
	
	
	
}

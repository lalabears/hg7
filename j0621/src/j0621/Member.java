package j0621;

public class Member{
	// 필드(iv, cv)
	private String name;
	private String id;
	private int age;
	private String email;
	// 생성자
	public Member() {};
	public Member(String name, String id, int age, String email) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.email = email;
	}
	public Member(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", age=" + age + ", email=" + email + "]";
	}
	// 메서드 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}

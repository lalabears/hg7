package j0628;
public class Member {
// 이름, 아이디, 비밀번호 
	private String name;
	private String id;
	private String pw; 
	Member(){}
	public Member(String name, String id, String pw) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
	}
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
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", pw=" + pw + "]";
	}
	
	
	
}

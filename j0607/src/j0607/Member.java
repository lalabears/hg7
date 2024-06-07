package j0607;

public class Member {
	String id; 
	String name;
	int age; 
	Member manager; 
	
	
	Member(){
		id="";
		name="홍길동";
		age = 0; 
		manager = null;
	}
	Member(Member m){
		this(m.id, m.name, m.age,m.manager);
	}
	Member(String id, String name, int age, Member manager){
		this.id = id; 
		this.name = name; 
		this.age = age; 
		this.manager = manager;
	}
	
	// 사람의 이름을 매개변수로 받아서 바꿔주는 메서드 
	void changeName(String name) {
		this.name = name; 
		
	}
	
	// 매니져를 바꾸는 메서드를 만들어보세요
	void changeManager(Member m) {
		this.manager = m; 
	}
	
	void printAttr() {
		System.out.println(id+name+age+manager);
	}

}

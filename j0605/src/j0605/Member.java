package j0605;

public class Member {
	// 1. 변수 
	String id ;
	String name ;
	String pw ;
	String email ;
	
	// 2. 생성자 
	Member(){}  // 빈채로라도 만들어야지 사용할 수 있음 
	Member(String id, String pw ){
		this.id = id;
		this.pw = pw; 
	}
	Member(String id, String name, String pw, String email ){
		this.id = id;
		this.name = name;
		this.pw = pw; 
		this.email = email; 
	}
	// 3. 메서드 
	void printAtt() {
		System.out.printf("[아이디 : %s  이름 : %s  비밀번호 : %s 이메일 : %s]\n",
				id, name, pw, email);
		
	}
	

}

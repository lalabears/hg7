package j0621;
import java.util.*;
public class C0621_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// member 객체만 담을 수 있는 리스트 
		List<Member> memList = new ArrayList<Member>();

		/*
		Member m = new Member(); 		// 기본 생성자로 만든 객체 
		m.setName("홍길동");		m.setId("aaa");     m.setAge(30);
		m.setEmail("hong@aa.com");	
		// 리스트에 값 넣기 			    
		memList.add(m);*/

		// Member m = new Member("홍길동","aaa",30,"hong@aa.com"); // 매개변수가 있는 생성자 
		// memList.add(m); // 객체를 리스트에 추가
		
	/*	String name="", email="", id="";
		int age=0; 
		memList.add(new Member(name, id, age, email));*/
		
		String name, email, id;
		int age; 
		/*for(int i = 0 ; i < 2 ; i++) {
			Member m = new Member(); 
			System.out.println("이름");
			m.setName(scan.next());
			System.out.println("아이디");
			m.setId( scan.next());
			System.out.println("나이");
			m.setAge(scan.nextInt());
			System.out.println("이메일");
			m.setEmail(scan.next());
			memList.add(m);
		}
		
		
		*/
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("이름");
			name = scan.next();
			System.out.println("아이디");
			id = scan.next();
			System.out.println("나이");
			age = scan.nextInt();
			System.out.println("이메일");
			email = scan.next();
			memList.add(new Member(name, id, age, email));
		}
		
		
		for(Member a : memList) {
			System.out.println(a);
		}
		
		
	}

}

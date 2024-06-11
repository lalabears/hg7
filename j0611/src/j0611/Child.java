package j0611;

public class Child extends Parent{
//   java에서 상속은 extends 키워드를 사용
//   자식 클래스 뒤에 extends 부모클래스 사용	
	String school ; 
	// int playtime; 	
	void printSchool() {
		System.out.println("학교:"+school);
	}
	/*
	 extends 로 확장된 자식의 클래스는 
	 부모의 멤버 + 자기자신의 멤버로 이루어짐. 
	 부모 : 이름, 나이, 정보출력메서드 
	    +
	 자신 : 학교, 놀이시간, 학교정보출력메서드
	*/
}

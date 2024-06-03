package j0603;
public class Person {
	// 1. 변수 - 인스턴스변수와 클래스 변수가 있다. + 지역변수
	String name;  // 이름 
	int age;      // 나이
	static String livein ="earth"; // 클래스 변수  
	// 2. 생성자  -  추가적으로 생성자를 만들지 않을 경우 생략 가능함.  
	// 3. 메서드 (함수)
	//	1. gen() 어린이(10살미만), 청소년(20살미만), 성인 을 리턴해주는 함수 
	String gen() {
		if( age < 10 ) return "어린이";
		else if( age<20 ) return "청소년";
		else return "성인";
	}
	//	2. nextAge() 내년에 몇살인지 리턴해주는 함수 
	int nextAge() {
		return age+1;
	}
	//	3. ageNyr(나이) 매개변수로 받아서 N년후 나이를 리턴 
	int ageNyr(int n) {
		return age+n;
	}
	//	4. print() "이름님 00살"이라고 출력해주는 함수 
	void print() {
		System.out.printf("%s님 %d살\n",name,age);
		
	}
}

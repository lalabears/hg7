package j0605;
public class Person1 {
	// 1. 변수 
	String name; 
	int age;
	double height; 
	double weight; 
	
	// 2. 생성자 (Constructor) - 생성과 동시에 변수를 원하는 값으로초기화할때 사용
	/*
	 생성자는 객체가 생성될때 호출되는 인스턴스 초기화 메서드 
	 ************모든 클래스는 하나이상의 생성자가 있음.*********************** 
	 객체의 초기화 방법이 여러개 존재할 경우 하나의 클래스가 여러개의 생성자를 가질 수 있음
	 
	 조건 : 이름은 클래스이름과 같아야함. 
	       생성자는 리턴값이 없다. void를 사용하지 않는다. 
	*/
	Person1(){  
		// 생성자가 없을때는 기본생성자가 자동으로 만들어지지만
		// 한개이상의 생성자를 만든다면, 기본 생성자를 만들어주지 않으면 사용할 수 없다
	}
	// 매개변수가 2개인 생성자. 
	Person1(String name, int age){
		this.name = name;  // this는 자기자신을 의미함. 
		this.age = age; 
	}
	Person1(String name){
		this.name = name; 
	}
	Person1(String name, int age, double h, double w){
		this.name = name;
		this.age = age; 
		height = h; 
		weight = w; 
	}
	
	
	// 3. 메서드 
	void printAtt() {
		System.out.printf("이름: %s 나이: %d 키: %f 몸무게 %f\n",name,age,height,weight);
	}
	void gainWeight() {
		weight++; 
	}
	void growH(double h) {
		height = height +h ; 
	}
	int agePlue(int a) {
		return age + a; 
	}

}

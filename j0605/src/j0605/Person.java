package j0605;
public class Person {
	// 인스턴스변수
	String name; 
	int age;
	double height; 
	double weight; 
	
	// 인스턴스메서드 
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

package j0617;
public class C0617_04 {
	public static void main(String[] args) {
		// Object 클래스 
		// 모든 클래스는 object클래스를 상속받는다 : 최상위클래스이다. 
		// 아무런 클래스를 상속받지 않으면 자동으로 extends Object를 삽입 상속함
		
		// object 가 모든것에 부모이기때문에 
		Object a = new Person();
		Object animal = new Animal(); 
		Object bus = new Bus(101);
		Object subway = new Subway(1);
		((Subway)subway).showInfo(); // 지하철 1번 승객은 0명이고 지하철수입은 0원입니다

		
		// object는 필드를 가지고잇지 않으며 11개의 메소드만으로 구성되어있다. 
		
		Animal ani = new Animal(); 
		// animal클래스 멤버들
		ani.eat(); ani.move(); 
		// 조상인 object 클래스 멤버들
		ani.toString(); ani.equals(animal);
		// 1. toString()메서드 - 객체의 정보를 문자열로 반환함. 
		//   패키지명.클래스명@주소에해당하는값 
		System.out.println(ani.toString());
		//   j0617.Animal@15db9742
		System.out.println(ani);    
		// 참조변수명을 출력해도 같은값을 반환함
		//   j0617.Animal@15db9742

		Person p = new Person("강백호",19);
		System.out.println(p);
		// 참조변수명.toString() > 참조변수명 으로 생략이가능 
		// 이름: 강백호 , 나이 : 19살

		Student s = new Student("서태웅",16);
		System.out.println(s);
		// 이름: 서태웅 , 나이 : 16살 학년: 0 , 반 : 0

				
		// 2. equals() - 해당 인스턴스매개변수로 전달받는 참조변수와 비교해
		// 그 결과를 반환. 참조변수가 가리키는 값을 비교 
		// 서로 다른 두 객체는 언제나 false 
		
		Person p1 = new Person("강백호",16);
		Person p2 = new Person("강백호",16);
		System.out.println(p1==p2); // false 저장된 위치가 다르므로 
		System.out.println(p1.equals(p2)); // false 
		Person p3 = p1; // 같은 메모리의 위치를 참조하기때문에 
		System.out.println(p1.equals(p3));  // true

		// 동일한 필드값을 포함하는 두 객체의 
		// 실제 내용을 비교하고자 할때는 메서드 오버라이딩을 통해서 해야함. 
		

		Object obj = new Object(); 
		System.out.println(obj.toString());
		
		
	}

}

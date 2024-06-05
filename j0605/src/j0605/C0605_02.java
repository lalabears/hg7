package j0605;
public class C0605_02 {
	public static void main(String[] args) {
	// Person 클래스사용
		// 1. 객체를 선언하고 생성 
		Person hong = new Person(); 
		// 클래스명  참조변수명 =  new  생성자(); 
		// 객체값 초기화
		hong.name = "홍길동";
		hong.age = 22; 
		hong.height = 179;
		hong.weight = 70;
		// 인스턴스메서드 호출 
		hong.printAtt(); // 객처의정보를 출력해주는 메서드
		hong.gainWeight();  // 1키로증가
		hong.printAtt();  // 1키로 증가했음을 확인할 수 있다. 
		
		// 매개변수로 숫자를 전달받아 그 숫자만큼 키가 커지는 메서드를 만들어보세요 
		hong.growH(10.2);
		hong.printAtt();
		// 리턴타입 int 로 . 매개변수로 1을 전달받아 내년의 나이를 출력해보세요(객체나이는변하지않음) 
		int num = 10;
		int newAge = hong.agePlue(num);
		System.out.println(hong.name+"의 현재 나이 "+ hong.age);
		System.out.println(hong.name+"의 1년후 나이 "+ newAge);
		
		
		
	}

}

package j0611;

public class C0611_01 {

	public static void main(String[] args) {
		// 클래스 변수는 클래스가 처음 로딩되었을때 초기화됨.
		// iv는 객체가 생성되었을때 초기화.
		// 만약 객체가 한번 더 생성되면 cv는 더이상 생성되지 않고
		// iv 객체만 초기화가된다. 
		
		Num n = new Num();
		System.out.println(n.x);  // 101  -> 매번 로딩되어 새롭게 초기화
		System.out.println(n.y);  // 3001 -> 한번 로딩되어 유지
		
		Num n1 = new Num();
		System.out.println(n1.x); // 101 
		System.out.println(n1.y); // 3002 

		Num n2 = new Num(11,12);
		System.out.println(n2.x); // 11
		System.out.println(n2.y); // 12
		
		/*  cv 먼저 초기화 > iv 초기화 
		- cv : 자동초기화 > 간단초기화 (=) > 초기화블럭을 통한초기화
		- iv : 자동초기화 > 간단초기화 (=) > 초기화블럭을 통한 초기화 > 생성자를통한 초기화  
		*/
		
		
		
	}

}

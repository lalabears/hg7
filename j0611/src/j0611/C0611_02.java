package j0611;
public class C0611_02 {
	public static void main(String[] args) {
		Car c1 = new Car(); 
		System.out.println("c1 CarNo : "+ c1.cNo);
		Car c2 = new Car(); 
		System.out.println("c2 CarNo : "+ c2.cNo);
		Car c3 = new Car(); 
		System.out.println("c3 CarNo : "+ c3.cNo);
		Car c4 = new Car(); 
		System.out.println("c4 CarNo : "+ c4.cNo);
		Car c5 = new Car(); 
		System.out.println("c5 CarNo : "+ c5.cNo);
		
		Car c6 = new Car("white","auto",4);
		System.out.println("c6 CarNo : "+ c6.cNo);
		Car c7 = new Car("red","auto",2);
		System.out.println("c7 CarNo : "+ c7.cNo);
		
		Car c8 = new Car(c1);
		System.out.println("c8 CarNo : "+ c8.cNo);
		System.out.println(c8.color);
		Car c9 = new Car(c7);
		System.out.println("c9 CarNo : "+ c9.cNo);
		System.out.println(c9.color);
		
		// 객체 배열 사용하기 . 
		Car[] cars = new Car[5];
		for(int i = 0 ; i < cars.length; i++) {
			cars[i] = new Car();
			System.out.println("carNo : " + cars[i].cNo);
		}
		
		
	}

}

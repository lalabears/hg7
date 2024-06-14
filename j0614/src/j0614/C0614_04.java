package j0614;
public class C0614_04 {
	public static void main(String[] args) {
		// 객체배열사용
		// tires = [앞왼, 앞오, 뒤왼, 뒤오]
		//           0    1    2     3
		Car car = new Car();
		for(int i = 0 ; i<6; i++) {
			int problemTireLocation = car.run();
			// 1번: 앞왼, 2번 앞오, 3번 뒤왼, 4번 뒤오 
			if(problemTireLocation !=0 ) {
				System.out.println(car.tires[problemTireLocation-1].location
						+ "한국타이어 교체");
				car.tires[problemTireLocation-1] = 
				new HankookTire(car.tires[problemTireLocation-1].location, 15);
			}
			System.out.println("======================");
			
			
			
		}
		
		
		
		
		
		
		
		
		/*
		for(int i =0 ; i <6 ; i++) {
			int problemTireLocation = car.run();
			switch(problemTireLocation) {
			case 1:
				System.out.println("앞 왼쪽 타이어 금호 타이어로 교체");
				car.frontLeftT = new KumhoTire("앞왼쪽", 20);
				//Tire t= new KumhoTire();
				break; 
			case 2:
				System.out.println("앞 오른쪽 타이어 금호 타이어로 교체");
				car.frontRightT = new KumhoTire("앞오른쪽", 20);
				break; 	
			case 3:
				System.out.println("뒤 왼쪽 타이어 금호 타이어로 교체");
				car.backLeftT = new KumhoTire("뒤왼쪽", 20);
				break; 
			case 4:
				System.out.println("뒤 오른쪽 타이어 금호 타이어로 교체");
				car.backRightT = new KumhoTire("뒤오른쪽", 20);
				break; 	
			} // switch
			System.out.println("======================================");
			
		}//for
		*/

	} // main

}// class

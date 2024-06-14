package j0614;
public class C0614_03 {
	public static void main(String[] args) {
		
		
		// 고양이객체
		Cat c1 = new Cat("나비",2,"암컷","흰색");
		Cat c2 = new Cat("하늘", 10, "수컷", "회색");
		Cat[] cats = { c1, c2 };  // 객체배열
		
		// 강아지객체 
		Dog d1 ,d2; 
		d1 = new Dog("코코",3,"수컷","리트리버");
		d2 =   new Dog("뿌꾸",6,"암컷","치와와");
		Dog[] dogs= {d1,d2};   // 객체배열
		
		// 토끼객체 , 
		
	// -----------------------------------------------------	// 
		
		Pet[] pets = { new Cat("나비",2,"암컷","흰색"),
					   new Cat("하늘", 10, "수컷", "회색"),
					   new Dog("코코",3,"수컷","리트리버"),
					   new Dog("뿌꾸",6,"암컷","치와와")
					  };
		
		for(int i = 0 ; i <pets.length ; i ++) {
			pets[i].printInfo(); // 메서드오버라이딩> 자기객체 함수 출력
		}
		// 나비, 2, 암컷, 흰색
		// 하늘, 10, 수컷, 회색
		// 코코, 3, 수컷, 리트리버
		// 뿌꾸, 6, 암컷, 치와와

		for(Pet p : pets) {   // 간단 for문 사용 
			p.printInfo();
		}
		
		

	}

}

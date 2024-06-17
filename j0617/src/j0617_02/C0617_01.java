package j0617_02;
public class C0617_01 {
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		Lion lion = new Lion(); 
		// 호랑이 
		feedALL(tiger);
		// 사자 
		feedALL(lion);
		// 판다 
		feedALL(new Panda());
		Panda panda = new Panda();
		feedAnimal(tiger);
		feedAnimal(lion);
		feedAnimal(panda);
		feedAnimal(new Cat());
		
	}
	static void feedAnimal(Animal a) {
		System.out.println(a.getFood());
	}
	
	// 매개변수의 다형성 부모클래스를 사용하면 안되나요? 
	static void feedALL(Anim a) {
		if( a instanceof Tiger) System.out.println("닭고기를 준다");
		if( a instanceof Lion ) System.out.println("소고기를 준다");
		if( a instanceof Panda ) System.out.println("대나무를 준다");
	}
	
	static void feed(Tiger t) {
		System.out.println("닭고기를 준다");
	}
	// 메서드의 오버로딩  &  static 메서드 
	static void feed(Lion t) {
		System.out.println("소고기를 준다");
	}
	static void feed(Panda p) {
		System.out.println("대나무를 준다");
	}

}

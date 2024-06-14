package j0614;
public class C0614_05 {
	public static void main(String[] args) {
		// 추상클래스는 완성된 설계도가 아니기때문에 객체를 생성할 수 없다. 
		//Animal a = new Animal();
		// a.cry();
		// a.eat();
		Puppy p = new Puppy();
		p.cry();
		p.play();
		Kitty k = new Kitty();
		k.cry();
		k.jump();
		// Animal a = new Animal();
		// 배열을 만든것. 
		Animal[] aniArr = new Animal[3]; 
		aniArr[0] = p; 
		aniArr[1] = k; 
		aniArr[2] = new Puppy();
		aniArr[0].cry(); // p > 강아지
		aniArr[1].cry(); // k > 고양이 
		aniArr[2].cry(); // p > 강아지 
	
		
		
		
		
	}

}

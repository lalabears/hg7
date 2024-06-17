package j0617_02;
public abstract class Anim {
	String name; 
	public void setName(String name) {
		this.name = name; 
	}
}
// Anim 클래스를 상속받음 
class Tiger extends Anim implements Animal {
	// getFood를 구현해야함 > 구현부를 완성해야함 
	public String getFood() { // 선언부
		return "닭고기를 준다";  // 구현부 
	}
}
class Lion extends Anim implements Animal {
	// getFood를 구현해야함 
	public String getFood() {
		return "소고기를 준다";
	}
}
class Panda extends Anim implements Animal {
	// getFood를 구현해야함 
	public String getFood() {
		return "대나무를 준다";
	}
}
class Cat extends Anim implements Animal {
	// getFood를 구현해야함 
	public String getFood() {
		return "물고기를 준다";
	}
}


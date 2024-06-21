package j0621;
// Animal 클래스 만들기 : 추상클래스
abstract class Animal {
	// private 변수 : name, age 
	private String name; 
	private int age;
	// 생성자
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// 추상 메서드 : cry
	abstract void cry();
    // 메서드 : eat,   > [밥을먹습니다] 출력 
    void eat() {
    	System.out.println("밥을 먹습니다");
    }
	//       toString 이름:00 나이: 00 
	@Override
	public String toString() {
		return "이름: " + name + ", 나이:" + age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	} 
} // animal class 
//Dog 클래스 - 동물 상속 - 동물의 모든변수, 메서드 다 받는다 
class Dog extends Animal{
	// private 변수 :   species
	private String species; 
	// 생성자 
	public Dog() {super("멍멍이", 1);}
	public Dog(String name, int age) {
		super(name, age);
	}
	public Dog(String name, int age, String species) {
		super(name, age);
		this.species = species;
	}
	// 메서드 
	// 추상메서드 완성 
	void cry() {
		System.out.println("멍멍");
	}
	// toString 이름:00 나이: 00 종: 00
	@Override
	public String toString() {
		return super.toString()+ ", 종: " + species ;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
}//Dog
// Cat 클래스 - 동물 상속
class Cat extends Animal{
	// private 변수 :   color
	private String color;
	// 생성자 
	public Cat(String name, int age) {
		super(name, age);
	}
	public Cat(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}
	// 메서드 
	// 추상메서드 완성 
	void cry() {
		System.out.println("야옹");
	}
	@Override
	public String toString() {
		return super.toString()+ ", 색: " + color ;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	} 
	
}//Cat



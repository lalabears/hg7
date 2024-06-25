package j0625;
// 추상메서드
public abstract class Animal {
	private String name;
	private int age; 
	Animal(){}
	Animal(String name, int age){
		this.name=name; this.age=age;
	}
	// 추상클래스
	abstract void cry();
	// 메서드 오버라이딩 
	public String toString() {
		return "이름 : "+ name+", 나이: "+ age;
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
	
} // animal 
class Dog extends Animal {
	private String species;
	Dog(String name, int age, String species){
		super(name, age); this.species = species;
	}
	void cry() { // 추상메서드를 구현 
		System.out.println("멍멍");
	}
	public String toString() {
		return super.toString()+", 종: "+ species;
	}
	
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	
	
}// dog
class Cat extends Animal {
	private String color;
	Cat(String name, int age, String color){
		super(name, age); this.color = color;
	}
	void cry() {
		System.out.println("야옹");
	}
	public String toString() {
		return super.toString()+", 색: "+ color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}// cat

package j0614;

import javax.swing.JPopupMenu.Separator;

public class Pet {
	String name; 
	int age; 
	String gender;
	Pet(){}
	Pet(String name, int age, String gender){
		this.name = name; this.age = age ; this.gender = gender;
	}
	void printInfo() {
		System.out.print(name+", "+age+", "+gender);
	}
} // pet class

class Dog extends Pet{
	String species;
	Dog(String name, int age, String gender, String species){
		super(name, age, gender);
		this.species = species;
	}
	// 메서드오버라이딩 
	void printInfo() {
		super.printInfo(); // 부모의 메서드 호출. this=자신, super=부모
		System.out.println(", "+ species);
	}
}
class Cat extends Pet{
	String color; 
	Cat(String name, int age, String gender, String color){
		super(name, age, gender);
		this.color = color;
	}
	// 메서드오버라이딩 
	void printInfo() {
		super.printInfo(); // 부모의 메서드 호출. this=자신, super=부모
		System.out.println(", "+ color);
	}
}






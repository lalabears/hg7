package j0621;
import java.util.*;
public class C0621_09 {
	public static void main(String[] args) {
		// 개 리스트를 만들어서 
		List<Dog> dogs = new ArrayList<Dog>();
		// 고양이 리스트를 만들어서 
		List<Cat> cats = new ArrayList<Cat>();
		
		Dog d1 = new Dog("뿌꾸", 5,"말티즈");
		Dog d2 = new Dog("무키", 5,"리트리버");
		Cat c1 = new Cat("춘식이", 3, "삼색");
		Cat c2 = new Cat("냥이", 1, "흰색");
		Cat c3 = new Cat("노아", 8, "검정");
	
		dogs.add(d1); dogs.add(d2);
		cats.add(c1); cats.add(c2); cats.add(c3);
		for(Dog d: dogs) {
			System.out.println(d);
		}
		for(Cat c : cats) {
			System.out.println(c);
		}
		System.out.println("--------------------------------");
		// animal을 상속 받는 객체라면 다 담을 수 있음. 
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(d1); animals.add(d2);
		animals.add(c1); animals.add(c2); animals.add(c3);
		for(Animal a : animals) {
			System.out.println(a);
		}
		// 동물들의 이름만 줄바꿈 없이 출력해보세요 
		for(Animal a : animals) {
			System.out.print(a.getName()+" ");
		}
		System.out.println();
		for(int i = 0; i< animals.size() ; i ++) {
			System.out.print(animals.get(i).getName() + " ");
		}
		System.out.println();
		
		// 4살 이하의 동물의 정보만 출력해보세요 
		for(Animal a : animals) {
			if(a.getAge()<=4) {
				System.out.println(a);
			}
		}
		// 이름이 3글자 이상인 동물의 정보를 출력해보세요 
		for(Animal a : animals) {
			if(a.getName().length() >=3) {
				System.out.println(a);
			}
		}
		System.out.println("==========================");
		List<Number> num = new ArrayList<Number>();
		// 1 - 100 사이의 짝수만 num리스트에 넣어주세요 
		for(int i = 1 ; i<=100; i++ ) {
			if(i%2==0)	num.add(i);
		}
		
		// 출력은 5의 배수만 출력해주세요 
		for(Number n : num) {
			if((Integer)n % 5==0)	System.out.println(n);
		}
		
		
		
	
	}

}

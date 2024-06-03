package j0603;

import java.util.Scanner;

public class C0603_11 {
	public static void main(String[] args) {
		// 객체 하나를 생성해주세요 
		// 홍길동 23살 
		Person p1 = new Person(); 
		p1.age = 23; 
		p1.name = "홍길동"; 
		p1.print();
		int age1 = p1.nextAge();
		int age20 = p1.ageNyr(20);
		String str = p1.gen();
		System.out.println("1년후 나이 : " + age1 );
		System.out.println("20년후 나이 : " + age20 );
		System.out.println("현재 : " + str );
		Scanner scan = new Scanner(System.in);
		// int[] num = new int[3]
		// 1. person의 객체 배열을 만들어서 (5명)
		Person[] people = new Person[5];
		// 2. 이름과 나이를 각각 입력받아서 
		for(int i = 0; i< people.length ; i++) {
			people[i] = new Person(); // 꼭 객체를 생성해야함!!!!!
			System.out.println("이름: ");
			people[i].name = scan.next();
			System.out.println("나이: ");
			people[i].age = scan.nextInt();
		}
		// 3. 출력해보기 (print()함수사용)
		for(int i = 0; i< people.length ; i++) {
			people[i].print();
			System.out.println(people[i].gen()); // 4. 어린이, 청소년, 성인 인지 출력해보기
		}
		 
		
		
		

	}

}

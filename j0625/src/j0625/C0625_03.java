package j0625;
import java.util.*;
public class C0625_03 {
	public static void main(String[] args) {
       // people 리스트를 만들어서 
	/*	짱구 5세 		봉미선 29세		강백호 18세 북산고 
		채치수 19세 북산고 	신형만 35세 떡잎상사 채송화 22세 떡잎유치원 */
	//		List<Student> s = new ArrayList<Student>(); 
//		s.add(new Student("강백호" ,18, "북산고" )) ;
//		
//		List<Worker> w = new ArrayList<Worker>(); 
//		w.add(new Worker("신형만" ,35, "떡잎상사"));
		// 다형성 
		/*
		List<Person> people = new ArrayList<Person>(); 
		people.add( new Person("짱구", 5) );
		people.add( new Person("봉미선", 29) );
		people.add( new Student("강백호" ,18, "북산고" )) ;
		people.add( new Student("채치수" ,19, "북산고" )) ;
		people.add( new Worker("신형만" ,35, "떡잎상사"));
		people.add( new Worker("채송화" ,22, "떡잎유치원"));

		// for 문을 사용해서 전체 출력하기
		for(Person p : people) {
			System.out.println(p);
		}*/
		
     /*	List<Person> people = new ArrayList<Person>(); 
		addP(people);   // 짱구~ 채송화 리스트에 추가하기
		printP(people); // 리스트에 있는거 출력하기*/
		
		List<Person> people;
		// 호출부 :  return 받는 타입 = 메서드명 ( 인수 ) ;
		// 구현부 :  리턴타입 메서드명(매개변수자료형 지역변수명){}
		people = addP();
		printP(people);

	}// main
	
	// 여기다 메서드만들기
	static List<Person> addP(){
		List<Person> p = new ArrayList<Person>();
		p.add( new Person("짱구", 5) );
		p.add( new Person("봉미선", 29) );
		p.add( new Student("강백호" ,18, "북산고" )) ;
		p.add( new Student("채치수" ,19, "북산고" )) ;
		p.add( new Worker("신형만" ,35, "떡잎상사"));
		p.add( new Worker("채송화" ,22, "떡잎유치원"));
		return p; // 00XX1
	}
	
	// 메서드 오버로딩
	static void addP(List<Person> p) {
		p.add( new Person("짱구", 5) );
		p.add( new Person("봉미선", 29) );
		p.add( new Student("강백호" ,18, "북산고" )) ;
		p.add( new Student("채치수" ,19, "북산고" )) ;
		p.add( new Worker("신형만" ,35, "떡잎상사"));
		p.add( new Worker("채송화" ,22, "떡잎유치원"));
	}
	static void printP(List<Person> peo) {
		for(Person p : peo) {
			System.out.println(p);
		}
	}

}

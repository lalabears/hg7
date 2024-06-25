package j0625;
import java.util.*;
public class C0625_02 {
	public static void main(String[] args) {
		// integer 객체만 담을 수 있는 리스트
		List<Integer> n = new ArrayList<Integer>();
		// list n 에 숫자 추가
		n.add(1);		n.add(2);		n.add(3);
		System.out.println(n); // [1, 2, 3]
		// 리스트의 모든 요소를 삭제 
		n.clear(); System.out.println(n); // []

		// 1-45 사이의 랜덤한 숫자 10개를 리스트에 채워보세요 
		for(int i = 0 ; i < 10 ; i ++) {
			int r = (int)(Math.random()*45)+1; 
			n.add(r);
			//n.add((int)(Math.random()*45)+1);
		}
		System.out.println(n);
		// 25 이상의 숫자만 출력해보세요 
		for(int i = 0 ; i < n.size() ; i ++) {
			if(n.get(i)>25) {
				System.out.print(n.get(i)+" ");
			}
		}
		System.out.println();
		System.out.println("정렬 전 : "+ n);
		Collections.sort(n);
		System.out.println("정렬 후 : "+ n);
		
		List<String> ns = new ArrayList<String>();
		ns.add("강백호"); ns.add("홍길동");  
		ns.add("서태웅"); ns.add("유관순");  
		System.out.println("정렬 전 : "+ ns); //[강백호, 홍길동, 서태웅, 유관순]
		// 문자열은 사전순으로 정렬을 해줌. 
		Collections.sort(ns);
		System.out.println("정렬 후 : "+ ns); //[강백호, 서태웅, 유관순, 홍길동]
		
		
		// people 라는 리스트를 만들어서
		// 강백호 20세, 홍길동 30세, 서태웅 24세, 유관순 17세를 리스트에 넣어보세요
		List<Person> people = new ArrayList<Person>();
		// people.add(여기는 person객체만 들어올 수 있음 !!!!)
		// 1. 객체를 따로 생성해서 넣는다 
		// 선언    =   생성 
		Person p1 = new Person("강백호", 20);
		people.add(p1);
		// 2. 생성함과 동시에 넣는다 
		people.add (   new Person("홍길동", 30)   );
		people.add(new Person("서태웅", 24));
		people.add(new Person("유관순", 17));
		
		
		for(int i = 0; i < people.size() ; i++ ) {
			System.out.println(people.get(i));
			// toString의 리턴이 출력이됨
		}
		
		System.out.println(people);
		// [name=강백호, age=20, name=홍길동, age=30, name=서태웅, age=24, name=유관순, age=17]
		
		Collections.sort(people);
		System.out.println(people);
		Collections.sort(people);
		// [name=유관순, age=17, name=강백호, age=20, name=서태웅, age=24, name=홍길동, age=30]

		

	}

}

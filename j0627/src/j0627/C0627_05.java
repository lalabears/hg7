package j0627;
import java.util.*;
public class C0627_05 {
	public static void main(String[] args) {
		List<Food> list = new ArrayList<Food>(); 
		// list에 음식을 넣어주세요 
		list.add(new Drink());
		list.add(new Snack());
		list.add(new Drink("콜라", 2500));
		list.add(new Snack("하리보", 2500, true));

		// 리스트에 들어있는 품목의 이름을 출력해주세요 
		for(int i = 0 ; i< list.size() ; i ++) {
			System.out.println(list.get(i).getName());
		}
		// 리스트에 들어있는 품목의 가격들을 출력해주세요 
		for(Food f: list) {
			System.out.println(f.getPrice());
		}
		// 리스트에들어있는 품목의 가격들의 총합을 구해보세요 
		int sum = 0 ;
		for(int i = 0 ; i < list.size(); i++) {
			sum += list.get(i).getPrice();
		}
		System.out.println(sum);
		// 리스트에 들어있는 품목의 가격의 평균을 구해보세요 
		System.out.println((double)sum/list.size());
		
		// map
		// 키(key) 값(value)
		Map<String, Food> map = new HashMap<String, Food>();
		map.put("홍길동", new Drink());
		map.put("강백호", new Snack());
		map.put("짱구", new Drink("우유", 1500));
		// 편의점을 방문한 손님의 이름을 출력해보세요 
		System.out.println(map.keySet()); // [강백호, 짱구, 홍길동]
		for(String name: map.keySet()) {
			System.out.println(name);
		}
		// 홍길동 - 물   /   강백호 - 초코파이   / 짱구 - 우유  출력해보기 
		for(String name: map.keySet()) {
			System.out.println(name + " - " + map.get(name).getName());
		}
		// 편의점이 판매한 아이템의 총합을 출력 
		sum=0;
		for(String name: map.keySet()) {
			sum+= map.get(name).getPrice();
		}
		System.out.println(sum); // 3000
		
		// 컬랙션 : list, set , Map 
		List<String> lists = new ArrayList<String>();
		Set<String> sets = map.keySet();
		
		Map<String, Integer> student = new HashMap<String, Integer>(); 
		student.put("홍길동", 80);
		student.put("김구", 100);
		student.put("유관순", 90);
		student.put("이순신", 70);
		student.put("강백호", 50);
		// 학생의 이름을 출력하기 
		for(String s : student.keySet()) {
			System.out.print(s + " "); // 강백호 홍길동 김구 이순신 유관순 
		} System.out.println();
		// 학생 : 점수 로 출력하기 
		for(String s : student.keySet()) {
			System.out.println(s + " : " + student.get(s)); // 강백호 홍길동 김구 이순신 유관순 
		} 
		// 학생들의 평균을 출력하기 
		int total = 0 ;
		for(String s : student.keySet()) {
			total += student.get(s); // 강백호 홍길동 김구 이순신 유관순 
		} 
		System.out.println((double)total/student.size()); //78.0
		
		Member m1 = new Member("홍길동", 80);
		Member m2 = new Member("김구", 100);
		Member m3 = new Member("유관순", 90);
		Member m4 = new Member("이순신", 70);
		Member m5 = new Member("강백호", 50);
		
		Map<String, Member> mem = new HashMap<String, Member>(); 
		mem.put("홍길동", m1);
		mem.put("김구", m2);
		mem.put("유관순", m3);
		mem.put("이순신", m4);
		mem.put("강백호", m5);
		// key 출력해보기. 
		for(String s : mem.keySet()) {
			System.out.print(s + " "); // 강백호 홍길동 김구 이순신 유관순 
		} System.out.println();
		// key : point 로 출력해보기 
		for(String s : mem.keySet()) {
			System.out.println(s + " : " + mem.get(s).point); // 강백호 홍길동 김구 이순신 유관순 
		} 
		// point의 평균 출력해보기 
		total = 0 ;
		for(String s : mem.keySet()) {
			total += mem.get(s).point;  
		}
		
		List<Member> first = new ArrayList<Member>();
		first.add(m1); first.add(m2); first.add(m3); 
		List<Member> second = new ArrayList<Member>();
		second.add(m4); second.add(m5); 
		
		Map<String, List<Member> > stus = new HashMap<String, List<Member>>();
		stus.put("1학년", first);
		stus.put("2학년", second);
		
		// stus - 의 key 출력해보기 
		for(String s : stus.keySet()) {
			System.out.println(s);
		}
		// stus 의 key : value 
		for(String s : stus.keySet()) {
			System.out.println(s + " : " + stus.get(s));
		}
		// 2학년 : [j0627.Member@15db9742, j0627.Member@6d06d69c]
		// 1학년 : [j0627.Member@7852e922, j0627.Member@4e25154f, j0627.Member@70dea4e]

		// 
		for(String s : stus.keySet()) { // s: key : 학년 
			for(Member m : stus.get(s)) { // m: 사람 
				System.out.println( s +"  :  " + m.name);
			}
			//System.out.println(s + " : " + stus.get(s).get(0).name);
		}
		//  2학년 : 이순신		1학년 : 홍길동

		// 1 학년 친구들의 총점, 2학년 친구들의 총점 출력해보세요 
		// Map<String, List<Member> >
		for(String s : stus.keySet()) { // s: key : "1학년", "2학년" 
			sum = 0 ;
			/*for(Member m : stus.get(s)) { // m: 사람 
				sum+= m.point;
			}*/
			for(int i = 0 ; i < stus.get(s).size() ; i++ ) {
				sum += stus.get(s).get(i).point;
			}
			System.out.println(s+"총점 :"+sum);
			System.out.println(s+"평균 :"+ (double)sum/ stus.get(s).size()  );
		}
		sum = 0;
		for(Member m : stus.get("2학년")) { // m: 사람 
			sum+= m.point;
		}
		
		////////////////////////////////
		List<Food> list2 = new ArrayList<Food>(); 
		list2.add( new Drink("콜라", 3000) );
		list2.add(  new Drink("맥주", 4000, true));
		list2.add( new Snack("새우깡",2500,false));
		
		
		
	}

}

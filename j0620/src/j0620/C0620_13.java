package j0620;
import java.util.*;
public class C0620_13 {
	public static void main(String[] args) {
		// treeset 생성하기 
		TreeSet<Integer> ts1 = new TreeSet<Integer>(); 
		TreeSet<Integer> ts2 = new TreeSet<>(); 
		TreeSet<Integer> ts3 = new TreeSet<>(Arrays.asList(1,2,3));
		
		
		TreeSet<Integer> set = new TreeSet<Integer>(); 
		set.add(5);		set.add(3);		set.add(9);		set.add(7);
		System.out.println(set); // [3, 5, 7, 9]
		System.out.println(set.size());
		
		for(int i : set) {
			System.out.print(i+ " ");
		}
		System.out.println();
		// 입력값보다 큰 데이터 중 최소값 출력 없으면 null 
		System.out.println(set.higher(3));
		// 입력값보다 작은 데이터 중 최대값 출력 없으면 null 
		System.out.println(set.lower(3));
		
		set.remove(7);
		System.out.println(set);
		set.clear();
		System.out.println(set);
		System.out.println(set.isEmpty());

		Set<Integer> ts4 = new TreeSet<Integer>(); 
		ts4.add(5);
		ts4.add(5);
		ts4.add(15);
		ts4.add(25);
		ts4.add(6);
		System.out.println(ts4); // [5, 6, 15, 25]
		// ts4.higher() 없다. 부모인터페이스에 존재하지 않는 메서드

	}

}

package j0626;
import java.util.*;
public class C0626_04 {
	public static void main(String[] args) {
/* 		iterator : ArrayList, Hashset등의 컬랙션을 반복할때
 *                 사용할 수 있는 객체. 
 *                 반복의 기술용어이기 때문에 반복자 라고 한다. 
 *      컬랙션 : list , set, map
 *      1. 컬랙션에서 요소를 제어하는 기능.
 *      2. next(), previous() 를사용해서 앞뒤로 이동함.
 *      3. hasNext()를 사용해 뒤에 요소가 있는지를 확인
 *      4. remove() 마지막요소를 현재 컬렉션에서 제거하는 기능 
*/
//		List<Object> list = new ArrayList<Object>();
		List list = new ArrayList();
		list.add("111");
//		list.add(222);
		list.add("333");
//		list.add(444);
		list.add("555");
		list.add("111");
		
		System.out.println("---------------------");
		// list의 경우는 인덱스가 있음. 
		for(int i = 0 ; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---------------------");
		// 간단 for문 -> 요소가 섞여 있다면 object로만 가져올 수 잇다 
		for(Object o : list) {
			System.out.println(o);
		}
		System.out.println("---------------------");
		// String str = "helloworld";	str.substring(0, 5); 
		List<String> list1 = new ArrayList<String>();
		list1.add("111");	list1.add("333");	list1.add("555");
		for(String s : list1) {
			System.out.println(s.substring(0,2));
		}
		System.out.println("---------------------");
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			// while은 it.hasNext()결과참일때만 동작
			System.out.println(it.next());
		}
		System.out.println("---------------------");
		it = list.iterator();
		while(it.hasNext()) {
			// while은 it.hasNext()결과참일때만 동작
			System.out.println(it.next());
		}
		System.out.println("종료");
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("벤츠"); cars.add("페라리");
		cars.add("람보르기니"); cars.add("롤스로이스");
		
		System.out.println("-----------------------------");
		// 정규 for문으로 출력 :
		for(int i = 0 ; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("-----------------------------");
		// 간단 for문으로 출력 :
		for(String c : cars) {
			System.out.println(c);
		}
		System.out.println("-----------------------------");
		// iterator을 사용해서 출력 : 
		Iterator t = cars.iterator();
		while(t.hasNext()) {
			System.out.println(t.next());
		}
		
		
	}

}

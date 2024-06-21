package j0621;
import java.util.*;
public class C0621_07 {
	public static void main(String[] args) {
		// 객체 배열 
		Card[] c = new Card[4];
		// 1. 배열의 크기제한, 2. 같은타입만 넣을 수 있다.
		// 3. 삭제불가  4. 중간에 추가하기 못함 
		c[0] = new Card("Spade",1);
		c[1] = new Card("Heart",1);
		c[2] = new Card("Clover",1);
		c[3] = new Card("Diamond",1);
		for(int i = 0; i< c.length; i++) {
			System.out.println(c[i]); // toString()
		}
		// Spade - 1  / Heart - 1	/ Clover - 1 /	 Diamond - 1
		for(int i = 0; i< c.length; i++) {
			System.out.println(c[i].getKind() +" - "+c[i].getNumber()); 
		}
		System.out.println("-------------------");
		// 1. 배열의 크기제한 없음. 2. 타입에 상관없이 담을 수 있음
		// 3. 삭제 가능, 4. 중간에 추가할 수 있음 
		ArrayList<Card> list = new ArrayList();
		list.add(new Card("Spade",1)); // Object로 자동형변환되어 저장됨
		list.add(new Card("Heart",1)); // Object로 자동형변환되어 저장됨
		list.add(new Card("Clover",1)); // Object로 자동형변환되어 저장됨
		list.add(new Card("Diamond",1)); // Object로 자동형변환되어 저장됨
	//	list.add("String");
	//	list.add(new Integer(11));
	//	list.add(new Point(1,1)); 
		for(int i = 0 ;i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// Spade - 1  / Heart - 1	/ Clover - 1 /	 Diamond - 1
		for(int i = 0 ;i < list.size(); i++) {
			System.out.println(list.get(i).getKind() + " - "+ list.get(i).getNumber());
		}
		// 간단for 
		for(Card n : list) {
			System.out.println(n.getKind() + " - " + n.getNumber());
		}
		
		
		
	}// main

}

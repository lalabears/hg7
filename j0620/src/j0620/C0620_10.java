package j0620;
import java.util.*;
public class C0620_10 {
	public static void main(String[] args) {
		ArrayList<Number> aL = new ArrayList<Number>();
		LinkedList<Number> lL = new LinkedList<Number>();		
		System.out.println("순차적으로 추가하기");
		System.out.println("ArrayList : "+ add1(aL));
		System.out.println("LinkedList : "+ add1(lL));
		
		System.out.println("중간에 추가하기");
		System.out.println("ArrayList : "+ add2(aL));
		System.out.println("LinkedList : "+ add2(lL));
		
		System.out.println("접근시간 테스트 ");
		System.out.println("ArrayList : "+ access(aL));
		System.out.println("LinkedList : "+ access(lL));
		
		System.out.println("중간에서 삭제하기 ");
		System.out.println("ArrayList : "+ remove1(aL));
		System.out.println("LinkedList : "+ remove1(lL));
		
		System.out.println("순차적으로 뒤부터 삭제하기 ");
		System.out.println("ArrayList : "+ remove2(aL));
		System.out.println("LinkedList : "+ remove2(lL));
		
	}
	public static long remove2(List list) {
		long start = System.nanoTime();
		for(int i= list.size()-1; i>=0;i--) {
			list.remove(i); // 뒤에서부터순차적으로 삭제하기
		}
		long end = System.nanoTime();
		return end-start; 
	}
	public static long remove1(List list) {
		long start = System.nanoTime();
		for(int i = 0 ; i < 10000 ;i ++) {
			list.remove(500); // 인덱스가 500인애들 삭제하기
		}
		long end = System.nanoTime();
		return end-start; 
	}
	public static long access(List list) {
		long start = System.nanoTime();
		for(int i = 0 ; i < 10000 ;i ++) {
			list.get(i); // get(i) 는 i인덱스에 접근
		}
		long end = System.nanoTime();
		return end-start; 
	}
	public static long add1(List list) {
		long start = System.nanoTime();
		for(int i = 0 ; i < 10000 ;i ++) {
			list.add(i+1);
		}
		long end = System.nanoTime();
		return end-start; 
	}
	public static long add2(List list) {
		long start = System.nanoTime();
		for(int i = 0 ; i < 10000 ;i ++) {
			list.add(500,1);
		}
		long end = System.nanoTime();
		return end-start; 
	}

}

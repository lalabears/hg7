package j0624;
import java.util.*;
public class C0624_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> n = new ArrayList<Integer>();
		n.add(1); n.add(10); n.add(100); n.add(1000);
		// n에 있는 숫자들의 합 :
		int sum = 0;
		for(int i = 0 ; i<n.size();i++) {
			sum += n.get(i);
		}
		System.out.println(sum);
		// 객체 선언 및 생성. 
		Num n1 = new Num(1); 
		System.out.println(n1.x);
		// collection 은 객체를 담을 수 있다. 	
		List<Num> list = new ArrayList<Num>();
		// 객체를 리스트에 추가하기 
		list.add(n1);
		list.add(new Num(10));
		list.add(new Num(100));
		list.add(new Num(1000));
		int obsum = 0 ; 
		for(int i = 0 ; i<list.size();i++) {
			obsum += list.get(i).x;
		}
		System.out.println(obsum);
		
		System.out.println("-----------------------");
		list.clear(); //		System.out.println(list);
		
		// List<Num> list = new ArrayList<Num>();
		// 정수입력 
		list.add(new Num(10)); 
		// 0번째 리스트 출력하기 
		System.out.println(list.get(0).x); // 10
		System.out.println(list.get(0).y); // 0.0
		
		list.add(new Num(3.14));
		System.out.println(list.get(1).x);  // 0
		System.out.println(list.get(1).y);  // 3.14 
		
		list.clear(); // 리스트 전체 값 제거 
		// list를 사용. 실수만 입력을 받아 -1을 입력받으면 입력받기 중지. 
		while(true) {
			System.out.println("숫자를 입력하세요 (종료 : -1 )");
			double d = scan.nextDouble();
			if(d==-1) break;
			//list.add(new Num(Double.parseDouble(d)));
			list.add(new Num(d));
		}
		// 입력된 실수들의 합을 구해보세요 
		double dsum = 0 ; 
		for(int i = 0 ; i<list.size();i++) {
			dsum += list.get(i).y;
		}
		System.out.println(dsum);
		
		
		
		
		
		
		
		
		
	/*	// list에 정수를 -1(a)을 입력받을때까지 입력 받아서 리스트엔 저장하세요 
		String num=""; 
		while(true) {
			System.out.println("숫자를 입력하세요 (종료 : a )");
			num = scan.next(); 
			if(num.equals("a")) break; 
			// list.add(new Num(10));
			// Integer 추가 : list.add(Integer.parseInt(num));
			list.add(new Num(Integer.parseInt(num)));
		}
//		입력받은 숫자들의 합을 출력해보세요  get
		obsum = 0; 
		for(int i = 0 ; i< list.size() ; i++) {
		//	obsum += list.get(i); // 객체를 가지고온다. 
			obsum += list.get(i).x;
		}
		System.out.println("총합 : "+ obsum);
		
	*/	
		
		
	}

}

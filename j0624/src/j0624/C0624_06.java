package j0624;
import java.util.*;
public class C0624_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Num> list = new ArrayList<Num>();
		// 객체 리스트에서는.. : 추가하기.  
		// 1. 객체 생성 후 그 값을 list에 add 메서드 사용해서 넣기 
		// Num nobj = new Num(10);
		// list.add(nobj);
		// 2. 객체를 생성함과동시에 넣거나 
		// list.add(new Num(3.14));

		// 값을 읽어오기. get(인덱스)메서드 사용 
	//	list.get(0);    // 객체 그자체 
	//	list.get(0).x ; // x변수 가져오기 
	// 	list.get(0).getX(); // getter메서드로 값 가져오기 
	//	list.get(0).y ; // y변수 가져오기 .
		
		/*실수를 입력받으면 0을 저장 
		정수를 입력받으면 입력받은 숫자를 리스트에 저장 
		총합은 어떻게 구할까요 ?*/		
		String num = "";
		while(true) {
			System.out.println("숫자를 입력하세요 (종료 : a )");
			num = scan.next(); 
			if(num.equals("a")) break; 
			else if( isInteger(num) ) {   //  정수면
				list.add( new Num(Integer.parseInt(num)) );
			} else if( isDouble(num) ) { // 실수면
				list.add( new Num(0) );
			}
		}
		int sum = 0; 
		for(int i = 0 ; i< list.size() ; i++) {
			sum += list.get(i).x;
		}
		System.out.println("총합 : "+ sum);
		
		

		
	/*	
		System.out.println(isDouble("3.14"));  // true
		System.out.println(isInteger("3.14")); // false
		System.out.println(isDouble("3"));  // false -
		System.out.println(isInteger("3")); // true*/
	}
	static boolean isDouble(String num) {
		// 실수는 숫자이며, 
		// 1로나눈 나머지가 0이면 정수. 아니면실수 
		try {
			// 실수면 참, 정수면 거짓
			double d = Double.parseDouble(num);
			//Double.parseDouble(num);
			//return true; 
			if (d % 1 == 0 ) return false;
			else return true;
		} catch(Exception e) {
			return false; 
		}
	}
	static boolean isInteger(String num) {
		// 정수면 참, 실수면 거짓
		try {
			Integer.parseInt(num);
			return true;
		} catch(Exception e) {
			return false; 
		}
	}

}

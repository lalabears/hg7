package j0624;
import java.util.*;
public class C0624_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		String num = "";
//		정수를 -1(a)을 입력받을때까지 입력 받아서 리스트엔 저장하세요 add
		while(true) {
			System.out.println("숫자를 입력하세요 (종료 : a )");
			num = scan.next(); 
			if(num.equals("a")) break; 
			list.add(Integer.parseInt(num));
		}
//		입력받은 숫자들의 합을 출력해보세요  get
		int sum = 0; 
		for(int i = 0 ; i< list.size() ; i++) {
			sum += list.get(i);
		}
		System.out.println("총합 : "+ sum);
		
	}

}

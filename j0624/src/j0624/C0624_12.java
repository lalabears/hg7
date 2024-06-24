package j0624;
import java.util.*;
public class C0624_12 {
	public static void main(String[] args) {
		/*	문자열로 nextLine() 으로 입력을 받아서 "1 2 3 4 5"
		입력받은 숫자들의 리스트는 List<Num> 로 만들어서 한개한개 넣은후  */
		Scanner scan = new Scanner(System.in);
		//String str = scan.nextLine();
		String str = "1 2 3 4 5 6 7 8 9 10";
		String[] nums = str.split(" "); 
		// 방금전에 한것 :List<Integer> n = new ArrayList<Integer>(); 
		// 지금할것. 
		List<Num> list = new ArrayList<Num>();
		for(int i =0; i <nums.length ; i++ ) {
			list.add( new Num(Integer.parseInt(nums[i])));
		}
		
		System.out.println(list); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		 
		// list에 있는 숫자들의 합을 출력해보세요. 
		int sum = 0 ;
		for(int i =0; i<list.size(); i++) {
			sum += list.get(i).x; 
		}
		System.out.println(sum); // 55
		
		// 최대값과 최소값도 출력해보세요
		int max = list.get(0).x;
		int min = list.get(0).x;
		
		
	    // 평균도 출력해보세요
		System.out.println("평균 : "+ (double)sum/list.size());
		// 평균 : 5.5

		 
		 
		 
		 
		 
		
		
		/*String n = "11";
		System.out.println(n+100); // 11100

		System.out.println(Integer.parseInt("10")+100); //111
		
		
		
		int n2 = 10; 
		Integer n3 = (Integer)n2; 
		int n4= (int) n3; */
		
	}

}

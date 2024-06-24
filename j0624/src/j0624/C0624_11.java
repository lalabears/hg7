package j0624;
import java.util.*;
public class C0624_11 {
	public static void main(String[] args) {
		// 입력부분 
		/*	문자열로 nextLine() 으로 입력을 받아서 "1 2 3 4 5"
		입력받은 숫자들의 리스트는 List<Number> 로 만들어서 한개한개 넣은후  */
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 숫자들을 띄어쓰기해서 입력해주세요");
		String str = scan.nextLine();
		String[] nums = str.split(" "); 
		
		List<Double> list = new ArrayList<Double>();
//		List<Integer> list = new ArrayList<Integer>();
		for(int i =0; i <nums.length ; i++ ) {
//			list.add(Integer.parseInt(nums[i]));
			list.add(Double.parseDouble(nums[i]));
		}
		// Integer.parseInt("1") > 1   : 문자열1을 정수 1로 바꿔줌
		// Double.parseDouble("1") > 1.0 : 문자열1을 실수1.0으로 바꿈
		
		System.out.println(list);  //   [1, 2, 3, 4, 5]
		
		//list에 있는 숫자들의 합을 출력해보세요. 
		double sum = 0 ;
		for(int i =0; i<list.size(); i++) {
//			sum += (int)list.get(i); // Number - 실수, 정수 
			sum += list.get(i); // Integer - 실수, 정수 
		}
		System.out.println(sum); // 15
		
	//	최대값과 최소값도 출력해보세요
		Collections.sort(list); //  integer, double, string 
		System.out.println(list);
		System.out.println("최소값 : " + list.get(0));
		System.out.println("최대값 : " + list.get(list.size()-1));
		
		//평균도 출력해보세요
		System.out.println("평균 : "+ (double)sum/list.size());
		
		// 역순정렬 
		Collections.reverse(list);
		System.out.println(list);
		

	}

}

package j0624;

import java.util.*;

public class C0624_10 {
	public static void main(String[] args) {
		String str = "swim,golf,book,run,game";
		String[] h1 = str.split(","); // 배열에 담아서 출력해보세요 
		for(String h: h1) {
			System.out.print(h+" ");
		}
		System.out.println();
		String str2 = "수영/골프/독서/조깅/게임";
		String[] h2 = str2.split("/"); // 배열에 담아서 출력해보세요 
		for(String h: h2) {
			System.out.print(h+" ");
		}
		System.out.println();
		String str3 = "수영 골프 독서 조깅 게임";
		String[] h3 = str3.split(" "); // 배열에 담아서 출력해보세요 
		for(String h: h3) {
			System.out.print(h+" ");
		}
		System.out.println();
		String str4 = "자바-파이썬-C-자바스크립트";
		String[] h4 = str4.split("-"); // 배열에 담아서 출력해보세요 
		for(String h: h4) {
			System.out.print(h+" ");
		}
		System.out.println();
		
		
		String s1 = "Hello World";
		String s2 = "hello world";
		if(s1.equals(s2)) { // 문자열도 대소문자를 구별함. 
			System.out.println("s1,s2 같음");
		}else {
			System.out.println("s1,s2 다름");
		}
		if(s1.equalsIgnoreCase(s2)) { // 대소문자 무시하고 비교 
			System.out.println("s1,s2 같음");
		}else {
			System.out.println("s1,s2 다름");
		}
		// s1,s2 같음
		String s3 = s1.toLowerCase(); // s1을 소문자로 만듦
		if(s3.equals(s2)) {  
			System.out.println("s1,s2 같음");
		}else {
			System.out.println("s1,s2 다름");
		}
		String n = "1 2 3 4 5 6 7 8 9 10";
		String[] num = n.split(" ");
		System.out.println(Arrays.toString(num));
		// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		// 배열에 들어간 숫자들의 합? 
		int sum = 0; 
		for(int i = 0; i< num.length; i++) {
			sum += Integer.parseInt(num[i]);
		}
		System.out.println(sum); // 55
		
		// int배열을 만들어서 스트링배열num의 값 복사하기 
		int[] arr = new int[num.length];
		for(int i = 0; i< num.length; i++) {
			arr[i] = Integer.parseInt(num[i]);
		}
		System.out.println(Arrays.toString(arr));
		// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		sum = 0; 
		for(int i = 0; i< num.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum); // 55
		
		// 리스트사용 - Integer 객체 사용 
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i< num.length; i++) {
			list.add(Integer.parseInt(num[i]));
		}
		System.out.println(list);
//		[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		int objsum = 0 ; 
		for(int i = 0; i< list.size(); i++) {
			objsum += list.get(i);
		}
		System.out.println(objsum);
		
		List<Num> numList = new ArrayList<Num>();
		for(int i = 0; i< num.length; i++) {
			numList.add(new Num(Integer.parseInt(num[i])));
		}
		objsum = 0 ; 
		for(int i = 0; i< numList.size(); i++) {
			objsum += numList.get(i).x;
		}
		System.out.println(objsum);

		
	}

}

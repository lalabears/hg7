package j0604;

import java.util.Arrays;

public class C0604_08 {
	public static void main(String[] args) {
	  /*
	  1. pass by value 값에 의한 전달  
	  매개변수가 int, float 등 기본자료형일때 값에 의해 전달됨
	  호출자의 실 매개변수와 피호출자의 매개변수는 독립된 메모리를 갖는다. 
	  
	  2. call by reference 참조에 의한 전달
	  참조자료형을 전달할 경우 값이아니라 주소값을 전달한다. 
	  호출자나 피호출자나 같은 변수를 가리킨다.  
	  */
		// 기본변수 사용했을경우 
		int j = 5 ; // 메인함수의 j는5 
		System.out.println(" 1. " + j ); // 5 
		increment(j); // increment 함수를 호출 
		System.out.println(" 3. " +  j ); // 변함없이 5
		// 참조변수 사용했을 경우 . 
		int[] arr = {1,2,3,4,5};
		System.out.println(" 1. " +Arrays.toString(arr));
		System.out.println(arr); // 주소값
		plusOne(arr); // [I@15db9742 주소값.
		System.out.println(" 3. " +Arrays.toString(arr));
		int[] arr2 = {1,2,3,0,5,1,7,9,1,8};
		// 숫자 1을 0으로 만드는 함수를 만들어보세요 
		System.out.println("before : "+Arrays.toString(arr2));
		System.out.println(arr2); // arr2의 주소 
		System.out.println(arr2[0]); 
		oneToZero(arr2); 
		System.out.println("after  : "+Arrays.toString(arr2));
	}
	static void increment(int j) {
		j++; 
		System.out.println(" 2. " + j); // 지역변수 j를 1 증가
	}
	static void plusOne(int[] arr) {
		System.out.println(arr); // [I@15db9742   같은 주소. 
		for(int i = 0 ; i<arr.length;i++) {
			arr[i] = arr[i]+1; 
		}
		System.out.println(" 2. " +Arrays.toString(arr));
	}
	static void oneToZero(int[] arr) {
		System.out.println(arr);
		for(int i = 0 ; i<arr.length; i++) {
			if(arr[i]==1) arr[i]=0; 
		}
	}

}

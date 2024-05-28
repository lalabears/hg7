package j0528;

import java.util.Arrays;

public class C0528_05 {

	public static void main(String[] args) {
		// 복사. 
		// 변수의 경우 
		int a = 10; 
		int b = a ; 
		System.out.printf("a: %d, b: %d \n",a,b); // a 10 b 10
		a = 20; 
		System.out.printf("a: %d, b: %d \n",a,b); // a 20 b 10 
		// 배열의 경우 
		int[] arr1 = {1,2,3,4,5}; 
		int[] arr2 = arr1; 
		System.out.println(arr1 + " , " + arr2 );
		System.out.println("arr1: "+ Arrays.toString(arr1));
		System.out.println("arr2: "+ Arrays.toString(arr2));
	//	arr1: [1, 2, 3, 4, 5]       arr2: [1, 2, 3, 4, 5]
		arr2[2] = 10; 
		System.out.println("arr1: "+ Arrays.toString(arr1));
		System.out.println("arr2: "+ Arrays.toString(arr2));
	//	arr1: [1, 2, 10, 4, 5]	    arr2: [1, 2, 10, 4, 5]
		// 참조 자료형은 메모리에 실제 데이터 값이 아닌 저장된 위치를 저장함. 
		// 얕은복사를 할 경우, 데이터가 복사되는 것이 아니라 메모리 주소가 복사됨.
		
		// 배열을 복사 
		// 방법1. 
		int[] arr3 = new int[arr1.length]; 
		for(int i = 0 ; i <arr1.length; i++) {
			arr3[i] = arr1[i]; 
		}
		System.out.println(arr1 + " , " + arr3 );
		System.out.println("arr3: "+ Arrays.toString(arr3));
		// arr3: [1, 2, 10, 4, 5]
		arr3[0] = 100; 
		System.out.println("arr1: "+ Arrays.toString(arr1));
		System.out.println("arr3: "+ Arrays.toString(arr3));
		//arr1: [1, 2, 10, 4, 5]      arr3: [100, 2, 10, 4, 5]
		
		// 방법2. 
		int[] arr4 = Arrays.copyOf(arr1, arr1.length); 
		System.out.println(arr1 + " , " + arr4 );
		System.out.println("arr4: "+ Arrays.toString(arr4));
		// arr4: [1, 2, 10, 4, 5]
		arr4[0] = 7 ; 
		System.out.println("arr1: "+ Arrays.toString(arr1));
		System.out.println("arr4: "+ Arrays.toString(arr4));
		// arr1: [1, 2, 10, 4, 5]  	arr4: [7, 2, 10, 4, 5]
		
		// 총길이가 10개인 1-20사이의 홀수로 이루어진 배열을 하나 만들어보세요.
		// 그리고 그 배열을 복사해서 
		int[] num1 = new int[10]; // 홀수로 이루어진 배열
		//  1,3,5,7,9,11,13,15,17,19
		int n = 0; 
		for(int i = 0 ; i < 20 ; i ++) {
			if(i%2==1) {
				num1[n] = i; 
				n++;
			}
			if(n == 10) break; 
		}
		System.out.println(Arrays.toString(num1));
		// [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]
		// num2에 배열복사하기
		int[] num2 = new int[num1.length]; //  num1을 복사한 배열 
		for(int i = 0 ; i <num1.length; i++) {
			num2[i]=num1[i];
		}
		System.out.println(Arrays.toString(num2));
		
		// 방법2. 
		int[] num3 = Arrays.copyOf(num1, num1.length);
		System.out.println(Arrays.toString(num3));
		
		// 방법3. 
		int[] num4 = new int[num1.length]; 
		System.arraycopy(num1, 0, num4, 0, 5);
		//          원본배열  , 원본배열복사시작인덱스 , 
		//          복사할배열 ,복사할배열의시작인덱스 , 복사할요소의개수
		System.out.println(Arrays.toString(num4));
		
		
		// 배열의 길이 
		System.out.println(num4.length); 
		for (int i = 0 ; i < num4.length;i++) {
			System.out.println(num4[i]);
		}
		
		// for-each . 
		// 배열이나 컬렉션 등 집합 객체의 요소들을 하나씩 꺼낼때 사용함. 
		// for(요소자료형  변수명  :  집합객체 ) {       }   
		for(int i = 0 ; i < num1.length; i++) {
			System.out.println(num1[i]);
		}// [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]
		for (int yoso : num1 ) {
			System.out.println(yoso);
		}
		char[] ch = {'a','b','c','d','e','f'}; 
		// for each문을 사용해서 요소들을 줄바꿈없이 출력해보세요 
		// for(요소자료형 변수명 : 배열) {}
		for(char c : ch ) {
			System.out.print(c + " ");
		}
		System.out.println();
		String[] names = {"홍길동","유관순","김구","강감찬","이순신"}; 
		// for each문을 사용해서 
		// 제이름은 홍길동입니다. 
		for(String name: names) {
			System.out.print("제이름은 "+ name + "입니다.\n");
		}
		System.out.println();
		boolean[] power = { true, true, false, true, false, false, false}; 
		// for each문을 사용해서 출력
		// true 티비켜짐. false 티비꺼짐 

		for(boolean p : power ) {
			if(p) System.out.print("티비켜짐  ");
			else System.out.print("티비꺼짐  ");
		}
		System.out.println();
		int[] score = {80,71,40,65,90,55,77,68,100};
		// 70점 이상은 합격 이하는 불합격이라 출력해보세요 
		for (int s : score) {
			if(s>70) System.out.println("합격");
			else System.out.println("불합격");
			
		}
		
		

	}

}

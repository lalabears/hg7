package j0527;

import java.util.Arrays;

public class C0527_09 {

	public static void main(String[] args) {
		/* 
		기본 자료형(8가지) 이외 모든 자료형은 참조자료형 : 배열, 클래스 등
		
		배열: 동일한 자료형을 묶어 저장할 수 있는 참조 자료형. 
		     생성할때 크기를 지정해야함. 한번 크기를 정하면 바꿀 수 없음 
		배열 선언하기. 
		방법 1. 
					int[] a;       // int 형 자료만 저장 가능한 배열 
					double[] b;    // double 형 자료만 저장 가능한 배열 
					String[] c;    // String 형 자료만 저장 가능한 배열  
		방법 2. 
		            int  a[];
		            double  b[];
		            String  c[];
		배열을 선언하면 메모리에 변수의 공간만 생성하고 그 공간은 비운채로 둔다. 
		배열의 실제 데이터인 객체를 생성하지 않음. 
		
		 선언        생성 
		int[] n = new int[3]; 
		n은 참조변수로 실제 데이터값을 저장하는것이 아니라 메모리 주소를 저장함. 
		new : 메모리에 객체를 넣으라는 의미 
		int[3]: 정수3개를 저장할 수 있는 공간을 만들라는 의미 
		*/
		// 배열 선언 : 저장할 공간이 생성되는게 아니라 배열을 다루는데 필요한 변수가 생성
		int[] a1 ; 
		int a2[] ;
		int a = 0; 
		// 배열선언과 생성
		int[] arr1 = new int[3];  // 선언과 동시에 생성 
		int[] arr2; 
		arr2 = new int[3]; 
		int arr3[] = new int[3];
		int arr4[];
		arr4 = new int[3];
		
		boolean[] arr5 = new boolean[5]; 
		int[] arr6 = new int[2];
		double[] arr7 = new double[3];
		String[] arr8 = new String[10]; 
		
		/*
		배열에 값 넣기. 
		배열은 값을 저장할 수 있는 공간마다 방 번호가 있는데 이 방번호를 인덱스라고 한다.
		0부터 시작함
		
		참조변수명[인덱스] = 값; 
		*/
		
		int[] arr = new int[5];
		arr[0] = 10; 
		arr[1] = 3;
		arr[2] = 4;
		arr[3] = 11;
		arr[4] = 8;
		System.out.println(arr);
		
		// 배열에 있는 값 읽어오기 : 참조변수명[인덱스] 
		System.out.println(arr[0]);
		System.out.println(arr[4]);
		// 없는 인덱스를 사용하면 오류가 난다 
		// System.out.println(arr[-1]);
		// System.out.println(arr[5]);
		
		// arr9 라는 이름을 가진 논리형 배열을 하나 만들어서
		// 3칸짜리 배열을 만들어서 true, true, false 값을 넣어주세요 
		boolean[] arr9 = new boolean[3]; 
		// boolean arr9[] 
		arr9[0] = true;
		arr9[1] = true;
		arr9[2] = false;

		
		
		// 배열 객체 생성과 동시에 값 넣기 
		// 자료형[] 참조변수명 = new 자료형[]{값1,값2,값3..}
		int[] arr10 = new int[] {1,2,3,4,5}; 
		System.out.println(arr10[0]);  // 1
		System.out.println(arr10[2]);  // 3
		System.out.println(arr10[4]);  // 5
		// arr10[5] = 값넣기 불가능
		
		//   선언  /  생성+대입
		int[] arr12 ;
		arr12 = new int[]{2,4,6}; 
		
		// 자료형[] 참조변수명 = {값1, 값2, 값3....}
		int[] arr11 = {10,11,12};
		System.out.println(arr11[1]); // 11
		// 선언 / 대입 부분을 분리하는것이 불가능 함
		int[] arr13;
		// arr13 = {1,3,5};  // 오류 
		
		// 초기화 없이 사용이 불가능하다
		/*int b1 ; 
		int[] b2; 
		System.out.println(b1);
		System.out.println(b2);*/
		int b1 = 0; 
		int[] b2 = null; 
		System.out.println(b1);
		System.out.println(b2);
		// 강제 초기화 
		boolean[] c = new boolean[3];
		System.out.println(c);
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		// bool : false , int : 0 , double : 0.0 , string : null 
		
		double[] c2 = new double[3];
		double[] c3 = new double[]{1.1, 2.2, 3.3, 4.4, 5.5};
		// for문을 사용한 출력 
		// 강제초기화 double은 0.0 
		for(int i = 0; i<3;i++ )
			System.out.println(c2[i]);
		
		for(int i = 0; i<5;i++ )
			System.out.println(c3[i]);
		
		// 강제초기화 string은 null
		String[] strA = new String[4];
		for (int i = 0; i <4 ;i++)
			System.out.println(strA[i]);
		
		// 한번에 배열을 한줄로 출력하는 방법 
		System.out.println(Arrays.toString(c3));
		// control + shift + o 
		
		
		
		

	}

}

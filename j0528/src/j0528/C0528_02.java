package j0528;

import java.util.Arrays;

public class C0528_02 {

	public static void main(String[] args) {
		// [15, 45, 8, 39, 14, 43, 9, 30, 40, 35]
		// 위의 변수를 담는 배열 num 을 만들어보세요 
		
		int[] num = {15, 45, 8, 39, 14, 43, 9, 30, 40, 35}; 
		
		// 최대값 구하기. 
		int max = num[0]; // 배열의 첫번째 값으로 최대값을 우선 설정함. 
		for(int i = 0; i < num.length ; i++ ) {
			// i =0 pass , i = 1 max = 45, i = 2
			if (num[i] > max) {
				max = num[i]; 
			}
		}
		System.out.println("배열의 최대값 : "+  max );
		// 최소값을 구해보세요 
		int min = num[0]; // 배열의 첫번째 값으로 최대값을 우선 설정함.
		for(int i = 0; i < num.length ; i++ ) {
			if( min > num[i]) min = num[i]; 
		}
		System.out.println("배열의 최소값 : "+  min  ); 
		
		// 값들의 합계 , 평균
		int sum = 0 ;
		double avg = 0;
		for(int i = 0; i < num.length ; i++) {
			sum += num[i];
		}
		avg = (double)sum/ num.length;
		
		System.out.println("합계 : "+ sum + " 평균 : "+avg);
		
		// 10칸 배열을 만들어서 평균이상인것들만 배열에 넣어보세요 
		// num1 배열 
		int[] num1 = new int[10]; 
		
		int j = 0 ; 
		for (int i = 0 ; i < num.length ; i++ ) {
			if( num[i] > avg ) {
				num1[j] = num[i]; 
				j++;
			}
		}
		System.out.println(Arrays.toString(num1));
		int[] n = {1,2,3,4,5}; 
		// 잘 섞고싶다. {5,1,4,3,2} 
		System.out.println(Arrays.toString(n));
		int tmp = 0 ; 
		tmp = n[0];   // tmp = 1 
		n[0] = n[4]; // n[0] = 5 
		n[4] = tmp;   // n[4] = 1
		System.out.println(Arrays.toString(n));
		tmp = n[1];   // tmp = 2
		n[1] = n[4] ; // n[1] = 1
		n[4] = tmp; // n[4] = 2 
		System.out.println(Arrays.toString(n));
		tmp = n[2]; // tmp = 3 
		n[2] = n[3];
		n[3] = tmp ; 
		System.out.println(Arrays.toString(n));
		//          0 1 2 3 4
		int[] n1 = {1,2,3,4,5}; 
		// 0 ~ 4 사이의 랜덤한 숫자를 생성해서 셔플을 하게되면 랜덤하게 섞인다. 
		for (int i = 0; i< 100; i++  ) { // 100번 반복하는 for문 
			int k = (int)(Math.random()*5); // 0~4 사이의 랜덤한 숫자 생성
			int temp = n1[0]; 
			n1[0] = n1[k];
			n1[k] = temp; 
			System.out.println(i+"번째 반복중 , k : " + k);
			System.out.println(Arrays.toString(n1));
		}
		// 1. 1-45의 숫자가 들어있는 배열을 만들어서 
		int[] num45 = new int[45];
		for(int i = 0 ; i < num45.length; i++ ) {
			num45[i] = i+1; 
		}
		System.out.println(Arrays.toString(num45));
		// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45]
		// 2. 300번 섞어서 출력 해보세요 
		for( int i = 0 ; i < 300 ; i ++) {  // 300 번 반복 
			// 0번방 ~ 44 번방까지 존재함. 
			j = (int)(Math.random()*45);  // 0~44 까지의 랜덤 숫자생성
			// 0번째 인덱스값과 j번째 인덱스값을 서로 바꿈. 
			tmp = num45[0];
			num45[0] = num45[j];
			num45[j] = tmp; 
		}
		System.out.println(Arrays.toString(num45));
		// 3. 6칸 배열을 만들어서 섞인 배열에서 앞에 숫자 6개만 저장하기 
		int[] num6 = new int[6]; 
		for(int i = 0 ; i< num6.length ;i++ ) {
			num6[i]=num45[i];
		}
		System.out.println(Arrays.toString(num6));
		
		int a1 = 10, a2 = 20; 
		System.out.println("a1 : "+a1+", a2: "+a2);
		int a3 ;
		a3 = a1; 
		a1 = a2; 
		a2 = a3; 
		System.out.println("a1 : "+a1+", a2: "+a2);
		
		
		
		
		
		//               0   1   2   3   4   5 
		String[] arr = {"a","b","c","d","e","f"}; 
		// arr의 0번째와 arr의 3번째 바꾸기. 
		String at;
		at = arr[0];
		arr[0] = arr[3];
		arr[3] = at;
		System.out.println(Arrays.toString(arr));
		// arr의 0번째와 arr의 1번째 바꾸기
		at = arr[0];
		arr[0] = arr[1];
		arr[1] = at; 
		System.out.println(Arrays.toString(arr));
		// arr의 0 번째와 arr의 4번째 바꾸기
		at = arr[0];
		arr[0] = arr[4];
		arr[4] =at; 
		System.out.println(Arrays.toString(arr));
		// arr의 0번째와 arr의 5번째 바꾸기
		at = arr[0];
		arr[0] = arr[5]; 
		arr[5] = at; 
		System.out.println(Arrays.toString(arr));
		
		
		
		
		

	}

}

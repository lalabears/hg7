package j0528;

import java.util.Arrays;
import java.util.Scanner;

public class C0528_03 {

	public static void main(String[] args) {
		// 1-45 사이의 랜덤한 숫자 6개를 저장한 배열을 만들어보세요 
		int[] r45 = new int[6];
		for(int i = 0; i<r45.length;i++) {
			r45[i] = (int)(Math.random()*45)+1; 
		}
		System.out.println(Arrays.toString(r45));
		
		// [39, 39, 32, 14, 17, 45]
		
		// 1-45 사이의 서로다른 랜덤한 숫자 6개가 필요할 경우 
		
		// 1-45 를 저장한 배열을 만들어서 
		// 충분히 섞어서
		// 앞에서 6개만 가져오면 - 절대적으로 서로 다른 랜덤한 숫자 6개 만들어진다.
		
		int[] arr1 = {19, 35, 11, 38, 16, 18}; 
		int[] arr2 = {20, 45, 19, 16, 5, 11}; 
		// 1. 두배열에 서로 같은 숫자가 몇개 있는지 출력. : 3 
		// arr1[0] - arr2[0]~arr2[5]    arr1[1] - arr2[0]~arr2[5]
		// arr1[2] - arr2[0]~arr2[5]    arr1[3] - arr2[0]~arr2[5]
		// arr1[4] - arr2[0]~arr2[5]    arr1[5] - arr2[0]~arr2[5]
		
		int count = 0 ; // 같은 값을 세는 변수 
		for (int i = 0 ;i < arr1.length ; i ++) {
			for (int j = 0; j<arr2.length;j++) {
				if (arr1[i] == arr2[j]) {
					count++;
					// System.out.println(i + " : " +arr1[i]);
				}
			}
		}
		System.out.println(count);
		// 2. 두배열에 같은 값인 숫자는 무엇인지 출력 : 19,16,11
		for (int i = 0 ;i < arr1.length ; i ++) {
			for (int j = 0; j<arr2.length;j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(arr1[i]+"  ");
				}
			}
		}
		System.out.println();
		int[] arr3 = new int[6]; 
		int k = 0;
		for(int i = 0 ; i< arr1.length;i++ ) {
			for(int j = 0 ; j < arr2.length ; j ++) {
				if(arr1[i] == arr2[j]) {
					arr3[k] = arr1[i];
					k++;
				}
			}
		}
		System.out.println( k +" " + Arrays.toString(arr3));
		// 1 - 20 사이의 랜덤한 숫자로 채워진 5칸 배열을 만들어보세요 (겹치는 숫자없이)
		int[] num5 = new int[5];
		// 이렇게하면안되요. 
		for (int i = 0 ; i < num5.length;i++) {
			num5[i] = (int)(Math.random()*20)+1; 
		}
		System.out.println(Arrays.toString(num5));
		// 같은 숫자가 여러번 들어갈 확률이 높음. [6, 6, 13, 6, 17]
		
		int[] num20 = new int[20];
		for(int i = 0 ; i < num20.length ; i++ ) {
			num20[i] = i+1 ;
		}
		// 1~20까지의 숫자로 채워진 배열 [1,2,3...,20]
		System.out.println(Arrays.toString(num20));
		for(int i = 0; i <100 ; i++) {
			// 0~19의 숫자를 가지는 랜덤한 변수 생성 
			int n = (int)(Math.random()*20);
			int temp = num20[0];
			num20[0] = num20[n];
			num20[n] = temp; 
		}
		System.out.println(Arrays.toString(num20));
		for(int i = 0 ; i <num5.length ; i++) {
			num5[i] = num20[i];
		}
		System.out.println(Arrays.toString(num5));
		
		
		
		
		
		
		// 6칸 배열을 만들어서 입력한 숫자들로 채워진 6칸의 배열을 출력해보세요 
		Scanner scan = new Scanner(System.in);
		int[] arr4 = new int[6];
		for(int i = 0; i<arr4.length;i++) {
			System.out.println((i+1)+"번째 숫자를 입력: ");
			arr4[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(arr4));
			
		
			
			
			
		
		

	}

}

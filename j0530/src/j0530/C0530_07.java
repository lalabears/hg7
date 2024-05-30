package j0530;

import java.util.Arrays;

public class C0530_07 {

	public static void main(String[] args) {
		// 2차원 배열 
		int[][] arr1 = new int[3][5];
		
		// 각 행마다 다른 열을 개수를 가지고 싶을때: 가변 배열
		int[][] arr2 = new int[2][]; // 열크기 생략가능
		arr2[0] = new int[4]; 
		arr2[1] = new int[2]; 
		// 2차원 배열에 접근. 
		System.out.println(arr1); // arr1의 주소값.
		System.out.println(arr1[0]); // arr1[0]의 주소값
		System.out.println(arr1[0][0]); // 실제 값에 접근 
		
		int[][] arr3 = {{16,10,6,17,21},{23,5,12,18,3},{19,13,25,1,9}};
		// 배열 속 숫자의 최대값과 최소값을 구해보세요 
		int min=arr3[0][0], max = arr3[0][0]; 
		// min 16, max 16 ;
		for(int i = 0 ; i <arr3.length ;  i ++ ) {
			for (int j = 0 ; j <arr3[i].length ; j++ ) {
				if( min  > arr3[i][j] ) {
					min = arr3[i][j];
				}
				if( max < arr3[i][j] ) {
					max = arr3[i][j];
				}
			}// for j 
		}// for i 
		System.out.println("최대값: " +max);
		System.out.println("최소값: " +min);
		int[][] arr4 = { {95,86} , {83,92,96},{78,83,93,87,88}};
		// arr4의 총 합계와평균을 구해보세요 
		int sum=0;
		int s1=0, s2=0, s3=0; 
		// s1 = 95+86   s2 = 83+..+96   s3 = 78+...+88
		double avg=0;
		int n = 0 ; // 배열요소가 몇개인지 카운트
		for(int i = 0 ; i <arr4.length ;  i ++ ) {
			for (int j = 0 ; j <arr4[i].length ; j++ ) {
				sum += arr4[i][j];
				if(i == 0 ) s1 += arr4[i][j];
				if(i == 1 ) s2 += arr4[i][j];
				if(i == 2 ) s3 += arr4[i][j];
				n++;
			}// for j 
		}// for i 
		avg = (double)sum/ n; 
		System.out.println("합계: " + sum );
		System.out.println("평균: " + avg );
		System.out.println(s1+","+s2+","+s3);
		// 4 * 4 배열을 만드는데. 
		// 1-16까지 랜덤한 숫자가 (겹치는 숫자 없이) 
		// 들어가는 배열을 만들어보세요 
		int[] n16 = new int[16]; 
		for(int i = 0 ; i < n16.length ; i++ ) {
			n16[i] = i+1; 
		}
		// 랜덤하게 섞는다 
		int temp, random;
		for(int i = 0 ; i < 500 ; i++ ) {
			random = (int)(Math.random()*16);
			temp = n16[0];
			n16[0] = n16[random];
			n16[random]= temp;
		}
		System.out.println(Arrays.toString(n16));
		// 2차원 배열속에 넣기 
		int[][] n44 = new int[4][4]; 
		for(int i = 0 ; i < n44.length ; i++) {
			for(int j = 0 ; j < n44[i].length; j++ ) {
				n44[i][j] =  n16[ i * n44[i].length+j ];
			}
		}
		System.out.println(Arrays.deepToString(n44));
		// ++ 6개의 랜덤한 위치에 숫자를 0으로 바꿔보세요 
		int count = 1 ; 
		while(count<7) {
			int n1 = (int)(Math.random()*4); // 0~3 4*4 배열이기때문에
			int n2 = (int)(Math.random()*4); // 0~3 4*4 배열이기때문에
			
			if(n44[n1][n2]!= 0) {
				n44[n1][n2] = 0; 
				count++;
			}
			
		}
		for(int i = 0 ; i < n44.length ; i++) {
			for(int j = 0 ; j < n44[i].length; j++ ) {
				System.out.print(n44[i][j]+" ");
			}
			System.out.println();
		}
		
		
		//System.out.println(Arrays.deepToString(arr4));

	}

}

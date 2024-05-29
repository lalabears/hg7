package j0529;

import java.util.Arrays;

public class C0529_06 {

	public static void main(String[] args) {
		// 2 차원 배열 
		/*
		선언
		1. 타입[][] 배열이름; 
		2. 타입  배열이름[][];
		3. 타입[]  배열이름[][]; 
		생성
		new int[][]
		*/
		// 배열을 만들고 
		int[][] arr = new int[2][3];
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		// 배열을 초기화하고 
		for(int i = 0 ; i < arr.length ; i ++) {
			for(int j = 0 ; j < arr[i].length ; j ++ ) {
				arr[i][j] = 10;
			}// for - j 
		} // for - i
		// 배열을 출력 
		for(int i = 0 ; i < arr.length ; i ++) {
			for(int j = 0 ; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		/*
		 타입[][] 배열이름 = { 
		  {배열요소[0][0], 배열요소[0][1],....} ,
		  {배열요소[1][0], 배열요소[1][1],....} ,
		  ....
		  }
		*/
		int[][] arr1 = {{10,20,30},	{40,50,60}};
		int[][] arr2 = new int[][] {{1,2,3},{4,5,6}}; 
		
		// dynamic array : 열의 길이라 서로 다를 수 있다. 
		int[][] arr3 = new int[3][];
		arr3[0] = new int[2];
		arr3[1] = new int[4];
		arr3[2] = new int[1]; 
		for(int i = 0 ; i < arr3.length ; i ++) {
			for(int j = 0 ; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		int[][] arr4 = {{10,20},{10,20,30,40},{10}}; 
		for(int i = 0 ; i < arr4.length ; i ++) {
			for(int j = 0 ; j < arr4[i].length; j++) {
				System.out.print(arr4[i][j]+" ");
			}
			System.out.println();
		}
		// 4 * 3 크기의 배열을 만들어서. 
		// 0- 11 까지의 숫자로 초기화해서 출력해보세요 
		
		int[][] arr5 = new int[4][3]; 

		for(int i = 0 ; i <arr5.length; i++) {
			for(int j = 0 ; j < arr5[i].length; j++ ) {
				arr5[i][j] = i * arr5[i].length + (j);
			}
		}
		for(int i = 0 ; i <arr5.length; i++) {
			for(int j = 0 ; j < arr5[i].length; j++ ) {
				System.out.print(arr5[i][j]+"  ");
			}
			System.out.println();
		}
		int[] n1 = {1,2,3,4,5,6,7,8,9}; 
		int[][] n2 = new int[3][3]; 
		for(int i = 0 ; i <n2.length; i++) {
			for(int j = 0 ; j < n2[i].length; j++ ) {
				n2[i][j] = n1[ i * n2[i].length + j     ];
			}
		}
		for(int i = 0 ; i <n2.length; i++) {
			for(int j = 0 ; j < n2[i].length; j++ ) {
				System.out.print(n2[i][j]+"  ");
			}
			System.out.println();
		}
		// char     97 		
		// 소문자     a ~ o 까지 채운 1차원 배열을 만들어보세요 (15개)
		char[] ch = new char[15]; 
		for(int i = 0 ; i<ch.length;i++) { 
			ch[i] = (char)(97+i); 
		}
		/*
		 * for(int i = 97; i<(ch.length+97);i++) { ch[i-97] = (char)i; }
		 */
		// 3*5 2차원 배열을 만들어서 그 안에 a-o까지로 채워보세요
		char[][] ch2 = new char[3][5]; 
		for(int i = 0 ; i < ch2.length ; i++ ) {
			for(int j = 0 ; j < ch2[i].length; j++) {
				ch2[i][j] = ch[ i*ch2[i].length +j   ];
			}
		}
		for(int i = 0 ; i <ch2.length; i++) {
			for(int j = 0 ; j < ch2[i].length; j++ ) {
				System.out.print(ch2[i][j]+"  ");
			}
			System.out.println();
		}
		
		// 1 - 25 로   채운 1차원 배열을 만들고
		int[] n25 = new int[25];
		for (int i = 0; i<n25.length;i++) {
			n25[i] = i+1;
		}
		// 1차원 배열 섞기 
		int temp=0, random=0; 
		for( int i = 0 ; i < 200 ; i ++) {
			random = (int)(Math.random()*25); //0~24 포함하는 랜덤한 숫자
			temp = n25[0];
			n25[0] = n25[random];
			n25[random]=temp;
		}
		// 2차원 5*5 배열 로 만들기  
		int[][] n55 = new int[5][5];
		for(int i = 0 ; i < n55.length ; i++ ) {
			for(int j = 0 ; j<n55[i].length;j++) {
				n55[i][j] = n25[ i*n55[i].length+j    ];
			}
		}
		
		// 출력 : 
		System.out.print("    ");
		for(int i = 0 ; i < n55.length ; i++ ) {
			System.out.printf("%2d ",i);
		}
		System.out.println("\n-------------------------------");
		for(int i = 0 ; i < n55.length ; i++ ) {
			System.out.print(i + "|  ");
			for(int j = 0 ; j<n55[i].length;j++) {
				
				System.out.printf("%2d ",n55[i][j]);
			}
			System.out.println();
		}
		System.out.println("-------------------------------");
		
		
		
		
		
		
	}

}

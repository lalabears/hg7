package j0527;

import java.util.Arrays;

public class C0527_11 {

	public static void main(String[] args) {
		
		// 배열 선언하고 생성하고 값 넣기. 
		int[] a = {1,2,3} ;
		int a1[] = {1,2,3} ;
		int[] b = new int[] {4,5,6}; 
		int[] b1; 
		b1 = new int[] {4,5,6}; 
		int[] c = new int[3]; 
		System.out.println(c); // 주소값 출력 
		System.out.println(c[0]); // 기본 값인 0 출력 
		System.out.println(b[0]); // 4 
		c[0] = 7; 
		c[1] = 8; 
		c[2] = 9; 
		// 인덱스는 0부터 시작한다 !! 
		int[] d = new int[3]; 
		// 배열의 길이 : 배열이름.length
		for ( int i = 0 ; i < d.length ; i++) {
			d[i]= (int)(Math.random()*6)+1;
		}
		// 배열을 출력하려면 기본적으로for문을 사용
		for(int i = 0; i<d.length;i++) {
			System.out.println(d[i]);
		}
		System.out.println(Arrays.toString(d));
		
		
		
		
	}

}

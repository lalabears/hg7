package j0529;

import java.util.Arrays;
import java.util.Scanner;

public class C0529_07_빙고 {

	public static void main(String[] args) {
		// 빙고게임 만들기 . 
		Scanner scan = new Scanner(System.in); 
		int[][] box = new int[5][5]; // 빙고 숫자가 되어줄 2차원 배열 
		int[] num = new int[25]; // 1-25 사이의 랜덤한 숫자 배열 
		String[][] box1 = new String[5][5]; // 선택하면 X표시로 보여질 배열 
		int random = 0 , temp = 0; 
		
		// 1. num배열에 1-25까지 채운 후 랜덤하게 섞어주기. 
		// 1-1 1-25까지 일차원 배열에 채워준다. 
		for(int i = 0; i < num.length; i++ ) {
			num[i] = i + 1; 
		}
		// 1-2 1차원 배열을 랜덤하게 섞어준다. 
		for(int i = 0 ; i < 200 ; i++ ) {
			random = (int)(Math.random()*25); // 0-24 사이의 랜덤숫자(인덱스)
			// num[0] 의 값과 num[random]의 값을 서로 바꿔줌 
			temp = num[0];
			num[0] = num[random];
			num[random] = temp; 
		}
		// 2. 5*5 배열에 num배열의 값을 채운다. 
		for(int i = 0 ; i < box1.length; i++) {
			for(int j = 0 ; j<box1[i].length;j++) {
				box[i][j] = num[ i*box1[i].length + j ]; // int 배열 
				box1[i][j] = ""+ num[ i*box1[i].length + j ]; // String배열
			}
		}
		
		while(true) {
			// 빙고판 출력 
			System.out.print("    ");
			for(int i = 0 ; i < box1.length ; i++ ) {
				System.out.printf("%3d ", i);
			}
			System.out.println();
			System.out.println("--------------------------------");
			for(int i = 0 ; i < box1.length ; i++ ) {
				System.out.print(i + "|  ");
				for(int j = 0 ; j<box1[i].length; j++) {
					System.out.printf("%3s ",box1[i][j]);
				}
				System.out.println();
				
			} 
			System.out.println("--------------------------------");
			System.out.println("좌표를 입력해주세요 (종료 -1) ");
			String input = scan.next(); 
			if(input.equals("-1")) break; // -1 입력시 while true 종료 
			int n1 = input.charAt(0)-'0'; // 문자를 숫자로 바꾸려면 -'0'
			int n2 = input.charAt(1)-'0';
			box1[n1][n2] = "X"; 
			
			
			
		} //while - true 
		
	}// main
}// class

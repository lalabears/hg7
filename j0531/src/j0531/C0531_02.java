package j0531;

import java.util.Arrays;
import java.util.Scanner;

public class C0531_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// n 명의 학생을 
		String[] students = {"강백호", "서태웅", "채치수", "송태섭", "정대만", "권준호", "이달재", "신오일", "정병욱", "이호식", "이재훈", "오중식"};
		//                       0      1       2        3      4           5     6
		//                       00     01     10      
		// 1조 
		String[][] arr1 = new String[3][2];
		// 2 조로 나누어서 
		String[][] arr2 = new String[3][2];
		
		for(int i = 0 ; i < arr1.length; i ++ ) {
			for(int j = 0 ; j <arr1[i].length ; j++ ) {
				arr1[i][j] = students[   i * arr1[i].length  + j     ]; 
				arr2[i][j] = students[  i*arr1[i].length + j + students.length/2 ];
				
			}
		}
		System.out.println("== 1조 ==");
		for(int i = 0 ; i < arr1.length; i ++ ) {
			for(int j = 0 ; j <arr1[i].length ; j++ ) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("== 2조 ==");
		for(int i = 0 ; i < arr1.length; i ++ ) {
			for(int j = 0 ; j <arr1[i].length ; j++ ) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("검색할 학생의 이름을 입력해주세요 : ");
		String name = scan.next();
		int group = 0; 
		int line = 0; 
		String dir = "";
		
		for(int i = 0 ; i < arr1.length; i ++ ) {
			for(int j = 0 ; j <arr1[i].length ; j++ ) {
				if(arr1[i][j].equals(name)) {
					group = 1; 
					line = i + 1;
					dir = (j==0) ? "왼" :"오른";
				}else if(arr2[i][j].equals(name)) {
					group = 2; 
					line = i + 1;
				/*	if(j==0) dir = "왼";
					else  dir = "오른";*/
					switch(j) {
					case 0: dir = "왼"; break;
					case 1: dir = "오른"; break;  
					}
					
				}
			}
		}
		if(group == 0 ) System.out.println("존재하지 않는 학생입니다");
		else System.out.printf("%s은 %d조 %d번째줄 %s쪽에 있습니다\n", name, group, line, dir);
				
		
		
		
		
		
		
		
		
		
		/* 출력 : 
		== 1조 ==
		강백호 서태웅 
		채치수 송태섭 
		정대만 권준호 
		== 2조 ==
		이달재 신오일 
		정병욱 이호식 
		이재훈 오중식 */
		// 학생이름을 입력받아서   [송태섭은 1조 두번째줄 오른쪽에 있습니다] 를 출력
		//                    [이재훈은 2조 세번째줄 왼쪽에 있습니다.]
		

	}

}

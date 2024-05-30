package j0530;
import java.util.Arrays;
import java.util.Scanner;
public class C0530_08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 지뢰찾기
		// 1. 1이  5개 들어있는 5 * 5 배열을 만든다.
		// 1-1. 1이 5개들어잇는 25칸 1차원 배열을 만든다. (1과 0으로 이루어진배열)
		// 1-2. 25칸 배열을 잘 섞는다. 
		// 1-3. 5 * 5 배열에 잘 섞은 25칸 배열 값을 넣는다. 
		int[][] box = new int[5][5];       //  1과 0로 이루어진 5*5 배열 
		int[] num = new int[25];           // 25칸의 일차원배열 
		String[][] box1 = new String[5][5]; // 빈공백으로 이루어진 5*5스트링배열
		int count=0; // 나중에 숫자 카운트를 위한 변수 
		int rand, temp; 
		for(int i = 0 ; i < 5 ; i ++) {
			num[i] = 1;
		}
		// 랜덤하게 섞는다. 
		for(int i = 0 ; i < 500 ; i ++ ) {
			rand = (int)(Math.random()*25);
			temp = num[0];
			num[0] = num[rand];
			num[rand] =temp;
		}
		// box < num을 넣고 box1 < 빈공백을 넣으세요 
		for(int i = 0 ; i < box.length; i++) {
			for(int j = 0 ; j < box[i].length; j++) {
				box[i][j] = num[ i*box[i].length + j ];
				box1[i][j] = "";
			}
		}
		
		while(true) {
			// 좌표출력
			System.out.println("[지뢰찾기게임]");
			System.out.print("    ");
			for(int i = 0 ; i < box1.length; i++) {
				System.out.printf("%3d ", i);
			}
			System.out.println();// 줄바꿈
			System.out.println("-----------------------------------");
			for(int i = 0 ; i< box1.length; i ++) {
				System.out.print(i+"|  ");
				for(int j = 0 ; j < box1[i].length; j++) {
					System.out.printf("%3s ", box1[i][j]);
				}
				System.out.println();// 줄바꿈
			}
			System.out.println("-----------------------------------");
			if(count>0) {
				System.out.println("지뢰를 밟으셨습니다........");
				break;
			}
			System.out.println("좌표를 입력해주세요 (종료-1) ");
			String input = scan.next();// 
			if(input.equals("-1" )) break; 
			int n1 = input.charAt(0)-'0';
			int n2 = input.charAt(1)-'0'; 
			if(box[n1][n2]==1) {
				box1[n1][n2] = "꽝";
				count++; 
			}else {
				box1[n1][n2] = "X";
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}

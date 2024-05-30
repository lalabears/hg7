package j0530;
import java.util.Scanner;
public class C0530_09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 입력한 좌표를 O 로 바꾸는 프로그램 . 
		String[][] box1 = new String[5][5]; 
		for(int i = 0 ; i < box1.length; i++) {
			for(int j = 0 ; j < box1[i].length; j++) {
				box1[i][j] = "";
			}
		}
		while(true) {
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
			System.out.println("좌표를입력해주세요");
//			String n1 = scan.next();
//			String n2 = scan.next();
//			int n3 = Integer.parseInt(n1);
//			int n4 = Integer.parseInt(n2);
//			
//			box1[n3][n4] = "O"; 
			int n1 = scan.nextInt();  // 1 '1' "1"
			int n2 = scan.nextInt(); 
			if(n1<0 ||n1>4 || n2<0 ||n2>4) {
				System.out.println("좌표를 잘못입력하셨습니다");
				continue; 
			}
			box1[n1][n2] = "O"; 
			
		}

	}

}

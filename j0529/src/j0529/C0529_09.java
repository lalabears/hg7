package j0529;
import java.util.Scanner;
public class C0529_09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 열 크기와 행 크기를 입력받아 . 배열에  a-z까지 채워 넣으세요
        // 	4, 5 를 입력 받으면
		//  출력 :
//			a b c d e
//			f g h i j
//			k l m n o
//			p q r s t
		// 문자가 어려우면 숫자로 해보세요 
		//  1  2  3  4  5
		//  6  7  8  9  10
		//  11 12 13 14 15
		//  16 17 18 19 20
		System.out.println("행과 열의 크기를 입력 해주세요 ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		System.out.println(n1);
		System.out.println(n2);
		
		int[][]  num = new int[n1][n2]; 
		char[][] ch = new char[n1][n2];
		int cnt = 1 ;
		// 숫자넣기 
		for(int i = 0 ; i < num.length; i ++ ) {
			for(int j = 0 ; j <num[i].length ; j++ ) {
				num[i][j]=cnt;
				ch[i][j]=(char)(96+cnt); // a 가 97부터 시작하기때문에 cnt=1부터시작 
				cnt++;
			}
		}
		// 출력 
		for(int i = 0 ; i < num.length; i ++ ) {
			for(int j = 0 ; j <num[i].length ; j++ ) {
				System.out.print(ch[i][j] +" ");
			}
			System.out.println();
		}
		
		
		
	}

}

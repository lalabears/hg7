package j0529;
import java.util.Scanner;
public class C0529_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 10개중 2개의 보물 찾기 프로그램을 구성해보세요. 
		// 이번에는 당첨 대신에 100억, 10억이라고 표현해서 만들어보세요 
		int[] box = {0,0,0,0,0,0,0,0,1,2};
		String[] arr = new String[10]; 
		int num = 0 , count = 0 , temp=0, random=0; 
		// box를 랜덤하게 섞은 배열로 만들기
		for(int i = 0 ; i<100;i++) {
			random = (int)(Math.random()*10); // 0-9 사이 랜덤숫자
			temp = box[0];
			box[0] = box[random];
			box[random]= temp;
		}
		// arr 배열을 ? 채우기
		for(int i = 0 ; i < arr.length ; i ++ ) {
			arr[i] = "?";
		}
		// 무한반복문을 사용해서 게임만들기 
		while(true) {
			System.out.println("[보물찾기 프로그램]");
			for(int i = 0; i<arr.length; i++) {
				System.out.print( i + "\t");
			}
			System.out.println(); // 줄바꿈. 
			System.out.println("----------------------------------------------------------------------------");
			for(int i = 0 ; i <arr.length ; i++) {
				System.out.print( arr[i] + "\t");
			}
			System.out.println();
			if( count == 2 ) break; // 보물을 다 찾았을때 무한반복문 종료
			System.out.println("번호를 입력해주세요 : ");
			num = scan.nextInt();  // 인덱스를 입력받음
			if(box[num]==2) {
				arr[num] = "100억";
				count++;
			}else if (box[num]==1) {
				arr[num] = "10억";
				count++;
			}else {
				arr[num] = "꽝"; 
			}
		}//while-true
	}//main
}//class

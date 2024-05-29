package j0529;
import java.util.Arrays;
import java.util.Scanner;
public class C0529_04 {
	public static void main(String[] args) {
		// 보물찾기
		Scanner scan = new Scanner(System.in);
		int[] box = {0,0,0,0,0,0,0,1,1,1};
		String[] arr = new String[10]; 
		int num = 0 , count = 0 , temp=0, random=0; 
		// 섞기 
		for (int i = 0 ; i < 100 ; i++) {
			random = (int)(Math.random()*10); // 0-9까지 랜덤 숫자
			temp = box[0];
			box[0] = box[random];
			box[random]= temp;
		}
		for(int i = 0; i < arr.length ; i ++) {
			arr[i] = "?";
		}
		
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
			// 보물을 총 3개 (1이 총3개) 
			if (count == 3) break ; // 보물을 다 찾으면 종료 
			System.out.println("번호를 입력해주세요 : ");
			num = scan.nextInt();  // 인덱스를 입력받음
			if(box[num] == 1) {    // box 배열의 그 인덱스 위치에 1이 있다면
				arr[num] = "당첨";  // arr 배열의 num의 위치를 ?에서 당첨으로 바꿔줌
				count++; 
			}else {
				arr[num] = "꽝";
			}
			
			
			
			
			
		}// while-true
		
		
	
	}

}

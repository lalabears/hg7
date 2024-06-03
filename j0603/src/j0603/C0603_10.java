package j0603;
import java.util.Scanner;
public class C0603_10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 숫자 두개(두개를 담는배열 int)를 입력받아 더 작은 값을 반환해주는 함수를 
		// 만들어서 호출하세요 10 3  > 3을 반환해주는 함수 
		
		// 계산을 위한 객체 생성
		Calculate cal = new Calculate(); 
		int[] n = new int[3]; 
		for( int i = 0 ; i < n.length ; i ++) {
			System.out.println((i+1) + "번째숫자입력:");
			n[i] = scan.nextInt();
		}
		// n[0] , n[1] , n[2]
		//                    10 ,  3 
		int result = cal.min(n[0], n[1]);
		System.out.printf("%d와 %d 중 더 작은 수 : %d \n",
				n[0], n[1], result);
		
		// 큰값 3항식 사용 
		int rmax = cal.max(n[0], n[1]);
		System.out.printf("%d와 %d 중 더 큰 수 : %d \n",
				n[0], n[1], rmax);
			
		
		// 숫자 세개를 입력받아 가장 작은 수를 반환해주는 함수 만들기 
		int rmx3 =  cal.max3(n[0],n[1],n[2]);
		int rmn3 =  cal.min3(n[0],n[1],n[2]);
		
		System.out.printf("%d, %d, %d 중 가장 큰 수 : %d \n",
				n[0], n[1], n[2], rmx3);
		System.out.printf("%d, %d, %d 중 가장 작은 수 : %d \n",
				n[0], n[1], n[2], rmn3);
		
		Score sc = new Score();
		// 숫자 세개를 입력받아 평균이 60점이상이면 합격 
		System.out.println(sc.pass(n[0],n[1],n[2]));
		System.out.println(sc.avg(n[0],n[1],n[2]));
		System.out.println(sc.sum(n[0],n[1],n[2]));
		
		
		sc.call(100,80,70);
		

	}

}

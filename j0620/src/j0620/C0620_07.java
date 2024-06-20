package j0620;
import java.util.Scanner;
public class C0620_07 {
	public static void main(String[] args) {
		
		/*String str = "abc";
		String str1 = "abc";
		String str2 = new String("abc");
		String str3 = new String("abc");*/
		
		Scanner scan = new Scanner(System.in);
		// 1-100 사이의 랜덤 숫자를 발생시켜서 
		// 숫자맞추기 프로그램을 만들어주세요
		// 입력한값보다 랜덤숫자가 크면 크다고 힌트를 주고
		// 작으면 작다고 힌트를 주면서 .. 
		// 만약 숫자가 아닌 다른값이 입력이되면 "유효하지 않은값입니다"이라고 출력
		// 정답을 맞출때까지 무한루프 
		int randN = (int)(Math.random()*100)+1; 
		int n=0 ;
		while(true) {
			System.out.println("숫자입력 ");
			try { //    스캐너 객체를 생성 
				 n = new Scanner(System.in).nextInt();
			}catch(Exception e) {
				System.out.println("오류있음");
				e.printStackTrace();
			}
			if(n==randN) {
				System.out.println("정답 ");
				break;
			} else if( n > randN) {
				System.out.println("작은값을 입력해주세요");
			} else {
				System.out.println("큰값을 입력해주세요 ");
			}
		}

	}

}

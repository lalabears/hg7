package j0522;
import java.util.Scanner;
public class C0522_08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 숫자를 입력받아 
		// 1이면 1입니다. 6이면 6입니다. 9 이면 9입니다 그외 잘못입력하셧습니다 출력
		System.out.println("숫자를 입력해주세요 ");
		int num = scan.nextInt();
		if( num == 1 ) {
			System.out.println("1입니다.");
		} else if (num == 6) {
			System.out.println("6입니다.");
		} else if(num == 9) {
			System.out.println("9입니다");
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
		// 2. 점수를 입력받아 
		// 90점이상 A,  80점이상 90미만 B, 70점이상 80미만 C 그외 F
		// 라고 출력해보세요 
		System.out.println("점수를 입력해주세요 ");
		int score = scan.nextInt(); 
		
		if (score >= 90) {
			System.out.println("A");
		} else if( score >= 80 ) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
		// 3. 성별을 입력받아 m, M 이면 남성입니다. f, F 면 여성입니다
		// 그외에는 잘못입력하셨습니다 를 출력해보세요 
		// String이라면 equals를 사용해서 비교해야함.
		System.out.println("성별을 입력해주세요(m/M,f/F) ");
		String str = scan.next(); // "m" "F" 
		if ( str.equals("m") || str.equals("M")) {
			System.out.println("남성");
		} else if ( str.equals("f") || str.equals("F"))	{
			System.out.println("여성");
		}else{
			System.out.println("잘못입력하셨습니다");
		}
		// char로 바꿔서 비교하거나
		char ch1 = str.charAt(0); // 'm' 'F'
		if (ch1 == 'M' || ch1 =='m') {
			System.out.println("남성");
		}else if(ch1 == 'f' || ch1 == 'F') {
			System.out.println("여성");
		}else {
			System.out.println("잘못입력하셨습니다");
		}
				
	}

}

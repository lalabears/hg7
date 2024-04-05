package j0405;

import java.util.Scanner;

public class C0405_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 점수를 입력받아서 -> 숫자, scanner
		int score;
		System.out.print("점수를 입력해주세요 : ");
		score = scan.nextInt();
		
		// 90점 이상이면 A
		// 90점 미만 80점이상 B
		// 80점 미만 70점 이상 C
		// 나머지는 F를 출력해보세요 
		if(score >=90 ) {
			System.out.println("A");
		} else if (score >=80 ) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
		
		// 중첩 if문을 사용해서 
		// 98점 이상은 A+
		// 90점이상 94점 미만 A-
		
		// 88점 이상은 B+
		// 80점이상 84점 미만 B-
		
		// 78점 이상은 C+
		// 70점이상 74점 미만 C-
		
		if(score >=90 ) {
			// 90점 이상 !!
			// A+ score>=98
			// A  94 <=score< 98
			// A- 94 > score 
			if (score >= 98) {
				System.out.println("A+");
			} else if (score < 94) {
				System.out.println("A-");
			}else {
				System.out.println("A");
			}	
			
		} else if (score >=80 ) {
			// 이조건에 만족하려면 점수가 : 80<= 점수 <90
			if (score >= 88) {
				System.out.println("B+");
			} else if (score < 84) {
				System.out.println("B-");
			}else {
				System.out.println("B");
			}	
			
		} else if (score >= 70) {
			// 70점 이상 !!  70<= 점수 <80
			if (score >= 78) {
				System.out.println("C+");
	
			} else if (score < 74) {
				System.out.println("C-");
			}else {
				System.out.println("C");
			}	
			
			
		} else {
			System.out.println("F");
		}

	}

}

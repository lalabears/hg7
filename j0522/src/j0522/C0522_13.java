package j0522;

import java.util.Scanner;

public class C0522_13 {

	public static void main(String[] args) {
		// 점수를 입력받아 
		/* 100-97 : A+   96-93 : A  92-90 : A-
           89-87 : B+    86-83 : B  82-80 : B-
           79-77 : C+    76-73 : C  72-70 : C-
           나머지 F
        */
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력해주세요 ");
		int score = scan.nextInt();
		if(score >= 90) { // print() : 줄바꿈이 없음 
			/*
			// A
			System.out.print("A");
			if (score >=97 ) { // 100 99 98 97 
				System.out.println("+");
			}else if( score <= 92) { //90 91 92
				System.out.println("-");
			}
			*/
			if (score >= 97) {
				System.out.println("A+");
			}else if (score > 92) {
				System.out.println("A");
			}else {
				System.out.println("A-");
			}
			
		} else if (score >= 80) {
			// B
			System.out.print("B");
			if (score >=87 ) {
				System.out.println("+");
			}else if( score <= 82) {
				System.out.println("-");
			}
			
		} else if (score >= 70) {
			// C
			System.out.print("C");
			if (score >=77 ) {
				System.out.println("+");
			}else if( score <= 72) {
				System.out.println("-");
			}
		} else {
			// F
			System.out.print("F");
			
		}
		
		
	}

}

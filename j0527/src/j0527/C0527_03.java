package j0527;

public class C0527_03 {

	public static void main(String[] args) {
		// 중첩 반복문
		for (int i = 0 ; i <3 ; i++) {
			System.out.println("i: "+ i);
			for (int j = 0; j <3 ; j++) {
				System.out.print("j: "+j+"\t");
			}
			System.out.println("\n---------------------");
		}
		
		// 구구단 출력 
		for (int i = 2; i <= 9 ; i++) {
			for(int j =1; j <= 9;j++) {
				System.out.printf("%d*%d=%d\t",i,j,i*j);
			}
			System.out.println();
		}
		
		// while을 사용해서 구구단을 출력해보세요 
		int dan=0, gob=0; 
		dan = 2; // 단 초기화
		while ( dan <=9 ) {
			gob = 1; 
			while( gob <=9 ) {
				System.out.printf("%d*%d=%d\t",dan,gob,(dan*gob));
				gob++; // 곱하는 부분1씩증가 
			}
			System.out.println();
			dan++; 
		}
		/* 제어문 break, continue 
		
		break : if문을 제외한 가장 가까운 중괄호{}를 탈출하는 제어코드
				(ex. 스위치문에서 접해봄)
		continue : 반복제어문의 닫는중괄호 } 의 역할을 함. 
		       컨티뉴를 만나면 남은 코드가 있어도
		       바로 증감식으로 이동해 조건을 검사함 
		*/
		System.out.println(" ** BREAK ** ");
		for (int i = 0 ; i < 5 ; i++) {
			if (i == 3) break;
			System.out.println(i);
		}
		System.out.println(" ** CONTINUE ** ");
		for (int i = 0 ; i < 5 ; i++) {
			if (i == 3) continue;
			System.out.println(i);
		}
		System.out.println(" **** BREAK **** ");
		for (int i = 0 ; i < 10 ; i ++) {
			for(int j = 0; j < 10 ; j++) {
				if ( j == 5 ) break; 
				System.out.println(i+" "+j);
			}// for - j 
		}// for - i
		System.out.println(" **** CONTINUE **** ");
		for (int i = 0 ; i < 10 ; i ++) {
			for(int j = 0; j < 10 ; j++) {
				if ( j == 5 ) continue; 
				System.out.println(i+" "+j);
			}// for - j 
		}// for - i
		
		// 만약에 j가 5일때 for-j문이 아닌 for-i문을 종료시키고 싶다면 
		System.out.println(" **** break **** ");
		// 1. 조건식을 거짓으로 만드는 방법 
		for (int i = 0 ; i < 10 ; i ++) {
			for(int j = 0; j < 10 ; j++) {
				if ( j == 5 ) {
					i = 10; 
					break; 
				}
				System.out.println(i+" "+j);
			}// for - j 
		}// for - i
		System.out.println(" **** break **** ");
		// 2.별명을 붙여주어 탈출 
		loop: for (int i = 0 ; i < 10 ; i ++) {
			for(int j = 0; j < 10 ; j++) {
				if ( j == 5 ) {
					break loop; 
				}
				System.out.println(i+" "+j);
			}// for - j 
		}// for - i
		

	}

}

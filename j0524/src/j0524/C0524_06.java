package j0524;

public class C0524_06 {

	public static void main(String[] args) {
		// 중첩 for 
		
		for(int i = 0 ; i < 5; i++ ) {
			System.out.println("for 문 i에서 반복중입니다. ");
			for(int j=0 ; j<3 ; j++) {
				System.out.printf("i: %d - j: %d ,",i,j);
			}
			System.out.println("\n내부for문이 종료되었습니다");
		}
		
		for(int i = 0 ; i < 3 ; i ++ ) {
			for(int j = 0 ; j < 3 ; j++) {
				for(int k = 0 ; k<3 ; k++) {

					System.out.println(""+i+j+k);
					
				} // for - k 
				
			}// for - j 
			
		}// for -i 
		System.out.println("------------------");
		// for문을 사용해서 2중for문 사용해야함
		//	123
		//	123
		//	123
		for (int j = 0 ; j < 3 ; j++) {
			for (int i = 1; i<4;i++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		// for문을 사용해서 다음 과같이 출력해주세요 
		//	*****
		//	*****
		//	*****
		for (int j = 0 ; j < 3 ; j++) {
			System.out.println();
			for (int i = 1; i<=5;i++) {
				System.out.print("*");
			}
		}
		System.out.println();
		for(int i = 1;i<=5;i++) {
			for (int j = 1; j<= 3 ; j++) {
				System.out.println(i+","+j);
			}
		}
		// 2단 출력 
		for(int i = 1; i<=9; i++) {
			System.out.printf("%d * %d = %d \t",2,i,2*i);
		}
		System.out.println();// 줄바꿈 
		// 3단 출력 
		for(int i = 1; i<=9; i++) {
			System.out.printf("%d * %d = %d \t",3,i,3*i);
		}
		System.out.println();// 줄바꿈 
		System.out.println("----------------");
		System.out.println("구구단출력");
		// 중첩 for를 사용해서 구구단을 출력해보세요. 
		for(int i = 2 ;i<= 9 ;i++) {
			System.out.println("["+i+"단]");
			for (int j = 1; j<= 9 ; j++) {
				System.out.printf("%d * %d = %d \t",i,j,i*j);
			}
			System.out.println();
		}
		// 단 앞에 몇단인지도 표기해보기 . 
		/* 3. 
		[2단]    [3단]   [4단] .....
	    2*1=2    3*1=3   4*1    5*1  
	    2*2=4    3*2=6 
	    */ 
		System.out.println("----------------");
		System.out.println("구구단출력");
		for(int i = 2 ; i<=9; i++) {
			System.out.print("["+i+"단] \t\t");
		}
		System.out.println();
		for(int i = 1 ;i<= 9 ;i++) {
			for (int j = 2; j<= 9 ; j++) {
				System.out.printf("%d * %d = %d \t",j,i, i*j );
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		// 홀수단만 출력해보세요 
		for(int i = 2 ;i<= 9 ;i++) {
			if(i%2 == 1) { // 홀수 일때만 
				System.out.println("["+i+"단]");
				for (int j = 1; j<= 9 ; j++) {
					System.out.printf("%d * %d = %d \t",i,j,i*j);
				}
				System.out.println();
			}
		}
		System.out.println();
		
		for(int i = 1 ;i<= 9 ;i++) {
			for (int j = 2; j<= 9 ; j++) {
				if (j %2 == 1)
					System.out.printf("%d * %d = %d \t",j,i, i*j );
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("구구단 (전체) * 짝수만 출력해보세요");
		// 구구단 (전체) * 짝수만 출력해보세요
		System.out.println();
		for(int i = 2 ;i<= 9 ;i++) {
			System.out.println("["+i+"단]");
			for (int j = 1; j<= 9 ; j++) {
				if(j%2==0)
					System.out.printf("%d * %d = %d \t",i,j,i*j);
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i = 1 ;i<= 9 ;i++) {
			if(i%2 == 0 ) {
				for (int j = 2; j<= 9 ; j++) {
					System.out.printf("%d * %d = %d \t",j , i, i*j );
				}
				System.out.println();
			}
		}
		
		System.out.println();
		
		
	} // main

} // class

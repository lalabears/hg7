package j0524;

public class C0524_09 {

	public static void main(String[] args) {
		// do - while : 
		/*
		while 문은 진입전에 조건식부터 검사하지만 
		do-while문은 한번 실행 후 조건식을 검사함
		즉. do-while은 조건식 결과와는 상관없이 무조건 한번은 실행됨. 
		
		초기식; (필수는아니지만 일반적으로사용)
		do {
			조건식이 참인동안 반복되는 코드들(최초1회는 무조건실행) 
			증감식; (필수는 아니지만 일반적으로 사용)
		} while(조건식); (while문과 다르게 ;을 꼭 써야함) 
		실행구문 > 증감식 > 
		조건식(참) > 실행구문 > 증감식
		조건식(거짓) > 종료
		*/
		int i = 1;
		while(i<6) {
			System.out.println(i);
			i++;
		}
		i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<6);
		
		
		int a = 0 ;
		while (a < 0 ) {
			System.out.println("출력1");
			a++; 
		}
		a = 0; 
		do {
			System.out.println("출력2");
			a++; 
		}while (a < 0 );

		// 반복문 for - while - do while 
		
		/* 제어문 
		 break : if문을 제외한 가장 가까운 중괄호를 { }  탈출하는 제어코드.  
		
         switch문에서 본적이 있는데 그때도 switch문을 탈출하기 위해서 사용함. 		
		*/
		
		a = 1; 
		switch(a) {
		case 1:
			System.out.println(1);
			break; 
		case 2:
			System.out.println(2);
			break;
		default:
			System.out.println(0);
		}
		System.out.println("------------");
		for(i = 0 ; i < 10 ; i ++) {
			System.out.println(i);
			break; 
		}
		int sum1 =0, sum2 = 0  ; 
		for(i = 0 ; i < 10 ; i ++) {
			sum1+=i;
			if( i == 5) {
				break; 
			}
			sum2+=i;
		}
		System.out.println(sum1);
		System.out.println(sum2);
		
		for (i = 0 ; i < 10 ; i ++) {
			for(int j = 0 ; j < 10 ; j++) {
				if (j==5) {
					break;
				}
				System.out.println(i+" "+j);
			}
		}
		System.out.println("=================");
		// 만약 j == 5됫을때 for 문을 종료시키고 싶다면 
		// 1. i값을 변형해서 조건식을 거짓으로 만든다. 
		for (i = 0 ; i < 10 ; i ++) {
			for(int j = 0 ; j < 10 ; j++) {
				if (j == 5) {
					i = 9;
					break;
				}
				System.out.println(i+" "+j);
			}
		}
		System.out.println(i);
		System.out.println("=================");
		// 2. 별명을 만들어준다. 
		loop1: for (i = 0 ; i < 10 ; i ++) {
			for(int j = 0 ; j < 10 ; j++) {
				if (j==5) {
					break loop1;
				}
				System.out.println(i+" "+j);
			}
		}
		
		boolean run= true;
		i = 0;
		while(run) {
			int j = 0; 
			while(j<10) {
				System.out.println(j);
				if(j == 5) {
					run = false; 
					break; 
				}
				j++;
			}
		}
		
		loop2: while(true) {
			int j = 0; 
			while(j<10) {
				System.out.println(j);
				if(j == 5) {
					break loop2; 
				}
				j++;
			}
		}
		
		/*
		 continue : 반복제어문의 } 역할을 함. 
		 반복제어문은 }를 만나면 증감식으로 이동해 조건을 검사함. 
		 즉, 반복문 실행도중 continue를 만나면 수행할 코드들이 남이 있어도
		 마치 중괄호의 끝을 만난것처럼 증감식을 수행하고 조건을 검사함
		*/
		
//		for(i = 0; i < 10 ; i ++) {
//			continue;
//		//	System.out.println(i); // 이부분이 실행될 수 없는 코드라서 오류
//		}
		System.out.println("******break**************");
		for (i = 0 ; i < 10 ; i ++ ) {
			if(i==5) break;
			System.out.println(i);
		}
		System.out.println("*******continue**********");
		for (i = 0 ; i < 10 ; i ++ ) {
			if(i==5) continue; // }
			System.out.println(i);
		}
		
		for (i = 0 ; i <10 ; i++ ) {
			for(int j =0 ; j<10;j++) {
				if(j == 5) continue;
				System.out.println(i+" "+j);
			}
		}
		
		l3: for (i = 0 ; i <10 ; i++ ) {
			for(int j =0 ; j<10;j++) {
				if(j == 5) continue l3;
				System.out.println(i+" "+j);
			}
		}
		
	}

}

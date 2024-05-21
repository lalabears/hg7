package j0521;

public class C0521_02 {

	public static void main(String[] args) {
		// printf ("문자열만나올 수 있음" , 대입이되는값들) ; 
		System.out.printf("그냥문자열은 출력은 할 수 있음 \n");
		// %c :문자, %d :정수 , %f: 실수, %s : 문자열 
		
		System.out.printf("%c \n", 'A'); 
		System.out.printf("%d \n", 100); 
		System.out.printf("%f \n", 3.1415); // %f를 사용하면 소수점  6자리 표현
		System.out.printf("%s \n", "문자열"); 
		
		int a = 123; 
		System.out.printf("%d \n", a);
		int a1= 10, a2 = 20, a3 = 30; 
		System.out.printf("%d-%d-%d \n", 11, 12, 13);
		System.out.println(11 + "-" + 12 + "-" + 13);
		System.out.printf("%d %d %d \n", a1, a2, a3);
		
		double a4 = 13.214527; 
		System.out.printf("%.3f \n", a4);
		
		int num1 = 121; 
		int num2 = 33 ; 
		System.out.printf("더하기 결과 값: %d \n", num1+num2);
		System.out.printf("나누기 결과 값: %.2f \n", (float)num1/num2);
		
		/* 변수 : 번호, 이름, 나이, 이메일주소 
		 출력  :
		 ------------------------------------
		 번호	이름		나이		이메일
		 ------------------------------------
		   1    홍길동    20      hong@aa.com 		  
		*/
		// 변수 선언하기 
		int no = 1, age; 
		String name, email; 
		age = 20;
		name = "홍길동";
		email = "hong@aa.com"; 
		
		System.out.println("------------------------------------");
		System.out.println("번호\t이름\t나이\t이메일");
		System.out.println("------------------------------------");
		// 변수 사용한 값 출력하기 printf사용해보기
		System.out.printf("%d\t%s\t%d\t%s\n",no,name,age,email);
		
		/*
		 변수 : 번호, 이름, 국, 영, 수, 총점, 평균  
		 
		 출력
		 ----------------------------------------------------
		 번호	이름		국어		영어		수학		총점		평균
		 ---------------------------------------------------- 
		  1    홍길동    100      90      80     270     90.00
		*/
				
		// 변수 선언하기. 
		int number=0, kor=0, eng=0, math=0, total=0 ; 
		String stuname=""; 
		double avg=0; 
		// 값 넣어주기 
		number = 1; 
		kor = 100; 
		eng = 90; 
		math = 80; 
		total = kor+eng+math; 
		avg = total / 3.0 ;  
		stuname = "홍길동";
		
		System.out.println("----------------------------------------------------");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------------");
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f \n",
				      number, stuname, kor, eng, math, total, avg) ;
		
		

	}

}

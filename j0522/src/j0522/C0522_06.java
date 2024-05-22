package j0522;

import java.util.Scanner;

public class C0522_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 삼항연산자 
		// 7의 배수인지 아닌지를 삼항식으로 표현해보세요 >>
		String r="";
		System.out.println("숫자를 입력해주세요 ");
		int number = scan.nextInt();
		r = ( (number%7) == 0 ) ? "7의 배수입니다" : "7의 배수가아닙니다.";
		// 결과
		System.out.println("입력하신 숫자는 "+ r);
		
		
		/*
		동전으로 교환하는 프로그램입니다. 
		돈을 입력받아 
		500원 몇개, 100원 몇개, 50원 몇개, 10원 몇개 가 나오는지 출력해보세요 
		ex) 1270을 입력을 받는다면 
		500원 2개   100원 2개  	50원 1개 	10원 2개 를 출력하시면됩니다. 
		*/
		// 1. 변수선언
		int money = 1270;
		int c500=0, c100=0, c50=0, c10=0; 
		System.out.println("교환하고싶은 금액을 입력해주세요 ");
		money = scan.nextInt();
		// 2. 연산 ( / and % )
		c500 = money/500;       // 500원 나머지 값들로 밑에 동전들을 계산. 
		c100 = (money%500)/100;          // 100원
		c50  = ((money%500)%100)/50;     // 50원
		c10  = (((money%500)%100)%50)/10;// 10원
		// 3. 출력
		System.out.println("입력한금액 : "+money);
		System.out.printf("500원 %d개 \n",c500);
		System.out.printf("100원 %d개 \n",c100);
		System.out.printf("50원 %d개 \n",c50);
		System.out.printf("10원 %d개 \n",c10);
		
		
		
		
		
		
		// 534 자루의 연필을 30명의 학생에게 같은 개수로 나눠 주려고 합니다.
		// 학생당 몇자루를 가질 수 있고 
		// 몇개의 연필이 남는지 출력해주세요 
		// 1. 변수선언
		int pen = 534 , stu = 30 ;
		// 2. 연산
		int pp = 534/30; 
		int extra = 534%30; 
		// 3. 출력 
		System.out.println("학생당 연필 : " + pp);
		System.out.println("남는 연필 : " + extra);

	}

}

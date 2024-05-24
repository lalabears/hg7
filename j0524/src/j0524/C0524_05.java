package j0524;

public class C0524_05 {

	public static void main(String[] args) {
		// for문의 활용 
		// 1- 5 까지의 합
		// 0+1+2+3+4+5
		int sum = 0 ; 
		sum = sum + 1;
		sum = sum + 2; 
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5; 
		System.out.println("1-5의 합 : "+ sum);
		sum = 0 ; 
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		System.out.println("1-5의 합 : "+ sum);
		sum = 0 ;  
		for(int i = 1 ; i < 6 ; i++) {
			sum += i; 
		}
		System.out.println("1-5의 합 : "+ sum);
		
		// 50 - 100까지의 합을 구해보세요 
		int sum50100=0;
		for(int i = 50 ; i<=100; i++) {
			sum50100+=i;
		}
		System.out.println("50 - 100까지의 합 "+ sum50100 );
		
		// 1-20까지의 합을 구하는데
		//출력을 
		sum = 0 ;
		int i=1 , firsti;
		firsti = i ; 
		for (i=1;i<=20;i++) {
			sum+=i;
		}
		System.out.println(i);
		System.out.println( firsti +"부터 " + (i-1) +" 까지의 합은 "+sum);
		
		for(i=0;i<5;i++) {
			System.out.println(i);
			if (i == 2) break; // i가 2가 되는 순간 for문은 종료
		}
		// 1-100까지의 합을 구하는데 
		// 합이 500이상일때 [1-n번 까지의 합은 5??] 입니다라고 출력해보세요
		sum = 0; 
		for(i=1;i<=100;i++) {
			sum += i;
			if(sum >= 500) break;
			
		}
		// 합이 15이상이라면 >		1 - 5의 합은 15입니다
		System.out.printf("1에서 %d 까지의 합은 %d\n", i , sum );
		System.out.println("이전단계");
		System.out.printf("1에서 %d 까지의 합은 %d\n", i-1 , sum-i );
		
		// 1-100 사이의 홀수의합과 짝수의 합, 총합 을 출력해보세요 
		int sum1=0, sum2=0;
		for(i = 1; i<101;i++) {
			if(i%2==0) sum2+=i;
			else       sum1+=i;
		}
		System.out.printf("홀수의 합: %d, 짝수의 합: %d, 총합: %d \n", 
				sum1,sum2,sum1+sum2);
		
		// 1-20 사이의 5의배수, 7의배수의 합을 구해보세요
		// 5+7+10+14+15+20
		sum=0;
		for(i=1;i<=20;i++) {
			if( i%5==0 || i%7==0)
				sum += i;
		}
		System.out.println(sum);
		// 1-10까지 3의 배수가 아닌 숫자들의 합
		// 1. 1-10까지의 합 - 3의배수의합 
		// 2. 1,2,4,5,7,8,10
		sum=0;		sum1=0;		sum2=0;
		for(i = 1 ; i<11;i++) {
			sum2 += i;   // 1-10까지의합
			if( i%3 != 0 )	sum += i ; // 3의배수가아닌
			if( i%3 == 0 ) sum1 += i;  // 3의 배수인
		}
		System.out.println(sum);
		System.out.println(sum2-sum1);
		
		
	}              

}

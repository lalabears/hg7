package j0401;

public class C0401_08 {

	public static void main(String[] args) {
		
		// 연산자 : 연산을 수행하는 기호 + - * / 
		// 피연산자 : 연산 수행 대상 ( 변수, 상수, 리터럴, 수식) 
		
		// 9 * ( 5 - 2 ) , n1 + n2, PI*3  
		
		// 연산자에 우선순위를 원하면 괄호를 사용하면됨 
		
		// 1. 증가연산자 (++), 감소연산자(--)
		
		int i = 1; 
		
		i++; // 1만큼 증가시켜라 
		i++;
		System.out.println(i);
		
		i--; 
		i--; 
		System.out.println(i);
		// ----- i = 1
		i++; // 전위형
		System.out.println(i);
		++i; // 후위형
		System.out.println(i);
		
		// j = ++k; 의 의미
		int k = 1 ; 
		++ k; // k = 2
		int j = k; // j =2 
		
		// j = k++; 의 의미 
		k = 1; 
		j = k; // j =1
		k++ ;  // j =1, k = 2 
		
		i = 5;
		j = 0;
		
		j = i++;
		System.out.printf("j = i ++ 실행 후, i=%d, j=%d \n",i,j);
		
		i = 5;
		j = 0;
		
		j = ++i;
		System.out.printf("j = ++i 실행 후, i=%d, j=%d \n",i,j);
		
		
		// - : 피연산자의 부호를 반대로 
		// + : 아무일도 일어나지 않음 
		i = -3; 
		i = +i;
		System.out.println(i);
		
		i = -3; 
		i = -i;
		System.out.println(i);
		
		
		

	}

}

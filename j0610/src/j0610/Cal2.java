package j0610;
//숫자 3개의 합계와 평균을 구해주는 클래스를 만들어보세요
public class Cal2 {
//	iv : n1, n2, n3, sum, avg
	int n1, n2, n3, sum;
	double avg; 
//	기본생성자,	매개변수 있는 생성자. 
	Cal2(){ n1 = 0; n2 = 0; n3 = 0; }
	Cal2(int n1, int n2, int n3){
		this.n1 = n1; this.n2 = n2;	this.n3 = n3;
	}
//	매개변수, 리턴이없는 sum
	void sum() {
		sum = n1+n2+n3;
	}
//	매개변수, 리턴이있는 sum
	int sum(int n1, int n2, int n3) {
		return n1+n2+n3;
	}
//	매개변수로 배열을 받는 sum 
	int sum(int[] arr) {
		int sum = 0 ;
		for(int i = 0 ; i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
//	매개변수, 리턴이없는 avg
	void avg() {
		avg = (n1+n2+n3)/3.0;
	}
//	매개변수, 리턴이있는 avg
/*	double avg(int n1, int n2, int n3) {
		return (n1+n2+n3)/3.0; 
	}
*/
	double avg(int n1, int n2, int n3) {
		// 클래스 내부에서 다른 메서드 호출 
		return sum(n1,n2,n3)/3.0; 
	}
	
	
//	매개변수로 더블을 받는 avg 
	double avg(double n1, double n2, double n3) {
		return n1+n2+n3/3;
	}
	void result(int n1, int n2, int n3) {
		printR("합계: "+ sum(n1,n2,n3)+", 평균 : "+ avg(n1,n2,n3) );
		
		// sum(a,b,c) => sum메서드를 호출해서 반환값으로 int타입을 리턴함. 
		// avg(a,b,c) => avg 메서드 호출 => sum 메서드 호출
		//           => 반환값으로 avg결과 계산 => double타입으로 리턴함. 
	}
	void printR(String str) {
		System.out.println(str); 
	}
	int sum(int n) {
		// 1 부터 n까지 더하는 메서드 
		int result = 0 ; 
		for(int i = 1 ; i <= n ; i ++) {
			result += i ; 
		}
		return result; 
	}
	/* 재귀호출(recursive call) 
	    메서드 내부에 해당 메서드를 다시 호출하는 것을 의미. 
	    자기자신을 계속해서 호출하므로 끝없이 반복되기 때문에
	    중단하는 조건문을 반드시 포함해야함. */
	int recursiveSum(int n) {
		if(n==1) {
			// n이 1이면 n을 반환함. 
			return 1;
		}
		// n이 1이 아니면 n을 1부터 n-1까지의 합과 더한값을 반환함 
		return n+recursiveSum(n-1);
	}
	// 1-4까지의 합: 1-3까지 합에 4를 더함
	// 1-3까지의 합: 1-2까지 합에 3을 더함
	// 1-2까지의 합: 1-1까지 합에 2를 더함
	// 1부터 1까지의 합은 그냥 1 
	// 즉. n이 1이 아니면 n과 1부터 n-1까지의 합을 더한값을 반환. n=1이면 그냥 1반환
	
	int power(int base, int exponent) {
		if(exponent == 0 ) return 1;
		else return base * power(base, exponent-1); 
	}
	// power(2,5) => 2*2*2*2*2*1 = 32 
	
	// 팩토리얼을 재귀호출을 사용해서 만들어 보세요 
	// 5! = 5*4*3*2*1 =120,  4! = 24  3!= 6
	long factorial(int n ) {
		long result = 0;
		if(n==1) result = 1; 
		else result = n * factorial(n-1);
		return result;		
	}
	
	// 문자열 뒤집기 메서드를 재귀호출을 사용해서 만들어보세요 
	String reverseStr(String str) {
		// str = "hello"  >  결과 : olleh
		if(str.length() == 0 )	return str;
		else return reverseStr(str.substring(1))+str.charAt(0);
	}
	
	
	
}

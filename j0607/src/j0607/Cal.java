package j0607;

public class Cal {
	// 짝수인지 
	boolean isEven(int n) {
		if(n%2==0) return true;
		else return false;
	}
	// 홀수인지 
	boolean isOdd(int n) {
		if(n%2==1) return true;
		else return false;
	}
	// 2의 배수인지 짝수인지 
	boolean isMulti(int n) {
		if(n%2==0) return true;
		else return false;
	}
	// n이 m의 배수인지 
	boolean isMulti(int n, int m) {
		if( n % m == 0 ) return true;
		else return false; 
	}
	// max - 매개변수 정수2개 
	int max(int n1, int n2) {
		if(n1>n2) return n1;
		else return n2; 
	}
	// max - 매개변수 - 배열 
	int max(int[] a) {
		int x = a[0];
		for(int i = 0 ;i <a.length; i++) {
			if(x < a[i]) x = a[i];
		}
		return x; 
	}
	// min - 매개변수 정수 2개
	int min(int n1, int n2) {
		if(n1<n2) return n1;
		else return n2;
	}
	
	// min - 매개변수 - 배열 
	int min(int[] a) {
		int n = a[0];
		for(int i = 0; i<a.length; i++) {
			if( n > a[i]) n = a[i];
		}
		return n; 
	}
	
	
	
	
	
	

}

package j0604;

public class Cal3 {
	// 인스턴스변수 n1, n2
	int n1;
	int n2; 
	int minVal; 
	// n1, n2 중 최대 값을 출력  - 리턴 있음 (int, long.. )
	int max() {
		if (n1>n2) return n1;
		else return n2; 
	}
	// n1, n2 중 최소 값 - 리턴이 없음 (void) 
	void min() {
		if (n1<n2) minVal = n1;
		else minVal = n2;
	}
	// 숫자 1개를 매개변수로 받아서 짝수 인지 홀수 인지 리턴 
	String oddEven(int n) {
		if(n%2 == 0) return "짝수";
		else return "홀수";
	}
	String oddEven() {
		if(n1%2 == 0) return "짝수";
		else return "홀수";
	}




}

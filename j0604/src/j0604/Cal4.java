package j0604;

public class Cal4 {
	// 인스턴스변수
	int n1;
	int n2; 
	
	// 전달받은 두 숫자의 
	// 합과 평균을 계산해 배열에 저장하는 메서드
	void calculate(int[] result, int a, int b) {
		result[0] = a+b;
		result[1] = (a+b)/2;
		// 배열은 주소값을 보내느것이기때문에
		// return이 필요가 없다. 
	}
	void cal1 (int[] result) {
		result[0] = n1+n2;   // 인스턴스변수 사용해서 계산 
		result[1] = (n1+n2)/2;
	}
	void add(int[] r) {
		r[0] = n1+n2; 
	}
	void sub(int[] r) {
		r[1] = n1-n2; 
	}
	void mul(int[] r) {
		r[2] = n1*n2; 
	}
	void div(int[] r) {
		r[3] = n1/n2; 
	}
	void run(int[] r) {
		add(r);	sub(r);
		mul(r);	div(r);
	}
	
	void cal2(int[] arr) {
		arr[4] = arr[1]+arr[2]+arr[3];
		arr[5] = arr[4]/3;
	}

}

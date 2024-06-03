package j0603;

public class Calculate {
	
	int max3(int n1, int n2, int n3) {
		int result=0;
		if(n1>=n2) { // n1이 n2보다 큰 경우 
			if(n1>=n3) { // n1이 n3보다 큰경우  
				result = n1;  // n1이 가장 큼 
			}else if(n2>=n3) { //n1이 n3보다작을 경우
				result = n2;   // n2가 n3보다 크면 n2가 가장큼
			}else {
				result = n3;   // n1이 n3보다작고 n2가 n3보다작아서 n3이 가장큼
			}
		}else {  // n1이 n2보다 작은경우 
			if (n2>=n3) result = n2;
			else if (n1>=n3) result = n1;
			else result = n3;
		}
		return result; 
	}
	int min3(int n1, int n2, int n3) {
		if(n1<=n2) { 
			if(n1<=n3) { 
				return n1;  
			}else if(n2<=n3) { 
				return n2;   
			}else {
				return n3;   
			}
		}else {  
			if (n2<=n3) return n2;
			else if (n1<=n3) return n1;
			else return n3;
		}
		
	}
	
	// 최대값 - 삼항식 사용
	int max( int n1, int n2 ) {
		return (n1>n2) ? n1:n2;
	}
	// 최소값.    10      3
	int min(int n1, int n2) {
		if (n1<n2) return n1;
		else return n2; 
/*		int result = 0; 
		if(n1 < n2) result = n1; 
		else result = n2; 
		return result;*/
	}

	
	
	
	//         5L,     3L
	long add(long n1, long n2) {
		return n1+n2;
	}
	long sub(long n1, long n2) {
		return n1-n2;
	}
	long mul(long n1, long n2) {
		return n1*n2;
	}
	double div(long n1, long n2) {
		return n1/(double)n2;
	}
	long remain(long n1, long n2) {
		return n1%n2;
	}
	
	
	
	int add(int n1, int n2) {
		return n1+n2;
	} // add
	int sub(int n1, int n2) {
		int r = n1-n2;
		return r; 
	} // sub 
	void print() {
		System.out.println("이곳은 void 메서드로 리턴값이 없습니다.");
	}
	
	
	

}

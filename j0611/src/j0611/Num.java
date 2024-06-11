package j0611;

public class Num {
	/* 변수의 초기화 : 변수를 선언하고 처음 값을 저장하는것.
	   인스턴스변수, 클래스변수는 자동초기화됨
	   지역변수는 사용하기전에 초기화해야함
	*/
	// 1. 간단초기화 (대입연산자를 사용한 초기화)
	// 인스턴스 변수
	int x;     // x는 기본값 0으로 초기화
	int y = x; // y는 초기화에 x를사용함
	int z = 100; // z는 100으로 초기화
	int[] arr1 = new int[4];  // 참조변수 {0,0,0,0}으로 자동초기화
	// 클래스 변수 
	static double pi = 3.14; 
	static int k = 3000;
	static int[] arr2 = new int[5]; // 참조변수
	
	// 2.  초기화블럭을 사용해서 초기화 
	// 인스턴스변수 초기화
	{
		z++;    // 인스턴스 변수 
		x = z;  // 인스턴스변수z를 1증가한 값을 x에 대입 
		++k; // 클래스변수 
		y = k ; // 클래스변수 k값을 1 증가한 값을 y에 대입 
		
	}
	// 클래스변수 초기화 - 주로 복잡한 초기화에 사용됨. 
	// for, if 등등 사용해서 초기화를 할 수 있다. 
	static {  // 클래스변수만 초기화 할 수 있다. 
		for(int i = 0 ; i <arr2.length ; i ++) {
			arr2[i] = 3*(i+1); 
		}
	}
	
	// 생성자를 통한 초기화 - iv
	Num(){} // 기본생성자 
	Num(int x, int y ){
		this.x = x ; 
		this.y = y ; 
	}
	
	
	// 메서드 
	int sum() {
		int result = 0 ;  // 지역변수  - 초기화 후 사용할 수 있음
		result = x+y; 
		return result;
	}
	int sum( int x, int y ) {
		// sum(1,2) > x = 1, y = 2; 
		x = 10; 
		return x+y; 
	}
	double sum(double x, double y ) {
		return x+y; 
	}
	int sum(int[] arr) {
		int result=0; 
		for(int i = 0; i<arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
	
	
	
	
	
	
	
	

}

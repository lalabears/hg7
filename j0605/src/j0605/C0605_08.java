package j0605;
public class C0605_08 {
	public static void main(String[] args) {
		/* 메서드 오버로딩 : 하나의 클래스에 같은 이름의 메서드를 여러개 정의하는 것
		 - 메서드의 이름이 같아야함.
		 - 매개변수의 개수 또는 타입이 달라야함.
		 - 매개변수가 같고 리턴타입이 다를경우 오버로딩이 성립하지 않는다
		*/ 
		C0605_08 c = new C0605_08();
		
		// 오버로딩을 왜 사용할까요 ? 이름을짓는 번거로움도 없고 
		// 같은동작이라면 하나의 메서드만 기억하면됨
		// add()
		// 1+1          add1( int x, int y)      > int 
		// 1.01 + 2     add2(double x, int y )   > double
		// 1.1 +2.2     add3(double x, doubl y)  >double
		// 2+2.23       add4(int x, double y )   >double
		int r = c.add(1,2); 
		System.out.println(r);
		double r1 = c.add(2, 3.14); 
		System.out.println(r1);
		double r2 = c.add(1.23, 3.14);
		System.out.println(r2);
		double r3 = c.add(1.1111, 3);
		int r4 = c.add(1,2,3);
		System.out.println(r4);
	} // main
	
	double add(int x, double y ) {
		return x+y;
	}
	double add(double x, double y) {
		return x+y;
	}
	double add(double x, int y ) {
		return x+y;
	}
	int add(int x, int y, int z) {
		return x+y+z;
	}
	// 1. 매개변수의 이름이 다른것은 오버로딩이 아니다. 
	// A
	int add(int x, int y ) { 
		return x+y;
	}
    // int add(int a, int b ) {  	return a+b;   }     
	// 2. 리턴 타입은 오버로딩의 성립 조건이 아니다. 
	// long add(int x, int y) {	return (long)(x+y);	}
	
	// 1. 매개변수의 타입이 다르므로 오버로딩이 성립함. -- 사용시 주의해야함. 
	// B
	long add(int x, long y) { 
		return x+y; 
	}
	// C
	long add(long x, int y) { 
		return x+y; 
	}
	// 2. 매개변수는 다르지만 같은 의미의 기능을 수행하는것을 오버로딩이라고함. 
	// D
	long add(long x, long y ) { 
		return x+y ; 
	}
	int add(int[] x) { 
		int sum=0; 
		for(int i = 0 ; i<x.length; i++) {
			sum+=x[i];
		}
		return sum; 
	}
	
}// class

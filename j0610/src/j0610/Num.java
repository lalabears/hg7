package j0610;

public class Num {
	// x, y는 인스턴스 변수 
	int x;
	int y = x; 
	// y를 초기화 하는데 x를 사용함. 
	// 인스턴스변수경우 int는 기본값이 0 이므로 0으로 초기화 됨. 
	
	// 1. 명시적 초기화 (=) 대입연산자를 사용 . 
	int z = 10 ;  // 기본형의 초기화 
	Calculator c = new Calculator(); // 참조변수의 초기화 
	int[] arr = new int[100]; // 참조변수의 초기화 {0,0,0,0}
	
	// 2. 초기화 블럭 - 인스턴스변수 경우는 잘 사용하지 않음 . 필요하면 사용함. 
	// 인스턴스변수의 복잡한 초기화에 사용이 된다. 
	// {} 를 사용해서 초기화를 해줌 
	{
		z++;
		x = z; 
		// 초기화 블럭 내에서는 조건문, 반복문 등등 자유롭게 사용이 가능하다. 
		for(int i = 0 ; i<arr.length; i++) {
			arr[i]=i+1; 
		}
		
	}
	
	// 3. 생성자를 통한 초기화 - iv는 주로 생성자를 이용해서 초기화함. 
	Num(){		x = 10;		y = 20;		z = 30; 	}
	Num(int x, int y ){
		this.x = x; this.y = y;
	}
	
	
	// cv - 클래스변수 초기화 
	// 1. 명시적초기화 (=) 
	static double pi = 3.14; 
	static int[] arr2 = new int[10]; 
	// 2. 초기화 블럭을 사용한 초기화  
	// - 클래스 변수의 복잡한 초기화에 사용됨
	static {
		
		for(int i = 0 ; i< arr2.length; i++) {
			arr2[i] = (int)(Math.random()*10)+1;
		}
		
	}
	
	void myFunc() {
		int a ; 
		// int b= a ;
		// 지역변수는 초기화하지 않으면 사용할 수 없다. 
	}
	
	
	
	
	
	
}

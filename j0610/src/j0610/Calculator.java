package j0610;

public class Calculator {
	// 클래스 내 변수 iv, cv, lv 
	static double pi = 3.14; 
	int n1; // 0
	int n2;  // 0 
	int[] arr1; // 선언만 배열존재X
	int[] arr2 = new int[5]; // 선언+생성 {0,0,0,0,0}
	int sum; 
	// 생성자 
	Calculator() {} // 기본생성자
	Calculator(int n1, int n2) { // 생성자의 오버로딩
		this.n1 = n1; 	this.n2 = n2;
	}
	Calculator(int n1, int n2, int[] arr) {// 생성자의 오버로딩
		this.n1 = n1; 	this.n2 = n2;	this.arr1 = arr;
		System.out.println("arr1의 주소 "+this.arr1);
	}
	//메서드 
	// 매개변수X 반환X
	void sum() {
		sum = n1+n2; // iv 사용 
	}
	// 메서드의 오버로딩 
	// 매개변수 O 반환 O
	static int sum(int n1, int n2){
		int sum = n1+n2; // lv 지역변수
		return sum;
	}
	// 메서드의 오버로딩 
	// 매개변수 O 반환 O
	int sum(int[] arr) {
		System.out.println("매서드 내 arr 주소 : "+arr);
		int sum = 0; // lv 지역변수 
		for(int i = 0; i<arr.length; i++) {
			sum+= arr[i];
		}
		return sum;
	}
	// 반환이 배열인 메서드 
	int[] makeRange(int lower, int upper) {
		int[] arr = new int[(upper-lower)+1];
		            //           10 - 1 // 9 
		for(int i = 0; i<arr.length;i++) {
			arr[i] = lower++;
		}
		return arr; 
	}
	// sum(int[] arr) 와 같은 매개변수를 가지는 의미여서 
	// 메서드오버로딩은 불가함. 
	int sum1(int ... values) {
		int sum = 0 ; 
		for(int i = 0; i<values.length; i++) {
			sum+=values[i];
		}
		return sum;
	}
	
	

}

package j0604;

import java.util.Arrays;

public class C0604_01 {
	public static void main(String[] args) {
	// Number class 사용	
		
		/*
		변수 : 8 가지 기본형 + 참조형 변수 
		기본형 : 
		논리 - boolean
		문자 - char 
		정수 - byte, short, int, long
		실수 - float, double 
		=> 기본타입변수는 메모리에 직접 저장
		
		참조형 : 기본타입을 제외한 배열, 클래스, 인터페이스 등 
		=> 참조타입변수는 객체의 주소를 저장  
		*/
		
		int n = 10 ; 
		System.out.println(n); // 값을 출력 
		n = 20; 
		System.out.println(n); // 값을 출력 
		// 1차원
		// 배열선언    배열생성
		int[] num = new int[4];
		for(int i = 0 ; i < num.length ; i++) {
			num[i] = i+1;
		}
		System.out.println(num);  // 객체의 주소
		System.out.println(Arrays.toString(num));
		System.out.println(num[0]); // 배열의 값에 접근 
		// 2차원 배열 
		int[][] num2d = new int[2][]; // 행이2개 있다. 열은 ?
		num2d[0] = new int[3]; // 각 행에 해당하는 열 배열을 생성 
		num2d[1] = new int[2]; // 
		
		for(int i = 0 ; i < num2d.length ; i++ ) {
			for(int j = 0; j<num2d[i].length;j++) {
				num2d[i][j] = i*num2d[i].length+j+1;
			}
		}
		System.out.println(num2d);
		System.out.println(Arrays.toString(num2d));
		System.out.println(Arrays.deepToString(num2d));
		System.out.println(num2d[0][0]); // 2차원 배열의 값 
		System.out.println(num2d[0]); // 1행의 주소 
		// 클래스. 
		// 1. 클래스형의 변수 선언  =>  클래스명 참조변수명
		// 2. 객체생성           =>  new 생성자() 
		// 3. 생성된 객체의 주소를 객체변수에 대입 
		Number nu = new Number();
		// Number class의 new연산자로 객체를 생성하고 이름을 nu로 지정. 
		System.out.println(nu);  // 객체의 주소 
		nu.n1 = 10 ;  // 객체이름.변수   
		nu.n2 = 20 ;  // 객체의 속성 중 n1, n2라는 변수에 10, 20을 할당
		System.out.println(nu.n1); // 객체의 변수 값
		System.out.println(nu.n2);
		
		int[] arr = new int[2];
		String[] strArr = new String[3]; 
		// 객체 배열 
		// Number 객체 2개를 배열 형태로 만들어 사용하기위해서는 .. 
		Number[] nuArr = new Number[2];
		// Number 객체를 담을 배열의 주소를 할당함. 
		//  아직 객체는 생성되지 않았기 때문에 객체를 생성해야함. 
		nuArr[0] = new Number(); // 객체를 생성. 
		nuArr[1] = new Number(); // 객체생성 
		
		nuArr[0].n1 = 100 ; 
		nuArr[0].n2 = 10 ; 
		
		System.out.println(nuArr);      // 주소값
		System.out.println(nuArr[0]);   // 주소값
		System.out.println(nuArr[0].n1);// 실제 값
		

		Number a = new Number(); 
		Number b = new Number(); 
		a.n1 = 10 ; 
		b.n1 = 100; 
		
		a.print(); // 20

		// 객체생성없이 클래스 변수를 가져올 수 있다. 
		double c = Number.pi; 
		
		
		
	}

}

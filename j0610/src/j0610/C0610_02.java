package j0610;

import java.util.Arrays;

public class C0610_02 {
	public static void main(String[] args) {
		/* 변수 : 기본형변수 8가지 + 참조형 변수 
		 기본형 : boolean, char, byte, short, int, long, float, double
		 => 기본형은 메모리에 값을 직접 저장 
		 참조형 : 기본형을 제외한 배열, 클래스, 인터페이스 등.. 
		 => 참조형은 객체의 주소를 저장 
		*/
		// 기본형 
		int n = 21; 
		System.out.println("int 타입 변수 값 : " + n); 
		// 참조형 - 배열 
		int[] arr = new int[5];    // 배열을 선언하고 생성
		int[] arr1 = {1,2,3,4,5} ; // 배열을 선언, 생성 동시에 값 초기화
		System.out.println("arr1 배열의 주소값 : "+arr1); 
		int[] arr2 = arr1;  // 배열의 얕은 복사 : 주소를 복사함. 
		System.out.println("arr2 배열의 주소값 : "+arr2); 
		arr2[0] = 10; 
		System.out.println(arr1[0]); 
		// 주소가 같기때문에 arr2[0], arr1[0]은 같고, 값 변경이 생길경우 서로 영향을끼침
		
		// 참조형 - 클래스 
		// 클래스 객체 선언 및 생성 
		Calculator c = new Calculator(); 
		// 인스턴스객체 호출 : 참조변수명.인스턴스변수명 
		c.n1 = 10 ; 
		c.n2 = 20 ;
		System.out.println("객체의 주소 : " + c);
		System.out.println("객체의 인스턴스변수값 : "+c.n1);
		System.out.println("클래스변수 pi : "+Calculator.pi);
		// 클래스변수는 객체를 생성하지 않아도 값을 가져올 수 있음
		// 클래스변수 호출 : 클래스명.클래스변수명 
		// c.arr1[0] = 10 ; // 사용할 수 없음. 배열이 생성되지 않았기때문에  
		
		c.arr2[0] = 10; // 배열선언+생성 
		System.out.println(Arrays.toString(c.arr2));
		
//		c.arr1 = {1,2,3};   // 선언된 배열을 이렇게 초기화 불가능  
		//c.arr1 = new int[]{1,2,3}; // 배열 생성 및 초기화 
		c.arr1 = new int[3];
		c.arr1[0] = 1; c.arr1[1] = 2; c.arr1[2] = 3; 
		
 		int[] arr3 = {1,2,3,4,5}; 
 		System.out.println("arr3의 주소 : "+ arr3);
		Calculator c1 = new Calculator(10,20,arr3);
		System.out.println(Arrays.toString(c1.arr1));
	/*	arr3의 주소 : [I@7852e922
	    arr1의 주소 [I@7852e922
		[1, 2, 3, 4, 5]*/
		
		// 객체 배열 선언 및 생성 
		Calculator[] cal = new Calculator[3];
		// Calculator객체를 3개 담을 수 있는 배열을 생성함. 
		System.out.println("객체 배열의 주소 : "+cal);
		// 배열을 생성함. 객체는 생성하지 않음. 
		// 객체 생성 
		cal[0] = new Calculator(); 
		cal[1] = new Calculator(20,5);
		cal[2] = new Calculator(10,20,arr3);  
		System.out.println("객체의 주소 : "+cal[0]);
		System.out.println("객체의 인스턴스변수값: " +cal[1].n1);		
		System.out.println("객체의 배열의 주소값: " +cal[2].arr1);
		System.out.println("객체의 배열의 실제값: " +cal[2].arr1[0]);
		
		// 메서드 호출 
		// 참조변수명.메서드명 (인수1, 인수2, ..) 
		// 자료형 변수명 = 참조변수명.메서드명(인수1, 인수2,...) 
		/*  자료형  메서드명 ( 매개변수1, 매개변수2, .. 매개변수n){
		 		코드들
		 		return 문; (리턴자료형과 메서드자료형이 일치하야함)
			}
			
		반환형은 메서드 연산 결과값을 메서드를 호출한 호출자에게 반환할때 사용하는 자료형
		int, double, int[], 객체 등이 될 수 있음. 
		
		매개변수는 메서드를 호출할때 전달하는 자료로 상수, 변수, 배열, 객체 등 
		
		return 문은 생략가능하며 return문 뒤 자료형은 반환형과 동일 
		void 는 반환값이 없을때 사용
		
		*/
		Calculator c3 = new Calculator(11,12); 
		// 리턴이 없는 메서드 호출 
		c3.sum();  // 참조변수명.메서드명 
		System.out.println(c3.sum);  // 11+12 = 23
		// 리턴이 없고 객체의 인스턴스변수에 값이 저장됨. 
		
		// 매개변수가 정수타입인 메서드 
		int r = Calculator.sum(25,6); 
		// 리턴이 있는 메서드 호출 
		// 자료형  변수 = 참조변수명.메서드명(인수1,인수2) ; 
		System.out.println(r); // 25+6 = 31 
		
		int[] arr4 = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("arr4 주소 : "+arr4);
		// 매개변수가 배열인 메서드 
		int r2 = c3.sum(arr4);
	/*	arr4 주소 : [I@5c647e05
		매서드 내 arr 주소 : [I@5c647e05    */		
		System.out.println(r2); // 1~10 까지 합 : 55

		int[] arr5 ; 
		arr5 = c3.makeRange(1,10);
		System.out.println(Arrays.toString(arr5));
		//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		
		/* 가변인자 : 
		 메서드나 생성자를 호출 할 경우 매개변수의 개수가 반드시 일치해야함. 
		 가변인자를 사용할 경우, 개수를 지정할 필요없으며 모두 배열로 관리됨. 
		 
		 반환형 메서드명(자료형 ... 변수명){}
		 생성자명(자료형 ... 변수명){}  
		*/
		
		int r3 = c3.sum1(new int[] {1,2,3});  
		System.out.println(r3);  // 6
		int r4 = c3.sum1(1,2,3,4,5,6,7,8,9,10); 
		System.out.println(r4);  //55
		int r5 = c3.sum1(12,3); 
		System.out.println(r5);  //15
		
		Cal2 c4 = new Cal2(11,12,13);
		c4.sum();
		System.out.println(c4.sum); // 36
		c4.avg();
		System.out.println(c4.avg);	//12.0
		System.out.println(c4.sum(1,2,3)); // 6
		System.out.println(c4.avg(1,2,3)); // 2.0
		c4.result(8, 9, 10);
		// 합계: 27, 평균 : 9.0
		
		System.out.println(c4.sum(10));
		// 55
		System.out.println(c4.recursiveSum(10));
		// 55 
		System.out.println(c4.factorial(5)); // 120
		System.out.println(c4.factorial(4)); // 24
		
		String str = "javascript"; 
		//            012
		System.out.println(str.substring(2));
		// vascript
		System.out.println(str.charAt(0));
		// j
		str = "hello";
		System.out.println(str);
		// hello
		System.out.println(c4.reverseStr(str));
		
	}

}

package j0604;
import java.util.*;
public class C0604_02 {
	public static void main(String[] args) {
	// Number, Cal, Cal2 클래스 사용	
		Number num = new Number();
		num.n1 = 10; 
		num.n2 = 3; 
		num.print();  // 함수를 호출
		
		// 1. 리턴, 매개변수 없는 메서드들 : Number
		System.out.println(num.addResult);  // 기본값 0 출력 
		num.add();  // 객체이름.메서드명();  
		System.out.println(num.addResult); // 13 
		num.sub();
		System.out.println(num.subResult);  // 7 
		num.mul();
		System.out.println(num.mulResult);
		num.div();
		System.out.println(num.divResult);
		
		// 2. 리턴있음. 매개변수 없음 : Cal 
		// 1. 객체생성 및 선언 
		Cal num1 = new Cal();
		num1.n1 = 100 ;
		num1.n2 = 2 ; 
		int r1 = num1.add(); 
		int r2 = num1.sub();
		int r3 = num1.mul();
		double r4 = num1.div();
		System.out.printf("%d+%d=%d\n",num1.n1,num1.n2,r1);
		System.out.printf("%d-%d=%d\n",num1.n1,num1.n2,r2);
		System.out.printf("%d*%d=%d\n",num1.n1,num1.n2,r3);
		System.out.printf("%d/%d=%.2f\n",num1.n1,num1.n2,r4);
		
		// 3. 리턴있음. 매개변수있음 : Cal2  
		// 객체 선언 및 생성
		Cal2 num2 = new Cal2(); 
		num2.n1 = 10; 
		num2.n2 = 3; 
		
		int re1 = num2.add(20, 5);
		int re2 = num2.sub(20, 5);
		int re3 = num2.mul(20, 5);
		double re4 = num2.div(20, 5);
		System.out.printf("%d+%d=%d\n",20,5,re1);
		System.out.printf("%d-%d=%d\n",20,5,re2);
		System.out.printf("%d*%d=%d\n",20,5,re3);
		System.out.printf("%d/%d=%.2f\n",20,5,re4);
		
		
		
		
	}

}

package j0624;
public class C0624_02 {
	public static void main(String[] args) {
		/* Wrapper class : 8개 기본형을 객체로 포장해주는 클래스 
		   각각타입에 해당하는 데이터를 인수로 전달받아 객체로 만들어준다.
		   래퍼클래스의 인스턴스로 변환하는 과정: boxing (박싱)
		   래퍼클래스의 인스턴스를 기본 타입으로 꺼내는 과정 : unboxing(언박싱)
		   자동화된 박싱, 언박싱을 오토박싱 오토언박싱이라고함
		*/
		Integer num = new Integer(17);  // 박싱
		int n= num.intValue(); // 언박싱 
		System.out.println(num+" : "+ n);
		
		Character ch = 'X';  // 오토박싱
		// Character ch = new Character('X');
		char c = ch;        // 오토언박싱
		// char c = ch.charValue(); 
		System.out.println(ch + " : "+ c);
		Integer num1 = new Integer(7); // 박싱 
		Integer num2 = new Integer(3); // 박싱
		int int1 = num1.intValue(); // 언박싱 
		//           기본타입명+Value(); 
		int int2 = num2.intValue(); // 언박싱
		// 연산은 내부적으로 래퍼클래스인 피연산자를 오토언박싱해서 기본타입끼리 연산수행
		Integer result1 = num1+num2 ; 
		System.out.println(result1);
		Integer result2 = int1-int2; 
		System.out.println(result2);
		int result3 = num1+num2;
		System.out.println(result3);
		int result4 = num1+10; 
		System.out.println(result4);
		
		Integer num3 = new Integer(10);
		Integer num4 = new Integer(20);
		Integer num5 = new Integer(10);
		// 비교연산은 오토언박싱을 통해서 가능함. 
		System.out.println( num3 < num4 );  // true
		System.out.println( num3 == num5 ); // false
		System.out.println( num3.equals(num5) ); // true
		int int3 = num3.intValue();
		int int4 = num4.intValue();
		int int5 = num5.intValue();
		System.out.println( int3 < int4 );  // true
		System.out.println( int3 == int5 ); // true
		
		String str = "333"; 
		Integer in1 = Integer.parseInt(str);
		int n1 = Integer.parseInt(str);
		System.out.println(str+100);
		System.out.println(in1+100);
		System.out.println(n1+100);
		
		String s2 = "11.1";
		Double dn1 = Double.parseDouble(s2);
		double d1 =  Double.parseDouble(s2);
		System.out.println(s2+100);
		System.out.println(dn1+100);
		System.out.println(d1+100);
		
	}

}

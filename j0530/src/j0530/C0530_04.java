package j0530;

import java.util.Arrays;

public class C0530_04 {

	public static void main(String[] args) {
		// String : 자바가 제공하는 클래스 중 문자열을 저장하는 클래스 String 
		// String 참조변수명 = new String("문자열") 
		String str = new String("안녕하세요");
		String str1 = "Good Morning"; 
		// 자주 사용하는 클래스. 다른클래스와는 다른 특징을 가지고있다
		// 1. 한번 정의된 문자열은 변경할 수 없다. 
		// 2. 문자열 리터럴을 바로 입력해서 객체를 생성할때 문자열끼리 공유(메모리 효율성)
		String s1 = "안녕";
		String s2 = "안녕";
		String s3 = new String("안녕");
		System.out.println( s1 == s2 ); // 같은 문자열끼리 공유하므로 true; 
		System.out.println(s1==s3); // 주소가 서로 다르므로 false 
		String s4 = new String("hello");
		String s5 = s4; 
		s4 = "bye"; 
		System.out.println(s4);
		System.out.println(s5);
		String s6 = "bye"; 
		System.out.println(s4 == s6 );
		String s7 = new String("bye");
		String s8 = new String("bye");
		String s9 = new String("bye");
		System.out.println(s4 == s7 );
		System.out.println(s7 == s8 );
		
		
		// String + 연산을 할수 있음
		// 1. 문자열 + 문자열 
		String a = "안녕"+"하세요";
		String a1 = "hi";
		String a2 = "hello";
		String a3 = "안녕은 영어로 "+ a1+a2;
		// 2. 문자열 + 기본 자료형   / 기본자료형 + 문자열 
		System.out.println(1+"hi");    //1hi
		System.out.println(1+2+"hi");  // 3hi
		System.out.println("hi"+1);    // hi1
		System.out.println("hi"+1+2);  // hi12
		System.out.println("hi"+(1+2));  // hi3
		    //     0123456       
		String r1 = "안녕 하세요!";
		String r2 = "Good Morning~"; 
		// length() : 문자열의 길이 
		System.out.println(r1.length()); //7 
		System.out.println(r2.length()); //13
		//charAt(index) : 인덱스 위치에서의 문자 
		System.out.println(r1.charAt(3));  // 하 
		System.out.println(r2.charAt(10)); // n
		// indexOf(' ') : 문자열에 포함된 문자 또는 위치를 앞에서부터 검색
		System.out.println(r1.indexOf('하')); // 3
		System.out.println(r2.indexOf('n'));  // 첫번째 n의 위치인 8 리턴
		System.out.println(r2.indexOf('!'));  // 존재하지 않을 시 -1 
		// lastIndexOf(' ') 
		System.out.println(r2.lastIndexOf('n')); // 뒤에서부터 찾는다 10 
		// String.valueof()  문자열로 변환하기 위한 방법 
		String r3 = String.valueOf(false);
		String r4 = String.valueOf(0.1234);
		System.out.println(r3+r4);
		// concat(str) : 문자열과 문자열 연결 + 와 같음 
		String r5 = r1.concat(r2); 
		System.out.println(r5); // 안녕 하세요!Good Morning~
		// toCharArray() 
		char[] arr1 = r1.toCharArray();
		char[] arr2 = r2.toCharArray();
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		String ju = "8304221185600";
		char[] jumin = ju.toCharArray();
		System.out.println(Arrays.toString(jumin));
		
		// equals(str)
		String c1 = "ABC";
		System.out.println(c1.equals("ABC"));  // true
		System.out.println(c1.equals("abc"));  // false
		System.out.println(c1.equals("aBc"));  // false 
		// equalsIgnoreCase(str)
		String c2 = "ABC";
		System.out.println(c2.equalsIgnoreCase("ABC"));  // true
		System.out.println(c2.equalsIgnoreCase("abc"));  // true
		System.out.println(c2.equalsIgnoreCase("aBc"));  // true 
		
		// contains(str)
		// 현재의 문자열에 str이 포함되어있는 지 검사해서 결과를 반환 
		String c3 = "APPLE";
		System.out.println(c3.contains("A"));
		System.out.println(c3.contains("a"));
		System.out.println(c3.contains("k"));
		
		// startWith(str, offset) 시작하는지
		String c4 = "www.naver.com";
		System.out.println(c4.startsWith("www"));      // t
		System.out.println(c4.startsWith("WWW"));      // f
		System.out.println(c4.startsWith("naver"));    // f
		System.out.println(c4.startsWith("naver",4));   // t
		// endwith 끝나는지 
		System.out.println(c4.endsWith("com"));
		// toLowerCase(), toUpperCase() > 모두소문자로, 모두 대문자로 
		String c5 = "Good Morning";
		System.out.println(c5.toUpperCase()); // GOOD MORNING
		System.out.println(c5.toLowerCase()); // good morning
		// trim() 문자열 앞뒤 공백을 업앤 후 반환
		String c6 = "  안   녕  하세요     ";
		System.out.println(c6);
		System.out.println(c6.length());  // 17
		System.out.println(c6.trim());
		System.out.println(c6.trim().length());  // 10 
		// split(str, int) : 현재 문자열을 str로 구분해 배열로 반환. 
		//  숫자가 있으면 구분갯수가 지정됨
		String c7 = "ABC-DEF-GHI";
		String[] arr3 = c7.split("-");
		String[] arr4 = c7.split("-",2);
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
		//substring 문자열 자르기 
		String c8 = "ABCDEFG";
		 //          0123456
		System.out.println(c8.substring(2)); // 2번인덱스부터 끝까지
		System.out.println(c8.substring(2,4)); // 2번인덱스부터 4번전까지
		
		// replace : 현재 문자열에 있는 문자를 다른것으로 변경 
		String c9 = "A+B+C+E";
		System.out.println(c9.replace("+", "-"));
		
		

	}

}

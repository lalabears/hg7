package j0624;
public class C0624_07 {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = new String("홍길동");
		String str3 = new String("홍길동");
		String str4 = "홍길동";
		if(str1==str2) { // 문자열의 주소값을 비교 
			System.out.println(str1+", "+str2+"은 같은 사람입니다");
		}else {
			System.out.println(str1+", "+str2+"은 다른 사람입니다");
		}
		// 홍길동, 홍길동은 다른 사람입니다
		System.out.println("---------------------------------");
		if(str1==str4) { // 문자열의 주소값을 비교 
			System.out.println(str1+", "+str4+"은 같은 사람입니다");
		}else {
			System.out.println(str1+", "+str4+"은 다른 사람입니다");
		}
		// 홍길동, 홍길동은 같은 사람입니다
		System.out.println("---------------------------------");
		if(str1.equals(str2)) { // equals :문자열 내용을 비교해줌 
			System.out.println(str1+", "+str2+"은 같은 사람입니다");
		}else {
			System.out.println(str1+", "+str2+"은 다른 사람입니다");
		}
		// 홍길동, 홍길동은 같은 사람입니다
		System.out.println("---------------------------------");
		Member m1 = new Member(new String("홍길동"));
		Member m2 = new Member("홍길동");
		if( m1  ==  m2 ) {  
			System.out.println(m1+", "+m2+"은 같은 사람입니다");
		}else {
			System.out.println(m1+", "+m2+"은 다른 사람입니다");
		}// j0624.Member@15db9742, j0624.Member@6d06d69c은 다른 사람입니다
		//홍길동, 홍길동은 다른 사람입니다
		System.out.println("---------------------------------");
		if( m1.equals(m2) ) {  
			System.out.println(m1+", "+m2+"은 같은 사람입니다");
		}else {
			System.out.println(m1+", "+m2+"은 다른 사람입니다");
		}// j0624.Member@15db9742, j0624.Member@6d06d69c은 다른 사람입니다
		// 홍길동, 홍길동은 다른 사람입니다
		System.out.println("---------------------------------");
		if( m1.getName().equals(m2.getName()) ) {  
			System.out.println(m1+", "+m2+"은 같은 사람입니다");
		}else {
			System.out.println(m1+", "+m2+"은 다른 사람입니다");
		}// 홍길동, 홍길동은 같은 사람입니다


		
		
		

	}

}

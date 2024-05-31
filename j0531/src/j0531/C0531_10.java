package j0531;
public class C0531_10 {
	public static void main(String[] args) {
		// 배열 선언 - 저장할 공간을 만들어줌 
		int[] hour = new int[3]; 
		int[] minute = new int[3];
		double[] second = new double[3]; 
		// 배열에 데이터 입력 
		hour[0] = 12;
		minute[0] = 12;
		second[0] = 12.55; 
		// 객체선언 - 저장할 공간을 만들어줌 
		String str = new String("안녕하세요");
		Time t1 = new Time(); 
	// 클래스명  변수명 = new 생성자	
		t1.hour = 12; 
		t1.minute = 12; 
		t1.second = 12.55; 
		Time t2 = new Time(); 
		t2.hour = 13; 
		t2.minute = 45; 
		t2.second = 10.12; 
		System.out.println(hour);// 주소값 출력 
		System.out.println(hour[0]); // 12 
		System.out.println( t1 );// j0531.Time@6d06d69c
		System.out.println(t1.hour);
		
		
		// 정리 
		// 변수 선언 후 값 넣기
		int i = 10 ; 
		// 배열 선언 후 값 넣기
		int[] arr = new int[10];
		arr[0] = 10 ; 
		// 객체 선언 후 값 넣기 
		Time time = new Time(); 
		time.hour = 10 ; 
		
		
		
		
		
		
		
		
	}

}

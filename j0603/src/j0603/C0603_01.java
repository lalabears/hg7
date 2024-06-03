package j0603;

public class C0603_01 {

	public static void main(String[] args) {
		/*변수 : 총8가지 기본형 
		논리 - boolean
		문자 - char
		정수 - byte, short, int, long
		실수 - float, double
		=> 기본타입변수는 메모리에 직접값을 저장		*/
		boolean b = true; // true, false
		char c = 'A'; // 한글자 문자, ' ' , 65 
		int n = 21; // 가장 기본 정수형
		long n2 = 10000000000l; // 큰 정수, 접미사 l, L을 붙여야함. 
		float n3 = 3.1234f; //실수. 접미사 f, F
		double n4 = 5.1234; // 실수. 접미사 d,D 생략이 가능함
		System.out.println(n4);
		/* 참조타입 : 기본타입을 제외하고, 배열, 클래스, 인터페이스 등 
		=> 참조타입 변수는 객체의 주소를 저장 
		*/
		String str = "123";
		String str2 = "100";
		// 숫자로 변환
		int num1 = Integer.parseInt(str);
		int num2 = Integer.parseInt(str2);
		System.out.println("문자열의 합: "+ str + str2);
		System.out.println("정수의 합: "+ (num1+num2));
		// 문자열로 변환
		String str3 = ""+num1; // 정수를 문자열로 변환하기 위해서 문자열을 더해줌
		int k = 1; 
		k = k + 1 ; 
		// k+1을 100번 반복해도 1개의 k 라는 메모리 공간에 숫자가 업데이트되어 저장됨
		String s = "1";
		s = s+1; 
		// s+1을 100 번 반복하면 100개의 방이 만들어짐 
		int[] num = {1,2,3,4,5}; 
		System.out.println(num);  // 참조형은 변수에 주소가 저장됨. 
		for(int i = 0 ; i <num.length ; i++ ) {
			System.out.println(i+"번째 방 : "+ num[i]);
		}
		// 단순 for문( for-each)
		int m=0;
		for(int nu: num) {
			System.out.println(m+"번째 방 "+ nu);
			m++;
		}
		//                { a, b }
		int[][] num2d = {{1,2,3,4,5},{6,7,8,9,10}};
		System.out.println(num2d); // 2차원 배열이 있는 주소
		System.out.println(num2d[0]); // 2차원 배열 중 첫번째 배열의 주소
		System.out.println(num2d[1]); // 2차원 배열 중 두번째 배열의 주소
		System.out.println(num2d.length); // 행의길이
		System.out.println(num2d[0].length); // 첫번째 배열의 열의길이
		System.out.println(num2d[1].length); // 두번째 배열의 열의길이 
		for(int i = 0 ; i < num2d.length; i++) {
			for(int j = 0; j<num2d[i].length ; j++ ) {
				System.out.println(i+"번 행의 "+ j +"번째 방 "+ num2d[i][j]);
			}
		}
		
		// 9시 30분 20.0 초 , 10시 10분 11.1초 
		// 1. 변수 사용 
		int h1 = 9;
		int m1 = 30; 
		double s1 =20.0;
		System.out.printf("%2d:%2d:%.2f\n",h1,m1,s1);
		int h2 = 10;
		int m2 = 10; 
		double s2 = 11.1; 
		System.out.printf("%2d:%2d:%.2f\n",h2,m2,s2);
		// 2. 1차원 배열 
		int[] hour = new int[2];
		int[] minute = new int[2];
		double[] second = new double[2];
		hour[0] = 9; minute[0] = 30 ; second[0] = 20.0;
		hour[1] = 10; minute[1] = 10 ; second[1] = 11.1;
		System.out.printf("%2d:%2d:%.2f\n",hour[0],minute[0],second[0]);
		System.out.printf("%2d:%2d:%.2f\n",hour[1],minute[1],second[1]);
		// 3. 2차원 배열 
		int[][] time = { {9,30,20},{10,10,11}};
		double[][] time2 = { {9,30,20.0},{10,10,11.1}};
		System.out.printf("%2d:%2d:%2d\n",time[0][0],time[0][1],time[0][2]);
		System.out.printf("%2d:%2d:%2d\n",time[1][0],time[1][1],time[1][2]);
		System.out.printf("%2.0f:%2.0f:%.2f\n",time2[1][0],time2[1][1],time2[1][2]);
		// 4. 객체 사용. 
		Time t1 = new Time(); 
		t1.hour = 9;  t1.minute = 30;	t1.second = 20.0;
		Time t2 = new Time();
		t2.hour = 10;  t2.minute = 10;  t2.second = 11.1; 
		System.out.printf("%2d:%2d:%.2f\n",t1.hour,t1.minute,t1.second);
		System.out.printf("%2d:%2d:%.2f\n",t2.hour,t2.minute,t2.second);
		// 5. 객체 배열 
		Time[] times = new Time[2];
		times[0] = new Time();  	times[1] = new Time(); 
		times[0].hour = 9; 	times[0].minute = 30; times[0].second = 20.0;
		times[1].hour = 10; times[1].minute = 10; times[1].second = 11.1;
		System.out.printf("%2d:%2d:%.2f\n",times[0].hour ,times[0].minute,times[0].second);
		System.out.printf("%2d:%2d:%.2f\n",times[1].hour ,times[1].minute,times[1].second);
		
		
		
		
	}

}

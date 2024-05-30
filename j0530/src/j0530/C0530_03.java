package j0530;

import java.util.Arrays;

public class C0530_03 {

	public static void main(String[] args) {
		// 비밀번호 만들기 
		// a: 97 ~  z: 122,  A: 65 ~ Z:90,  !:33  ~  /:47    0: 48~
		//       26          26      10       15  
		// 1. 소문자 배열, 대문자 배열, 숫자배열, 특수문자배열 만들기 (4개)
		char[] lowercase = new char[26]; // 소문자 배열 생성
		char[] uppercase = new char[26]; // 대문자배열
		char[] number = new char[10]; // 숫자 
		char[] special = new char[15]; // 특수문자
		// 소문자
		for(int i = 0 ; i <lowercase.length;i++) {
			lowercase[i] = (char)(97+i);
		}
		System.out.println(Arrays.toString(lowercase));
		// 대문자
		for(int i = 0 ; i <uppercase.length;i++) {
			uppercase[i] = (char)(65+i);
		}
		System.out.println(Arrays.toString(uppercase));
		// 숫자
		for(int i = 0 ; i <number.length;i++) {
			number[i] = (char)(48+i);
		}
		System.out.println(Arrays.toString(number));
		// 특수문자
		for(int i = 0 ; i <special.length;i++) {
			special[i] = (char)(33+i);
		}
		System.out.println(Arrays.toString(special));
		// 2. 위의 배열들을 랜덤하게 섞기 
		// 소문자 섞기 
		char temp ; 
		int n ; 
		for (int i = 0 ; i < 500 ; i ++) {
			n = (int)(Math.random()*lowercase.length); // 0-25 사이의 인덱스를 랜덤하게 생성
			temp = lowercase[0];
			lowercase[0] = lowercase[n];
			lowercase[n] = temp;
		}
		System.out.println(Arrays.toString(lowercase));
		// 대문자 
		for (int i = 0 ; i < 500 ; i ++) {
			n = (int)(Math.random()*uppercase.length); // 0-25 사이의 인덱스를 랜덤하게 생성
			temp = uppercase[0];
			uppercase[0] = uppercase[n];
			uppercase[n] = temp;
		}
		System.out.println(Arrays.toString(uppercase));
		// 숫자 
		for (int i = 0 ; i < 500 ; i ++) {
			n = (int)(Math.random()*number.length); // 0-25 사이의 인덱스를 랜덤하게 생성
			temp = number[0];
			number[0] = number[n];
			number[n] = temp;
		}
		System.out.println(Arrays.toString(number));
		// 특수문자 
		for (int i = 0 ; i < 500 ; i ++) {
			n = (int)(Math.random()*special.length); 
			temp = special[0];
			special[0] = special[n];
			special[n] = temp;
		}
		System.out.println(Arrays.toString(special));
		// 3. 12자리 크기의 char타입의 pwd 배열만들기 
		char[] pwd = new char[12];
		// 4. pwd에 소문자, 대문자, 숫자, 특수문자 배열에서 2~3 사이의 (random())
		//    값을 가져와서 pwd배열에 순차적으로 넣기
		//  ex. pwd={a,b,c,F,K,0,1,!,?,(,,}
		//            3+2+2+3 = 10 칸의 배열을 생성

		int cnt = 0 ; // 몇자리 배열인지 세줄 변수 
	/*	// 1. 소문자
		n = (int)(Math.random()*(3-2+1))+2; // 2-3 숫자 랜덤하게 생성 
		for(int i = 0 ; i < n ; i ++) {
			pwd[i+cnt] = lowercase[i];
		}
		cnt+=n; 
		// 2. 대문자 
		n = (int)(Math.random()*(3-2+1))+2; // 2-3 숫자 랜덤하게 생성 
		for(int i = 0 ; i < n ; i ++) {
			pwd[i+cnt] = uppercase[i];
		}
		cnt+=n; 
		// 3. 숫자 
		n = (int)(Math.random()*(3-2+1))+2; // 2-3 숫자 랜덤하게 생성 
		for(int i = 0 ; i < n ; i ++) {
			pwd[i+cnt] = number[i];
		}
		cnt+=n; 
		// 4. 특수문자 
		n = (int)(Math.random()*(3-2+1))+2; // 2-3 숫자 랜덤하게 생성 
		for(int i = 0 ; i < n ; i ++) {
			pwd[i+cnt] = special[i];
		}
		cnt+=n; 
		
		*/
		int ck = 1; // 소문자1, 대문자2, 숫자3, 특수 4 
		for(int i = 0 ; i < pwd.length ; i ++) {
			n = (int)(Math.random()*(3-2+1))+2;
			for(int j = 0 ; j< n ; j++ ) {
				if(ck==1) pwd[j+cnt] = lowercase[j];
				if(ck==2) pwd[j+cnt] = uppercase[j];
				if(ck==3) pwd[j+cnt] = number[j];
				if(ck==4) pwd[j+cnt] = special[j];
			}
			cnt+=n;
			if(ck==4) break;
			ck++;
		}
		System.out.println(Arrays.toString(pwd));
		System.out.println(cnt);
		// 5. 가져온 숫자만큼의 배열을 새롭게 만들어서 pw ={a,b,c,F,K,0,1,!,?,(}
		char[] pw = new char[cnt]; 
		for(int i = 0 ; i < pw.length; i++) {
			pw[i] = pwd[i];
		}
		// 6. 랜덤하게 섞어서 출력하기. 
		for(int i = 0 ; i< 500 ; i++) {
			n = (int)(Math.random()*pw.length); 
			temp = pw[0];
			pw[0] = pw[n];
			pw[n] = temp;
		}
		System.out.println(Arrays.toString(pw));
		String str = "";
		for(int i = 0 ; i < pw.length; i++) {
			str+= pw[i];
		}
		System.out.println(str);
		
	}

}

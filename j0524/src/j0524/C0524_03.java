package j0524;

public class C0524_03 {

	public static void main(String[] args) {
		// Math.round():반올림  Math.ceil():올림  Math.floor():버림 
		double n = 178.74;
		System.out.println(Math.round(n)); // 179
		System.out.println(Math.ceil(n));  // 179.0
		System.out.println(Math.floor(n)); // 178.0
		
		int num = 1556; 
		System.out.println("기존값 : " + num +" > " + Math.round(num));
		System.out.println("일의 자리에서 반올림: " + 
					(int)(Math.round(num/10.0) * 10 ) );
		System.out.println("십의 자리에서 반올림: " + 
				(int)(Math.round(num/100.0) * 100 ) );
		System.out.println("백의 자리에서 반올림: " + 
				(int)(Math.round(num/1000.0) * 1000 ) );
		System.out.println("천의 자리에서 반올림: " + 
				(int)(Math.round(num/10000.0) * 10000 ) );
		
		double pie = 3.14159265;
		System.out.println("기존값 : " + pie +" > " + Math.round(pie));
		// 소수 첫째까지 반올림 출력 : 3.1
		System.out.println("소수점 첫째자리까지 반올림 " +
				        Math.round(pie*10)  /10.0	);
		// 소수 둘째까지 반올림 출력 : 3.14
		System.out.println("소수점 둘째자리까지 반올림 " +
		        Math.round(pie*100)  / 100.0	);
		// 소수 셋째까지 반올림 출력 : 3.142
		System.out.println("소수점 셋째자리까지 반올림 " +
		        Math.round(pie*1000)  /1000.0	);
		
		// 소수 둘째 자리부터 버림 :3.1
		System.out.println("소수점 둘째자리부터 버림 " +
		        (int)(pie*10)  / 10.0	);
		// 소수 셋째 자리부터 버림 :3.14
		System.out.println("소수점 세째자리부터 버림 " +
		        (int)(pie*100)  / 100.0	);
		// 소수 넷째 자리부터 버림 :3.145
		System.out.println("소수점 네째자리부터 버림 " +
		        (int)(pie*1000)  / 1000.0	);
		
		// random 
		// 0 <= Math.random() <1 사이의 실수 생성
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		double rand = Math.random();
		System.out.println(rand);
		System.out.println(rand);
		System.out.println(rand);
		System.out.println(rand);
		
		// 1 ~ 10 사이의 랜덤한 숫자를 생성 
		// 1 <=(int)Math.random()*10+1 <11 
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		
		// 1- 45 사이의 랜덤한 숫자를 생성하는 변수를 선언하고 출력해보세요
		int rand45 = (int)(Math.random()*45)+1; 
		System.out.println(rand45);
		// 10 - 20 사이의 랜덤한 숫자를 생성해서 출력해보기 
		int rand10 = (int)(Math.random()*(20-10+1))+10;
		System.out.println(rand10);
		// a: 97 ~  z: 122,  A: 65 ~ Z:90,  !:33  ~  /:47
		// 강력한 비밀번호 만들기 
		// 7자리 비밀번호 
		// 대문자(1)+숫자(1)+영소문자(2)+특수문자(1)+숫자1+영소문자(1)
		// G3ab!5k
		char c1,c2,c3,c4,c5,c6,c7;
		// 랜덤한 영소문자  97 ~  122 사이의 랜덤한 숫자 생성 
		int r1,r2,r3;
		r1 = (int)(Math.random()*(122-97+1))+97;
		r2 = (int)(Math.random()*(122-97+1))+97;
		r3 = (int)(Math.random()*(122-97+1))+97;
		c1 = (char)r1; 
		c2 = (char)r2; 
		c3 = (char)r3; 
		// 랜덤한 영대문자  65 ~ 90
		int r4;
		r4 = (int)(Math.random()*(90-65+1))+65;
		c4 = (char)r4;
		// 랜덤한 숫자 0-9 
		int r5,r6;
		r5 = (int)(Math.random()*10);
		r6 = (int)(Math.random()*10);
		// 랜덤한 특수기호 33  ~ 47
		int r7; 
		r7 = (int)(Math.random()*(47-33+1))+33;
		c7 = (char)r7;
		String strongPW =""+c4+r5+c1+c2+c7+r6+c3;
		System.out.println(strongPW);
		
	}

}

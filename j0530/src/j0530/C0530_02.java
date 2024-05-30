package j0530;

import java.util.Arrays;

public class C0530_02 {

	public static void main(String[] args) {
		// 1. 정수 10개를 저장하는 배열을 만들고. (변수선언)
		int[] number = new int[10]; 
		int sum = 0; // 합계를 저장할 변수
		int rand = 0; // 랜덤숫자를 위한 변수 
		// 2. 1-10 사이의 정수를 랜덤하게 생성해서 저장. 
		for(int i = 0 ; i < number.length ; i++) {
			rand = (int)(Math.random()*10)+1 ;// 1-10 사이의 랜덤한 숫자. 
			number[i] = rand; // 랜덤한숫자를 number배열의 i번째에 저장
		}
		// 3. 배열의 요소를 for문을 사용해서 하나하나 출력해보고. 
		for(int i = 0 ; i < number.length ; i++) {
			System.out.print( number[i] + " ");
		}
		System.out.println(); // 줄바꿈
		// 4. 요소들의 평균을 출력해보세요 
		for(int i = 0 ; i < number.length ; i++) {
			 sum += number[i];
		}
		System.out.println("요소들의 평균은 : "+ sum/(double)number.length);
		
		// scan.next 로 주민등록 번호를 입력받아.
		// char 배열에 저장하고. 
		// 뒤에 6자리는 * 로 표현해서 출력해보세요 
		// 입력 :  8304221185600
		// char 배열에는 {'8','3','0','4', .. } 으로 들어 가 있음. 
		// 출력은 char배열을 사용해서 string으로 출력해주시면됩니다. 
		// 출력 :  8304221******	
		// 1. 변수선언
		String str = "8304221185600";
		//            0123456
		char[] juminId = new char[str.length()]; 
		String newStr="";
		// 2. 배열에 값 넣기 
		for(int i = 0 ; i < juminId.length; i++) {
			juminId[i] = str.charAt(i);  // charAt()함수를 사용한다!
		}
		// 3. newStr에 뒷자리 * 로 넣기
	/*	for(int i = 0 ; i < juminId.length ; i++ ) {
			if(i > 6) {  // i 인덱스가 6보다 클때는 *로 문자열에 넣는다.
				newStr += "*";
			}else { // i가 0~6사이는 주민번호숫자를 가져와 문자열에 넣는다 
				newStr += juminId[i];
			}
		}*/
		
		for(int i = 0 ; i < juminId.length ; i++ ) {
			if(i > 6) {  // i 인덱스가 6보다 클때는 *로 문자열에 넣는다.
				juminId[i] = '*';
			}
		}
		// 4. 출력 
		System.out.println(Arrays.toString(juminId));
		System.out.println(newStr);
		
	}

}

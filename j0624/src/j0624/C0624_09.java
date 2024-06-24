package j0624;
import java.util.*;
public class C0624_09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 주민등록번호를 입력받아서. 
		// "830422-1185600" 입력을 받는다면 
		// "040422-3185600"  
		String ssn = "040422-3185600";  // 둘리주민번호
		//            01234567890123
		// 1. 나이를 출력      2024-1983 / 2024-2004
//		1,2 로시작하면 19시작하는 사람들. 
//		3,4 로시작하면 20
//		substring, parseint
		char ch = ssn.charAt(7); // 1,2,3,4 를 알기위해서. 
		int age = 0; 
		String year="";
		String birth = ssn.substring(0,2); // 83 / 04
		if(ch == '1'|| ch == '2' ) {
			year = "19"+birth; 
			age = 2024 - Integer.parseInt(year);
			//     2024-1983 
		}else {
			year = "20"+birth; 
			age = 2024 - Integer.parseInt(year);
		}
		System.out.println("나이 : "+ age);
		
		
		// 2. 태어난 계절 출력  봄  -> switch()
//		substring
		String s = ssn.substring(2,4); // 월 위치 
		String season="";
		// if(s.equals("12") || s.equals("01"))
		switch(s) {
		case "12": case "01": case "02":
			season="겨울";
			break;
		case "03": case "04": case "05":
			season="봄";
			break;
		case "06": case "07": case "08":
			season="여름";
			break;
		case "09": case "10": case "11":
			season="가을";
			break;
		}
		System.out.println("태어난 계절 : "+season);
		
	}

}

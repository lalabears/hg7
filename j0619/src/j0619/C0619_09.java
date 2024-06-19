package j0619;
import java.util.Date; // 날짜 클래스 
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class C0619_09 {
	public static void main(String[] args) {
		// Date클래스를 사용하면 날짜에 관한 간단한 처리를 할 수 있음. 
		// Date클래스는 대부분의 메서드가 사용되지 않고잇음 (너무 오래됨)
		Date today = new Date();
		System.out.println(today);
	//	Wed Jun 19 16:56:32 KST 2024
		// {"Jan", "Feb"..}
		// 월 => 0 부터시작함     7월
		Date d1 = new Date(2024,6,19);
		System.out.println(d1);
		
		// 기본 출력 : Wed Jun 19 17:02:15 KST 2024
		// 날짜 출력을 원하는 포멧대로 해준다 - 날짜의 형식화 
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4, sdf5;
		sdf1 = new SimpleDateFormat("yy년 MM월 d일, E요일");
		System.out.println(sdf1.format(today));
		sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf2.format(today)); // 2024-06-19
		sdf3 = new SimpleDateFormat("zzzz - a h : mm ");
		System.out.println(sdf3.format(today)); // 한국 표준시 - 오후 5 : 05 
		sdf4 = new SimpleDateFormat("H:mm:s");
		System.out.println(sdf4.format(today)); // 17:07:5
		sdf5 = new SimpleDateFormat("G yyyy년 MMM dd일 E요일 HH:mm:ss Z ");
//		서기 2024년 6월 19일 수요일 17:09:07 +0900 
		System.out.println(sdf5.format(today));
		SimpleDateFormat sdf6, sdf7, sdf8, sdf9, sdf10;
		sdf6 = new SimpleDateFormat("오늘은 올해 D번째 날입니다");
		System.out.println(sdf6.format(today));
		sdf7 = new SimpleDateFormat("오늘은 이달의 d번째 날입니다");
		System.out.println(sdf7.format(today));
		sdf8 = new SimpleDateFormat("오늘은 올해 w번째 주입니다");
		System.out.println(sdf8.format(today));
		sdf9 = new SimpleDateFormat("오늘은 이달의 W번째 주입니다");
		System.out.println(sdf9.format(today));
		sdf10 = new SimpleDateFormat("오늘은 이달의 F번째 E요일 입니다");
		System.out.println(sdf10.format(today));
		
		DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		Date d = null;
		try {
			d = df.parse("2024년 12월 25일"); // d:날짜객체
			// 문자열을 날짜형식으로 만들어줘 
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String str = df2.format(d);
		System.out.println(str);
		
		//Date ddd = df.parse("2024년 12월 25일");
		
		
	}

}

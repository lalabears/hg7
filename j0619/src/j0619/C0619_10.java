package j0619;
import java.util.*;
public class C0619_10 {
	public static void main(String[] args) {
		// java.util.Date - 날짜와 시간을 다룰 목적으로 만들어짐
		//                  거의 더이상 사용되지는 않지만 쓰이긴함 
		// java.util.Calendar - Date를 개선한 클래스. 많이 사용하고있음 
		// Calendar cal = new Calendar(); // 은 사용할 수 없음. 
		// 캘린더는 추상클래스 
		
		Calendar cal = Calendar.getInstance(); 
		int year = cal.get(Calendar.YEAR);
		System.out.println(year+"년");
		// 월은 0부터 시작함 1월 : 0 , 2월 : 1 ... 
		int month = cal.get(Calendar.MONTH)+1;
		System.out.println(month+"월");
		System.out.println("올해의 몇번째 주 "+ cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println(cal.get(Calendar.DATE)+"일");
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)+"요일");
		// 1: 일요일 2:월요일 3: 화요일 4:수요일 .. 7 : 토요일 
		// 마직막날을 가져옴 
		int lastday = cal.getActualMaximum(Calendar.DATE);
		System.out.println(lastday); // 30  6월은 30일까지 있음 
		
		final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};
		// 일요일이 1부터 시작하기때문에 배열의 0번째 해당하는 곳은 비움 
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		//        2024/6/15일로 설정함. 
		date1.set(2024, 5, 15); // 월은 0부터 시작하기때문에 5는 6월을 의미한다. 
		// date1을 오늘날짜로 설정하는 방법 
		//set()을 사용하면된다. 
		// date1.set(Calendar.YEAR, Calendar.MONTH, Calendar.DATE);
		System.out.println("date1 : "+ toString(date1) 
					+ DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+"요일");		
//		date1 : 2024년6월19일수요일
		System.out.println("date2 : "+ toString(date2) 
		+ DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+"요일");		
//		date2 : 2024년6월19일수요일
		
		// 오늘날짜의 밀리세컨드를 구한다. 
		System.out.println(new Date(date1.getTimeInMillis()));
		System.out.println(new Date(date2.getTimeInMillis()));
		
		// 두날짜간의 차이를 얻으려면 천분의 일초단위로 변환해야함. 
		long diff = date2.getTimeInMillis() - date1.getTimeInMillis();
		System.out.println(diff);
		// 345600000 로표현이 된다. 
		// 일로 계산하려면 
		System.out.println(diff/(24*60*60*1000)+"일");

	}
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년"
					+(date.get(Calendar.MONTH)+1)+"월"
					+ date.get(Calendar.DATE)+"일";
	}

}

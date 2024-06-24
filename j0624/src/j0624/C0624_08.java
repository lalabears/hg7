package j0624;

import java.util.Scanner;

public class C0624_08 {
	public static void main(String[] args) {
		//          97 98 99 ... 
		String str="abcdefghijk";
		//          012345
		// charAt()
		System.out.println(str.charAt(5));  // f 
		// fghi 를 charAt을 사용해서 출력해보세요 
		char ch = str.charAt(0); 
		// System.out.println(str.charAt(5)+str.charAt(6)+str.charAt(7)+str.charAt(8));  
		System.out.println(""+str.charAt(5)+str.charAt(6)+str.charAt(7)+str.charAt(8));  
		// subString()
		System.out.println(str.substring(5,9)); //fghi
		System.out.println(str.substring(5)); //fghijk
		
		String stuno = "com202411001";
		// com : 컴퓨터공학, 2024 : 입학년도, 11: 담당교수, 001: 번호
		// 입학년도를 출력해보세요
		System.out.println(stuno.substring(3,7));
		// 번호를 출력해보세요 
		System.out.println(stuno.substring(9));
		// 20241100 을 출력해보세요 
		System.out.println(stuno.substring(3,11));
		
		// 길이: length()
		System.out.println(str.length());
		System.out.println(stuno.length());
		
		Scanner scan = new Scanner(System.in);
		// 문자열을 입력을 받아서.
		String input = scan.nextLine();
		// 문자열의 길이를 출력해보세요
		System.out.println(input.length());
		// substring과 length를 사용해서 
		// [안녕하세요]를 입력받는다면 안녕하세 까지 출력해보세요 
		System.out.println(input.substring(0,input.length()-1));
		
		String hobbys ="수영,조깅,독서,요리,영화감상,게임,골프,자전거,테니스";
//                      012 345 6789
		System.out.println(hobbys.contains("요리")); // true
		if(hobbys.contains("요리")) {
			System.out.println("취미에 요리가 있습니다");
		}else {
			System.out.println("취미에 요리가 없습니다");
		}
		// split() 문자열에 ","기준으로 쪼개서 배열에 차례대로 넣어줌
		String[] hArr = hobbys.split(",");
		for(int i = 0 ; i < hArr.length; i++) {
			System.out.println(hArr[i]);
		}
		
		
		
		String news ="밤사이 중부 지방에는 강한 비가 내렸습니다.\r\n"
				+ "\r\n"
				+ "지금은 비가 그쳤는데요.\r\n"
				+ "\r\n"
				+ "차츰 또 다른 비구름이 유입돼 이번에는 남부 지방에 강한 비를 뿌리겠습니다.\r\n"
				+ "\r\n"
				+ "예상되는 비의 양은 전북과 경북에 5에서 30mm, 강원 내륙과 충청 그 밖에 남부 지방에 5에서 20mm가량입니다.\r\n"
				+ "\r\n"
				+ "특히 오후부터 저녁 사이에 남부 지방은 시간당 10에서 20mm 안팎의 강한 비가 벼락과 돌풍과 함께 쏟아질 수 있겠습니다.\r\n"
				+ "\r\n"
				+ "대기 상층으로는 6월에 이례적인 황사가 지나고 있는데요.\r\n"
				+ "\r\n"
				+ "오후에 서쪽 지역은 일시적으로 황사의 영향을 받겠습니다.\r\n"
				+ "\r\n"
				+ "수도권과 충남은 미세먼지 농도 나쁨 수준까지 오르는 곳이 있겠고요.\r\n"
				+ "\r\n"
				+ "이동 속도는 빨라서 밤이면 모두 해소되겠습니다.\r\n"
				+ "\r\n"
				+ "오늘 곳곳에 비가 내리면서 비와 황사가 섞여 내릴 수 있기 때문에 조심해주셔야겠습니다.\r\n"
				+ "\r\n"
				+ "현재 기온 보시면 서울이 23.1도, 대구 23.6도로 어제보다 조금 낮고요.\r\n"
				+ "\r\n"
				+ "낮 기온 서울 28도, 대구 31도까지 오르겠습니다.\r\n"
				+ "\r\n"
				+ "모레부터는 정체전선이 다시 북상해 남해안과 제주에 비가 내리기 시작하겠습니다.\r\n"
				+ "\r\n"
				+ "날씨였습니다.";
		
		int idx = news.indexOf('비'); // char => ' '
		System.out.println(idx);  // 15
		
		int idx1 = news.indexOf('비',16);  // 그 위치 이후로 찾기
		System.out.println(idx1);  // 32
		
		int idx3 = news.indexOf('비',33);  // 그 위치 이후로 찾기
		System.out.println(idx3);  // 53
		
		
		int idx2 = news.indexOf("서울");  // String = " "
		System.out.println(idx2);  // 436
		
		// 비 라는 단어가 몇개 포함되어있는지는 어떻게 찾을까요 ?? 
		int result = -1; 
		int count = 0; 
		while(true) {
			result = news.indexOf("황사", result+1);
			//result = news.indexOf('비', result+1);
			//  System.out.println(result);
			if(result == -1) break;
			count++;
		}
		//System.out.println("비의 갯수: "+ count); 
		System.out.println("황사의 갯수: "+ count);  // 3
		
		// 황사는 몇개 있을까요? 출력해보세요 
		
		
		
		
		
		
	}

}

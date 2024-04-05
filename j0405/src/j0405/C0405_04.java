package j0405;

public class C0405_04 {

	public static void main(String[] args) {
		
		// if
		// if - else 
		// if - else if - else
		/*
		if(조건식1) {
			실행문1
		} else if (조건식2) {
			실행문2
		} else if (조건식3){
			실행문3 
		} else {
			실행문4 
		}		
		*/
		// 조건식1이 참이면 실행문1 실행 -> if문 종료 
		// 조건식1이 거짓이고, 조건식2가 참이면 실행문2 실행 -> if문 종료
		// 조건식1이 거짓이고, 조건식2가 거짓이고 조건식3이 참이면 실행문3 실행 -> if 종료 
		// 조건식1, 2, 3이 거짓이면 실행문4 실행후 종료 
		
		String weather ="맑음";
		
		if(weather.equals("비")) {
			System.out.println("비가 오네요, 우산을 챙겨주세요");
		}else if (weather.equals("눈")) {
			System.out.println("눈이 오네요, 빙판길 조심하세요");
		}else {
			System.out.println("날씨가 맑습니다. 선트림을 발라주세요 ");
		}
		
		// 1. 해보세요 
		int num = 0;
		// 변수가 양수면 양수, 0이면 0, 음수면 음수를 출력해보세요 
		if( num > 0 ) {
			System.out.println("양수");
		} else if(num == 0 ) {
			System.out.println("0");
		} else{
			System.out.println("음수");
		}
		
		// 2. 
		int money = 500; 
		// 돈이 만원이상이면 [택시를탄다]
		// 만원미만 이천원이상이면[버스를탄다] 
		// 이천원미만 천원이상이면 [따릉이를 빌린다]
		// 나머지는 [걸어간다] 를 출력해보세요 
		
		if(money >= 10000) {
			System.out.println("택시를 탄다");
		} else if( 2000 <= money  ) {  // && money <10000
			System.out.println("버스를탄다");
		} else if (1000 <= money ) { // && money <2000
			System.out.println("따릉이를 빌린다"); 
		} else {
			System.out.println("걸어간다");
		}
		
		
		
		
		
		
		
	}// main


}// class 

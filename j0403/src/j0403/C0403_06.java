package j0403;

public class C0403_06 {

	public static void main(String[] args) {
		
		// 조건문 
		
		// 조건을 만족할때만 { } 을 수행 => 조건식이 true일때만 실행 
		/*
		  if(조건식) {
		    // 실행문 
		  }		 
		 */
		// 조건식의 연산결과는 true, false 
		// 여러문장을 묶기 위해서 { } 로 블록을 지정해줌 
		// 실행문이 한문장일때는 {}는 생략가능 
		
		int score = 40; 
		if (score >= 60) {
			
			System.out.println("합격"); 
			System.out.println("축하합니다");
			
		}
		
		if (score >= 60) 
			System.out.println("합격"); 
		
		if (score >= 60) 
			System.out.println("합격"); 
			System.out.println("축하합니다"); // 이문장은 블록으로 묶이지 않아서 조건문 밖에 잇다고 인식됨
			
		
		// if - else 
		/*
		 if(조건식){
		   실행문1 
		 }else{
		   실행문2
		 }
		 
		 조건식이 참일때 실행문1을 실행, 조건식이 거짓일때 실행문2를 실행 
		 */
		
		if (score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

		// 실행문이1줄일 경우 {} 생략 가능 
		if (score >= 60) 
			System.out.println("합격");
		else 
			System.out.println("불합격");
		
		
		
		
		
		

	}

}

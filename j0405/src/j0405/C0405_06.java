package j0405;

public class C0405_06 {

	public static void main(String[] args) {
		// 중첩 if : if문 안에 if문 사용 
		
		/*
		if(조건식1) {
			실행문1  : 조건식1을 만족햇을때 실행 
			if(조건식1-1) {
				실행문1-1 : 조건식1을 만족하며, 조건식1-1을 만족했을때 실행 
			}else {
				실행문1-2 : 조건식1을 만족하나, 조건식1-1이 거짓일때 실행 
			}
		}else if (조건식2){
			실행문2 : 조건식1이 거짓, 조건식2가 참일때 실행 
		}else {
			실행문3  : 조건식1, 조건식2가 거짓일때 실행 
		}

        */
		int score = 97; 
		if (score> 90) {
			System.out.println("90보다 큽니다");
			if(score < 95) {
				System.out.println("95보다 작습니다.");
			} else {
				System.out.println("95보다 큽니다. ");
			}// else : if(score < 95)
		} else {
			System.out.println("90보다 작습니다");
		}
		
		
		
		
		
		
	}

}

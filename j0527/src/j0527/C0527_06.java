package j0527;
public class C0527_06 {
	public static void main(String[] args) {
		// 주사위 두개를 던져서 같은수가 나오면 더블! 이라고 출력하고 종료
		// 총몇번의 시도만에 종료가 되었는지 출력하기. 
		int count=0;
		while(true) {
			// 주사위는 1 - 6 사이의 숫자이다. 
			int dice1 = (int)(Math.random()*6)+1 ; 
			int dice2 = (int)(Math.random()*6)+1 ; 
			count++;
			System.out.println(count+" 차 시도 ");
			if(dice1 == dice2){
				System.out.println("정답!!");
				break; 
			}else {
				System.out.println("dice1 : "+dice1);
				System.out.println("dice2 : "+dice2);
			}
			
		}
		System.out.println("총 "+ count +"번 시도했습니다");
	}

}

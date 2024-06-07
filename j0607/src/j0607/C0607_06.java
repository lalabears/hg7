package j0607;
public class C0607_06 {
	public static void main(String[] args) {
		
		int[] myNum= {11, 21, 5, 35, 9, 19};
		int[] myNum1= {1, 21, 5, 35, 9, 19};
		int[] myNum2= {11, 20, 5, 35, 9, 12};
		int[] myNum3= {11, 21, 5, 35, 7, 19};
		
		Lotto lotto106 = new Lotto(); 
		lotto106.generateLotto();
		lotto106.printLotto();
		System.out.println(lotto106.lottoWin(myNum)+"개");
		System.out.println(lotto106.lottoWin(myNum1)+"개");
		System.out.println(lotto106.lottoWin(myNum2)+"개");
		System.out.println(lotto106.lottoWin(myNum3)+"개");

		
		
		int[] num = new int[5];
		// 객체 배열을 생성해서 총 5회에 같은 로또번호를 응모해서 각회당
		// 몇등당첨인지 출력해보세요
		Lotto[] lotto = new Lotto[5];
		for(int i = 0 ; i < lotto.length; i++) {
			lotto[i] = new Lotto(); // 각 배열당 객체생성 
			lotto[i].generateLotto();
			lotto[i].printLotto();
			System.out.println(lotto[i].lottoWin(myNum)+"개");
		}
		
		// 로또 객체 생성 - 제 101 회
		Lotto lotto101 = new Lotto(); 
		lotto101.printLotto(); //[0, 0, 0, 0, 0, 0]
		lotto101.generateLotto();  // 6개의 랜덤한 숫자가 생성
		lotto101.printLotto(); // [12, 6, 22, 5, 28, 20]
		int n = lotto101.lottoWin(myNum);
		// n개 당첨됨 
		System.out.println(n);
		int b = lotto101.lottoWinBonus(myNum);
		System.out.println(b);
		
		
		// 로또 6개의 숫자중에서 11은 반드시 들어가는
		// generateLotto 함수를 메서드오버로딩을 사용해서 만들어주세요 
		// generateLotto(11)
		
		
		
		// 몇개가 당첨됬는지 리턴해주는 함수를 만들어보세요 
		// lottoWin(myNum)
		
		
		// 보너스 까지 생각해서 몇등 당첨인지. 
		// 1등 6개.  2등 5개+보너스1 . 3등 5개. 4등 4개. 5등 3개
		
		
		
		
		
		Lotto lotto102 = new Lotto(); 
		lotto102.generateLotto();
		lotto102.printLotto();
		
		Lotto lotto103 = new Lotto(); 
		lotto103.generateLotto();
		lotto103.printLotto();
		
		
		Lotto lotto104 = new Lotto(); 
		lotto104.generateLotto();
		lotto104.printLotto();
		
		Lotto lotto105 = new Lotto(); 
		lotto105.generateLotto();
		lotto105.printLotto();
		// 얘는 로또번호가 있어서 
		// 당첨된 번호도 알려줘야하고
		// 상금 도 알려줘야함
//		lotto101.insertNums(myNum); 
		// 배열을 보내면 몇개 당첨되었는지 상금은 얼마인지 알려줘야함
	//	Lotto lotto102 = new Lotto(); 
	}

}

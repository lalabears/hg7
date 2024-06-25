package j0625;
import java.util.*;
public class Lotto {
// 4 > 5 > 3 > 2 > 6 > 7
	// 2. 1-45 사이의 중복이 없는 랜덤한 숫자 6개 넣기
	void lottoInput(List<Integer> list) {
		// lv : 초기화를해서 사용해야함 
		int cnt = 0; // 6개가 들어갔는지 확인을 위한 변수 
		while(true) {
			// 1 - 45 사이의 랜덤숫자 
			int rand = (int)(Math.random()*45)+1;
			if(!list.contains(rand)) {
				list.add(rand);
				cnt++;
			}
			if(cnt==6) break; // 6개가 됫을때 무한루프끝
		}
	} // lottoInput
	
	// 3. 6개 숫자 넣기 (nextline()으로 한줄로 입력받아서 해보세요)
	void myInput(List<Integer> list) {
		Scanner scan = new Scanner(System.in);
		System.out.println("번호입력");
		String str = scan.nextLine();
		String[] nums = str.split(" ");
		for(int i = 0 ; i < nums.length ; i++) {
			list.add(Integer.parseInt(nums[i]));
		}
	}
	// 4. 로또번호 출력하기 ( for i=0;i<lotto.size() 로출력해보기)
	void lottoPrint(List<Integer> list) {
		for(int i = 0 ; i< list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println(); // 줄바꿈
	}
	// 5. 내번호 출력하기 (간단 for문으로 출력해보세요 )
	void myNumPrint(List<Integer> list) {
		for(Integer i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	List<Integer> lottoWin(List<Integer> lotto, List<Integer> input ){
		// win 이름의 리스트를 생성함. 
		List<Integer> win = new ArrayList<Integer>();
		for(int i = 0 ; i< lotto.size(); i++) {
			for(int j = 0 ; j < input.size(); j++ ) {
				if(lotto.get(i) == input.get(j)) {
					win.add(input.get(j));
					break;
				}
			}
		}
		return win; 
	}
	// 7. 최종결과 출력하기. 당첨개수, 당첨된 번호 
	void lottoResult(List<Integer> list) {
		System.out.println("당첨개수: "+ list.size());
		System.out.print("당첨번호: ");
		if(list.size() == 0) {
			System.out.println("당첨번호가 없습니다......");
		}else {
			lottoPrint(list);
		}
	}
}

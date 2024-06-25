package j0625;
import java.util.*;
public class C0625_05 {
	public static void main(String[] args) {
		// 1. 객체선언 및 변수 생성
		Lotto lo = new Lotto();
		List<Integer> lotto = new ArrayList<Integer>();
		List<Integer> input = new ArrayList<Integer>();
		List<Integer> win;
		// 2. 1-45 사이의 중복이 없는 랜덤한 숫자 6개 넣기
		lo.lottoInput(lotto);
		// 3. 6개 숫자 넣기 (nextline()으로 한줄로 입력받아서 해보세요)
		lo.myInput(input);
		// 4. 로또번호 출력하기 ( for i=0;i<lotto.size() 로출력해보기)
		lo.lottoPrint(lotto);
		// 5. 내번호 출력하기 (간단 for문으로 출력해보세요 )
		lo.lottoPrint(input);
		//	lo.myNumPrint(input);
		// 6. win에 당첨된 번호 넣기 
		win = lo.lottoWin(lotto, input);
		// System.out.println(win);
		// 7. 최종결과 출력하기. 당첨개수, 당첨된 번호 
		lo.lottoResult(win);
		
		
		

	}

}

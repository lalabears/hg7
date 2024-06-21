package j0621;
import java.util.*;
public class C0621_02 {
	public static void main(String[] args) {
		// N, A를 입력받아. 
		// 1-N 사이의 랜덤정수를 
		// A개만큼 중복없이 리스트에 넣는 프로그램을 만들어보세요 
		// 만약 N: 45 A: 3 으로 입력 받으면 : [34,1,19] 리스트만들기
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("랜덤숫자 최대값 입력 : ");
		int n = scan.nextInt();
		System.out.println("갯수 입력 : ");
		int count = scan.nextInt(); 
		int cnt = 0;
		while(true) {
			int randN = (int)(Math.random()*n)+1; // 1-n 랜덤숫자생성
			if(!list.contains(randN)) {
				list.add(randN);
				cnt++;
			}
			if(cnt==count) break;
		}
		System.out.println(list);
        // [2, 15, 16, 12, 9, 13, 14, 4, 11, 6]



	}

}

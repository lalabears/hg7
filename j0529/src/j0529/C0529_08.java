package j0529;

import java.util.Scanner;

public class C0529_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][] words = {
				{"chair","의자"}, 
				{"computer","컴퓨터"},
				{"desk","책상"},
				{"apple","사과"},
				{"cellphone","핸드폰"},
				{"bag","가방"}
		};
		
		// for 문을 사용해서  chair의 뜻은? 이라는 질문을 하면 
		// scanner 로  의자 라고 대답하면 정답, 아니면 오답. 이라고 출력
		// chair ~ bag 까지 다 물어보기 
		
		for(int i = 0 ; i < words.length ; i++ ) {
			System.out.println(words[i][0]+"의 뜻은? ");
			String ans = scan.next(); 
			if(ans.equals(words[i][1])) {
				System.out.println("정답!!");
			}else {
				System.out.println("오답! 정답은: " + words[i][1]);
			}
		}
		

	}

}

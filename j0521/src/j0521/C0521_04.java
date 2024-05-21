package j0521;
import java.util.Scanner;
public class C0521_04 {

	public static void main(String[] args) {
		// next, nextline
		Scanner scan = new Scanner(System.in);
		// next()는 공백을 기준으로 한 단어 또는 한 문자씩 입력을 받는다. 
		// nextLine()은 문자 또는 엔터치기 전까지의 문장 전체를 입력을 받는다
		System.out.println("nextLine() 입력: ");
		String str1 = scan.nextLine();
		System.out.println("str1 : "+str1);

		System.out.println("next() 입력 : ");
		String str2 = scan.next();
		System.out.println("str2 : "+str2);
		// 다 입력하신 분들은 : hello world 를 입력해보세요 
		// hello world를 입력했을때 str1은 문장 전체를 입력받고
		// str2 는 공백 전까지의 hello 를 입력 받는다는 것을 알 수 있다. 
		
		System.out.print("숫자를 입력해주세요 :  ");
		int n = scan.nextInt();
		String t = scan.nextLine(); // enter 입력이 들어가는 공간. 
		System.out.println("문장을 입력해주세요 ");
		String s = scan.nextLine();
		System.out.println("입력한 숫자 : "+ n);
		System.out.println("입력한 문자 : "+ s);
		// 원햇던 입력은 n : 10, s : 문자열 입력하고자 했지만 n을 입력하자마자 바로 출력이된다.
		// nextLine()은 한줄 단위로 입력을 받기 때문에 \n을 포함한다. 
		// nextInt()에서 10을 입력하고 엔터를 치면 버퍼에 10\n이 저장이된다. 
		// nextInt()에서 버퍼에서 내용을 가져올때 10만 가져오고 \n은 무시함.
		// 버퍼에 여전히 \n이 남아 있기 때문에 nextLine()을 가져오면 버퍼에 있는 \n이 
		// String s 에 들어감. 
		// 해결 방법 :
		// 1. nextLine() 대신에 next()를 사용한다. 
		// 2. nextInt()와 nextLine()사이에 nextLine()을 한개 더 넣어줌. 
		
		
		
		
		

	}

}

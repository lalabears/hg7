package j0520;
import java.util.*;
public class C0520_09 {
	public static void main(String[] args) {
		// 스캐너 사용해보기 
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력해주세요 : ");
		String name = scan.nextLine();
		System.out.printf("당신의 이름은 %s 입니다. \n", name);
		// 문자열로 나이를 입력받아 당신의 나이는 28세입니다 를 출력해보세요 
		System.out.println("나이를 입력해주세요 : ");
		String age = scan.nextLine(); // nextline 은 문자열 
		int ageNum = Integer.parseInt(age); // 입력받은 문자열을 숫자로 변환
		System.out.println("당신의 나이는 "+ age +"세입니다");
		System.out.printf("당신의 이름은 %s 세입니다. \n", age);
		System.out.printf("당신의 이름은 %d 세입니다. \n", ageNum);

		// 문자열로 취미를 입력받아 당신의 취미는 골프입니다  를 출력해보세요 
		System.out.println("취미를 입력해주세요 >> ");
		String hobby = scan.nextLine();
		System.out.println("당신의 취미는 "+hobby +"입니다");
	}

}

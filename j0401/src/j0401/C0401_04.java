package j0401;
import java.util.Scanner;
public class C0401_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요>>");
		int n1 = scan.nextInt();
		System.out.print("두번째 숫자를 입력하세요>>");
		int n2 = scan.nextInt();
		
		System.out.println("첫번째로 입력한 숫자는 : " + n1);
		System.out.println("두번째로 입력한 숫자는 : " + n2);
		
		System.out.print("세번째 숫자를 입력하세요>>");
		double n3 = scan.nextDouble();
		System.out.println("세번째로 입력한 숫자는 : " + n3);

		scan.nextLine(); // 문장입력 
		
		
	}

}

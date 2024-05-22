package j0522;
import java.util.Scanner;
public class C0522_01 {

	public static void main(String[] args) {
		// 입력과 출력 
		System.out.println("줄바꿈이 있는 출력"+"문자열을 이어줄 수 있음");
		System.out.print("줄바꿈이 없는 출력"+ "줄바꿈을 하고싶으면 \n");
		System.out.printf("문자열: %s, 정수: %d, 실수 : %.2f", "abcd", 5, 3.1234);
		// 변수를 넣어서 출력할 수 도 있다. 
		int age = 22;
		String name = "홍길동";
		System.out.println("제 이름은 "+name+"이고, 나이는 "+ age +"살입니다.");
		System.out.printf("제 이름은 %s이고, 나이는 %d 살입니다 \n", name, age);
		
		// 콘솔창에 입력을 하고자한다면 scanner를 사용해야함. 
		Scanner scan = new Scanner(System.in);
		// import java.util.Scanner; 없이는 사용이 불가능함. 
		// next(), nextLine() 문자열 
		// next() - 공백이 입력되기전 글자를 입력받는다. 
		// nextLine() - 엔터를 입력하기 전까지 글자 전체를 입력받는다. 
		// nextInt() : 정수
		// nextDouble() : 실수 
		String str1 , str2 ;
		System.out.println("글자를 입력해주세요 (안녕 하세요)");
		str1 = scan.nextLine();
		System.out.println("글자를 입력해주세요 (안녕 하세요)");
		str2 = scan.next();
		System.out.printf("nextLine으로 입력받은 문장 : %s \n",str1 );
		System.out.printf("next로 입력받은 문장 : %s \n",str2 );
		int n ; 
		System.out.println("숫자를 입력해주세요 (정수)");
		n = scan.nextInt();
		System.out.println("입력하신 정수는 : "+ n);
		double n2; 
		System.out.println("숫자를 입력해주세요 (실수)");
		n2 = scan.nextDouble();
		System.out.println("입력하신 실수는 : "+n2);
		
		// 주의할 점. 
		int n3;
		String str3; 
		System.out.println("숫자를 입력해주세요 ");
		n3 = scan.nextInt();
		scan.nextLine();
		System.out.println("문장을 입력해주세요 ");
		str3 = scan.nextLine();
		System.out.printf("숫자 : %d, 문장: %s \n",n3,str3);
		/*
		nextline()은 한줄단위로 입력을 받기때문에 enter key 누른거 까지 입력을 받음. 
		n3을 입력을하고 enter를 누르면 버퍼에 숫자와\n 까지 저장이 되었다가. 
		nextint가 숫자만 가져와서 버퍼에는 \n만 남아잇는데 
		nextline 이 \n도 글자로 읽어와서 str3에 \n이 저장이되면서 프로그램이 종료  
		해결하기 위해서는 nextline > next 사용
		nextline을 (nextint와 nextline사이에) 사용해줌
		*/
	}

}

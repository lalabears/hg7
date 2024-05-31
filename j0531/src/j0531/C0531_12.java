package j0531;
import java.util.Scanner;
public class C0531_12 {
	public static void main(String[] args) {
		
		// 배열을 선언
		int[] arr ;
		// 배열을 생성
		arr = new int[4];
		for(int i = 0 ; i < arr.length ; i++ ) {
			arr[i] = 10; // 배열의 값을 모두 10으로 초기
		}
		
		
		Scanner scan = new Scanner(System.in);
		// 회원1 : 강백호  아이디 aaa 비밀번호 1111
		// 회원2 : 서태웅  아이디 bbb 비밀번호 2222
		// 회원3 : 채치수  아이디 ccc 비밀번호 3333 
		// 4번째 회원은 스캐너로 입력을 받습니다. 
		//   송태섭   ddd    4444
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		Member m4 = new Member();
		m1.name = "강백호";
		m1.id = "aaa";
		m1.pw = "1111";
		m2.name = "서태웅";
		m2.id = "bbb";
		m2.pw = "2222";
		m3.name = "채치수";
		m3.id = "ccc";
		m3.pw = "3333";
		m1.printId(); // aaa
		m1.resetPw("1234");
		System.out.println("회원의 정보를 입력해주세요 이름 아이디 비밀번호");
		m4.name = scan.next();
		m4.id = scan.next();
		m4.pw = scan.next();
		System.out.println("이름\t아이디\t비밀번호\t");
		System.out.printf("%s\t%s\t%s\n",m1.name,m1.id,m1.pw);
		System.out.printf("%s\t%s\t%s\n",m2.name,m2.id,m2.pw);
		System.out.printf("%s\t%s\t%s\n",m3.name,m3.id,m3.pw);
		System.out.printf("%s\t%s\t%s\n",m4.name,m4.id,m4.pw);
		
		
		
		
		
		
		
		// 강백호  24살 키는 190이고 몸무게는 95키로 로 만들기 
		Person gang = new Person();
		// 클래스명  변수명 = new 생성자; 
		gang.name = "강백호";
		gang.age = 24;
		gang.height = 190; 
		gang.weight= 95; 
		gang.print();
		System.out.println(gang.name+"은 내년에 "+ gang.newYear() +"살");
		// 서태웅  24살 키 188 몸무게는 80키로 로 만들고
		Person seo = new Person();
		seo.name = "서태웅";
		seo.age = 24; 
		seo.height = 188;
		seo.weight = 80;
		seo.print();
		System.out.println(seo.name+"은 내년에 "+ seo.newYear() +"살");

		// 채치수  28살  키 194  몸무게는 120 
		Person chae = new Person();
		chae.name = "채치수";
		chae.age = 28; 
		chae.height = 194; 
		chae.weight = 120; 
		chae.print();
		System.out.println(chae.name+"은 내년에 "+ chae.newYear() +"살");

	}
}

package j0628;
import java.io.*;
import java.util.*;
public class C0628_08 {
	       // 오류에 대한 부분을 호출한 부분에 책임전가 
	public static void main(String[] args)  {
		// try-catch문은 오류부분을 처리를 하겠다는 의미 
		try {
			method1();
			method2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일읽기가 실패하였습니다.. ");
		}
	} // main
	
	static void method1() throws Exception {
		// 파일 쓰기 부분
		Scanner scan = new Scanner(System.in);
		String path = "C:/aaa/3.txt";
		File f = new File("C:/aaa/3.txt");
		FileWriter fw = new FileWriter(f);
		String data =""; // 지역변수는 초기화해서 사용해야한다.
		for(int i = 0 ; i< 5 ; i++) {
			System.out.println((i+1)+"번 학생이름: ");
			data += scan.next() + "\n";
		}
		// data문자열을 파일에쓰기
		fw.write(data);
		fw.close();
		System.out.println("파일쓰기가 완료되었습니다 ");
	}
	static void method2() throws Exception{
		String path = "C:/aaa/3.txt";
		File f = new File("C:/aaa/3.txt");
		// 파일 읽기 부분
		BufferedReader br =  new BufferedReader(new FileReader(f));
		while(true) {
			String line = br.readLine();
			if(line == null ) break; 
			System.out.println(line);
		}
		br.close();
	}

}

package j0628;
import java.io.*;
import java.util.*;
public class C0628_07 {
	public static void main(String[] args) {
		// 파일 쓰기 부분
		Scanner scan = new Scanner(System.in);
		String path = "C:/aaa/3.txt";
		File f = new File("C:/aaa/3.txt");
		FileWriter fw = null;
		try {
			fw = new FileWriter(f);
			String data =""; // 지역변수는 초기화해서 사용해야한다.
			for(int i = 0 ; i< 5 ; i++) {
				System.out.println((i+1)+"번 학생이름: ");
				data += scan.next() + "\n";
			}
			// data문자열을 파일에쓰기
			fw.write(data);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("파일쓰기가 완료되었습니다 ");
		}
		// 파일 읽기 부분
		BufferedReader br = null; 
		//FileReader fr = null;
		//fr = new FileReader(f);
		try {
			br = new BufferedReader(new FileReader(f));
			while(true) {
				String line = br.readLine();
				if(line == null ) break; 
				System.out.println(line);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}	finally {
			
		}

	}

}

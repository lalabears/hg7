package j0628;
import java.io.*;
public class C0628_06 {
	public static void main(String[] args) {
		String path = "C:/aaa/2.txt";
		File f = new File(path); 
		// 파일에 쓰기 
		FileWriter fw = null; 
		try {
			fw = new FileWriter(f);
			String data ="파일쓰기를 시작하겠습니다\n";
			data += "내용추가도 가능하겠죠? \n";
			for(int i = 1; i<= 10 ; i++) {
				data += i+"번째 줄!! \n";
			}
			fw.write(data);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("파일쓰기가 완료되었습니다");
		}
		//----------------------------------------------// 
		// 파일 읽기
		// 객체선언 
		BufferedReader br = null;  // bufferedreader: 한줄씩 읽어옴
		try {
			// 객체를 생성함. 
			br = new BufferedReader(new FileReader(f)); 
			while(true) {
				String line = br.readLine();
				if(line == null ) break;
				System.out.println(line);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}

package j0627;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class C0627_12 {
	public static void main(String[] args) throws Exception{
	// File 클래스를 통해서 파일시스템이나 폴더를 조작할 수 있다. 
		
		// File(String path) 생성자 사용 
		String filePath = "C:/aaa/1.txt";
		File file = new File(filePath);
		// File(디렉토리주소, 파일명) 생성자 사용 
		String dicPath = "C:/aaa";
		String fileName = "1.txt";
		File file2 = new File(dicPath, fileName);
		
		FileReader fileReader = new FileReader(file); 
		
		// 한문자씩 읽기 
//		int ch=0; 
//		while((ch=fileReader.read()) != -1) {
//			System.out.println((char)ch);
//		}
		
		// 한줄씩 읽기 
//		BufferedReader reader = new BufferedReader(fileReader);
//		String line = "";
//		while( (line = reader.readLine() ) != null   ) {
//			System.out.println(line);
//		}
		
		
		// 버퍼에 읽기 
		int read; 
		char[] buffer = new char[100];
		while( (read= fileReader.read(buffer) ) != -1) {
			String data = new String(buffer, 0, read);
			System.out.println(data);
		}
		
		
		
		fileReader.close();
		
		FileWriter fw = new FileWriter(file2);
		//                             "파일경로"
		fw.write("쓰고싶은글을 적으면 \n");
		fw.write("어떻게 출력이 될까요 ?? \n");
		String str = "";
		for(int i = 0 ; i < 10 ; i++  ) {
			str+= i+"번째 줄입니다 \n";
		}
		fw.write(str);
		Scanner scan = new Scanner(System.in);
		// 스캐너로 0을 입력하기전까지 입력받은 문자열을 메모장에 넣어보세요 
		while(true) {
			System.out.println("문자입력해주세요");
			String s= scan.nextLine();
			if(s.equals("0")) break;
			fw.write(s+"\n");
			
		}
		
		fw.flush();
		fw.close();
		
		// 입력된 메모장을 콘솔에 출력해보기 
		
		FileReader fr = new FileReader(file); 
		BufferedReader br = new BufferedReader(fr);
		String l = "";
		while((l=br.readLine())!=null) {
			System.out.println(l);
		}
		fr.close();

		
	}

}

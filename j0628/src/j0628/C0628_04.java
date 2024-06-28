package j0628;
import java.io.*;
public class C0628_04 {
	public static void main(String[] args) {
		
		String path1 = "C:\\aaa\\1.txt";
		String path2 = "C:/aaa/1.txt";
		try {
			FileInputStream file = new FileInputStream(path2);
			FileReader fr = new FileReader(path1); 
			int data=0;
			// fileInputStream을 이용해서 파일 내용을 읽어 화면에 출력 
			while( (data=file.read()) != -1 ) {
				System.out.println( (char)data );
			}
			System.out.println("------------------");
			file.close(); 
			// fileReader를 이용해서 파일 내용을 읽어 화면에 출력 
			int data2 = 0 ; 
			while(  (data2=fr.read()) != -1  ) {
				System.out.println( (char)data2 );
			}
			fr.close();
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

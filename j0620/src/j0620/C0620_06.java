package j0620;
import java.io.File;  // control + shift + o 
import java.io.FileWriter;
import java.io.IOException;
public class C0620_06 {
	public static void main(String[] args) {
		File dir = new File("C:/bbb");
		dir.mkdirs();
		System.out.println("폴더가 생성되었습니다. ");
		File f = new File("C:/bbb/text.txt");
		
		try {
			f.createNewFile(); // 파일을 생성시키지 못할경우 대비 
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일이 생성되었습니다. ");
		
		FileWriter fw = null;
		String str = ""; 
		try {
			fw = new FileWriter("C:/bbb/text.txt");
			for(int i = 0 ; i < 10 ; i++) {
				str+="글씨를 저장합니다 \n";
			}
			fw.write(str);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("글자가 저장되었습니다 ");
		

	}

}

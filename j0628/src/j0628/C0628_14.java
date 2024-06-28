package j0628;
import java.io.*;
public class C0628_14 {
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\aaa\\product.txt");
		String fileName = f.getName(); // file의 이름을 가져옴
		System.out.println(fileName);
		int pos = fileName.lastIndexOf("."); 
		System.out.println(pos);
		System.out.println("경로를 제외한 파일이름 "+f.getName());
		System.out.println("확장자를 제외한 파일이름 "+ fileName.substring(0,pos));
		System.out.println("확장자 " + fileName.substring(pos+1));
		System.out.println("경로를 포함한 파일이름 "+ f.getPath());
		// C:\aaa\product.txt
		System.out.println("파일의 절대경로 "+ f.getAbsolutePath());
		//파일의 절대경로 C:\aaa\product.txt
		System.out.println("파일의 정규경로 "+ f.getCanonicalPath());
		//파일의 상대경로 C:\aaa\product.txt
		System.out.println("파일이 속해있는 디렉토리 "+ f.getParent());
	    //	파일이 속해있는 디렉토리 C:\aaa
		System.out.println("user.dir: "+System.getProperty("user.dir"));
		// user.dir  C:\workspace\j0628




	}

}

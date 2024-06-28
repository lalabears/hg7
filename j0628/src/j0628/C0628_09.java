package j0628;
import java.io.*;
import java.util.*;
public class C0628_09 {
	public static void main(String[] args) throws Exception{
		List<Member> memList = new ArrayList<Member>();
		String path = "C:/aaa/1.txt";
		File f = new File(path);
		BufferedReader br = new BufferedReader(new FileReader(f));
		while(true) {
			String line = br.readLine();
			if(line==null) break;
			String[] arr = line.split(",");
			memList.add( new Member(arr[0].trim(), arr[1].trim(), arr[2].trim()));
		}
		br.close();
		System.out.println(memList);
		System.out.println("읽기끝");


	}

}

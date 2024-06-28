package j0628;
import java.io.*;
import java.util.*;
public class C0628_10 {
	public static void main(String[] args) {
		List<Product> pList = new ArrayList<Product>();
		String path = "C:/aaa/2.txt";
		File f = new File(path);
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(f));
			while(true) {
				String line = br.readLine();
				if(line==null) break;
				String[] arr = line.split(",");
				pList.add(new Product(arr[0].trim(), Integer.parseInt(arr[1].trim())));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("읽기끝");
		}
		System.out.println(pList);

	}

}

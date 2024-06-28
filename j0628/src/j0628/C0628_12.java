package j0628;
import java.io.*;
import java.util.*;
public class C0628_12 {
	public static void main(String[] args) throws Exception{
		// Product 객체의 리스트생성 
		List<Product> list = new ArrayList<Product>();
		list.add(new Product("생수",1000));
		list.add(new Product("건빵",3000));
		list.add(new Product("초코파이",1000));
		list.add(new Product("우유",1500));
		// 파일에 쓰기 
		String path = "C:/aaa/product.txt";
		File f = new File(path);
		FileWriter fw = new FileWriter(f);
		String data="";
		for(int i = 0 ; i <list.size() ; i++ ) {
			data+= list.get(i).getName() + "," +
				   list.get(i).getPrice()+"\n";
		}
		fw.write(data);
		fw.close();
		System.out.println("완료되었습니다");
		
		
		
	}

}

package j0628;
import java.util.*;
import java.io.*;
public class ProductM {
	Scanner scan = new Scanner(System.in);

	public void pSave(List<Product> list) throws Exception{
		String path = "C:/aaa/p1.txt"; // 저장될 위치 
		File f = new File(path); 
		FileWriter fw = new FileWriter(f);
		String data=""; // 파일에 쓸 문장들을 담는 문자열 
		for(int i = 0 ; i <list.size(); i++ ) {
			data+= list.get(i).getName()+","+
				   list.get(i).getPrice()+"\n";
		}
		fw.write(data);
		fw.close();
		System.out.println("저장이 완료되었습니다");
	}

	
	
	
	
	public Map<String, Object> pRead() {
		Map<String, Object> map = new HashMap<String, Object>();
		String path = "C:/aaa/product.txt";
		File f = new File(path);
		List<Product> list = new ArrayList<Product>();
		BufferedReader br = null; 
		try {
			br = new BufferedReader(new FileReader(f));
			while(true) {
				String line = br.readLine();
				if(line == null ) break;
				String[] arr = line.split(",");
				list.add(new Product(arr[0].trim(),Integer.parseInt(arr[1].trim())));
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
		map.put("list", list);
		System.out.println("파일에서의 입력이 완료되었습니다. ");
		return map;
	}
	
	
	
	
	
	
	
	
	
	public Map<String, Object> pInput(List<Product> list, int count) {
		Map<String, Object> map = new HashMap<String, Object>();
		while(true) {
			System.out.println((count+1)+"번제품 정보를 입력하세요: ");
			String str = scan.nextLine();
			if(str.equals("0")) break;
			String[] strArr = str.split("/");
			list.add(new Product(strArr[0],Integer.parseInt(strArr[1].trim())));
			count++;
		}
		map.put("count",count);
		map.put("list", list);
		return map;
	}

	public void pPrint(List<Product> list) {
		System.out.println("상품명\t가격");
		for(int i = 0 ; i <list.size() ; i++) {
			System.out.printf("%s\t%,d\n",list.get(i).getName(),
					list.get(i).getPrice());
		}
	}
	public void pSearch(List<Product> list) {
		int flag = 0; 
		System.out.println("검색하실 상품의 이름을 입력해주세요 : ");
		String name = scan.next();
		System.out.println("상품명\t가격");
		for(int i = 0 ; i < list.size() ; i++ ) {
			if( list.get(i).getName().contains(name) ) {
				System.out.printf("%s\t%,d\n",list.get(i).getName(),
						list.get(i).getPrice());
				flag = 1; 
			}
		}
		if(flag==0) System.out.println("검색하신 상품이 없습니다. ");
	}

	public int calTotal(List<Product> list) {
		int sum = 0 ; 
		for(Product p : list ) {
			
			sum += p.getPrice();
			
		}
		return sum;
	}











}

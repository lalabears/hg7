package j0621;
import java.util.*;
public class C0621_03 {
	public static void main(String[] args) {
//		1. 5명의 아이디를 입력받아 리스트에 저장하고 (아이디 길이 다 다르게)
//		2. 가장 길이가 긴 아이디를 출력하세요 
		Scanner scan = new Scanner(System.in);
		List<String> ids = new ArrayList<String>();
		int max=0;  // 가장 긴 아이디의 길이 저장  
		// 1. 입력받는쪽.
		for(int i = 0 ; i< 5 ; i ++) {
			System.out.println("아이디를 입력해주세요 ");
			String id = scan.next();
			ids.add(id);
			// 2. 각아이디의 길이에서 최대길이를 찾아야함.
			if(max < id.length() ) 	max = id.length();
		}	
		// 3. 그 길이의 아이디를 출력 
		for(int i = 0 ; i< ids.size(); i ++) {
			if(max == ids.get(i).length()) System.out.println(ids.get(i));
		}

	}

}

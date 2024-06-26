package j0626;
import java.util.*;
public class C0626_05 {
	public static void main(String[] args) {
		String str1 = "https://semiconductor.samsung.com/kr";
		String str2 = "https://semiconductor.samsung.com/kr/dram/ddr.jsp";
		String str3 = "https://semiconductor.samsung.com/kr/foundry/process-technology.jsp";
		String test = "abcdefghijklmn";
		String lotto = "1조198756";
		// substring 
		String r1 = lotto.substring(2); // 2번방부터 끝까지 
		System.out.println(r1);
		String r2 = test.substring(3,6);  // 3번부터 6번앞까지
		System.out.println(r2);   // 3, 4, 5 
		// indexof
		int r3 = lotto.indexOf("조1"); // 조의 위치 리턴
		System.out.println(r3);
		int r4 = str1.indexOf("t"); // 가장 먼저 나오는 t의 위치
		System.out.println(r4);
			
		// str2에서 dram-jsp까지 출력해보세요  
		// indexof+substring만 사용
		int n1 = str2.indexOf("/d");
		int n2 = str2.indexOf("jsp");
		String r5 = str2.substring(n1+1,n2+3);
		System.out.println(r5);  // dram/ddr.jsp
		
		// str3에서  foundry/ 출력 
		int n3 = str3.indexOf("/f");
		int n4 = str3.indexOf("/p");
		String r6 = str3.substring(n3+1, n4+1);
		System.out.println(r6);
		
		// str1을 사용해서 str2의  /dram/ddr.jsp 가져오기
		// str1의 길이 +  st2의 substring 끝까지
		String r7 = str2.substring(str1.length());
		System.out.println(r7);
		// /dram/ddr.jsp
		
		// str1을 사용해서 str3의 밑에부분 가져오기 
		// foundry/process-technology.jsp
		String r8 = str3.substring(str1.length()+1);
		System.out.println(r8);
		
		String u1 = "https://gsds.kaist.ac.kr/";
		String u2 = "https://gsds.kaist.ac.kr/about";
		String u3 = "https://gsds.kaist.ac.kr/education";
		String u4 = "https://gsds.kaist.ac.kr/admission";
		String u5 = "https://gsds.kaist.ac.kr/people";
		String u6 = "https://gsds.kaist.ac.kr/news";
		
	//	System.out.println(u2.substring(u1.length()));
		// 리스트를 만들어서 리스트에
		List<String> list = new ArrayList<String>();
		list.add(u2.substring(u1.length()));
		list.add(u3.substring(u1.length()));
		list.add(u4.substring(u1.length()));
		list.add(u5.substring(u1.length()));
		list.add(u6.substring(u1.length()));
	//	[about,education,admission,people,news]
		
		Iterator us = list.iterator();
		while(us.hasNext()) {
			System.out.println(us.next());
		}
		Scanner scan = new Scanner(System.in);
		String names = "홍길동 홍길순 홍길자 이순신 강감찬 유관순 김구 김유신";
		String input= "";//scan.next();
		// 이름을 입력받아서 학생이름이 있으면 있음. 없으면 없음 이라고 출력해보세요 
		
		if(names.contains(input)) {
			System.out.println("있음");
		}else {
			System.out.println("없음");
		}		
		List<String> strs = new ArrayList<String>();
		strs.add(str1);	strs.add(str2);	strs.add(str3);	strs.add(test);
		strs.add(lotto);strs.add(u1);strs.add(u2);strs.add(u3);	
		strs.add(u4);strs.add(u5);	strs.add(u6); strs.add(names);		
		// url이면 url 아니면 아님을 출력해보세요 
		for(String s: strs) {
			//if(s.startsWith("https://")) {
			if(s.contains("https://")) {
				System.out.println("url : "+s);
			}else {
				System.out.println("url 아님 : "+s);
			}
		}
		for(int i = 0 ; i < list.size() ; i ++) {
			if(list.get(i).contains("https://")) {
				System.out.println("url : "+list.get(i));
			}else {
				System.out.println("url 아님 : "+list.get(i));
			}
		}
		System.out.println("---------------------");
		// list jsp로끝나는 게 있다면 그 주소를 출력해주세요
		for(String s: strs) {
			if(s.endsWith(".jsp")) {
				System.out.println(s);
			}
		}
		
		

	}

}

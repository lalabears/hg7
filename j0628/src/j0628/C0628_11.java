package j0628;
import java.io.*;
import java.util.*;
public class C0628_11 {
	public static void main(String[] args) throws Exception{
		// member 객체의 리스트생성 
		List<Member> list = new ArrayList<Member>();
		list.add(new Member("홍길동","aaa","1111"));
		list.add(new Member("강백호","bbb","2222"));
		list.add(new Member("유관순","ccc","3333"));
		list.add(new Member("이순신","ddd","4444"));
		list.add(new Member("서태웅","eee","5555"));	
		// 파일에 쓰기 
		String path = "C:/aaa/mem.txt";
		File f = new File(path);
		FileWriter fw = new FileWriter(f);
		String data="";
		for(int i = 0 ; i <list.size() ; i++ ) {
			data+= list.get(i).getName() + "," +
				   list.get(i).getId()+","+
				   list.get(i).getPw()+"\n";
		}
		fw.write(data);
		fw.close();
		System.out.println("완료되었습니다");
		
		
		
	}

}

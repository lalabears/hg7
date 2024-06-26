package j0626;
import java.util.*;
public class C0626_01 {
	public static void main(String[] args) {
		// 객체선언 및 생성
		Book b1 = new Book("Java",10000); 
		System.out.println(b1);
		Book n1 = new Novel("해리포터1", 15000, "판타지" );
		// Novel n1 = new Novel("해리포터1", 15000, "판타지" );
		System.out.println(n1);
		Book c1 = new Comics("슬램덩크",8000,1);
		//Comics c1 = new Comics("슬램덩크",8000,1);
		System.out.println(c1);
		System.out.println("------------------------------------");
		// 부모타입의 객체 배열이라면 자손을 담을 수 있다 
		Book[]  bs = new Book[4];
		bs[0] = b1;
		bs[1] = n1;
		bs[2] = c1;
		// bs[3] = new Book("CSS",20000);
		for(int i = 0 ; i<bs.length;i++) {
			System.out.println(bs[i]);
		}
		System.out.println("------------------------------------");
		List<Book> list = new ArrayList<Book>();
		list.add(b1);
		list.add(n1);
		list.add(c1);
		list.add( new Book("CSS",20000) );
		list.add( new Novel("김약국집딸들", 15000, "소설" ) );
		list.add( new Comics("원피스",5000,13) );
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("------------------------------------");
		// 리스트에서 책의 제목만 출력해보기 
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i).getTitle());
		}
		// 책의 가격 출력해보기 
		int total = 0 ;
		for(int i = 0; i<list.size(); i++) {
			total += list.get(i).getPrice();
		}
		System.out.println("책의 총 가격 : "+ total);
		// 책의 총 가격 : 73000
	
		
		
		
	}

}

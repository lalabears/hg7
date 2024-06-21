package j0621;
import java.util.*;
public class C0621_13 {
	// 클래스변수 . 전역변수 
	static Scanner scan = new Scanner(System.in);
	static HashMap<Integer, Mem> map = new HashMap<Integer, Mem>();
	public static void main(String[] args) {
		// Mem(int no, String name, String subject, int score)
		map.put(1001, new Mem(1001,"홍길동","자바", 90));
		map.put(1002, new Mem(1002,"유관순","자바", 100));
		map.put(1003, new Mem(1003,"강백호","자바", 30));
		map.put(1004, new Mem(1004,"서태웅","자바", 10));
		map.put(1005, new Mem(1005,"채수연","자바", 70));
		// 출력해주는 메서드를 만들어서 
		// 번호\t이름\t과목\t성적  을 출력해보세요 
		printAll();
		// 학번을 입력받아서 학번에 해당하는 친구정보 출력하기 없으면 없다고하기
		System.out.println("검색하고자하는 학생의 학번을 입력해주세요 ");
		int stuno = scan.nextInt();
		Mem m = map.get(stuno);
		if(m!=null) {
			System.out.println("번호\t이름\t과목\t성적");
			System.out.println("-----------------------------------");
			System.out.printf("%d\t%s\t%s\t%d\n",m.getNo(),m.getName(),m.getSubject(),m.getScore());
		} else {
			System.out.println("학생이 존재하지 않습니다.");
		}
		
	}//main
	static void printAll() {
		System.out.println("번호\t이름\t과목\t성적");
		System.out.println("-----------------------------------");
		for(Integer no : map.keySet()) {
			Mem m = map.get(no);
			System.out.printf("%d\t%s\t%s\t%d\n",m.getNo(),m.getName(),m.getSubject(),m.getScore());
		}
		
	}//printall

}

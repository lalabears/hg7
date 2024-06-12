package j0612;

import java.util.Scanner;

public class C0612_02 {
	public static void main(String[] args) {
		// 기본생성자로 객체만듦
		Data d1 = new Data(); 
		// 객체를 생성하면. 
		// n1, n2, sum, sub, mul, div 가 만들어진다. 
		System.out.println(d1.n1);   //1
		System.out.println(d1.n2);   //1
		System.out.println(d1.sum);  //2
		// 매개변수가 있는 생성자로 객체생성
		Data d2 = new Data(100,25); 
		// n1, n2, sum, sub, mul, div 가 만들어진다.
		System.out.println(d2.n1); //100
		System.out.println(d2.n2); // 25
		System.out.println(d2.sum); //125
		
		System.out.println("-------");
		System.out.println(d1.x);  // 101    - cv
		System.out.println(d1.y);  // 5001   - iv
		System.out.println(d2.x);  // 102    - cv
		System.out.println(d2.y);  // 5001   - iv
		System.out.println("-------");
		
		// 객체 배열 
		// 배열에 대한 선언 및 생성
		Data[] d = new Data[5];
		d[0] = d1; // 객체선언된 변수 넣기 
		d[1] = new Data(10,20); // 객체 선언한 것을 넣기 
		d[2] = new Data();
		System.out.println(d[0].n1);  // 1
		System.out.println(d[1].n1);  // 10 
		System.out.println(d[2].n1);  // 1 
		
		// d[3]은 객체를 생성하지 않음. > 오류 
	/*	d[3].n1 =100;
		d[3].n2 = 10;
		System.out.println(d[3].n1);*/
		
		
		Board b1 = new Board();
		// b1.name = "홍길동"; > private 변수이므로 불가능
		// System.out.println(b1.name); > private 변수이므로 불가능
		b1.setName("홍길동"); // setter를 통해서 iv값 변경
		String name = b1.getName(); // getter를 통해서 iv값 호출
		b1.printPost(); // method를 호출해서 변수값 확인 
		
		Board b2 = new Board("1","안녕하세요","24/06/12","홍길동");
		b2.printPost();
		
		Board b3 = new Board();
		String[] sb = b3.save("2","반갑습니다","24/06/12","강백호");
		System.out.println("배열주소"+ sb);
		for(int i = 0; i< sb.length ; i++) {
			System.out.print(sb[i]+"\t");
		}
		Scanner scan = new Scanner(System.in);
		// Board의 객체 배열을 만들어서 5칸. 
		// 5개의 번호, 제목, 날짜, 이름을 입력받아 
		// 객체 배열을 생성해서 출력해보세요 
		String no,ti,da,na; 
		Board[] board = new Board[5]; 
		// int[]num= new int[5];
		System.out.println();
		System.out.println();
		// 생성자 사용 - 객체생성
		for(int i = 0 ; i<board.length ; i ++) {
			System.out.println("번호:");
			no = scan.next();
			System.out.println("제목:");
			ti = scan.next();
			System.out.println("날짜:");
			da = scan.next();
			System.out.println("이름:");
			na = scan.next();
			board[i]= new Board( no, ti, da, na);
		}
		// printPost() 사용 - 출력
		for(int i = 0 ; i<board.length ; i ++) {
			board[i].printPost();
		}

	}

}

package j0603;

import java.util.Scanner;

public class C0603_04 {

	public static void main(String[] args) {
		// 3권의 책 객체를 생성해서 원하시는 값을 넣어보세요. 
		// showprice를 통해 출력도 해보세요
		Book b1 = new Book(); 
		b1.title = "빨강머리앤";
		b1.price = 24000; 
		Book b2 = new Book();
		b2.title = "슬램덩크";
		b2.price = 10000;
		Book b3 = new Book();
		b3.title = "곰돌이푸";
		b3.price = 15000; 
		// 출력 
		b1.showPrice();
		b2.showPrice();
		b3.showPrice();
		
		/*  book 객체 3개의 배열형태로 만들어 사용하기 위해서는 
		    Book[] bk = new Book[3] ;  // 객체 배열선언 및 생성
		    
		    bk에는 객체 3개를 담을 배열의 주소가 할당
		    아직 객체는 만들어 지지 않았기 때문에 객체를 생성해야함. 
		    bk[0] = new Book();  // 실제 객체 생성 
		    bk[1] = new Book();  // 실제 객체 생성 
		    bk[2] = new Book();  // 실제 객체 생성 
		    
		    or
		    
		    Book[] b = { new Book(), new Book(), new Book()}; 
		*/
//		b1.title = "빨강머리앤";		b1.price = 24000; 
//		b2.title = "슬램덩크";		b2.price = 10000;
//		b3.title = "곰돌이푸";		b3.price = 15000; 
        System.out.println("객체배열사용"); 
		// 객체배열 선언 및 생성 
		Book[] bk = new Book[3];
		bk[0] = new Book();
		bk[1] = new Book();
		bk[2] = new Book();
//		for(int i = 0 ; i<bk.length ; i++) {
//			bk[i] = new Book();  // 객체를 생성해줌. 
//		}
		bk[0].title = "빨강머리앤";  bk[0].price = 24000; 
		bk[1].title = "슬램덩크";   bk[1].price = 10000; 
		bk[2].title = "곰돌이푸";   bk[2].price = 15000; 
		for(int i = 0; i< bk.length ; i++ ) {
			bk[i].showPrice();
		}
		System.out.println("입력받아 객체값 넣기 ");
		Scanner scan = new Scanner(System.in);
		Book b4 = new Book(); 
		System.out.println("책의 제목을 입력해주세요 ");
		b4.title = scan.next();
		System.out.println("책의 가격을 입력해주세요 ");
		b4.price = scan.nextInt();
		b4.showPrice();
		// 5칸 객체 배열을 생성해서 5개의 값을 입력받아(총10개)
		// 5개의 책 정보를 출력해보세요 
		int[] number = new int[5];
		String[] strs = new String[3];
		// 객체배열생성및선언
		Book[] dbook = new Book[5]; // 5칸 객체 배열 생성 
		// 객체 생성 및 값 넣기 
		for(int i = 0 ; i <dbook.length ; i++) {
			dbook[i] = new Book();  // 객체생성 
			System.out.println("책의 제목을 입력해주세요 ");
			dbook[i].title = scan.next();
			System.out.println("책의 가격을 입력해주세요 ");
			dbook[i].price = scan.nextInt();
		}
		// 출력 
		for(int i = 0 ; i <dbook.length ; i++) {
			dbook[i].showPrice();
		}
		
		
		

	}

}

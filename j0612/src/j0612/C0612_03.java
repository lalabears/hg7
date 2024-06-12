package j0612;
import java.util.Scanner;
public class C0612_03 {
	static Scanner scan = new Scanner(System.in);
	// 10칸짜리 객체배열을 만들어서 사용하세요 
	static Product[] p = new Product[10];
	static int count; // 기본값 0으로 저장  
	public static void main(String[] args) {
		loop:while(true) {
			System.out.println("== 제품관리메뉴 == ");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 정보 조회");
			System.out.println("0. 프로그램 종료 ");
			int menu = scan.nextInt();
			switch(menu) {
			case 1:
				productInput();
			// 제품명, 제품가격, 제품세금을 입력받아 
				//객체 생성하는 메서드
				break;
			case 2: 
				productPrint();
			// 현재까지 입력된 정보를 출력하는 메서드 
				break;
			case 0:
				break loop; 
			}
		}
	} // main
	// 객체 정보를 입력하는 메서드 
	static void productInput() {
		// 제품명, 제품가격, 제품세금을 입력받아 객체 생성하는 메서드
		System.out.println("제품정보입력을 선택하셨습니다.");
		System.out.println("제품명 : ");
		String name = scan.next();
		System.out.println("제품가격 : ");
		int price = scan.nextInt();
		System.out.println("제품세금 : ");
		double tax = scan.nextDouble();
		p[count] = new Product(name, price, tax);
		count++; 	
	}
	// 출력을 위한 메서드 
	static void productPrint() {
		for(int i =0 ; i < count ; i++) {
			// p[i].printInfo();
			System.out.println(p[i].getpId()+"\t"
					+p[i].getpName() +"\t"
					+p[i].getPrice() +"\t"
					+p[i].getTax());
		}
		
	}
	

}// class


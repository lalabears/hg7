package j0611;
import java.util.Scanner;
public class Method {
	// 1.  1-45 사이랜덤 숫자를 하나 리턴해주는 메서드를 만들어보세요 
	int random() {
		return (int)(Math.random()*45)+1;
	}
	// 2. 숫자 한개를 입력받아(scanner) 그 숫자를 리턴해주는 메서드를 만들어보세요 
	int input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를입력해주세요");
		int n = scan.nextInt();
		return n; 
	}	
	// 3. 1-45 사이 3개의 랜덤숫자를 리턴해주는 메서드를 만들어보세요(중복ok)
	int[] randArr() {
		int[] arr = new int[3];
		for(int i = 0; i< arr.length; i++) {
			arr[i] = (int)(Math.random()*45)+1;
		}
		return arr; 
	}
	Point randClass() {
		Point p = new Point();
		p.x = (int)(Math.random()*45)+1;
		p.y = (int)(Math.random()*45)+1;
	//	p.z = (int)(Math.random()*45)+1;
		return p;
	}
	
	
}

package j0605;

import java.util.Arrays;

public class C0605_09 {

	public static void main(String[] args) {
		// 객체선언 및 생성 
		Rect r = new Rect(); 
		
		r.buildRect(25, 25, 50, 50);
		
		Point p1 = new Point();
		p1.x = 10; p1.y = 10; 
		Point p2 = new Point();
		p2.x = 20; p2.y = 20;
		r.buildRect(p1,p2);
		
		Point p3 = new Point();
		p3.x = 20; 	p3.y = 20;
		r.buildRect(p3, 50,50);
		
		// 대표적인 오버로딩메서드 
		System.out.println(false);
		System.out.println('A');
		System.out.println("");
		System.out.println();
		
	}

}

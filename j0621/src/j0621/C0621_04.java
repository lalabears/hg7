package j0621;
import java.util.*;
public class C0621_04 {
	public static void main(String[] args) {
		// 객체 선언 및 생성
		Point p1 = new Point(1,2);
		Point p2 = new Point(1,3);
		Point p3 = new Point(1,4);
		Point p4 = new Point(1,5);
		// ArrayList<타입> 객체명 = new ArrayList<타입>(초기저장용량) ;

		// 모든 클래스는 Object가 조상 - 다형성에의해서 다 넣을 수 있음 
		ArrayList obj1 = new ArrayList(); 
		ArrayList<Object> obj = new ArrayList<Object>(); 
		// 숫자 
		ArrayList<Number> n = new ArrayList<Number>();
		// 문자열 
		ArrayList<String> strs = new ArrayList<String>();
		// Point 객체만 넣을 수 있는 arrayList
		List<Point> pointList = new ArrayList<>(); // 길이가 고정되지않음 
		Point[] ps = new Point[10]; // 길이가 고정되어있음
		// add로 리스트 추가 
		pointList.add(p1);		pointList.add(p2);
		pointList.add(p3);		pointList.add(p4);
		pointList.add(new Point(0,0));
		System.out.println(pointList);
		// [j0621.Point@15db9742, j0621.Point@6d06d69c, j0621.Point@7852e922, j0621.Point@4e25154f, j0621.Point@70dea4e]

		// 간단 for문 
		for(Point p : pointList) {
			System.out.println(p);
		}
		
		
	}

}

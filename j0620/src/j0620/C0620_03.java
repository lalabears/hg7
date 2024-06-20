package j0620;
public class C0620_03 {
	public static void main(String[] args) {
		
		Shape[] arr = { new Cir(5.0), new Rect(3,4), new Cir(1) }; 
		System.out.println(sumArea(arr));

	}// main
	static double sumArea(Shape[] s) {
		double sum = 0;   // 지역변수 lv는 꼭 초기화해서 사용해야함
		for(int i = 0 ; i < s.length; i++) {
			sum += s[i].calcArea();
		}
		return sum; 
	}

}// class

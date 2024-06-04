package j0604;
public class C0604_09 {
	public static void main(String[] args) {
		int n1 = 10; 	int n2 = 5; 
		//  n1과 n2의 합을 리턴받는 클래스 메서드를 만들어보세요 
		int result = add(n1,n2);
		System.out.println(result); // 15 
		int[] r = {0}; // 1칸 배열을 생성하고 0으로 값 초기화 
		System.out.println(r); // 참조변수 
		System.out.println(r[0]);
		add(n1,n2,r); // 배열을 add메서드의 매개변수로 전달 
		System.out.println(r); // 참조변수 
		System.out.println(r[0]);
	}// main
	static int add(int n1, int n2 ) {
		return n1+n2;
	} //add
	static void add(int n1, int n2, int[] result) {
		System.out.println(result); // 참조변수 
		result[0] = n1+n2; // 매개변수로 넘겨받은 연산결과를 배열에 저장
	} // add

}// class

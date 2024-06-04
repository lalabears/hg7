package j0604;

public class C0604_03 {

	public static void main(String[] args) {
	// Cal3 클래스 사용
		// 클래스 선언과 생성 
		Cal3 num = new Cal3();
		// 객체 인스턴스변수에 값 넣기
		num.n1 = 9;
		num.n2 = 11; 
		// 최대값을 계산하는 함수 호출 
		// 리턴이 있기때문에 반환값을 변수 만들어서 저장
		int numMx = num.max();
		System.out.println(numMx); // 출력
		// 최소값을 계산하는 함수 호출 리턴값없음
		num.min();
		System.out.println(num.minVal); //인스턴스변수 출력
		// 매개변수가 있는 함수 호출 
		// String result = num.oddEven(10); 
		System.out.println(num.oddEven(10));
		

	}

}

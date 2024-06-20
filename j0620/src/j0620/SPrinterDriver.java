package j0620;
// 인터페이스를 구현하기 위해서는 implements 를 사용해야함
public class SPrinterDriver implements Printable{
// 삼성프린터 사용에 필요한 클래스 정의 
	// 인터페이스에있는 추상메서드를 완성시켜야한다. 
	public void print(String doc) {
		System.out.println("삼성프린터 출력입니다");
		System.out.println(doc);
	}
}

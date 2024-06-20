package j0620;
public class LPrinterDriver implements ColorPrintable {
	public void print(String doc) {
		System.out.println("엘지프린터 출력입니다 - 흑백 출력입니다 ");
		System.out.println(doc);
	}
	// 두개의 추상메서드를 구현해야함
	// ColorPrintable이 Printable을 상속받았기때문에 
	public void colorPrint(String doc) {
		System.out.println("엘지프린터 출력입니다 - 컬러 출력입니다.");
		System.out.println(doc);
	}
}

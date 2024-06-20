package j0620;

public interface Printable {
	// 인터페이스는 interface 키워드로 선언함.
	// 메서드는 몸체없이 세미콜론으로 마무리됨. 
	// 이런메서드를 추상메서드라고함. 
	public abstract void print(String doc); // 추상메서드 
}
// 인터페이스는 인터페이스끼리 상속관계에 있을 수 있다. 
interface ColorPrintable extends Printable{
	public abstract void colorPrint(String doc); // 추상메서드 
}
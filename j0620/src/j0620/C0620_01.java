package j0620;
public class C0620_01 {
	public static void main(String[] args) {
		
		// 추상클래스, 인터페이스는 객체생성이 불가능하다 
		String myDoc = "이 보고서는 ..... "; 
		
		// 다형성:
		// Printable 참조변수에 그것을 구현한 객체를 담을 수 잇다
		Printable p = new SPrinterDriver();
		p.print(myDoc);
		System.out.println("-------------");
		// L프린터객체도 담을 수 있다
		// 자신의 참조변수로 자신의 객체를 생성해서 담기 
		LPrinterDriver lp = new LPrinterDriver();
		// 자신이 구현한 인터페이스 참조변수로 객체를 담을 수 있다.  
		ColorPrintable cp = new LPrinterDriver();
		// 자신이 구현한 인터페이스의 조상의 참조변수로 객체를 담을 수 있다 
		Printable p1  = new LPrinterDriver(); 
		
		lp.colorPrint(myDoc);
		lp.print(myDoc);
		
		cp.colorPrint(myDoc);
		cp.print(myDoc);
		
		p1.print(myDoc);  // 기능은 가지고있지만 리모콘이없어서 동작시킬수없음
	

		
	}

}

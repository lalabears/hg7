package j0614;
// 상속: class 자식클래스 extends 부모클래스
public class Americano extends Coffee{
	//iv
	int shot ;
	// 생성자
	public Americano() {
		super(4000); // super() 상위생성자를 호출함.
		shot = 2;
	}
	// 메서드 오버라이딩 : 부모도 같은 메서드를 가지고있음
	public void printInfo() {
		System.out.println(shot+" 샷 아메리카노: "+ price);
	}
	public void addshot() {
		System.out.println("샷추가");
		shot++;
	}

}

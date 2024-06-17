package j0617;

class User{
	//    인터페이스를 매개변수로 받을 수 있다
	public void allLan(Lan l) {
		l.greetings();
	}
	
}


// 추상클래스 (abstract)
public abstract class Country {
	// 추상메서드를 1개이상 포함하는 클래스 
	public abstract void country();
}
// kor는 부모클래스 country에서 상속받고
//       인터페이스 lan을 구현함 
class Kor extends Country implements Lan{
	public void country() {
		System.out.println("대한민국");
	}
	public void greetings() {
		System.out.println("안녕하세요");
	}
}
// Eng
class Eng extends Country implements Lan{
	public void country() {
		System.out.println("미국");
	}
	public void greetings() {
		System.out.println("Hello");
	}
}
// Fren  
class Fren extends Country implements Lan{
	public void country() {
		System.out.println("프랑스");
	}
	public void greetings() {
		System.out.println("Bonjour");
	}
}
// Jap
class Jap extends Country implements Lan{
	public void country() {
		System.out.println("일어");
	}
	public void greetings() {
		System.out.println("..");
	}
}
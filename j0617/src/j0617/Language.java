package j0617;
// 추상클래스 
abstract class Language {
	// iv
	public String country;
	public Language() {} // 기본생성자 
	public Language(String country) {
		this.country = country;
	}
	// 추상메서드
	public abstract void greetings();
	// public abstract void bye();
	public void mom() {
		System.out.println("mother");
	}
} // language-class
class Korean extends Language{
	public Korean() { 
		super("대한민국");
	}
	public void greetings() {
		System.out.println("안녕하세요");
	}
} // korean - class 
class English extends Language{
	public English() {this.country = "미국";}
	public void greetings() {
		System.out.println("Hello");
	}
}   
class French extends Language{
	public French() { super("프랑스"); }
	public void greetings() {
		System.out.println("Bonjour");
	}
}






package j0614;
// 기본패키지 위치에 상속받는 Male클래스
public class Male extends Person{
	// person으로부터 상속을 받았기때문에 부모클래스 멤버들을 모두 가지게됨. 
	public void info() {
		String str ="";
		System.out.println("남자입니다");
//		str = this.name+", "+this.height+", "+this.weight+", "+this.age;
		// 상속을 받았기때문에 부모의 변수를 가질 수 있으나. 
		// private한 변수(age)는 접근할수 없다(다른클래스이기때문에)
		str = this.name+", "+this.height+", "+this.weight;
		// 하지만 같은 패키지내에 존재하기때문에 default, protected는 접근가능함.
		
		printName();   //public
		printHeight(); // protected
		printWeight(); // default
		// private메서드 printAge()는 사용할 수 없음 
	}

}

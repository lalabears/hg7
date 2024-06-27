package j0627;
public class C0627_10 {
	public static void main(String[] args) {
		// 싱글톤 
		/* 싱글톤
		   단 하나의 객체만 만들도록 보장하는 객체를 싱글톤이라고 함. 
		   싱글톤을 만들려면 클래스 외부에서 new 연산자로 생성자를 호출 할 수 없도록해야함
		   생성자 앞을 private로 막아주어야함. 	   
		   public class 클래스명 {
		   		// 필드
		   		// 자신의 타입인 필드를 선언함
		   		private static 클래스 singleton = new 클래스();
		   		// 생성자
		   		private 클래스(){}
		   		// 메서드
		   		static 클래스 getInstance(){ 
		   		    //외부에서 호출 할 수 있는 메서드로 자기객체를 리턴해줌.   
		   			return singleton; 
		   		} 
		   }
		   // 외부에서 객체를 얻는 방법 : getInstance()메서드를 호출함. 
		   클래스 변수1 = 클래스.getInstance(); 
		   클래스 변수2 = 클래스.getInstance(); 
		*/
		// 생성자를 private으로 해두었기 때문에 컴파일에러 
		// Singleton ss = new Singleton(); 
		Singleton ss1 = Singleton.getInstance();
		System.out.println(Singleton.getNum());
		ss1.setNum(20);
		Singleton ss2 = Singleton.getInstance();
		System.out.println(ss2.getNum());
		// 클래스변수 : 클래스명.변수명
		// 인스턴스변수: 참조변수명.변수명
		// 클래스메서드 : 클래스명.메서드명
		// 인스턴스메서드: 참조변수명.변수명 
		if( ss1 == ss2 ) {
			System.out.println("같은 객체입니다");
		}else {
			System.out.println("다른 객체입니다 ");
		}
		System.out.println(ss1);//  j0627.Singleton@15db9742
		System.out.println(ss2);//  j0627.Singleton@15db9742
		ss1.call();
		ss2.call();
		
		
		
		
		
		
		
		

	}

}

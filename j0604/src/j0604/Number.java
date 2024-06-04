package j0604;

public class Number {
	/* 인스턴스변수는 객체가 생성되었을때 생성됨. 
	   클래스 변수는 객체 생성없이 사용할 수 있음 (static)
	   지역변수는 메서드안에 주로 위치하며 메서드가 종료시 사라짐
	*/
	static double pi = 3.14;  // 클래스변수
	// 인스턴스변수 (객체변수)
	int n1;   
	int n2; 
	int addResult; 
	int subResult;
	int mulResult;
    double divResult; 
    // 리턴, 매개변수 없는 메서드 
    void add() {
    	addResult = n1 + n2 ; 
    }
    void sub() {
    	subResult = n1 - n2; 
    }
    void mul() {
    	mulResult = n1 * n2;
    }
    void div() {
    	divResult = n1 / (double)n2; 
    }
    
    
    
	
	
	
	void print() {
		int num = 10;    // 지역변수 
		System.out.println(n1+n2+num);
	}
	
	
	
	
	
	
	
	
	/*
	 메서드 (함수) -   클래스 안에 있음. 
	 작업을 수행하기위한 명령문의 집합 . 
	 어떤 값을 입력받아 처리하고 결과를 돌려줌 (입력값이 없을수 있음. 반환값이 없을 수 잇음)
	 하나의 메서드는 하나의 기능만 수행하도록 만드는 것이 좋다  
	 선언부 :   리턴타입   메서드명  ( 매개변수1, 매개변수2, ... )
	 구현부 :   {
	                선언문
	                수행문
	                return문
	           }
	 메서드의 종료 : 메서드 블럭 { } 끝에 도달했을때 종료 
	              메서드 수행 중 return문을 만났을때 
	              (return : 현재 실행중인 메서드를 종료하고 호출한 메서드로 돌아감)
	 return 값이 없는 경우 리턴값을 void로 사용 
	 반환값이 없는 경우 : return; 
	 반환값이 있는 경우 : return 반환값; 
	 메서드 호출 :  참조변수.메서드명() ;         <= 매개변수 없을때 
	              참조변수.메서드명(값1,값2,..)  <= 매개변수가 있을때
	             리턴타입  변수명 = 참조변수.메서드명()  <= 리턴타입있을때 
	
	*/
	

}

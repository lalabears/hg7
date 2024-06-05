package j0605;

public class Cal2 {
	int num1;
	int num2; 
	int addResult;
	int subResult;
	int mulResult;
	double divResult; 

	// 생성자는 1개라도 존재하면 기본생성자가 만들어지지 않는다.
	// 기본생성자를 사용하고싶으면 꼭 써야함!!!!
	Cal2(){
		this(1,1);
	}
	
	Cal2(int num1, int num2){
		this.num1 = num1; 
		this.num2 = num2; 
		this.addResult = num1 + num2; 
		this.subResult = num1 - num2;
		this.mulResult = num1 * num2; 
		this.divResult = num1 / (double)num2;
	}
	
	
}

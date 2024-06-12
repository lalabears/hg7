package j0612;
public class Data {
	// cv 
	static int cnt = 100; 
	// iv 
	int no = 5000;
	int x, y; 
	// iv 선언
	int n1;	int n2;	int sum; int sub; int mul; int div; 
	
	// 초기화 블럭 
	{
		cnt++; // cv 
		x = cnt;  // cv cnt를 1 증가 후 x값에 넣는다
		no++; // iv
		y = no ;  // iv no를 1 증가 후 y값에 넣는다. 
	}
	
	
	
	
	
	
	// 생성자 
	Data(){  // 기본생성자
		this(1,1);  // this()는 생성자 호출
		// this(1,1)은 매개변수가 2개인 생성자를 호출함. 
	}
	public Data(int n1, int n2){ // 매개변수2개가 있는 생성자 
		// 생성자는 iv를 초기화하는데 사용한다. 
		this.n1 = n1;     // this는 자기자신을 의미함 (this객체)
		this.n2 = n2;
		this.sum = n1 + n2;
		this.sub = n1 - n2;
		this.mul = n1 * n2; 
		this.div = n1 / n2 ;
	}
	

}

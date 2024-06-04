package j0604;

public class Score {
	/*	name, total  라는 인스턴스 변수를 가진 Score 라는 클래스 
		1. printStu() : name은 total점 입니다 라고출력
		2. pass() : 만약 70점이상이면 합격, 이하면 불합격 리턴 
	*/
	String name;
	int js;
	int db; 
	int total; // 평균
	
	void printStu() {
		System.out.println(name+"님 "+total+"점");
	}
	void calTotal() {
		total = (js+db)/2;
	}
	int getTotal() {
		return (js+db)/2;
	}
	String pass() {
		total = getTotal();
		//calTotal();
		// total = js+db;
		if(total>=70)	return "합격";
		else return "불합격";
	}
	
}

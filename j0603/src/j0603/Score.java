package j0603;

public class Score {
	
	// 숫자 세개의 평균이 60점이상이면 "합격" 을 반환 이하면 "불합격" 
    String pass(int n1, int n2, int n3) {
    	double avg = (n1+n2+n3)/3.0; 
    	if(avg >= 60) 	return "합격";
    	else return "불합격"; 
    }
	// 평균을 리턴해주는 avg()
	double avg(int n1, int n2, int n3) {
		return (n1+n2+n3)/3.0;
	}
	// 총점을 리턴해주는 sum()
	int sum(int n1, int n2, int n3) {
		return n1+n2+n3; 
	}
	
	void call(int n1, int n2, int n3) {
		int r1 = sum(n1,n2,n3);
		System.out.println(r1);
		double r2 = avg(n1,n2,n3);
		System.out.println(r2);
		String r3 = pass(n1,n2,n3);
		System.out.println(r3);
	}
	
}

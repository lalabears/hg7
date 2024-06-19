package j0619;

public class Himart {
	// 객체변수 iv, cv 는 디폴트값이 있다. 
	private Electronic[] e = new Electronic[3];
	// 전자기기 객체배열 
	private int count = 0 ; // 객체배열의 인덱스 
	
	public void insert(Electronic elec) {
		e[count] = elec; 
		count++; 
	}
	Electronic[] select() {
		return e; 
	}
	// Electronic[] eArr = h.select();
	
	
	

}

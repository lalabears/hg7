package stuPkg;
public class Student {
	static int count = 2024100; 
	int stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg; 
	int rank; 
	// 초기화 블럭
	{
		count++;
	}
	// 생성자
 	Student(){}
	public Student(String name, int kor, int eng, int math) {
		this.stuNo = count;	this.name = name;	this.kor = kor;
		this.eng = eng;		this.math = math;
		this.total = kor+eng+math; 	this.avg = this.total/3.0;
	}
	@Override
	public String toString() {
		
		return String.format("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d",
				stuNo, name, kor, eng, math, total, avg, rank);
		
		/*return "" + stuNo + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math
				+ "\t" + total + "\t" + avg + "\t" + rank ;*/
	}
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
	

}

package j0617;
public class Employee extends Person {
//	company, rank, dept
	private String company; // 회사명
	private String rank;    // 직급
	private String dept;    //  부서
//	해당 클래스에 생성자를 작성
	Employee(String company,int age,String dept,String name,String rank){
		super(name, age); // 부모변수는 부모가 초기화해라 
		this.company = company;
		this.rank = rank; 
		this.dept = dept; 
	}
//	해당 클래스에 필드 정보를 출력하는 메소드
	// 메서드 오버라이딩 
	public void printInfo() {
		System.out.println("이름: "+name+", 나이: "+age+
				"살, 회사: "+company+", 부서: "+dept+", 직급: "+rank);
	}
	// getter & setter 
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}

package j0621;

public class Mem {
	private int no;
	private String name;
	private String subject;
	private int score;
	
	
	public Mem(int no, String name, String subject, int score) {
		super();
		this.no = no;
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	

}

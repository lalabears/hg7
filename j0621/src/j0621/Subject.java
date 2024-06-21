package j0621;
public class Subject {
   //	변수 
	private String title;  //과목명
	private int score;     // 점수
	// 생성자 
	Subject(){}
	Subject(String title, int score) {
		this.title = title;
		this.score = score;
	}
	// method
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	} 
	
	
}

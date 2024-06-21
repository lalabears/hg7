package j0621;
import java.util.*;
public class Student {
   // 필드 ( iv, cv) 
	private int stuNo;    // 학번
	private String stuName;  // 이름
	// private Subject sb = new Subject();
	// Subject[] sbarr = new Subject[4]; 
	private List<Subject> subList = new ArrayList<Subject>();
	
	// 리스트 - 수강한 과목의 리스트 
	// 생성자
	Student(){}
	Student(int stuNo, String stuName) {
		this.stuNo = stuNo;
		this.stuName = stuName;
	}
	// 1. addSubject()메서드 만들기 
	void addSubject(String title, int score) {
		subList.add(new Subject(title, score));
		
		/*// 방법 1. 
		Subject sub = new Subject();
		sub.setTitle(title); 
		sub.setScore(score);
		subList.add(sub);*/
		/*// 방법 2
		Subject sub = new Subject(title, score);
		subList.add(sub);*/
		// 방법 3
	
	}
	void showInfo() {
		System.out.println("번호 : "+stuNo);
		System.out.println("이름 : "+stuName);
		// 1. 객체가 가지고 있는 과목명 : 점수 다 출력해보기. 
	/*	for(int i = 0 ; i<subList.size();i++) {
			System.out.println(subList.get(i).getTitle());
			System.out.println(subList.get(i).getScore());
		}*/
		int total = 0 ;
		for(Subject s : subList) {
			System.out.println(s.getTitle()+" : "+ s.getScore());
			total += s.getScore();
		}
		// 2. 과목의 총점과 평균도 출력하기 
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + ((double)total/subList.size()));
		
	}
	
	
	
}

package j0531;
import java.util.Scanner;
public class C0531_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 학생 성적 검색 - contain
		String[] name = {"강백호", "서태웅", "강치수"};
		int[][] score = { {40,50,70,160},{10,20,30,60},{90,100,95,285}};
		double[] avg = { 53.33, 20.00, 95.00};
		String[] title = {"이름","국어","영어","수학","총점","평균"};
		int stu_no=-1; // 검색된 학생이 유무를 확인 
		String sName = "";
		System.out.println("검색하고싶으신 학생의 이름을 입력해주세요 ");
		sName = scan.next();
		for(int i =0; i<title.length;i++) {
			System.out.printf("%s\t", title[i]);
		}
		System.out.println();
		System.out.println("----------------------------------------------");
		for(int i = 0; i<name.length; i++) {
			if( name[i].contains(sName)) {
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name[i],score[i][0],score[i][1],score[i][2],score[i][3],avg[i]);
				stu_no = i; 
			}
		}
		if(stu_no == -1 ) System.out.println("학생이 존재하지 않습니다.");


	}

}

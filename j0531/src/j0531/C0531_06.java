package j0531;
import java.util.Scanner;
public class C0531_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 학생 성적 수정 - contain
		int[] sno = {1,2,3};
		String[] name = {"강백호", "서태웅", "강치수"};
		int[][] score = { {40,50,70,160},{10,20,30,60},{90,100,95,285}};
		double[] avg = { 53.33, 20.00, 95.00};
		String[] title = {"번호","이름","국어","영어","수학","총점","평균"};
		int stu_no=-1; // 검색된 학생이 유무를 확인 
		int cnt=0;  //검색된 학생의 수
		String sName = "";
		System.out.println("수정하고싶으신 학생의 이름을 입력해주세요 ");
		sName = scan.next();
		for(int i =0; i<title.length;i++) {
			System.out.printf("%s\t", title[i]);
		}
		System.out.println();
		System.out.println("----------------------------------------------");
		for(int i = 0; i<name.length; i++) {
			if( name[i].contains(sName)) {
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",sno[i],name[i],score[i][0],score[i][1],score[i][2],score[i][3],avg[i]);
				cnt++; // 검색된 학생의 수만큼 cnt가 증가함. 
				stu_no = i; 
			}
		}
		if(cnt == 0 ) {
			System.out.println("학생이 존재하지 않습니다.");
		}else if(cnt>1) {
			System.out.println("몇번 학생의 성적을 수정하시겠습니까? ");
			int no = scan.nextInt();
			stu_no = (no-1); // 인덱스는 0번부터 시작하기 때문에 
		}
		System.out.println(name[stu_no]+"학생을 선택하셨습니다.");
		System.out.println("1.국어 2.영어 3.수학 원하시는 과목을 선택해주세요");
		int subject = scan.nextInt();
		if(subject == 1) {
			System.out.println(name[stu_no]+"학생의 현재국어점수 : "+ score[stu_no][0]);
			System.out.println("수정하고싶은 점수를 입력해주세요 ");
			score[stu_no][0] = scan.nextInt(); // 입력받은 점수로 국어점수 수정 
			score[stu_no][3] = score[stu_no][0]+score[stu_no][1]+score[stu_no][2];
			avg[stu_no] = score[stu_no][3]/3.0;
		}
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",sno[stu_no],name[stu_no],score[stu_no][0],score[stu_no][1],score[stu_no][2],score[stu_no][3],avg[stu_no]);
	}

}

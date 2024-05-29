package j0529;

public class C0529_02 {

	public static void main(String[] args) {

		String[] names = {"하니","민지","다니엘","해린","혜인","민지"};
		int[] scores = {228,290,260,252,285,285};
	
		// 전체 출력 
		System.out.println("이름\t점수");
		System.out.println("---------------");
		for(int i = 0 ; i < names.length; i++ ) {
			System.out.printf("%s\t%d\n",names[i],scores[i]);
		}
		// 특정학생 만 출력 
		System.out.println("\n---------------");
		System.out.println("이름\t점수");
		System.out.println("---------------");
		int stu_no = -1; 
		for(int i = 0 ; i < names.length; i++ ) {
			if(names[i].equals("윈터")) {
				System.out.printf("%s\t%d\n",names[i],scores[i]);
				stu_no = i; 
			}
		}
		if(stu_no==-1) {
			System.out.println("검색하신 학생이 존재하지 않습니다.");
		}
		
		// 다니엘의 점수를 260 > 280으로 바꾸기 
		int modi_no = -1; 
		// {"하니","민지","다니엘","해린","혜인","민지"};
		// int[] scores = {228,290,260,252,270,285};
		//           scores[0]   scores[2]
		String searchname = "다니엘"; //scan.next();
		for(int i = 0 ; i < names.length; i++ ) {
			if(names[i].equals(searchname)) {
				modi_no = i;  
			}
		}
		System.out.println("다니엘은 배열의 "+modi_no+"방에 있습니다. ");
		System.out.println("다니엘은 점수는 "+scores[modi_no]+"있습니다. ");
		scores[modi_no] = 280;  // 정수 수정. 
		System.out.println("다니엘은 수정된 점수는 "+scores[modi_no]+"있습니다. ");
		// 학생성적프로그램에서 수정을 할 경우에는 
		// 예: 국어점수 수정 > 국어점수는 수정, 해당 영어점수 수학점수를 가져와서
		//    학생의 총점과 평균을 새롭게 수정을 해 주어야 함. 
		// kor[modi_no] = 90; 
		// total[modi_no] = kor[modi_no]+ eng[modi_no]+ math[modi_no];
		// avg[modi_no] = total[modi_no]/3.0; 
		
		
		// Rank 
		int rankCnt;
		int[] rank = new int[names.length];
		for(int i = 0 ; i < names.length ; i ++ ) {
			rankCnt = 1; // 처음은 무조건 1등으로 시작함. 
			for (int j = 0 ; j < names.length ; j++ ) {
				if(scores[i] < scores[j] ) {
					rankCnt++;
				}
			}
			rank[i] = rankCnt; 
		}
		// 전체 출력 
		System.out.println("이름\t점수\t등수");
		System.out.println("---------------");
		for(int i = 0 ; i < names.length; i++ ) {
			System.out.printf("%s\t%d\t%d\n",names[i],scores[i], rank[i]);
		}
		
		
		
		
	}

}

package j0531;

import java.util.Arrays;

public class C0531_07 {

	public static void main(String[] args) {
		// 학생성적 - 등수 
		String[] name = {"강백호", "서태웅", "강치수"};
		int[][] score = { {40,50,70,160},{10,20,30,60},{90,100,95,285}};
		int[] rank = new int[name.length];
		for (int i = 0; i < rank.length; i++) {
			int rankCnt=1;
			for(int j = 0 ; j <rank.length; j++) {
				// {160, 60, 285}    {160,60,285}
				if(score[i][3] < score[j][3]) {
					rankCnt++;
				}
			}
			rank[i] = rankCnt;
		}
		System.out.println("등수처리가 완료되었습니다");
		System.out.println(Arrays.toString(rank));
	}

}

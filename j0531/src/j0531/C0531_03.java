package j0531;

public class C0531_03 {

	public static void main(String[] args) {
		// 학생성적 출력
		String[] name = {"강백호", "서태웅", "채치수"};
		int[] kor = {40, 10, 90}; 
		int[] eng = {50, 20, 100}; 
		int[] math = {70, 30, 95}; 
		int[] total = {160, 60, 285}; 
		
		System.out.println("이름\t국어\t영어\t수학\t총점");
		System.out.println("--------------------------------------");
		for (int i = 0 ; i < name.length ; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\n", name[i],kor[i],eng[i],math[i],total[i]);
		}
		//  name = {"강백호", "서태웅", "채치수"};
		int[][] score = { {40,50,70,160},{10,20,30,60},{90,100,95,285}};
		System.out.println("2차원배열로 출력");
		System.out.println("이름\t국어\t영어\t수학\t총점");
		System.out.println("--------------------------------------");
		for (int i = 0 ; i < name.length ; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\n", name[i],score[i][0],score[i][1],score[i][2],score[i][3]);
		}
		

	}

}

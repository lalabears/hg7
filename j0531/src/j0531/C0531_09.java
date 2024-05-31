package j0531;

import java.util.Scanner;

public class C0531_09 {

	public static void main(String[] args) {
		/*
		변수 : 다양한 형태의 하나의 데이터를 저장할 수 있는 공간
		배열 : 같은 타입의 여러데이터를 저장할 수 있는 공간
		구조체 : 타입에 관계없이 서로 관련된 데이터를 저장 할 수 있는 공간
		클래스 : 다양한 자료형의 데이터 + 그 기능(함수)을 묶어놓은 구조체
		*/
		Scanner scan = new Scanner(System.in);
		int[] hour = new int[3];
		int[] minute = new int[3];
		double[] second = new double[3];
		for(int i = 0 ; i <3 ; i ++) {
			System.out.println("시를 입력하세요 : ");
			hour[i] = scan.nextInt();
			System.out.println("분을 입력하세요 : ");
			minute[i] = scan.nextInt();
			System.out.println("초를 입력하세요 (ex. 45.02 )");
			second[i] = scan.nextDouble();
		}
		
		// 2번째로 입력한 것만 출력해보세요 
		System.out.printf("%d : %d : %.2f \n",hour[1],minute[1],second[1]);
		// 2번째 시간을 14:14:37.33으로 변경해서 출력해보세요 
		hour[1] = 14;
		minute[1] = 14; 
		second[1] = 37.33; 
		System.out.printf("%d : %d : %.2f \n",hour[1],minute[1],second[1]);
		// 3번째 시간 중 second를 59.10로 변경해서 시:분:초 로 출력해보세요 
		second[2] = 59.10; 
		System.out.printf("%d : %d : %.2f \n",hour[2],minute[2],second[2]);
		
	}

}

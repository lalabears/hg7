package j0604;
public class C0604_05 {
	public static void main(String[] args) {
	// Score 객체 사용 
		// 1. 객체 배열 생성 3명 
		Score[] stu = new Score[3]; 
		// 객체 생성 
		for(int i = 0; i <stu.length;i++) {
			stu[i] = new Score(); // score 객체생성
		}
		// 값 넣기
		stu[0].name = "강백호"; stu[0].js = 50;  stu[0].db = 30;
		stu[1].name = "송태섭"; stu[1].js = 70;  stu[1].db = 80;
		stu[2].name = "채치수"; stu[2].js = 100; stu[2].db = 90;
        // 각 객체의 총점 계산
		stu[0].calTotal();	stu[1].calTotal();	stu[2].calTotal();
		// 각 객체 출력 
		stu[0].printStu();	stu[1].printStu();	stu[2].printStu();
		
		// 강백호의 db점수를 50점으로 수정해서 출력해보세요 
		// 강백호님 50점  이라고 출력해보기
		stu[0].db = 50;
		stu[0].calTotal();
		stu[0].printStu();
		// 채치수의 이름을 채소연 으로 변경해보세요 
		stu[2].name = "채소연";
		// 송태섭을 출력해보세요 
		System.out.println(stu[1].name);
		//for 문과 if문을 사용해서 이름이 송태섭일때 db 점수를 70 점으로 변경
		for( int i = 0 ; i < stu.length ; i ++ ) {
			if( stu[i].name.equals("송태섭")) {
				stu[i].db = 70; 
				stu[i].calTotal();
				stu[i].printStu();
			}
		}
		
		
		
		
		
		
	}// main
} // class 

package j0613;
public class C0613_02 {
	public static void main(String[] args) {
		// 1. Subject 클래스 만들기 - score, title (private한 변수로만들기)
		Subject sub1 = new Subject();
		// 과목명을 전달해 인스턴스생성 할 수 있어야함
		Subject sub2 = new Subject("국어");
		// 과목명과 점수를 전달해 인스턴스 생성 할 수 있어야함
		Subject sub3 = new Subject("수학", 80);
		// 2. 과목명을 별도의 setter를 이용해 저장할 수 있어야함
		sub1.setTitle("영어");
		// 3. 점수는 0~100사이의 점수만 입력받아 저장할 수 있어야함
		// 범위를 벗어난 값이 매개변수로 입력되면 점수가 잘못입력되엇다고 출력하기
		sub1.setScore(65);
		// 4. 저장된 점수를 기반으로 등급을 반환해줌(char) 등급은 A~D, F까지 
		System.out.println(sub1.getGrade());
		// 5. 매개변수로 과목명을 입력받아 객체와 동일한 과목인지 알려주는 메서드만들기 
		// 동일한 과목이면 true 아니면 false반환
		System.out.println(sub1.equalSubject("영어"));
		// 6. 점수 비교메서드 만들기 
		// 매개변수로 점수를 입력받아 객체의 점수보다 크면 입력하신 점수가 큽니다 라고 출력
		sub1.compScore(65);
	}

}

package j0611;
import java.util.Arrays;
import lottopkg.Member;
public class C0611_03 {
	public static void main(String[] args) {
		// 객체선언 및 생성 
		Method m = new Method(); 
		
		int num = m.random(); // 1-45사이 랜덤숫자 생성 메서드호출
		System.out.println(num);
		
		//num = m.input();
		System.out.println(num); 
		
		int[] arr = new int[3];
		arr = m.randArr();
		System.out.println(Arrays.toString(arr));
		
		Point p = new Point();
		p = m.randClass();
		System.out.println(p.x);
		System.out.println(p.y);
	//	System.out.println(p.z);
		
		// import를 사용하지 않으면 패키지명.클래스명으로 사용해야함 
		// lottopkg.Member m = new lottopkg.Member();
		//Member m1 = new Member(); // 기본생성자는 사용할 수 없음
		// public 생성자를 통해서는 객체 생성이 가능함. 
		Member m2 = new Member("강백호",31,"kang@aa.com","사원");
		m2.name = "서태웅"; // name은 public 이기때문에 접근가능
		m2.printName(); // public 메서드만 접근가능
		m2.printAll();  // public 메서드만 접근가능 
		
		
		
		Time t = new Time(14,31,25); 
		t.printTime(); 
		// t.hour = 10; 
		// 현재 시간을 1시간 후로 변경하고자 하는데
		// t.hour을 가져 올 수 없기때문에 
		// 객체의 시간을 가져오는 메서드를 만들어보세요. 
		// 객체의 시간을 수정할 수 있는 메서드를 만들어보세요 
		t.setHour(t.getHour()+1);
		t.printTime(); 
		
		// 현재 분에서 20분 후의 시간을 출력해보세요 
		t.setMinute(t.getMinute()+30);
		t.printTime(); 
		
		
		Time t1 = new Time(25,78,90); 
		t1.printTime();   //  0: 0: 0
		
		// t1.hour = 110; 
		
		Time t2 = new Time(3,10,25);
		System.out.println(t2.getHour());
		
	}

}

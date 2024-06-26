package j0626;
import java.util.*;
public class C0626_02 {
	public static void main(String[] args) {
		Americano a1 = new Americano();
		a1.addShot(3);
		System.out.println(a1);
        //이름: 아메리카노, 가격: 2500, 뜨커? false, 샷 : 2
		//이름: 아메리카노, 가격: 4000, 뜨커? false, 샷 : 5
		Latte l1 = new Latte();
		l1.changeMilk("두유");
		System.out.println(l1);
		//이름: 카페라떼, 가격: 3500, 뜨커? false, 우유 : 우유
		//이름: 카페라떼, 가격: 4000, 뜨커? false, 우유 : 두유
		
		List<Cafe> list = new ArrayList<Cafe>();
		list.add(a1);
		list.add(l1);
		list.add(new Americano());
		list.add(new Latte());
		list.add(new Cafe());
		// 리스트에 담긴 것들의 이름을 간단for문으로 출력 
		for(Cafe c: list) {
			System.out.print(c.getName()+ " ");
		}
		System.out.println();
		// 리스트에 담긴 커피의 가격의 총 합? 
		int sum = 0;
		for(Cafe c: list) {
			sum += c.getPrice();
		}
		System.out.println("sum:"+sum);

	}

}

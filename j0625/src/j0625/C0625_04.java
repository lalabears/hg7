package j0625;
import java.util.*;
public class C0625_04 {
	public static void main(String[] args) {
		/*List<Animal> a = new ArrayList<Animal>();
		a.add( new Dog ("뿌꾸", 5, "말티즈"));
		a.add( new Dog ("순심이", 10, "리트리버"));
		a.add( new Cat ("초코", 2, "검정색"));
		a.add( new Cat ("모찌", 4, "흰색"));
		for(int i = 0; i<a.size();i++) {
			System.out.println(a.get(i));
		}  */ 
		List<Animal> animal = addAnimal();
		printAnimal(animal);
	} // main
	
	static List<Animal>  addAnimal(){	
		Scanner scan = new Scanner(System.in);
		List<Animal> a = new ArrayList<Animal>(); 
		/*a.add( new Dog ("뿌꾸", 5, "말티즈"));
		a.add( new Dog ("순심이", 10, "리트리버"));
		a.add( new Cat ("초코", 2, "검정색"));
		a.add( new Cat ("모찌", 4, "흰색"));*/
		// 아래와 같이 무한히 입력을받아 입력한글자가 0일때 무한루프 멈춤
		// "d 뿌꾸 5 말티즈"
		// "d 순심이 10 리트리버"
		// "c 초코 2 검정색" 
		// 객체리스트를 채워보세요 
		
		while(true) {
			System.out.println("동물의 정보를입력하세요(종료0)");
			String str = scan.nextLine();
			String[] info = str.split(" ");
			// d 뿌꾸 5 말티즈
			// info[0] d , info[1] 뿌꾸, info[2] 5 info[3] 말티즈
			if(info[0].equals("0")) break; 
			else if(info[0].equalsIgnoreCase("c")) {
				//고양이를 의미함. 
				a.add( new Cat(info[1],Integer.parseInt(info[2]), info[3]));
			} else if (info[0].equals("d")) {
				//강아지를 의미함. 
				a.add( new Dog(info[1],Integer.parseInt(info[2]), info[3]));
			}
		}
		return a;
	}
	
	
	static void printAnimal(List<Animal> a) {
		for(int i = 0; i<a.size();i++) {
			System.out.println(a.get(i));
		}
	}
	
	

}// class 

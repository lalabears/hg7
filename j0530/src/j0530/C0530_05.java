package j0530;

public class C0530_05 {

	public static void main(String[] args) {
		// indexof, lastindexof, substring 을 꼭 사용해서 
		// name에는 홍길동, age에는 15를 넣어보세요 
		// Integer.parseInt()
		// ' '  ""
		String str = "내 이름은 [홍길동]입니다. 나이는 [15]살입니다";
		//           0 1 234 5 67
		String name= ""; 
		int age=0;
		// System.out.println(str.indexOf('['));     // 6
		// System.out.println(str.lastIndexOf('[')); // 20
		int n = str.indexOf('['); 
		name = str.substring(n+1, n+4);
		n = str.lastIndexOf('[');
		String ag = str.substring(n+1, n+3);
		age = Integer.parseInt(ag);
		System.out.println(name);
		System.out.println(age);
		
		String source = "SOSHELP";
		String[] morse = {".-", "-...", "-.-.","-..", "."
						,"..-.", "--.", "....","..",".---"
						, "-.-", ".-..", "--", "-.", "---"
						, ".--.", "--.-",".-.","...","-"
						, "..-", "...-", ".--", "-..-","-.--"
						, "--.." };
		
		String abc = "ABC"; 
		// A : 65   morse[0]  B : 66   morse[1]
		String abcmorse = morse[0]+morse[1]+morse[2];
		//       morse[abc.charAt(0)-'A']
		//               + morse[abc.charAt(1) - 'A']
		System.out.println(abcmorse);
		
		String result = ""; 
		for(int i = 0 ; i < source.length(); i++ ) {
			result += morse[ source.charAt(i) -'A'];
			//                'S' - 'A' 
		}
		
		
		
		
		
		System.out.println(source + "는 모스부호로 : ");
		System.out.println(result);
		
		
		
		
	}

}

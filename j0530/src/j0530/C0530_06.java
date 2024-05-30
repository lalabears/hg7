package j0530;

public class C0530_06 {

	public static void main(String[] args) {
		/*
		System.out.println("매개변수의 개수 : " + args.length);
		for(int i = 0 ; i < args.length ; i++ ) {
			System.out.println(args[i]);
		}*/
		// 숫자두개를 args로 입력받아서 두 수의 합을 출력해보세요 
	//	int n1 = Integer.parseInt(args[0]);
	//	int n2 = Integer.parseInt(args[1]);
	//	System.out.println(n1+"+"+n2+"="+(n1+n2));
		// runconfigurations : 30  X  2 
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[2]);
		String cal=args[1]; 
		System.out.println(n1+cal+n2+"="+(n1*n2));
		
		

	}

}

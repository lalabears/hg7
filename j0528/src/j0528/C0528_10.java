package j0528;

public class C0528_10 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40};
		
		// 20이 몇번째에 있나요 ?
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i]==20){
				System.out.println(i+"있음!!");
				break; 
			}
		}

	}

}

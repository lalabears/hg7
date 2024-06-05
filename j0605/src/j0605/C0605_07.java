package j0605;

public class C0605_07 {

	public static void main(String[] args) {
		int[] arr = {3,2,1,6,5,4}; 
		
		// 1. 배열의 모든요소를 출력하는 메서드
		printArr(arr);
		// 2. 배열을 작은수에서 큰 수로 정렬하는메서드
		sortArr(arr);
		printArr(arr);
		// 3. 배열에 있는 숫자의 합계를 구하는메서드 
		int sum = sumArr(arr);
		System.out.println("합계 : "+sum);

	}
	static void sortArr(int[] arr) {
		int temp = 0 ; 
		// 3 2 1 6 5 4 
		// 3 2 1 6 5 4 
		for(int i = 0 ; i < arr.length ; i ++) {
			for(int j = 0 ; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp; 
				}
				
			}
			
			
		}
		
	}
	
	
	
	static void printArr(int[] arr) {
		for(int a : arr) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
	static int sumArr(int[] arr) {
		int sum = 0; 
		for(int a : arr) {
			sum += a; 
		}
		return sum;
	}

}

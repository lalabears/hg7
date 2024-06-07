package j0607;

public class C0607_02 {

	public static void main(String[] args) {
		// 기본생성자를 통해서 객체생성 
		Car c1 = new Car(); 
		System.out.println("c1.color : "+c1.color);
		c1.color = "red";
		System.out.println("c1.color : "+c1.color);
		System.out.println("c1.gearType : "+ c1.gearType);
		System.out.println("c1.door : "+ c1.door);
		System.out.println("c1 : "+c1);// c1의 주소값
	/*	c1.color : red 	c1.gearType : auto	c1.door : 4
		c1 : j0607.Car@15db9742*/
		// 주소값이 복사되어 c1와 c2가 같아짐. 
		Car c2 = c1;       
		c2.color = "blue";
		System.out.println("=======================");
		System.out.println("c2.color : "+c2.color);
		System.out.println("c2 : "+c2);// c1의 주소값
		System.out.println("c1.color : "+c1.color);
		System.out.println("c1 : "+c1);// c1의 주소값
	/*	c2.color : blue     c2 : j0607.Car@15db9742
		c1.color : blue	    c1 : j0607.Car@15db9742   */
		// 배열복사
		int[] arr1 = {1,2,3};
		int[] arr2 = arr1 ; // 주소복사. 
		int[] arr3 = new int[arr1.length];
		arr3[0] = arr1[0]; arr3[1] = arr1[1]; arr3[2] = arr1[2];
		// 객체복사 
		Car c3 = new Car(c1); // 객체복사(주소다름)
		c3.color = "pink"; 
		System.out.println("=======================");
		System.out.println("c3.color : "+c3.color);
		System.out.println("c3 : "+c3);// c1의 주소값
		System.out.println("c1.color : "+c1.color);
		System.out.println("c1 : "+c1);// c1의 주소값
	/* 	c3.color : pink    c3 : j0607.Car@6d06d69c
		c1.color : blue    c1 : j0607.Car@15db9742 	 */
	}

}

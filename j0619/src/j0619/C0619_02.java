package j0619;
public class C0619_02 {
	public static void main(String[] args) {
		
		Himart h = new Himart();
		h.insert( new Desktop("삼성","컴퓨터",1200000,"GeForce"));
		h.insert( new NoteBook("LG","그램", 1500000, 3));
		h.insert( new Tablet("애플","프로3",2500000, true));
		
		Electronic[] eArr = h.select();
		
		int[] arr = {1,2,3};
		for( int a : arr ) {
			System.out.println(a);
		}
		for(int i = 0 ; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for(Electronic e : eArr) {
			System.out.println(e);
		}

				
	}

}

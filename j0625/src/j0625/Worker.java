package j0625;
public class Worker extends Person {
	private String work;
	public Worker() {super();}
	public Worker(String name, int age,String work) {
		super(name, age); this.work = work;
	}
	@Override
	public String toString() {
		return super.toString() + ", work=" + work ;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	} 
	
	
	
}

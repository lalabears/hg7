package j0628;
public class Exhibit {
	private String title; 
	private int category; 
	private int place;
	public Exhibit() {}
	public Exhibit(String title, int category, int place) {
		this.title = title;		this.category = category;  this.place = place;
	}
	@Override
	public String toString() {
		String cName = "";
		if(category == 1) cName="전시";
		else if(category == 2) cName ="체험";
		else if (category ==3) cName ="박람회";
		String pName = "";
		if(place == 1) pName="서울";
		else if(place == 2) pName ="부산";
		else if (place ==3) pName ="제주";
		return "분류 : " + cName + ", 전시회명 : " + title + ", 장소 : " 
				+ pName ;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public int getPlace() {
		return place;
	}
	public void setPlace(int place) {
		this.place = place;
	} 
	
	
	
	
}

package j0628;
import java.util.*;
public class ExhibitManager {
	// iv - 필드, 인스턴스변수, 전역변수 
	Map<Integer, Exhibit> exhibitMap = new HashMap<Integer, Exhibit>();
	// 전시회를 맵에 추가하는 메서드 
	void insertExhibit(Exhibit exh) {
		// key는 중복이 없어야하기때문에 가장마지막 key 값을 찾는다. 
		int lastNo = 0; 
		Iterator<Integer> it = exhibitMap.keySet().iterator();
		while(it.hasNext()) {
			lastNo = it.next();
		}
		exhibitMap.put(lastNo+1, exh);
	}
	Map<Integer, Exhibit> selectMap(){
		return exhibitMap;
	}
	public Map<Integer, Exhibit> searchMap(String title) {
		Map<Integer, Exhibit> map = new HashMap<Integer, Exhibit>();
		for(Integer i : exhibitMap.keySet() ) {
			if( exhibitMap.get(i).getTitle().contains(title) ) {
				map.put(i, exhibitMap.get(i));
			}
		}
		return map;
	}
	public int deleteMap(int no) {
		Exhibit tmp = null; 
		for(Integer i : exhibitMap.keySet()) {
			if(i == no) {
				tmp = exhibitMap.remove(no);
				break;
			}
		}
		return tmp != null ? 1 : 0;
	}
	
	

}
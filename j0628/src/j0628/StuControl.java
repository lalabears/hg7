package j0628;
import java.util.*;
import java.io.*;
import java.nio.Buffer;
public class StuControl {
	Scanner scan = new Scanner(System.in);

	// 텍스트 파일 읽어와서 list에 저장하기 
	public List<Student> stuRead() throws Exception{
		List<Student> list  = new ArrayList<Student>();
		String path = "C:/aaa/stuInput.txt";
		File f = new File(path);
		BufferedReader br = new BufferedReader(new FileReader(f));
		while(true) {
			String line = br.readLine();
			if(line == null ) break; 
			String[] arr = line.split(",");
			System.out.println(arr[0]);
			list.add( new Student(arr[0].trim(),
					Integer.parseInt(arr[1].trim()),
					Integer.parseInt(arr[2].trim()),
					Integer.parseInt(arr[3].trim())
					));
		}
		
		return list;
	}
	
	
	// list에 있는 값들 파일에 저장하는 메서드
	public void stuSave(List<Student> list) throws Exception {
		String path = "C:/aaa/stu.txt";
		File f = new File(path);
		FileWriter fw = new FileWriter(f); // 기존내용삭제후쓰기: 덮어쓰기
	//	FileWriter fw = new FileWriter(f, true); // true : 이어쓰기
		String data = "";
		for(int i = 0 ; i < list.size(); i++) {
			data+= list.get(i).getStuNo() +","+
				   list.get(i).getName() +","+
				   list.get(i).getKor() +","+
				   list.get(i).getEng() +","+
				   list.get(i).getMath() +","+
				   list.get(i).getTotal() +","+
				   list.get(i).getAvg() +","+
				   list.get(i).getRank() +"\n"; 					
		}
		fw.write(data);
		fw.close();
		System.out.println("저장이 완료되었습니다");
		
		
	}
	
	
	
	// 학생정보를 입력하는 메서드 
	public Map<String, Object> stuInput(List<Student> list, int count) {
		Map<String, Object> map = new HashMap<String, Object>();
		while(true) {
			System.out.println("[학생 성적 입력]");
			System.out.println((count+1)+"번 학생 이름 입력: (0.종료)");
			String name =scan.next();
			if(name.equals("0")) break;
			System.out.println("국어 : ");
			int kor = scan.nextInt();
			System.out.println("영어 : ");
			int eng = scan.nextInt();
			System.out.println("수학 : ");
			int math = scan.nextInt();
			list.add( new Student(name,kor,eng,math));
			count++;	
		}
		map.put("count", count);
		map.put("list", list);
		return map;
	}


	public void stuPrint(List<Student> list) {
		System.out.println("학생정보출력");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등수");
		for(int i = 0 ; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}



	


	

	
	

}

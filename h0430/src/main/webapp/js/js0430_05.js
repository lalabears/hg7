//1. 저장버튼을 눌렀을때 alert() 창이 뜨게 해주세요

function vbtn(){
	
    var stuname, kor, eng, math, total, avg; 
	stuname = document.getElementById("name").value;
	kor = document.getElementById("ko").value; 
	eng = document.getElementById("en").value;
	math = document.getElementById("math").value;
	
	console.log(stuname); 
	console.log(kor); 
	console.log(eng); 
	console.log(math); 
	
	total = Number(kor)+Number(eng)+Number(math);
	avg = total/3; 
	console.log(total); 
	console.log(avg); 
/*
	document.write("이름 : "+stuname+"<br>");
	document.write("국어 : "+kor+"<br>");
	document.write("영어 : "+eng+"<br>");
	document.write("수학 : "+math+"<br>");
	document.write("총점 : "+total+"<br>");
	document.write("평균 : "+avg+"<br>"); */
    prnt(stuname, kor, eng, math, total, avg ) ;
//콘솔로 입력한 이름, 국영수 점수를 출력을 해본다. 
//국영수 점수를 사용해서 총점과 평균을 구한다
//document.write로 출력한다. 
} 
// 출력용 함수를 따로 만들기 prnt() 

function prnt(){  
//	arguments.. 사용.. 
	let title = ['이름','국어','영어','수학','합계','평균']; 
	//arguments[0] > 이름   arguments[1] > 국어 ... 
	for (let i = 0 ; i <title.length ; i++){
		document.write(title[i] +" : " +arguments[i]+"<br>"	);
	}
	
}
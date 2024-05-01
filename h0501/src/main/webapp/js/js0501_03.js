function dDay(){
	//alert('d')
	
	var today = new Date(); // 이시점의 날짜, 시간 
	var lastday = new Date(2024,11,31);
	//  Tue Dec 31 2024 00:00:00 GMT+0900
	console.log(today)
	console.log(lastday)
	
	var dDayTime = lastday.getTime() - today.getTime();
	var dDay = Math.ceil(dDayTime/(1000*60*60*24));
	
	document.getElementById('h02').innerHTML = 
	dDay + '일'; 
	
	

}

function cDay(){
	// alert('C')
	var today = new Date();
	var toyear = today.getFullYear();
	var tomonth = today.getMonth() + 1;
	var todate = today.getDate(); 
	var today = today.getDay(); // 일요일 0 , 토 6
	var yoil = ['일','월','화','수','목','금','토'];
	var toyoil = yoil[today]; 
	
	var str = toyear +
	"년 "+ tomonth+"월 " + todate +"일 "+ toyoil+"요일"; 
	
	document.getElementById('h01').innerHTML = str;
	
	/*
	지금 년 월 일 요일을 
	h01아이디를 가지는 위치에 넣어주세요 
	>>  2024년 5월 1일 수요일 
	
	*/
	
}
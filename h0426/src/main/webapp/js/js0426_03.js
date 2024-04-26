/*DATE 객체
1. 연도(year) : 1900년(00) ~ 1999년(99)
*** 2. 월(month) : 1월(0) ~ 12월(11) ***
3. 일(day) : 1일(1) ~ 31일(31)
4. 시(hours) : 0시(0) ~ 23시(23)
5. 분(minutes) : 0분(0) ~ 59분(59)
6. 초(seconds) : 0초(0) ~ 59초(59)*/

var date = new Date(); // date객체 생성 

document.write(date+"<br>"); 

var date1 = new Date("May 5 2024 12:00:00");
document.write(date1+"<br>"); 

var date2 = new Date(0);
document.write(date2+"<br>"); 
// 1970.1.1을 기준으로 숫자 밀리초 만큼 지난 날짜 
var date2 = new Date(86400000);
// 86400000ms 는 1일
document.write(date2+"<br>"); 

var date3 = new Date(90,5,25); // 90년 6월 25일
document.write(date3+"<br>"); 


var date4 = new Date(2000,5,25,15,40,0); // 90년 6월 25일
document.write(date4+"<br>"); 


// ISO 날짜양식 - 국제 표준 

var d1 = new Date("1999-12-12T13:40:30");
var d2 = new Date("1999-12-12");
var d3 = new Date("1999-12");
var d4 = new Date("1999");

document.write(d1+"<br>"); 
document.write(d2+"<br>"); 
document.write(d3+"<br>"); 
document.write(d4+"<br>"); 

// long  MMM DD YYYY
var d1 = new Date("Feb 10 2000"); 
var d2 = new Date("10 Feb 2000"); 
var d3 = new Date("February 10 2000"); 
var d4 = new Date("FEBRUARY 10 2000"); 
document.write(d1+"<br>"); 
document.write(d2+"<br>"); 
document.write(d3+"<br>"); 
document.write(d4+"<br>"); 
// short MM/DD/YYYY

var d1 = new Date("04/26/2025"); //MM/DD/YYYY
var d2 = new Date("2025/05/10"); //YYYY/MM/DD
document.write(d1+"<br>"); 
document.write(d2+"<br>"); 

document.write("<hr>")

var milisec = Date.now();
document.write(milisec+"<br>");
// 1970.1.1 일부터 오늘까지의 시간을 ms로 반환 

var n1 = new Date(milisec);
var n2 = new Date();

document.write(n1+"<br>"); 
document.write(n2+"<br>"); 


document.write("<hr>")

var date = new Date(); // 지금. 이순간 
// Fri Apr 26 2024 12:52:03
var year = date.getFullYear();// 현재 연도를 4자리숫자로 반환 
var month = date.getMonth(); // (현재월-1) 1월은 0으로 나옴  
var day = date.getDate(); // 날짜 
var yoil = date.getDay(); // 요일 0일요일 1월 2화 3수 4목 5금 6토 

document.write(year,month,day,yoil); // 20245265

var yoil3 = ['일','월','화','수','목','금','토'];
//             0  1    2     3   4   5    6 
document.write("오늘은 "+ year +"년 "+
 (date.getMonth()+1) +"월 "+ date.getDate() +"일 "
	+ yoil3[yoil] + "요일입니다<br> ");


/*

var yoil2 = '';

if(yoil == 0 ) { 
	yoil2 = '일요일'; 
} else if(yoil==1){
	yoil2 = '월요일';
}else if(yoil==2){
	yoil2 = '화요일';
} else if(yoil==3){ 
	yoil2 = '수요일';
}else if(yoil==4){ 
	yoil2 = '목요일';
}else if(yoil==5){  
	yoil2 = '금요일';
}else if(yoil==6){
	 yoil2 = '토요일';
}

switch(yoil){
	case 0: 
		yoil2 = '일요일';
		break;
	case 1: 
		yoil2 = '월요일';
		break;
	case 2: 
		yoil2 = '화요일';
		break;
	case 3: 
		yoil2 = '수요일';
		break;
	case 4: 
		yoil2 = '목요일';
		break;
	case 5: 
		yoil2 = '금요일';
		break;
	case 6: 
		yoil2 = '토요일';
		break;
}

*/



	
// 오늘은 2024년 4월 26일 금요일 입니다 . 
/*
var fruit = '딸기';
switch(fruit){
	case '오렌지': case '귤': 
		document.write('오렌지입니다.');
		break; 
	case '딸기':
		document.write('딸기입니다.');
		break; 	
}
if(fruit=='오렌지'){
	document.write('오렌지입니다.');
}else if(fruit=='딸기'){
	document.write('딸기입니다.');
}
*/




























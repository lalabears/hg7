/*
조건문 - if-else 문, switch 문

switch(조건값){
    case 값1:
          조건값이 값1일때 실행되는 실행문; 
          break; 
    case 값n:
          조건값이 값n일때 실행되는 실행문; 
          break;
    default:
          조건값이 case절 아무것에도 해당되지 않을때 실행되는 실행문;
          break;
}
 */

 var x = 100 ; 
 
 switch( typeof(x) ){
	
	case "number" : // if( typeof(x) ==  "number")
		document.write("숫자타입입니다.");
		break;
	case "string": // if( typeof(x) ==  "string")
		document.write("문자타입입니다.");
		break; 
	case "boolean": // if( typeof(x) ==  "boolean")
		document.write("불리언타입입니다.");
		break;
	default: // else 
		document.write("타입을 잘 모르겟습니다.");
		break; 
	
 }
 
 var day = new Date().getDay(); 
 
 // 오늘의 요일을 반환함. ( 일요일 0 - 토요일은 6)
 
 switch(day){
	case 1: // 월요일 
	case 2: // 화요일
	case 3: // 수요일
	case 4: // 목요일
	case 5: // 금요일
	//case 1: case 2: case 3: case 4: case 5:
		document.write("평일입니다. 힘내세요!");
		break; 
	case 6: // 토요일
	case 0: // 일요일 
		document.write("즐거운 주말입니다!");
		break;	
 }
 /*
swith를 사용해서  월을 입력받아서 
3~5->봄 6~8->여름 9~11->가을 12~2->겨울
을 출력 
 */
var month = 4; // Number(prompt("월을 입력하세요:"));

switch (month) {
	case 3: case 4:	case 5:
		document.write("봄");
		break;
	case 6:case 7:case 8:
		document.write("여름");
		break;
	case 9:case 10:case 11:
		document.write("가을");
		break;
	case 12:case 1:case 2:
		document.write("겨울");
		break;
	default:
		document.write("잘못입력하셧습니다");
		break;
	
}





document.write("<hr>");

var num = 2; 

// if - else 
if(num == 2 ){
	document.write("2 입니다");
} else {
	document.write("2가 아닙니다.");
}
document.write("<br>");
// switch 
switch (num) {
	case 2: // if (num == 2)
		document.write("2 입니다");
		break;
	default:
		document.write("2가 아닙니다.");
		break;	
}

document.write("<br>");
var g = "남자";
//var g ="여자";

if( g == "남자"){
	document.write("남자");
}else if(g == "여자"){
	document.write("여자");
}else {
	document.write("남자, 여자가 아닙니다.");
}
document.write("<br>");

switch(g){
	case "남자" :
		document.write("남자");
		break;
	case "여자" :
		document.write("여자");
		break;
	default:
		document.write("남자, 여자가 아닙니다.");
		break;
	
}














 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
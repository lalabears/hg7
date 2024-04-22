/*
if ( 조건값 == 값1 ){
	조건값이 값1일때 실행되는 실행문;
}else if( 조건값 == 값n) {
	조건값이 값n일때 실행되는 실행문; 
}else{
	조건값이 아무것에도 해당되지 않을때 실행되는 실행문;
}

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
/*
성별을 입력 받아 
남자면 남자 여자면 여자라고 출력

남, 남자, m, M, male, Male   > 남자
여, 여자, f, F, female, Female >여자
*/
// 1. 변수 선언 
var gender = "";//prompt("성별을 입력해주세요 ");

/*
if(gender =="남" || gender=="남자" || gender=="m" ||
    gender=="M" || gender=="male" || gender =="Male")
	document.write("남자");    
else if(ender =="여" || gender=="여자" || gender=="f" ||
    gender=="F" || gender=="female" || gender =="Female")
	document.write("여자");   
*/
switch(gender){
	case "남": case "남자": case "m":	case "M": case "male": case "Male":
		document.write("남자");    
		break;
	case "여": 
	case "여자": 
	case "f":	
	case "F":
	case "female": 
	case "Female":
		document.write("여자");    
		break;
	default:
		document.write("잘못입력하셨습니다.");
		break; 
	
	
}


/*
월을 입력해서 30일까지만 있으면
30일까지 있습니다. 
31일까지 잇습니다. 
28일까지 있습니다. 
*/
var month; 
var days = -1; 
month = Number(prompt("월을 입력해주세요 "));

// 1,3,5 7,8, 10,12 -> 31일까지 있음
// 4,6,9, 11 -> 30일 까지 있음 
// 2월이 -> 28일까지 있음 

switch(month){
	case 1: case 3: case 5: case 7: case 8:
	case 10: case 12:
		days = 31; 
		document.write(month +" 월은 " + days +"일까지 있습니다");

		break;
	case 4: case 6: case 9: case 11: 
		days = 30;
		document.write(month +" 월은 " + days +"일까지 있습니다");

		break;
	case 2:
		days = 28;
		document.write(month +" 월은 " + days +"일까지 있습니다");

		break;
	
}

if( days != -1 )
{
	document.write(month +" 월은 " + days +"일까지 있습니다");
}



let a = prompt("a ?");
a =Number(a);
/*
if(a == 0){
	alert(0);
}else if(a == 1){
	alert(1);
}else{
	alert(5);
}*/
// 위의 if문을 스위치로 바꿔보세요 
if (a == 2 || a == 3){
	alert('2 or 3');
}

switch(a){
	case 0:
		alert(0);
		break;
	case 1: 
		alert(1);
		break;
	case 2: case 3: 
		alert('2 or 3');
		break; 
	default:
		alert(5);
	
}









































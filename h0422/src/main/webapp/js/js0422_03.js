/*
1. 월을 입력받아서 
3~5->봄 6~8->여름 9~11->가을 12~2->겨울
을 출력 
*/

// 변수선언 
var month = 12; // Number(prompt("월을 입력하세요:"));

console.log(month+typeof(month)); 

// 봄
// if (month==3 || month ==4 || month == 5)
//   3  <=month<= 5 
if ( 3 <= month && month <=5  ){
	//봄일때 
	document.write("봄입니다");
}else if ( 6 <= month && month <= 8 ){
	// 여름일때 
	document.write("여름입니다");
}else if( 9 <= month && month <= 11 ){
	// 가을일때
	document.write("가을입니다");
}else if(month==1 || month ==2 || month == 12 ) {
	//겨울일때
	document.write("겨울입니다");
}else{
	// 숫자를 잘못입력했을때 
	document.write("숫자를 잘못입력하셧습니다.");
}
document.write("<hr>");
/*
성별(m, M, f, F), 키를 입력받아서 
남자일 경우 (m)  172.5이상이면  
[남성입니다] 
[평균이상] 이하면 [평균이하]
여자일 경우 (f) 159.6 이상이면 
[여성입니다]
[평균이상] 이하면 [평균이하]
그외는 [잘못입력하셨습니다] 라고 출력해보세요 

*/
// 변수 선언 - 입력 받기 
var gender, height; 
gender = prompt("성별을 입력해주세요(m,f,M,F)");
height = Number(prompt("키를 입력해주세요 ")); 

console.log(gender,height); //확인
// 조건문 
// if - 남자인지 여자인지
//         남자면 - 평균이상인지 이하인지
//         여자면 - 평균이상인지 이하인지 

if (gender == "m" || gender =='M'){
	
	document.write("남성입니다.");
	// 172.5이상이면 
	
	if (height >= 172.5) {
		document.write("평균이상입니다.");
	}else{
		document.write("평균이하입니다.");
	}
	
}else if( gender == 'f' || gender == "F" ){
	// 159.6 
	document.write("여성입니다.");
	if (height >= 159.6) {
		document.write("평균이상입니다.");
	}else{
		document.write("평균이하입니다.");
	}
}







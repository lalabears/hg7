/* 1.
방문자의 이름을 입력받아. 
00님 방문을 환영합니다 
를 출력해 보세요
*/
// 변수 선언 
var name = prompt("방문자의 이름을 입력해주세요 : ");
if(name){	
	document.write( name + "님 방문을 확영합니다.");
}
/*
2. 
2-1 숫자를 입력받아. 짝수면짝수 홀수면 홀수를 출력하세요
2-2  2-1에서 홀수 인 경우, 7의 배수일경우, 7의 배수입니다. 를 출력
*/
//변수선언 
var number ; 
number= prompt("숫자를 입력해주세요 ");
number = Number(number);

// 조건문
//  7 14 21 28 .. 
if ( number%2 == 0 ) {
	// 짝수일 경우 
	document.write("짝수입니다.");
}else{
	// 홀수일 경우 
	document.write("홀수입니다.");
	if( number % 7 == 0 ){
		// 7의 배수일 때 
		document.write(number +"는 7의 배수입니다.");
	}
		
}



/*
if ( number%2 == 1 ) {
	// 홀수일 경우 
	document.write("홀수입니다.");
}else{
	// 짝수일 경우 
	document.write("짝수입니다.");
}
*/







/*
3. confirm을 사용해서 .
정말 탈퇴하시겠습니까? 를 물어보고 
 확인 : 탈퇴처리되었습니다.
 취소 : 탈퇴취소되었습니다. 를 출력 
*/  
/*
var result = confirm("정말 탈퇴하시겠습니까?");
console.log(result);  // 확인을 눌렀을때 true 

if(result){
	document.write("탈퇴처리되었습니다.");
}else{
	document.write("탈퇴취소되었습니다.");
}
*/
document.write("<hr>");
if(confirm("정말 탈퇴하시겠습니까?")){
	document.write("탈퇴처리되었습니다.");
}else{
	document.write("탈퇴취소되었습니다.");
}

















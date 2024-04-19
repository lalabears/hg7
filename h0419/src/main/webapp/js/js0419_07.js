/*
1. 키와 몸무게를 입력받아 >>  180 70
,평균체중보다 작습니다. 평균체중입니다. 
평균체중보다 높습니다. 를 출력해보세요
평균체중 = (키 - 100) * 0.9

정상체중: 초록글씨
체중미달이면 : 노랑글씨
비만이면 : 빨간글씨 

<h1 style="color:red;"> 빨간글씨</h1>
<h1 style="color:blue;">파란글씨</h1>

if ( (11>10) && (12>1) ) {
	만족 
}
*/
// 변수선언 
var h ; // 키
var w ; // 몸무게
var avgW; // 평균 몸무게

h = 10;// Number(prompt("키를입력해주세요 ")); // 숫자를 변수에 넣어줌
w = 10;// prompt("몸무게를 입력해주세요 "); // 문자열을 변수에 넣어줌
w = Number(w); // 문자열을 숫자로 바꿔줌

avgW = ( h - 100 ) * 0.9 ; // 평균몸무게

if( w == avgW ){
	// 평균체중
	document.write('<h1 style="color:green;">평균체중</h1>');
}else if( w > avgW ){
	// 과체중
	document.write('<h1 style="color:red;">과체중</h1>');
}else{
	// 저체중
	document.write('<h1 style="color:yellow;">저체중</h1>');
}
/*
2. 아이디와 비밀번호를 입력 받아서 
둘다 같으면 [로그인되었습니다] 
아이디는 일치하나 비밀번호가 일치하지 않으면
[비밀번호가 일치하지 않습니다.]
입력한 아이디가 다르면 [아이디가 일치하지 않습니다] */

var id = 'admin' ;
var pwd = '1111' ;

var userid = prompt("아이디를 입력해주세요 ");
var userpw = prompt("비밀번호를 입력해주세요 ");

if( id == userid ){
	// 아이디가 일치할때
	if( pwd == userpw){
		// 아이디가 일치하고, 비밀번호가 일치. 
		alert("로그인되었습니다");	
		location.href = "https://www.google.com/";
		
	}else{
		// 아이디가 일치하고, 비밀번호가 일치하지 않을때 
		
		alert("비밀번호가 일치하지 않습니다.");	
		location.reload(); // 페이지 새로고침
	}
	
	
}else{
	// 아이디가 일치하지 않을때 
	alert("아이디가 일치하지 않습니다.");
	//location.reload(); // 페이지 새로고침
}



if( id != userid ){
	
	// 아이디가 일치하지 않을때 
	alert("아이디가 일치하지 않습니다.");
	//location.reload(); // 페이지 새로고침
	
	
}else{
	// 아이디가 일치할때
	if( pwd == userpw){
		// 아이디가 일치하고, 비밀번호가 일치. 
		alert("로그인되었습니다");	
		location.href = "https://www.google.com/";
		
	}else{
		// 아이디가 일치하고, 비밀번호가 일치하지 않을때 
		
		alert("비밀번호가 일치하지 않습니다.");	
		location.reload(); // 페이지 새로고침
	}
	
}


















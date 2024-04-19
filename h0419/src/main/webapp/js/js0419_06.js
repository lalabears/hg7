/*
조건문 - if , switch  

if (표현식) {
     표현식이 참일때 실행하고자하는 코드; 
}

if문은 표현식의 결과가 참이면 {}안의 코드를 실행함. 
거짓일 경우 아무것도 실행하지 않는다. 

 */

var x = 10, y = 20; 

if (  x == y ){
	
	document.write("x와 y의 값이 같습니다. ");
	//document.write("x와 y의 값이 같지 않습니다. ");
}

/* 
  = : 대입연산자 
  == : 비교연산자 
  
if (  x = y ){  // 이렇게 사용하면 같은지를 비교하는 것이 아니다
	
	document.write("x와 y의 값이 같습니다. ");
}
*/



 


if ( x < y ) {
	
	document.write("x가 y보다 작습니다. ");
}



//입력받은 숫자가 0일경우 (prompt) 화면에 이미지를 띄워주세요 

var str = '<img src="images/c1.jpg">' ;

var n  = 1; // Number(prompt("숫자를 입력해주세요 "));

if ( n == 0 ) {	
	document.write(str);
}

/*
if - else 

if ( 표현식 ){
 표현식이 참일때 실행
} 
else {
  표현식이 거짓일때 실행 
} */



var x = 10, y = 20; 

if (  x == y ){
	
	document.write("x와 y의 값이 같습니다. ");
} else {
	
	document.write("x와 y의 값이 같지 않습니다. ");
	
}


//입력받은 숫자가 0일경우 (prompt) 화면에 이미지를 띄워주세요 
// 0이 아닐때는 잘못입력하셧습니다를 h1로 표현해주세요 

var str = '<img src="images/c1.jpg">' ;
var str1 = '<h1>잘못입력하셨습니다.</h1>';
var n  = 1 ; //Number(prompt("숫자를 입력해주세요 "));

if ( n == 0 ) {	
	document.write(str);
} else {
	document.write(str1);
}

//나이를 입력받아서 20살이상이면 성인입니다. 아니면 미성년자입니다. 

var age = 22; //Number(prompt("나이를 입력해주세요 "));

if (age >= 20) {
	document.write("성인입니다.");
} else{
	document.write("미성년자입니다.");
}

if (age <= 20) {
	document.write("미성년자입니다.");
} else{
	document.write("성인입니다.");
}


// 숫자를 1개 입력받아서  1-1 양수입니다. 음수입니다
//  1-2 짝수입니다. 홀수입니다.(짝수는 2로 나눈 나머지 : 0)

var number = 10;  // Number(prompt("숫자를 입력해주세요 : "));

// 양수 : 0 보다크다 음수 : 0보다작다 
if (number < 0 ){
	document.write("음수");
}else{
	document.write("양수");
}

// 짝수 홀수는 2로 나눈 나머지 값을 통해 결정 
// 10%2 = 0  11%2 = 1
// 10/2 = 5  11/2 = 5.5
if ( number%2 == 0 ){
	document.write("짝수");
}else{
	document.write("홀수");
}


var x = 10, y = 20; 

if (  x == y )
{
	// 조건식이 참일때 즉, x와 y값이 같을때 실행되는 문장들입니다.
	document.write("x와 y의 값이 같습니다. ");	
} 
else 
{
// 조건식이 거짓일때 즉, x와 y값이 같지 않을때 실행되는 문장들입니다.
	if( x < y )
	{
		// x와 y값이 같지 않으며, 
		// x가 y보다 작을때(조건문이 참일때) 실행되는 문장들
		document.write("x가 y보다 작습니다.");
	}
	else 
	{
		// x와 y값이 같지 않으며,
		// x가 y보다 작지 않을때(조건문이 거짓일때) 실행되는 문장들
		document.write("x가 y보다 큽니다.");
	}
	
}

var n = -10 ; 

if ( n > 0 ) {
	// 양수들.. 
	document.write("양수");
	if( n % 5 == 0 ) {
		// 5 배수임
		document.write("5의 배수");
		
	}else{
		// 5의 배수가 아님 
		document.write("5의 배수가 아님 ");
	}
	
}else {
	// 음수들..
	document.write("음수");
	
}



/*if (조건식1) {
 조건식1이 참일때 실행
} else if( 조건식2) {
 조건식1이 거짓이면서 조건식2가 참일때
} else if( 조건식3) {
 조건식1,조건식2가 거짓이고 조건식3이 참일때
} else if( 조건식n) {
 앞에조건식들이 거짓이며 조건식n이 참일때
}else{
 조건식1~ 조건식n  거짓일때 실행 
}
*/


var x = 10, y = 20; 

if (  x == y ){
	 // 조건식1 
	 // x, y가 같은지 -> 참일때 
	document.write("x와 y의 값이 같습니다. ");	
} else if( x < y )	{
	document.write("x가 y보다 작습니다.");
}else{
	document.write("x가 y보다 큽니다.");	
}

// 숫자를 입력받아서 - 양수, 0 , 음수

var num = 10; //Number(prompt("숫자를입력해주세요 >> "));

// 내가 입력한 숫자는 num

if (num > 0) { 
	document.write("<h1>양수</h1>");	
}else if (num < 0) { 
	document.write("<h1>음수</h1>");	
} else { 
	document.write("<h1>0</h1>");	
}


/*
나이가 10살이상이고, 
키가 150이상만 탑승이 가능한 놀이 기구

나이와 키를 입력받아서
10살이상이면서 150이상이면 
[탑승가능]
[키가 미달입니다]
[나이가 미달입니다]
*/

var age = 11;//Number(prompt("나이 >> "));
var h = 120; //Number(prompt("키 >> "));

if (age < 10) {
	// 나이가 10살 미만
	document.write("<h1>나이가 미달입니다</h1>");	
}else{
	// 나이가 10살 이상
	
	if( h >= 150) {
		document.write("<h1>탑승가능</h1>");		
	}else{
		document.write("<h1>키가 미달입니다</h1>");	
	}
	
}

















/*

document.write("문자열들은 따옴표 안에 있어야합니다.");
document.write('홑 따옴표도 상관없습니다 ');
document.write(10000); //숫자는 그냥 쓸 수 있습니다
var n ="안녕하세요";
document.write(n); //변수명으로 사용이 가능합니다


*/














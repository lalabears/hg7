/*
긴주석 사용하는 방법
 */

// 한줄 주석 

// 출력 
document.write('js파일안에서 작성된 코드입니다');
document.write("<p>js파일안에서 작성된 코드입니다</p>");
document.write('<a href="https://www.google.com">구글</a>');


console.log("콘솔에 출력해주세요");

// 확인버튼만 존재
// alert("경고창입니다.");
// 확인 또는 취소 버튼이 존재 
// confirm("확인 창입니다. 정말 창을 닫으시겠습니까? ");

//사용자로부터 입력을 받을 수 있다.  
// prompt("나이를 입력하세요","30");


// 변수 : 데이터를 담을 수 있는 그릇 

var number ; // 변수선언

number = 100; 

console.log("number의 값은"+ number);

var num = 10 ; // 변수를 선언함과 동시에 초기화 
console.log("num의 값은"+num);

// number+ num의 값을 더한결과를 출력한다면 .. ? 

console.log("합계는 "+ (number+num) );


// var, let, const 
var a = 1;
a = "문자";
a = false; 
var a = 3.14 ;

let b = 3;  // let은 두번 선언할 수 없다. 
b = "a" ;   //let b ="A";

const c = 1234; // 선언도 할수 없고 값도 변경이 불가능합니다.  
// c = 49;  


console.log(typeof a);
console.log(typeof(b));

/*
var ans1 = confirm("확인 창입니다. 정말 창을 닫으시겠습니까? ");
console.log(ans1);

var ans2 = prompt("이름을 입력하세요");
console.log(ans2+typeof(ans2));
// 아무것도 입력을 하지 않았을때 : 빈공백이 문자열로 들어감
var a =""; 

var ans3 = prompt("나이를 입력하세요");
console.log(ans3 + typeof(ans3) );
// prompt창으로 입력받는 값은 string type이다 

*/
var x = 1, y = "1", z = 1; // == 값을 비교 === 타입까지 비교 
document.write("<br>");
document.write( (x==z) +"<br>"); // true
document.write( (x==y) +"<br>" );// true

document.write( (x === z) +"<br>"); // true
document.write( (x === y) +"<br>" );// false

x = 3, y =2 , z = 2; 

// OR  - 둘중 하나만 참이면 참 
document.write( (x==y) || (y==z) +"<br> ") ;   // true
//              false  || true  

// AND - 둘다 참이어야 참 
document.write( (x==y) && (y==z) +"<br> ") ;   // false
//              false  || true  


// ! not
document.write("<br>");
document.write( !(x == y )) ; // true
document.write( !(y == z )) ; // false

document.write("<hr>");

// 삼항식 

var x = 13, y = 5; 
var res; 
res = (x==y) ? "같다" : "다르다";
   //  질문    ?  참   :  거짓  
   
document.write("두 수는 "+res);




// 조건문 
/*
if(조건식1){
	조건식1이 참일때 실행 
}else if(조건식2){
	조건식2가 참일때 실행 (조건식1이 거짓)
}else if(조건식3){
	조건식3이 참일때 실행 (조건식1, 조건식2 거짓)
}else{
	조건식들이 다 거짓일때 실행 
}
*/
document.write("<hr>"); 

var n = 30; 

if ( n == 10 ){
	document.write("n은 10 입니다.");
} else if (n==20){
	document.write("n은 20 입니다.");
}else{
	document.write("n은 10 , 20 이 아닙니다.");
}

document.write("<hr>"); 
n = 3; 
if ( n > 10 ){
	document.write("n은 10 보다 큽니다.<br>");
	// n이 10보다 클때만 짝수인지 홀수인지 출력하세요
	if ( n%2 == 0 ){
		document.write("짝수");
	}else{
		document.write("홀수");
	}
	
	
}else {
	document.write("n은 10 보다 작습니다. ");
}
/* 산술연산자. 
 + 더하기
 - 빼기 
 * 곱하기 
 / 나누기 값 
a % b   a를 b로 나누었을때 나머지 값 

*/


var n1 = prompt("50미만의 숫자를 입력해주세요");
var n2 = Number(prompt("50미만의 숫자를 입력해주세요"));

n1 = Number(n1);


if(  ( n1 < 50 )   &&   ( n2 < 50 )  ){
	
	alert("두 숫자가 모두 50 미만입니다.");
	
}else{
	alert("조건에 맞지 않는 숫자가 있습니다. ");
}


if(  ( n1 < 50 )   ||   ( n2 < 50 )  ){
	
	alert("두숫자 중 최소한 하나는 50 미만입니다. ");
	
}else{
	alert("두개의 숫자 모두 50 이상입니다. ");
}


if( n1 !== "" && n2 !== ""){
	
	if(  ( n1 < 50 )   ||   ( n2 < 50 )  ){
		alert("두숫자 중 최소한 하나는 50 미만입니다. ");
	}else{
		alert("두개의 숫자 모두 50 이상입니다. ");
	}
}else {
	alert("숫자를 입력해주세요 ");
}


















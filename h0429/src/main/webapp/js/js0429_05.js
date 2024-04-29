/*
함수 호이스팅  -  함수 안에서 선언된 모든 변수는 함수 전체에 걸쳐 유효함. 
*/

var gNum = 10 ; // 전역변수 . 함수 안 함수 밖에서 사용할 수 있음
function prtNum(){
	document.write("지역변수 선언전 함수안 gNum " + gNum +"<br>");
	var gNum = 20;
	document.write("지역변수 선언 후 함수안 gNum " + gNum +"<br>");
}

function prtNum1(){
	var gNum; // 변수에 값이 들어가 있지 않을때 undefined 
	document.write("지역변수 선언전 함수안 gNum " + gNum +"<br>");
	gNum = 20;
	document.write("지역변수 선언 후 함수안 gNum " + gNum +"<br>");
}

prtNum();
prtNum1();  // prtNum(); 와 같음  
document.write("함수외부에서의 gNum " + gNum +"<br>");



// 매개변수 

function addNum(a,b,c){ // a,b,c라는 3개의 매개변수를 가지는 함수 
	return a+b+c;   // 숫자세개를 더한값을 반환함
}

var r1 = addNum(1,2,3); 
document.write("1,2,3  : " + r1 +"<br>");

var r2 = addNum(1,2); 
document.write("1,2  : " + r2 +"<br>"); // NaN 출력이됨. -> 계산할 수 없다 

var r3 = addNum(1); 
document.write("1  : " + r3 +"<br>"); // NaN 출력이됨. 

var r4 = addNum(); 
document.write("  : " + r4 +"<br>"); // NaN 출력이됨. 

function addNum1(a,b,c){// 전달받지 않은 매개변수는 undefined
	if( a === undefined ) {
		a = 0; 
	}
	if( b === undefined ) {
		b = 0 ; 
	}
	if (c === undefined) {
		c = 0 ;
	}
	return a+b+c;
}
var r1 = addNum1(1,2,3); 
document.write("1,2,3  : " + r1 +"<br>");
var r2 = addNum1(1,2); 
document.write("1,2  : " + r2 +"<br>"); // NaN 출력이됨. -> 계산할 수 없다 
var r3 = addNum1(1); 
document.write("1  : " + r3 +"<br>"); // NaN 출력이됨. 
var r4 = addNum1(); 
document.write("  : " + r4 +"<br>"); // NaN 출력이됨. 

document.write("<hr>");
 //   b에 값이 안들어 왔을때 결과가 a 
function multi(a,b){  //   a*b를 해주는 함수 
	// if( b === undefined ) 	b = 1; 
	b = (typeof(b) !== 'undefined') ? b : 1; 
	return a*b;
}

var r1 = multi(5,6); 
document.write("5,6  : " + r1 +"<br>");
var r2 = multi(5); 
document.write("5  : " + r2 +"<br>");


function multi1(a, b = 1){  //   b에 default값을 넣어줌 
	
	return a*b;
}

document.write("<hr>");
var r1 = multi1(5,6); 
document.write("5,6  : " + r1 +"<br>");
var r2 = multi1(5); 
document.write("5  : " + r2 +"<br>");

//숫자 두개를 전달 받아서 숫자의 값이 같으면(타입까지) 곱하기. 
// 아니면 더한값을 반환

function sumMulti(a, b){
	// = 대입연산자 b값을 a에 넣는다 
	// == 비교연산자 a랑 b가 같냐 
	// === 타입ㄲㅏ지 같은지 
	/*if(a === b){
		return a*b; 
	}else{
		return a+b;
	}*/
	var result ; 
	if(a===b){
		result = a*b ; 
	}else {
		result = a+b ;
	}
	return result; 
}
document.write( "<hr>");
document.write( sumMulti(7,7)  +"<br>"); // 49
document.write( sumMulti(7,'7')+"<br>");  // 77  -> 숫자+문자 = > 문자  
document.write( sumMulti(3,4)  +"<br>");   // 7 


//숫자두개를 전달 받아서 숫가 값이 같으면(타입까지) 같습니다,
//  큽니다, 작습니다(출력) 

function compNum (n1, n2){
	if(n1 === n2) {
		document.write(`${n1}과 ${n2}는 같습니다.<br>`);
	}else if (n1 > n2){
		document.write(`${n1}이 ${n2}보다 큽니다.<br>`);
	}else{
		document.write(`${n1}이 ${n2}보다 작습니다.<br>`);
	}
}

compNum(10, 2);
compNum(1, 12);
compNum(2, 2);


//숫자 한개를 전달받아 1부터 n까지의 합 
function sumN1(number){
	var sum = 0;
	for (let i = 1; i <= number ; i++){	
		sum += i ; 
	}
	return sum; 
}
var n = 10;
var sum1 = sumN1(n);  
document.write("1 부터 " + n +"까지의 합 " + sum1 +"<br>");
n = 100; 
var sum1 = sumN1(n);  
document.write("1 부터 " + n +"까지의 합 " + sum1 +"<br>");

//숫자 두개를 전달받아 n1부터 n2 까지의 합 
// 함수 없이 n1 - n2 까지의 합 . 
// n1 작게 n2는 n1보단 큰값이 들어가게 해야함. 
function sumN2(n1, n2 = 1){
	var tmp = 0; 
	if(n1 > n2){
		tmp = n1; 
		n1 = n2 ; 
		n2 = tmp;   // 값이 바뀜 
	}
	var sum = 0; 
	for (let i = n1 ; i <= n2 ; i++){
		sum += i ; 
	}
	return sum; 
}


var n1 = 20, n2 = 5 ; 

var sum = sumN2(n1, n2); 
document.write(`${n1} 부터 ${n2}까지의 합 : ${sum} <br>`);
n1 =100; 
var sum = sumN2(n1); 
document.write(`$1 - ${n1}까지의 합 : ${sum} <br>`);









 // arguments 객체 

// 전달 받은 매개변수들의 합을 구하는 함수 
function addNum(){ 
	var sum = 0 ; // 합을 저장하는 변수 
	for ( var i = 0 ; i < arguments.length ; i++ ){
		sum += arguments[i];
	}
	
	return sum;
	
}

console.log(addNum(1,2,3));
console.log(addNum(1,2));
console.log(addNum(1,2,3,4,5,6,7,8,9,10));

function passNum(a,b){ 
	document.write(a+" <br>");
	document.write(b+" <br>");
	document.write(arguments[0]+" <br>");
	document.write(arguments[1]+" <br>");
	document.write(arguments[2]+" <br>");
	document.write(" <hr>");
}

passNum(1,2);


function prtNum(a,b,...rest ){ 
	document.write(a+" <br>");
	document.write(b+" <br>");
	document.write(rest+" <br>");
	document.write(" <hr>");
}

prtNum(1,2,3,4,5);
document.write("<hr>");
function prtVal(a,b,...rest ){ 
	document.write( " a : " + a  +"<br>");
	document.write( " b : " + b  +"<br>");
	for(let i = 0 ; i < arguments.length ; i ++ ){
		document.write( i + "번째 arguments : " + arguments[i]  +"<br>");
	}
	
	for(let i = 0 ; i < rest.length ; i ++ ){
		document.write( i + "번째 rest : " + rest[i]  +"<br>");
	}
	
}
document.write( "<hr>");
prtVal(1,2,3,4,5);




/*
1. 
빼기를 해주는 함수를 만드는데 매개변수 없이 만들어보세요 
만약
sub(10, 2, 3) -> 10 - 2- 3 = 5 
sub(10,1,5,8) -> -4 */
function sub() { // 매개변수 없는 함수 선언
//  a[0] : 10    a[1]  : 2   a[2]    3 
	var firstNumber = arguments[0]; // firstNumber = 10이 들어감
	for (let i = 0 ; i <arguments.length - 1 ; i++ ){
		firstNumber = firstNumber -	arguments[i+1];	
	}
	return firstNumber;
}
document.write( sub(10,2,3) +"<br>") ;  // 5
document.write( sub(10,1,5,8) +"<br>") ;// - 4
/*
2. 첫번째 인수만 매개변수 firstNum 을 사용하고
나머지는 restAr 에 넣어서 위와 같이 출력해보기 
sub1(10, 2, 3) -> 10 - 2- 3 = 5 
sub1(10,1,5,8) -> -4 */

function sub1(firstNum,...restAr) { // 매개변수 없는 함수 선언
	for (let i = 0 ; i <restAr.length ; i++ ){
		firstNum -= restAr[i];	
	}
	return firstNum;
}
document.write("<hr>");
document.write( sub1(10,2,3) +"<br>") ;  // 5
document.write( sub1(10,1,5,8) +"<br>") ;// - 4

document.write("<hr>");
document.write("<hr>");
/*
입력받은 숫자들의 곱하기 값을 반환하기 . 
1. 매개변수 없이  

1*2*3*4*5 = 120
*/
function multiN1(){
	var result = 1; 
	// result = arguments[0]*arguments[1]*arguments[2]*arguments[3]...
	for (let i = 0; i < arguments.length ; i ++ ){
		result *= arguments[i];
	}
	return result; 
}


var re1 = multiN1(1,2,3,4,5);

document.write( re1 +"<br>") ;
document.write("<hr>");


/*
2 매개변수 1개 와 나머지 사용 
*/
function multiN2(x,y,...rest){
	var result = 1; 
	result *= x ; 
	result *= y ; 
	for(let i = 0 ; i <rest.length; i++ ){
		result *= rest[i];
	}
	return result; 
}


var re2 = multiN2(1,2,3,4,5);
document.write( re2 +"<br>") ;


// 미리 정의된 함수들 .. 

//eval() - 문자열로 표현된 코드를 실행 . 가급적 사용하지 말아야함. 

var x =10, y = 20 ; 
var r = eval(" x  +  y ");
document.write(r +"<br>"); 
var r = eval("3  *  y ");
document.write(r +"<br>"); 


// isFinite()  유한한 숫자인지 검사해 결과를 반환하는 함수 

document.write(   isFinite(123)   +"<br>"); //  true
document.write(   isFinite(0)    +"<br>"); // true
document.write(   isFinite(true)  +"<br>"); // true
document.write(   isFinite(null)    +"<br>"); //true
document.write(   isFinite('문자입니다')   +"<br>"); //false
document.write(   isFinite(undefined)    +"<br>"); //false
document.write(   isFinite(NaN)   +"<br>"); //false


// isNaN() 전달된 값이 숫자인지 아닌지. 
document.write(   isNaN(123)   +"<br>");  // false
document.write(   isNaN(0)    +"<br>"); // false
document.write(   isNaN(true)  +"<br>"); // false
document.write(   isNaN(null)    +"<br>"); // false
document.write(   isNaN('문자입니다')   +"<br>"); //true
document.write(   isNaN(undefined)    +"<br>"); //true
document.write(   isNaN(NaN)   +"<br>"); //true


// parseFloat() - 실수로 반환
document.write(  parseFloat("123")     +"<br>"); 
document.write(  parseFloat("123.456") +"<br>"); //123.456
document.write(  parseFloat("12 45 78") +"<br>"); 
document.write(  parseFloat("12 바나나") +"<br>"); 
document.write(  parseFloat("바나나 12") +"<br>"); // NaN


// parseInt() - 정수로 반환 
document.write(  parseInt("123")     +"<br>"); 
document.write(  parseInt("123.456") +"<br>");  //123
document.write(  parseInt("12 45 78") +"<br>"); 
document.write(  parseInt("12 바나나") +"<br>"); 
document.write(  parseInt("바나나 12") +"<br>"); // NaN

// Number() 숫자로 반환함. 
document.write(  Number("123")     +"<br>"); 
document.write(  Number("12 45 78")     +"<br>"); //NaN
document.write(  Number("12 바나나")     +"<br>"); // NaN
document.write(  Number(true)     +"<br>");   // 1
document.write(  Number(false)     +"<br>");  // 0 
document.write(  Number( new Date() )     +"<br>"); //1714374107887


// String()

document.write(  String(123)     +"<br>"); 
document.write(  String( new Date() )     +"<br>"); 
//Mon Apr 29 2024 16:02:52 GMT+0900 (한국 표준시)
document.write(  String(Boolean(1))     +"<br>"); 
document.write(  String(false)     +"<br>"); 



















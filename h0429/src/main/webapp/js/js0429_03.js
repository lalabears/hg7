/*지역 변수와 전역 변수 
지역변수 : 함수내 선언된 변수를 가리킴. 함수내에서만 유효 
-> 함수가 종료되면 메모리에서 사라짐  
매개변수 또한 함수내 정의되는 지역변수처럼 동작함*/

function localNum(){
	var num = 10 ; // 지역변수num에 숫자 10 대입  
	document.write("함수 내부 num " + num + ", 타입은 "+ typeof(num)+"<br>");
}

localNum(); // 함수 호출 

// document.write("함수 외부 num " + num + ", 타입은 "+ typeof(num)+"<br>");
// num is not defined

/*
전역변수 함수 외부에서 선언된 변수 
어느영역이나 접근이 가능하고. 웹페이지가 닫혀야 메모리에서 사라짐 
*/

var number = 10 ; // 전역변수로 number를 선언하고 10을 대입함 

function globalNum(){
		document.write("함수 내부 number " + number 
		+ ", 타입은 "+ typeof(number)+"<br>");
		
		number = 20 ; // 내부에서 접근해서 전역변수를 변경 할 수 있다.  
}
globalNum(); 
document.write("함수 호출이 끝난 후 number " + number 
		+ ", 타입은 "+ typeof(number)+"<br>");

document.write("<hr>");

var n = 10 ; // n이라는 변수를 전역변수로 선언 

function gNum(){
	var n = 20 ; // 같은 이름의 n이라는 변수를 지역변수로 선언 
	document.write("함수 내부 n " + n 
		+ ", 타입은 "+ typeof(n)+"<br>");
	document.write("함수 외부 n " + window.n 
		+ ", 타입은 "+ typeof( window.n )+"<br>");
	
}
gNum();

document.write("함수 호출이 끝난 후 n " + n + ", 타입은 "+ typeof(n)+"<br>");


document.write("<hr>");

var count = 0 ;  // 전역변수 선언  

myFunc(); // 함수선언문은 선언전에 호출 할 수 있다 
          // count = count  +   1   => 1

function myFunc(){
	count++; // 전역변수 1씩 증가 
	document.write("count : " + count + "<br>"); 
}

myFunc();  // count = 1  +   1   => 2


var theFunc = function(){  // 함수 표현식 
	count++; 
	document.write("count : " + count + "<br>"); 
}

theFunc(); // 함수 만들기 전에 호출 할 수 없다 . 


document.write("<hr>");


var x = 10, y = 20 ; 

function sub(){ // 매개변수가 없더라도, 전역변수로 선언되어 있으면 함수내 사용
	return y - x ; 
}
document.write(sub()+"<br>");



function parentFunc(){
	
	var x = 1, y = 2 ; // 전역변수랑 같은 이름의 지역변수를 선언  
	function add(){ // add함수는 내부 함수로 선언 
		return x + y ; // 전역변수가 아닌 지역변수 x, y에 접근 
	}
	
	return add(); 
}

document.write(parentFunc()+"<br>"); // 3

























/*함수 선언 
function 함수이름(매개변수1, 매개변수2 , ... ){
	함수가 호출됬을때 실행하고자 하는 실행문 ; 
}
함수 호출 
함수이름(매개변수..); 
함수이름();*/
function addNum( x, y ){  // 매개변수를 더한 값을 출력을 해라 
	document.write( x + y ); 
}
addNum(5,11);  // 5, 11을 전달해서 함수 호출 
document.write("<br>")
addNum(2,3);  // 2, 3을 전달해서 함수 호출 
function sumNum(x, y){
	var result = x + y ; 
	return result;  // 결과 값을 반환 함. 변수, 객체, 배열 ... 
}
function sumNum1(x, y){
	return x + y;  // 결과 값을 반환 함. 변수, 객체, 배열 ... 
}
var sum = sumNum(3,5); 
/*
sumNum()을 호출하면서, 그 인수로 3과 5를 전달 하고. 
함수 호출이 끝난 후 그 반환값을  sum변수에 대입 . */
document.write("<br>"+ sum +"<br>");


document.write("<hr>")

/*
function 함수이름(){  <- 함수 선언식 
	// 코드 
}

const 함수이름 = function() {  <- 함수 표현식 
	// 코드 
}

함수이름은 소문자로 시작합니다. 카멜표기법의 사용을 권장 . 
sumNum mulipleNumber .
동사를 많이 사용 . 함수의 기능을 표현 할 수 있는 이름을 사용하도록하자. 
*/


function myFunc1(){
	document.write("함수 선언식입니다<br>");
}

const myFunc2 = function(){
	document.write("함수 표현식입니다<br>");
}


myFunc1();
myFunc2(); // 함수 표현식의 경우 선언한것보다 위에 있을때 호출 할 수 없다


























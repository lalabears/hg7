/*
var abc = 0 ; 
var 변수명 ;
var 변수명 = 초기값 ; 
// 변수는 값을 저장, 함수는 코드를 저장 

		function 함수이름(){  
			// 코드 
		}
		function 함수이름(매개변수1,..., 매개변수n){  
			// 코드 
		}
		
		function 함수이름(매개변수1,..., 매개변수n){  
			// 코드 
			return 반환할값; // 값을 반환 할 수 있다. 
		}
*/

var abc = 10; 
var abc10 = abc+10; // 변수사용.
document.write(abc10+"<br>");

function prtHello(){ // hello, hi를 출력하는 함수 
	document.write("hello<br>");
	document.write("hi<br>");
} 


prtHello(); // 함수 호출 

function multi10(n){ // 곱하기10을 해서 출력해주는 함수 .
	document.write( (n*10) +"<br>");
} 

multi10(2); 
multi10(3); 
multi10('A'); // NaN

function prnChar(ch){ //전달 받은 문자를 출력하는 함수 
	document.write( ch +"<br>");
} 

prnChar('가');
prnChar('abcd');


function sum3(a,b,c){ // 숫자3개를 더해서 출력하는 함수 
	document.write( (a+b+c) +"<br>");
}

sum3(1,2,3);
sum3(10,11,12);


function multi20(n){ // 곱하기20한 값을 반환 함수 .
	return (20*n); 
}

var m20 = multi20(4); // 4 * 20 값이 m20에 대입 

document.write( (m20+3) +"<br>"); // m20에 더하기 3을해서 출력 


function sum4(a,b,c,d){ // 숫자4개를 더하는 함수 
	return (a+b+c+d); 
}

var result = sum4(1,2,3,4);

document.write( result +"<br>"); 

/*
1. 
현재 수강중인 과목은 00다 라고 출력해주는 함수를 만들어 보세요 . 

매개변수 : 00 

'자바' -> 현재 수강중인 과목은 자바다 
'html'-> 현재 수강중인 과목은 html다 
'css'-> 현재 수강중인 과목은 css다 
*/ 


function prtClass(str){
	document.write("현재 수강중인 과목은 "+ str +"다 <br>"); 
} 

prtClass('자바'); 
prtClass('HTML');
prtClass('CSS');

/*
2. 문자와 숫자를 전달하면 ex) 'hello', 3 
    hello가 3번 출력되는 함수를 만들어보세요 
  */ 
function prtStrN(str, a){
	// n번 반복하는 for문 
	for(let i = 0 ; i < a ; i ++){
		document.write(str+"<br>"); 		
	}
} 
prtStrN('hello', 3 );
prtStrN('hi', 5 );
prtStrN('안녕하세요', 1 );
/*
3. 숫자를 전달하면 '홀수' 혹은 '짝수' 를 반환하는 함수를 만들어보세요 
// odd - 홀 even - 짝
*/ 
function oddEvenNum(n){
	if ( n % 2 == 0 ){
		return '짝수';
	}else {
		return '홀수';
	}
}
var result1 = oddEvenNum(123);
document.write(  oddEvenNum(123)  +"<br>");
var result2 = oddEvenNum(22);
document.write(result2+"<br>");

/*
4. 두 수를 전달 받아서 더 큰값을 반환하는 함수를 만드세요 . 
(          매개변수              return )


*/

function bigger(n1, n2){
	if ( n1 > n2 )
		return n1;
	else
		return n2; 
}
// Math.max(10,2)
var res = bigger(10 , 2 ) ;
document.write(res+"<br>");
var res = bigger(1 , 2 ) ;
document.write(res+"<br>");


function input(){
	var n1 = Number(prompt("첫번째 숫자 : "))
	var n2 = Number(prompt("두번째 숫자 : "))
	var r1 = add(n1,n2);
	var r2 = sub(n1,n2);
	
	document.write(n1 + ", " + n2 + "<br>");
	document.write("더하기 값: " +r1+"<br>");
	document.write("빼기 값: " +r2+"<br>");
	
}
/*
function 함수이름(매개변수1,..., 매개변수n){  
			// 코드 
			return 반환할값; // 값을 반환 할 수 있다. 
		}
*/		
		
function add(num1,num2){
	return num1+num2;
}

function sub(num1,num2){
	return num1-num2;
}


input(); // 함수 호출 







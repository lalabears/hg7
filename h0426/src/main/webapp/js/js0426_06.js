var n = 10; 
document.write(n)

function myFunc(){
	// 코드가 들어감.. 
	document.write("안녕하세요 <br> "); 
	document.write("hi <br> "); 
	document.write("hello <br> "); 
}

myFunc(); // 함수 호출문 : 함수명();
//myFunc(); // 재사용하기 쉽다. 

function call2(){
	document.write("2를 가지고 있습니다.");
	return 2;  // 함수를 호출했을때 반환해주는 값 
}

call2();


var n = call2(); 
console.log(n);
/*
function 함수이름 ( 매개변수1, 매개변수2, .... ){
	함수가 호출됫을때 실행하고자 하는 실행문 
	
	return 함수를 호출했을때 반화하는 값 
}
*/
document.write('<hr>');

var num1; 

function addNum(x, y){
	var sum = x + y ;
	return sum; 
}
console.log(addNum(2, 3)) ; // x = 2, y =3 
num1 = addNum(3, 4); // x = 3, y =4 
console.log(num1); // 7 



document.write(n);

function multi10( x ){
	return 10*x ; 
}

// 5. + 숫자 두개를 전달받아서 더 큰수를 반화하는 함수 
// 6. 숫자 두개를 전달받아 n1부터 n2까지 합계를 반환하는 함수

// 1. 안녕하세요 반갑습니다 를 출력하는 함수 
function hello(){
	document.write("안녕하세요 <br>");
	document.write("반갑습니다 <br>");
}

hello();
function prt(str){
	document.write( str + "<br>");
}
prt("안녕하세요")
var str1 = "어머니가 사과10개를 사오셨어요";
prt(str1);

// 2. 숫자 하나를 전달하면 제곱을 출력하는 함수 

function sqrt(x){
	return x*x; 
}

var a = sqrt(2);
prt(a);
prt(sqrt(3));

// 3. 숫자 두개를 전달하면 사칙연산을 출력해주는 함수 
function prt4(n1,n2){
	document.write(`${n1} + ${n2} = ${n1+n2}  <br>`); // +
	document.write(`${n1} - ${n2} = ${n1-n2}  <br>`); // -
	document.write(`${n1} * ${n2} = ${n1*n2}  <br>`); // *
	document.write(`${n1} / ${n2} = ${n1/n2}  <br>`); // /

}

prt4(10,3);
prt4(20,10);



// 4. 숫자 세개를 전달하면 숫자 세개의 합을 반환하는 함수 

function sum3(x,y,z){
	return x+y+z ;
}

prt(sum3(1,2,3));
prt(sum3(2,3,4));














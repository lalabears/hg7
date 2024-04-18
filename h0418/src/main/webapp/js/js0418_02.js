/* 

 긴 주석은 이렇게 사용하시면 됩니다 .

*/

 // 한줄 주석은 이렇게 사용하시면됩니다.
 
 // 주석 :  ctrl + shift + c
 
 // 변수는 데이터를 담는 그릇이다.   
 
 var number; // 변수 선언 
 // var 변수명 
 
 number = 100; // 변수 선언하고 초기화
 
 var num = 10;  // 변수를 선언함과 동시에 초기화 할 수 있다. 
 
 // Var num1 =10 ; -> 대소문자를 구별하기 때문에 사용할 수 없음 
  
 /*
 자바스트립트는 대소문자를 구분합니다. -> 정확하게 대소문자를 구별해 사용해야함
 예약어는 사용하실 수 없습니다.  */
 
 var month, day ;   // 한번에 여러변수를 선언 할 수 있다. 
 
 var h= 7, min=15;  // 한번에 여러변수 선언과 동시에 초기화 가능
 
 month=10, day=5;   // 여러변수를 한번에 초기화 가능 
 
 
 
 /*
 var - 같은 변수명으로 여러번 선언을 해도됨 , 
       값도 업데이트 가능함. 
let - 한번만 선언 할 수 있음. 
       값은 업데이트 가능함
const - 한번만 선언하고 값변경이 불가능함  

*/


var a = 1; 
a = 100; 
a = "그냥 문자해";
var a = 3.14; 
a = true; 

let b = 3; 
b = "A";

// let b = 1234; 

const c = 123; 
// c = 49;  // 값 변경이 불가능  
console.log(c);


document.write("<h1>제목</h1>");

var name = "홍길동" ; 

document.write(name);

// 문자열
var str = 'hello';
document.write(str);
document.write('<br>'); 

var num = 100; 
document.write(num);
document.write('<br>'); 
document.write(10);   // 숫자 10
document.write('<br>'); 
document.write("10"); // 문자 10

document.write('<br>'); 
document.write("안녕하세요"); 

var h = "안녕하세요";
/*
document.write(h); 
console.log(h);
alert(h);
*/

// boolean - 참 혹은 거짓을 넣어 사용할 수 있음 

var bool = true; // 참, 
var bool2 = false; // 거짓

var True = "참"; 



// 참, 거짓 
// true (0) True(X) false(0) False(X)

console.log(True);


var n1; 
var n2 = null; 

document.write('<br>');
document.write(n1);  // 값이 뭔지 모르겟다
document.write('<br>');
document.write(n2);  // 값은 빈공백이다. 



/*-----------------------------------*/

// 1. 숫자 

/*자바스크립트는 다른언어들과는 달리
정수랑 실수를 구분하지 않음 
매우 큰 수나 작은수를 표현한때 e를 사용
할 수 있음  */


var n1 = 10; 
var n2 = 10.00001; 
var n3 = 10e3; //1000
var n4 = 10e-6; // 0.00001


/* 문자열 String
큰따옴표나 작은따옴표 안에 둘러쌓인
문자들의 집합  */

var str1 = "문자열입니다";
var str2 = '저도 문자열입니다 ';
var str3 = '저는 "홍길동"입니다';
var str4 = "저는 '홍길동'입니다";

var str5; 
// str5 = "저는"홍길동"입니다".

/*
이미지를 가지고 오는 html 태그를 변수로
선언하고 html에 document.write함수를
사용해서 
변수를 사용하여 이미지를 출력해보세요.
 */

// 문자열 -> 변수로 


var imgstr ;  // 변수를 선언하고 
imgstr = '<img src="images/c1.jpg" alt="내용">' ; // 변수에 값을 넣어줌 
 
document.write(imgstr); // 변수를 출력 

var tbstr = '<table border="1"><tr> <td>10</td> <td>20</td> </tr><tr> <td>30</td> <td>40</td> </tr></table>';

document.write(tbstr);

var ts1 = '<table>';
var ts2 = '<tr> <td>10</td> <td>20</td> </tr>';
var ts3 = '<tr> <td>30</td> <td>40</td> </tr>';
var ts4 = '</table>';

document.write(ts1);
document.write(ts2);
document.write(ts3);
document.write(ts4);

document.write(ts1+ts2+ts3+ts4);



var s1 ="안녕";
var s2 = "하세요";
var s3 = s1+s2;

// 문자열의 더하기는 문자열을 하나로 합친다 

document.write('<br><br><br>');
document.write(s3);

document.write('<br><br><br>');
document.write("제 이름은"+" 홍길동입니다");

/*자바스크립트는 숫자랑 문자열을 
더해서 사용하실 수 있습니다. 
이경우, 자바스크립트가 숫자를 문자열로
자동으로 바꿔서 두 문자열을 더하는 
연산을 수행합니다. 
*/

var a1 ="저는 "
var a2 = 20; 
var a3 ="살 입니다."

document.write('<br><br><br>');
document.write(a1+a2+a3);

 
 document.write('<br><br><br>');
 var a1 = 10;  // 숫자 > 더하기 할 수 있음
 var a2 = "10"; // 문자 > 
document.write(a1+10); // >> 20
document.write('<br>');
document.write(a2+10); // >> 1010

/*
불리언 boolean
참(true), 거짓(false)으로 표현함 
 */
 
 var n1 = 10; 
 var n2 =20 ;
 document.write('<br><br><br>');
 document.write( n1 == n2 );

var bol1 = false; 

/* typeof 연산자
피연산자의 타입을 반환하는 연산자  */
document.write('<br><br><br>');
document.write( typeof 10);
document.write('<br>') 
document.write( typeof n2);
document.write('<br>') 
document.write( typeof bol1);
document.write('<br>') 
document.write( typeof a2);


// 변수 v1은 201 v2는 "hello" 를 선언하고.
// 각각의 타입을 출력해보세요. 콘솔창에 ...  

var v1 = 201; 
var v2 = "hello";

console.log(typeof v1);
console.log(typeof v2); 

/*
null과 undefined
null 은 아직 값이 정해지지 않은것 
undefined 타입도 정해지지 않은것 
*/
var v3 ; 
var v4 = null; // object 타입의 null값 

 
 console.log(typeof v3); 
 console.log(typeof v4); 
 
 // object 
 var dog = {name:"해피", age:3}; 
 document.write("강아지이름은"+dog.name);

// 배열 - 하나의 변수에 여러가지 값을 저장할 수 있음 

var s1 = "봄";
var s2 = "여름";
var s3 = "가을";
var s4 = "겨울";

var season = ["봄","여름","가을","겨울"];
document.write("<br>"+season[0]+season[1]+season[2]+season[3]+"<br>");
 
 
 /* */
 
var num = 100; 
num = "안녕하세요";
num = true; 

console.log(5+"4");
 
console.log("5"*"4");

console.log(1-"문자열");

/*
Number("문자") -> 숫자
String(true) -> "true"
Boolean(0) 
0 ->거짓,  1-> 참 
 */
var a1 = Number("10");
console.log(typeof a1);  // 숫자 

var a2 = String(true);
console.log(typeof a2);

var a3 = Boolean(0);
console.log(a3);

var a4 = Number(true); // 참은 숫자 1 거짓은 숫자 0 
console.log(a4); 
 

var a5 = Number("A");
console.log(a5); 
 

 
 
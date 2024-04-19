

// 한줄 주석

/* 여러줄 주석  */

//웹 화면에 나타남
document.write("<h2>js 에서 작성된 글자입니다. </h2>");
document.write("태그없이 작성한 문구입니다.");

document.write('<br><a href="https://www.google.com" target="_blank">구글</a>');


//콘솔창에는. 
console.log("안녕");
console.log(2);

// 
/*
alert("경고창");

confirm("확인창");

prompt("질문창");
*/

// 변수 선언 방법 

// var, let 
/*
var 변수명 ; 
var 변수명 = 값 ; 

let 변수명;
let 변수명 = 값; 
*/

var num ; 
num = 100 ; 
var num = 1000 ;

console.log(num);

let num1 = 10; 
//let num1 = 10; // 같은 이름으로 선언 할 수 없음



num = "한글"; // 문자열
num = 3.14 ; // 숫자 - 정수. 실수 . 

document.write(num+num1); // 3.14 + 10 

num1 = "100"; 
document.write("<br>");
document.write(num+num1); // 문자 + 숫자 => 숫자를 문자로 바꿔서 문자+문자 

var str1 ="안녕";
var str2 ="하세요";
document.write("<br>");
document.write(str1+str2); // 안녕+하세요 => 안녕하세요 


document.write("<br>");
var sub = "html"; //"자바스크립트"; 

document.write("이 수업은 "+ sub +" 수업입니다");

var a1 = 100; 
var a2 = 5.23; 
var a3 = "css";
var a4 = "A";
var a5 = true; 
var a6 = false;
var a7 = null;
var a8 ; 

// typeof 

console.log(typeof a1); 
console.log(typeof(a2)); 
console.log(typeof(a3));
console.log(typeof(a4));
console.log(typeof(a5));
console.log(typeof(a6));
console.log(typeof(a7));
console.log(typeof(a8));


/*
1. 테이블을 그린다. >javascript에서

2. 국어를 변수(변수명:  subj) 로 만들어서 
   국어를 영어로 바꾼다

*/
var subj = "과학";

var tstr1 = "<table><tr><th>이름</th><th>과목</th><th>점수</th></tr>";
var tstr2 = "<tr><td>홍길동</td><td>"+subj+"</td><td>100</td></tr>";
var tstr3 = "<tr><td>유관순</td><td>"+subj+"</td><td>90</td></tr>";
var tstr4 = "<tr><td>이순신</td><td>"+subj+"</td><td>95</td></tr>";
var tstr5 = "<tr><td>강감찬</td><td>"+subj+"</td><td>80</td></tr></table>";

document.write(tstr1+tstr2+tstr3+tstr4+tstr5);



































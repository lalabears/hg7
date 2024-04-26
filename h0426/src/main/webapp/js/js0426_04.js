var today = new Date();
var year = today.getFullYear();
console.log(year);
var lastday = new Date(year, 11, 31);
// Tue Dec 31 2024 00:00:00 GMT+0900 (한국 표준시)
console.log(lastday);
var time = today.getTime();
console.log(time); // 1714110005197
var result = lastday.getTime() - time; 
var result2 = result/ ( 60*1000 * 60 * 24 ); 
console.log("D-day : " + Math.ceil(result2));



var strKo = '한글';
var strEn = "ABC"; 

var lnKo = strKo.length; 
var lnEn = strEn.length;

console.log(lnKo) ; // 2
console.log(lnEn) ; // 3 

console.log("아주 긴 문장을 출력 할 경우에는 \
역슬레시(원화)를 사용하면 줄바꿈을 할 수 있습니다.\
또 다른 한가지 방법은 " + " +를 사용해서 끊어서 줄을"
+" 나눌 수 있습니다. ")

var num = 10;
var numObj = new Number(10); 


var str = "문자열";
var strObj = new String("문자열");

console.log(typeof(str));  // string
console.log(typeof(strObj)); // object

console.log(str == strObj); //true
console.log(str === strObj); // false


var str = 'abcDEFabc'; 
//         012345678
var n1 = str.indexOf('abc');
console.log(n1); // 0
var n2 = str.indexOf('abc',3);
console.log(n2); // 6

// 찾을 수 없을때 -1을 반환함 
var n3 = str.indexOf('f');
console.log(n3); // -1  

var n4 = str.indexOf('abcd');
console.log(n4); // -1

var n5 = str.indexOf('c',4);
console.log(n5); // 2

var str = 'abcDEFabc'; 
//         012345678

var a1 = str.charAt(0);
console.log(a1); //a
var a2 = str.charAt(10); 
console.log(a2); // 빈문자열을 반환함. 

var a3 = str.charCodeAt(0); // 97
console.log(a3);

var str = 'abcDEFabc'; 
//         012345678 //             -4-3-2-10  
var b1 = str.slice(2,6); 
document.write(b1+"<br>")
// 음수로 전달된 인덱스는 문자열의 뒤에서부터
var b2 = str.slice(-4,-2); 
document.write(b2+"<br>"); // Fa
// 인덱스부터 끝까지 
var b3 = str.slice(2); 
document.write(b3+"<br>");
// substring(시작인덱스, 끝인덱스)
var b4 = str.substring(2,6);
document.write(b4+"<br>");
// substr(시작인덱스, 추출갯수)
var b5 = str.substr(2,6);
document.write(b5+"<br>");

var b6 = str.slice(1,0);
document.write(b6+"<br>"); // 빈공백
var b7 = str.substring(1,0);
document.write(b7+"<br>"); // a 

var str = "자바스크립트";
var str1 = str.concat("는 너무 어려워요<br>");
var str2 = str.concat("는 너무 어려워요. \
그렇지만 재미있어요. <br>");


document.write(str+"<br>");
document.write(str1);
document.write(str2);

var str = 'JavaScript';
document.write(str.toUpperCase()+"<br>");
document.write(str.toLowerCase()+"<br>");


var str = "                   java   script           ";
console.log(str);
console.log(str.trim());
// trim() 문자열의 앞뒤 공백제거 
var newstr = str.trim();
console.log(str.length); // 43
console.log(newstr.length) // 13

//var name = prompt("이름을 입력해주세요 ");
//document.write(name.toUpperCase()+"<br>");



var str = "안녕하세요 반갑습니다! 또 만나요."; 

var s1 = str.split(); // 아무 동작을 하지 않습니다. 
var s2 = str.split(""); // 한 문자씩 나눔
console.log(s2) 
var s3 = str.split(" "); //띄어쓰기 단위로 나눔 
console.log(s3) 
// (4) ['안녕하세요', '반갑습니다!', '또', '만나요.']
var s4 = str.split("!");
console.log(s4) ;
//(2) ['안녕하세요 반갑습니다', ' 또 만나요.']

document.write( "<hr> ")
var t = 
   "Hello Thank you good luck to you";
//  01234567....
//* 1. charat을 사용해서 g출력
console.log(t.indexOf('g'));
var n = t.indexOf('g'); 
document.write( t.charAt(n) + "<br>");
//* 2. you의 인덱스를 출력
document.write( t.indexOf('you') + "<br>");
// 3. 두번째 you의 인덱스 
document.write(  t.indexOf('you',13) + "<br>");
document.write(  t.lastIndexOf('you') + "<br>");
//* 4. substr을 사용해서 luck 출력
console.log(t.indexOf('luck')); // 21 
var n = t.indexOf('luck'); 
document.write( t.substr(n, 4) + "<br>");
//  5. substring을 사용해서 Thank 출력 
console.log(t.indexOf('Thank')); // 21 
var n = t.indexOf('Thank'); // 6, 12
document.write( t.substring(n, (n+5)) + "<br>");
// 6. 전체 문장을 대문자로 출력
document.write( t.toUpperCase() + "<br>");
// 7. 전체 문장을 소문자로 출력 
document.write( t.toLowerCase() + "<br>");
//* 8. 문장의 길이는 ? 
document.write( t.length + "<br>");

var s = t.split(" ");
document.write( s + "<br>");
//[ Hello , Thank, you, good, luck, to, you]
//   0        1       2    3     4    5   6 
//* 9. split을 사용해서 Hello출력
document.write( s[0] + "<br>");
//  10. split을 사용해서 luck출력
document.write( s[4] + "<br>");


document.write( t.search("you") + "<br>");
document.write( t.match("luck") + "<br>");

document.write( t.replace("you","me") + "<br>");
// Hello Thank me good luck to you

/*
전화번호를 입력을 받아서 끝에 4자리는
 ****로 출력해주세요
01012345678 
0101234****
*/

var phone = '01012345678';
var result = phone.substring(0,phone.length-4)+"****";

document.write(result);
//   0101234****

var str = 'ABCDE';
       //  01234567
console.log(str.indexOf('F'));  // 없으면. -1 반환함. 
console.log(str.indexOf('D'));  // 3을 반환함 


// 이메일 주소를 입력을 받아서 
// var myemail = prompt("이메일 주소를 입력해주세요 "); 
var myemail =  'aa@naver.com';
var ck1 = false; // 잘못된형식
var ck2 = false; // 잘못된형식 
if ( myemail.indexOf('@') > 0 ){
	ck1 = true; // @있으면 맞는 형식이다. 
}
var end = [ '.co.kr', '.com', '.net', '.or.kr' ];
//             0          1      2         3 
//  end 로 끝나지 않으면 잘못된 형식입니다 라고 출력해보세요 for, if , indexof()
for(let i = 0 ; i < end.length ; i ++){
	if (myemail.indexOf(end[i]) > 0  ){
		ck2 = true;  // end 로끝나면 맞는형식이다. 
	}	
}
if( ck1 && ck2 ){
	alert("올바른형식")
}else{
	alert("잘못된 형식입니다")
}


















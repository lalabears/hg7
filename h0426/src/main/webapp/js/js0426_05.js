
var str1 = "Hello world<br>";
var str2 = 'Hello world<br>';
var str3 = `백틱을사용하서 문자열 만들기<br>`;

document.write(str1);
document.write(str2);
document.write(str3);

var kor = 90; 
document.write("홍길동의 국어점수는 "+ kor +"점입니다.<br>" );

document.write(`홍길동의 국어점수는 ${kor}점입니다.<br>` );

var a = 10; 
var b = 5; 

document.write(`${a+b} 이렇게도 사용 가능합니다. .<br>` );

var sent = `백틱은
줄바꿈을 표현해줍니다.`
console.log(sent);

var sent1 = "그냥스트링은\n 역슬레시엔으로 줄바꿈을 표현함";
console.log(sent1);
// 백틱을 사용해서 
var n1 =10, n2 = 20 ;
//    백틱은 변수를 ${변수명} 의 형식으로 사용함. 
// 사칙연산을 출력해보세요 > 10 + 20 = 30 
document.write(`${n1} + ${n2} = ${n1+n2}  <br>`); // +
document.write(`${n1} - ${n2} = ${n1-n2}  <br>`); // -
document.write(`${n1} * ${n2} = ${n1*n2}  <br>`); // *
document.write(`${n1} / ${n2} = ${n1/n2}  <br>`); // /


var num = 5; 
var fruit = '사과'
// 어머니께서 사과를 5개 사오셨습니다.  > 백틱을 사용해서 출력해보기 

document.write(`어머니께서 ${fruit}를 ${num}개 사오셨습니다.<br>`);
// 숫자를 입력을 받아서 어머니께서 사과를 n개 사오셨어요.
// var n = Number(prompt("숫자입력"));
document.write(`어머니께서 ${fruit}를 ${Number(prompt("숫자입력"))}개 사오셨습니다.<br>`);
 
 // 1.7976931348623157e+308



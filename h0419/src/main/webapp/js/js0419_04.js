/*
+, - , *, /,% 를 화면에 출력해보세요

화면 
20 + 7 =  결과값
20 - 7 =  결과값
20 * 7 =  결과값
20 / 7 = 결과값
20 % 7 =  결과값
*/
var b = "<br>";
var num1 = 20; 
var num2 = 7; 
var r1 = num1 + num2;
var r2 = num1 - num2;
var r3 = num1 * num2;
var r4 = num1 / num2;
var r5 = num1 % num2;



document.write( num1 + " + " + num2 + " = " + r1 );
document.write(b);
document.write( num1 + " - " + num2 + " = " + r2 );
document.write(b);
document.write( num1 + " * " + num2 + " = " + r3 );
document.write(b);
document.write( num1 + " / " + num2 + " = " + r4 );
document.write(b);
document.write( num1 + " % " + num2 + " = " + r5 );
document.write(b);


document.write("<hr>");




/*
두 수를 입력 받아서  (prompt) 더 작은 수를 출력하세요
 > 삼항연산식 사용 
(표현식 ? 값1 : 값2 ) 표현식이 참일땐 값1, 거짓일땐 값2
*/

// 입력 
var n1, n2 ;
n1 = Number(prompt("첫번째 숫자를 입력해주세요 >> ") );
n2 = prompt("두번째 숫자를 입력해주세요 >> ") ;
n2 =Number(n2);

// 숫자 비교 삼항식 
var ans; 

ans = ( n1 < n2) ? n1 : n2 ;
//ans = ( Number(n1) < Number(n2)) ? n1 : n2 ; 

// 출력
document.write("더 작은 수는 "+ ans + "입니다.");


document.write("<hr>");
/*
키를 입력받아서 (prompt) ( 평균체중 = (키 - 100) * 0.9)
평균체중을 출력하세요 
출력 : 
평균체중: 
*/



var h =  Number(prompt("키를 입력해주세요 >> ") );

var avgw = (h-100) * 0.9 ; 

document.write("평균체중 : " + avgw);






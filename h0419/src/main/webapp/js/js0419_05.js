

var str = ""; 

document.write(str+"<br>");

str = "안녕하세요.";

document.write(str+"<br>");

str = str + " 반갑습니다.";
     // 안녕하세요 + 반갑습니다. 
document.write(str+"<br>");

str += " 감사합니다."

document.write(str+"<br>");


var tstr = "";
document.write(tstr+"<br>");

var n1 = Number(prompt("첫번째 숫자를 입력하세요 ")); 
var n2 = Number(prompt("두번째 숫자를 입력하세요 "));
tstr = "<table>"; 
tstr += "<tr><td>더하기</td><td>"+n1+"</td><td>+</td><td>"+n2+"</td><td>=</td><td>"+(n1+n2)+"</td></tr>";
tstr += "<tr><td>빼기</td><td>"+n1+"</td><td>-</td><td>"+n2+"</td><td>=</td><td>"+(n1-n2)+"</td></tr>";
tstr += "<tr><td>곱하기</td><td>"+n1+"</td><td>*</td><td>"+n2+"</td><td>=</td><td>"+(n1*n2)+"</td></tr>";
tstr += "<tr><td>나누기</td><td>"+n1+"</td><td>/</td><td>"+n2+"</td><td>=</td><td>"+(n1/n2)+"</td></tr>";
tstr += "<tr><td>나머지</td><td>"+n1+"</td><td>%</td><td>"+n2+"</td><td>=</td><td>"+(n1%n2)+"</td></tr>";
tstr += "</table>";

document.write(tstr+"<br>");
/*

<table>
<tr><td>더하기</td><td>20</td><td>+</td><td>7</td><td>=</td><td>20+7</td></tr>
<tr><td>빼기</td><td>20</td><td>-</td><td>7</td><td>=</td><td>20-7</td></tr>
<tr><td>곱하기</td><td>20</td><td>*</td><td>7</td><td>=</td><td>20*7</td></tr>
<tr><td>나누기</td><td>20</td><td>/</td><td>7</td><td>=</td><td>20/7</td></tr>
<tr><td>나머지</td><td>20</td><td>%</td><td>7</td><td>=</td><td>20%7</td></tr>
</table>

*/
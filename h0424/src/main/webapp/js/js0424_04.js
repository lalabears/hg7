
// 문자열은 따옴, 작은따옴표 안에 있다.
// 문자열은 그대로 출력이 된다. 

var str1 ;
var a = " 반갑습니다";
str1 = "안녕하세요"+ a  +" 감사합니다."; 
document.write(str1);

var str2 ;
str2 = "<h1>제목입니다</h1>"
document.write(str2);

var str3 ; 
var n = 11; 
str3 = "<p style='color:red;'>빨간색 숫자 : "+ n  +" </p>";

document.write(str3);


var str4; 
str4 = '<table><tr><td>10</td></tr><tr><td>20</td></tr><tr><td>30</td></tr></table>';

document.write(str4);


var str5 ; 

str5 = '<table>' + '<tr><td>10</td></tr>' +'<tr><td>20</td></tr>'+ '<tr><td>30</td></tr>'+'</table>';

document.write(str5);


var str6 =''; 
/*str6 = str6 + '<table>' ; 
str6 = str6 + '<tr><td>10</td></tr>';
str6 = str6 + '<tr><td>20</td></tr>';
str6 = str6 +  '<tr><td>30</td></tr>';
str6 = str6 +  '</table>';
*/

str6 += '<table>' ; 
str6 += '<tr><td>'+ 1 + '</td></tr>';
str6 += '<tr><td>'+ 2 + '</td></tr>';
str6 += '<tr><td>'+ 3 + '</td></tr>';
str6 +=  '</table>';

document.write(str6);

var str7 ='';
str7 += '<table>';
for(var i = 1 ; i <=5 ; i++  ){
	str7 += '<tr><td>'+ i + '</td></tr>';
}
str7 += '</table>';

document.write(str7);




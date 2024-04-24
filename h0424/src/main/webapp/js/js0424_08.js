
var num = [1,2,3,4,5];

//  1. push()

num.push(6,7,8);
document.write(num.length+"<br>");

// 2. pop()
document.write(num +"<br>");
num.pop();
document.write(num +"<br>");
document.write(num.length+"<br>");

var n1 = [10 , 21 , 2, 5, 1]; 
var con = ['로마', '나라','가나','미국'];
document.write(n1 +"<br>");
n1.sort();
document.write(n1 +"<br>");
con.sort(); // 한글일 경우 가나다 순으로 .. 
document.write(con +"<br>"); 


var a = [1, true, 'hello'];

var str1 = a.join(); // '1,true,hello' 
document.write( str1 );
var str2 = a.join('+'); // '1+true+hello'
document.write("<br>"+str2);
var str3 = a.join(' ');
document.write("<br>"+str3);

var b = ['010',1234,5678];
var str4 = b.join('-');
document.write("<br>"+str4);

/*push()는 
하나 이상의 요소를 배열의 가장 마지막에 
추가합니다.
추가한 만큼 배열의 길이가 늘어남

pop() 
배열의 가장 마지막 요소를 제거 
배열의 길이가 하나씩 줄어든다. 

sort()
배열의 요소를 문자열로 보고. 
알파벳 순서대로 정렬 
- 숫자는 원하는대로 정렬이 되지 않을 수 있음 

join() 
배열의 모든 요소를 하나의 문자열로  반환







*/












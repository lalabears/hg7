/*
2 * 1 = 2 
2 * 2 = 4 
2 * 3 = 6 ..
*/

// 1. for 문을 사용해서 0-9까지 출력해보세요 
var str ='';

for (let i = 0 ; i<10; i++){
	str = str+i; 
	// i가 0일때, str '' + (0)   -> str '0'  
	// i   1     '0'    + 1    ->    str '01'
	// i   2    '01'    + 2       str  '012'
	// i   3    '012'   +3        str  '0123'
	// i   9    '012345678' +9    str = '0123456789'
}
document.write(str);
document.write('<br>');




var n = 9 ; //n단을 출력하고싶다 

for (var i = 1 ; i <=9 ; i++){
	document.write( n + " * "+ i + " = " +(n * i) + "&nbsp;&nbsp;&nbsp;&nbsp;");
}
document.write("<hr>");
//n도 2 - 9 바뀌고 for
//곱해지는 부분 1- 9 까지 바뀐다. for   

// 1. 구구단 그냥 출력하기 (1-9  단까지 출력하기 ) 
for (var i = 2 ; i <=9 ; i++){ 
	// 변수 i는 단으로 사용
	document.write("[ " + i + " 단 ] <br>");
	
	for (var j = 1 ; j <=9 ; j++){
		// 변수 j는 곱해지는 값으로 사용 
		document.write( i + " * "+ j + " = " + (i*j) + "<br>");
	}
}



document.write("<hr>");
// 2. 구구단 열 바꿔서 출력하기 
document.write('[2단]&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;'+
'[3단]&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;'+
'[4단]&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;'+
'[5단]&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;'+
'[6단]&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;'+
'[7단]&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;'+
'[8단]&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;'+
'[9단] <br>');


for (var i = 1; i <=9 ; i++){
	
	for (var j = 2; j <=9 ; j ++){
		
		document.write( j + " * "+ i + " = " +(i*j) + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
		
	}
	document.write("<br>");
}





document.write('<a href ="https://www.google.com">구글</a>');

var n = 3 ; 
var n2 = 1; 
var n3 = 2; 
var str = '<table>'
str += '<tr><td colspan="5">[ ' + n + '단]</td></tr>'
str += '<tr><td>' + n + '</td><td>*</td><td>' + n2 + '</td><td>=</td><td>' + n*n2 + '</td></tr>'
str += '<tr><td>' + n + '</td><td>*</td><td>' + n3 + '</td><td>=</td><td>' + n*n3 + '</td></tr>'
str += '</table>';

var trtd="<tr><td>"

var htmlstr = '';

htmlstr = '<table>';

for (var i = 2 ; i <=9 ; i++){ 
	// 변수 i는 단으로 사용
	htmlstr += '<tr><td colspan="5">[ ' + i + '단]</td></tr>'
	
	for (var j = 1 ; j <=9 ; j++){
		// 변수 j는 곱해지는 값으로 사용 
		htmlstr += '<tr><td>' + i + '</td><td>*</td><td>' + j + '</td><td>=</td><td>' + i*j + '</td></tr>'

	}
}

htmlstr += '</table>';

document.write(htmlstr);














document.write("<hr>");
// 3. 구구단 테이블에 넣어보기 
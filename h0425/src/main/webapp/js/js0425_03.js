
var a = [1,2,3,4] ; 

//  a[0] a[1] a[2] a[3]

var a1 = [ [1,2]  ,  [3,4]   ];

document.write(a1[0]);
document.write("<br>");
document.write(a1[0][0]);
document.write("<br>");
document.write(a1[1][0]);

var a2 = [ 1 , 2 , ['A','B'] , 3, 4, ['C','D']]

//         0    1      2       3   4   5
document.write("<br>");
document.write(a2[5]);
//  'B' 를 출력
document.write(a2[2][1]);

var l1 = ['홍길동', 100 ];
var l2 = [  [ 2, 4, 6] , [ 1 , 3,  5 ]  ] ;
var l3 = [true, false, 3.14, 'hello', [1,2] , 5]; 
document.write("<br>");
document.write(typeof(l1));  // 배열은 object 타입
document.write("<br>");
document.write(typeof(l1[0])) ; // '홍길동' 
document.write("<br>");
document.write(typeof(l2[0][1])) ; // 4

document.write("<br>");
document.write(l2.length); // 2
document.write("<br>");
document.write(l2[0].length); // 3

// 100을 출력하려면 .. ?  
document.write("<br>");
document.write(l1[1]) ; 
// 6을 출력 하려면 .. ? 
document.write("<br>");
document.write(l2[0][2]);


l3 = [true, false, 3.14, 'hello', [1,2] , 5]; 
//     0     1       2     3         4    5
//                                 0 1

document.write("<br>");
document.write(l3[1]); //false 출력
document.write("<br>");
document.write(l3[3]);// hello 출력 
document.write("<br>");
document.write(l3[4][0]);// 1 출력 
document.write("<br>");
document.write(l3[5]); //5 출력 
document.write("<hr>");

var a3 = ['a','b','c','d','e','f'];
var a4 = [['a','b','c'],['d','e','f']];

// a3[0] a3[1]  a3[2]  a3[3]
for( let i = 0 ; i <a3.length ; i++){
	console.log(a3[i]); 
}

console.log(a4[0][0]); // i = 0 일때 j = 0
console.log(a4[0][1]); // i = 0 , j = 1
console.log(a4[0][2]); // i = 0,  j = 2 

console.log(a4[1][0]); // i = 1, j = 0
console.log(a4[1][1]); // i = 1, j = 1
console.log(a4[1][2]); // i = 1, j = 2

for (let i = 0 ; i <= 1 ; i ++ ){
	for (let j = 0 ; j <= 2 ; j ++ ){
		console.log(a4[i][j]);
	}
}

/*
for (let i = 0 ; i <= 3 ; i ++ ){
	document.write( 'i : ' + i + "<br>");
	for (let j = 0 ; j <= 3 ; j ++ ){
		document.write( 'j : ' + j + "<br>");
	}
	document.write("<hr>");
}
*/


var a5 = [['a','b','c'],['d','e','f'],[1,2],[3,4]];

var a5len = a5.length; //  4
var a50 = a5[0].length; // i = 0
var a51 = a5[1].length;  // i = 1
var a52 = a5[2].length;  // i = 2
var a53 = a5[3].length;   // i = 3
// 0에서부터 3까지 증가하는 변수 ?? 
// for문을 사용해서 요소 하나하나를 출력하려면 어떻게 해야할까요 .. ?? 

for (let i = 0 ; i < a5.length ; i ++ ){
	
	for (let j = 0 ; j < a5[i].length ; j ++ ){
		
		console.log(a5[i][j]);
	}
}


var score = [[80,90,85] ,[70,80,90],[84,92,80],[72,81,76]];

// for 문을 사용해서 하나하나 출력해보세요 length를 사용해서 .. 

for (let i = 0 ; i < score.length; i ++ ){
	for (let j = 0 ; j< score[i].length; j++ ){
		document.write(score[i][j]+"<br>")
	}
}

// var  n1 = ['홍길동','유관순','이순신'];
// var  s1 = [55, 80, 90];

var mem = [['홍길동',55],['유관순',80],['이순신',90]]; 
/*
    홍길동님 55점 -> mem[0][0]님 mem[0][1]점
    유관순님 80점 -> mem[1][0]님 mem[1][1]점
    이순신님 90점 -> mem[2][0]님 mem[2][1]점
*/
for (let i = 0 ; i <mem.length ; i ++){
	document.write(mem[i][0]+'님' +mem[i][1]+'점<br>');
}
/*
60 점 이하는 불합격, 이상은 합격을 출력해보세요 
홍길동 불합격
유관순 합격
이순신 불합격 */ 

for (let i = 0 ; i <mem.length ; i ++){
	
	if(mem[i][1] >= 60)
		document.write(mem[i][0]+'님' +' 합격<br>');
	else
		document.write(mem[i][0]+'님' +' 불합격<br>');
}

var n = [2,4,6,8,10] ;


var s = 0; 
for (let i = 0 ; i < n.length ; i ++ ){
	s = s + n[i];
}
console.log(s); 


var score = [[80,90,85] ,[70,80,90],[84,92,80],[72,81,76]];
/*
score[0][0] + score[0][1] + score[0][2]   => 출력
score[1][0] + score[1][1] + score[1][2]   => 출력
score[2][0] + score[2][1] + score[2][2]   => 출력
score[3][0] + score[3][1] + score[3][2]   => 출력
*/
//  
var s2 = 0 ;                         
for (let i = 0 ; i < 4 ; i ++ ){
	s2 = 0 ; // i = 0 일때 , i =1 일때 시작 합은 0이어야 하므로 ..
	for (let j = 0 ; j < 3 ; j++) {
		s2 += score[i][j]; 
	}
	console.log(s2);
}

var sum = [] ; // sum 배열에 총합을 넣어주기 

var s2 = 0 ;                         
for (let i = 0 ; i < 4 ; i ++ ){
	s2 = 0 ; // i = 0 일때 , i =1 일때 시작 합은 0이어야 하므로 ..
	for (let j = 0 ; j < 3 ; j++) {
		s2 += score[i][j]; 
	}
	sum.push(s2);
}
console.log(sum);

var sum1 = []; 
for (let i = 0 ; i < 4 ; i ++ ){
	sum1[i] = 0 ;
	for (let j = 0 ; j < 3 ; j++) {
		 sum1[i] += score[i][j]; 
	}
	
}
// -------------
var names = ['홍길동','유관순','이순신','김구']; 
//               255  240    256     229

// 조건문을 사용한다.. 
// 총합이 250 점 이상은 합격 . [ 홍길동님 합격입니다. 이순신님 합격입니다.]

// 만약에 250점이상이면 합격을 출력을 하는데. names 배열까지 사용해서 출력 

var s2 = 0 ;                         
for (let i = 0 ; i < 4 ; i ++ ){
	s2 = 0 ; 
	for (let j = 0 ; j < 3 ; j++) {
		s2 += score[i][j]; 
	}
	if( s2 >= 250 ){
		document.write(names[i] + ' 님 합격입니다.<br>');
	}
}

mem = [['홍길동',55],['유관순',80],['이순신',90]]; 
/*<table border="1"> 
<tr><td>mem[0][0]</td><td>mem[0][1]</td></tr>
<tr><td>mem[1][0]</td><td>mem[1][1]</td></tr>
<tr><td>mem[2][0]</td><td>mem[2][1]</td></tr></table> 
*/
var str = '';
str += '<table border="1">'
for (let i = 0 ; i < mem.length ; i ++){
	str += '<tr>';
	for(let j = 0 ; j <mem[i].length ; j++ ){
		str += '<td>'+ mem[i][j] +'</td>';
	}
	str += '</tr>';
}
str += '</table>';
document.write(str);

var arr2 =[ [1, "html", "4월"],[2, "css", "5월"],[3, "JavaScript", "6월"] ];
var tbstr = '';
tbstr += '<table border="1">'
for (let i = 0 ; i < arr2.length ; i ++){
	tbstr += '<tr>';
	for(let j = 0 ; j <arr2[i].length ; j++ ){
		tbstr += '<td>'+ arr2[i][j] +'</td>';
	}
	tbstr += '</tr>';
}
tbstr += '</table>';
document.write(tbstr);



for( var j in arr2 )  {}
for( var k of  arr2 ) {}


















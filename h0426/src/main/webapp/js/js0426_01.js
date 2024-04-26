
var number = ['one', 'two','three','four'];
//              0      1      2       3 
var t = number[1];

console.log(t);


// 배열에 값을 넣는방법 
number[4] ='five';

console.log(number.length) ; // 배열의 길이 

// 배열의 마지막에 값을 넣을 경우는 배열의 길이를 사용할 수 있다. 
number[number.length] = 'six';

number.push('seven');
number.push('eight', 'nine', 'ten');


for (let i = 0 ; i < number.length ; i ++ ){
	console.log(number[i]);
}

// 좋아하는 과일 5개를 입력받아 f 배열에 넣어보세요  
var f = []
for( let i = 0 ; i < 5 ; i ++ ){
	var a = '귤';//prompt("좋아하는 과일을 입력해주세요 ");
	f.push(a)
}
//  f = ['귤', '사과', '포도', '자몽', '망고'];
//         0    1       2      3      4    
// 만약에 f에 딸기가 있으면 [딸기가 있습니다.] 라고 출력
var cnt = 0 ; 
for (let i = 0 ; i < f.length ; i ++ ){
	if(f[i] == '딸기'){
		document.write("<p>딸기가 있습니다</p>");
		break;
	}else{
		cnt++; 
	}
}
console.log(cnt);
if( cnt == f.length  ){
	document.write("<p>딸기가 없습니다</p>");
}

// 배열안에 배열이 있는경우 
var num = [[1,2],3,4,[5,6,7],8];
//           0   1 2    3    4

console.log(num[0]);  // [1,2]
console.log(num[0][0]);  // 1
console.log(num[3][2]); // 7 

var tmp = [['A','B'],[1,2,3],['C','D'],[4,5,6]];
//             0        1         2        3
//           0   1    0 1 2      0  1    0 1 2 
// B와 5를 출력해보세요

console.log(tmp[0][1]);
console.log(tmp[3][1]);

console.log(tmp.length);   // 4 
console.log(tmp[0].length); // 2
console.log(tmp[3].length); // 3

for (let i = 0 ; i < tmp.length ; i ++){
	for( let j = 0 ; j < tmp[i].length ; j++){
		console.log(tmp[i][j]);
	}
}

var stu1 = ['홍길동', 60];
var stu2 = ['유관순', 80];
var student = [stu1, stu2]; 
var student1 = [['홍길동', 60], ['유관순', 80]]; 



var fru = [['딸기',15000],['망고',10000],['사과',5000]];
//        [0][0] [0][1] ,[1][0] [1][1], [2][0] [2][1]

// 뭐를 i로 써야하나 ? 
//document.write(fru[0][0] + ":" + fru[0][1] + "원<br>");
//document.write(fru[1][0] + ":" + fru[1][1] + "원<br>");
//document.write(fru[2][0] + ":" + fru[2][1] + "원<br>");

for(let i = 0 ; i <fru.length; i ++ ){
	document.write(fru[i][0] + " : " + fru[i][1] + "원<br>");
}

var lang = [ ['미국','영국','일본','중국','스페인'],
    ['영어','영어','일본어','중국어','스페인어'] ]
/* lang[0][0] 은 lang[1][0]을 사용합니다.
   lang[0][1] 은 lang[1][1]을 사용합니다. 
   lang[0][2] 은 lang[1][2]을 사용합니다.
*/
// 미국은 영어를 사용합니다. -> 5문장 출력해보기 
for(let i = 0 ; i < lang[0].length ; i ++ ){
	
	document.write( lang[0][i] +"은 "+ lang[1][i] +"를 사용합니다.<br>");

}


var n = [[1,2,3,4],[5,6],[7,8,9],[10,11]];
var sum = 0 ; 
// n에 들어있는 숫자들의 합을 구하세요 > 66

for(let i = 0 ; i < n.length ; i ++ ){
	// 4번 반복 
	for(let j = 0 ; j < n[i].length ; j ++){
		sum = sum + n[i][j]; 
	}
}
document.write("<p>배열 속 전체 숫자의 합계:"+ sum +"</p>");


/*
var ss = 0 ;
for (let i = 1 ; i< 11 ; i++){
	ss += i; 
}
*/
var num = [[1,2,3],[4,5,6],[1,3,5],[2,4,6]];
var mul = [] // 곱하기들 
var s = [] // 합계들
var su; 
for (let i = 0 ; i <num.length ; i ++){
	su = 0 ; 
	for(let j = 0 ; j < num[i].length ; j++ ){
		su += num[i][j];
	}
	s.push(su);
	
}
// 답 :  s [ 6, 15, 9, 12]

var ml ; 
for (let i = 0 ; i <num.length ; i ++){
	ml = 1 ; 
	for(let j = 0 ; j < num[i].length ; j++ ){
		ml = ml * num[i][j];
	}
	mul.push(ml);
}
// 답 : [6,120,15,48]

document.write("<p>더하기 배열: [ "+ s +" ]</p>");
document.write("<p>곱하기 배열: [ "+ mul +" ]</p>");


/*
안에 있는 작은 배열속 숫자들의 곱을 구해 새로운 배열에 넣으세요 
답 : [6,120,15,48]

     s [ 6, 15, 9, 12]

1. 전체 출력. 
2. 배열당 sum  -> 출력
3. push로  배열에 넣기 



document.write("<p>곱하기 배열: [ "+ mul +" ]</p>");




*/











var season = ['봄', '여름', '가을','겨울']; 
//              0     1      2     3
console.log( season[0] );
document.write(season);
for(var i = 0; i <= 3 ; i++ ){
	document.write('<p>'+season[i]+'</p>');
}

var num = [1,2,3,4,5]; 
var nlength = num.length; // 5
console.log(nlength);
// 0,1,2,3,4
for(var i = 0 ; i <nlength ; i++ ){
	document.write('<p>'+num[i]+'</p>');
}

// 홀수는 빨간글씨, 짝수는 파랑글씨로 출력 해보세요 
// <p style="color:red;">빨간글씨</p> 


for(var i = 0 ; i <nlength ; i++ ){
	if ( num[i] %2 == 0 ){
		document.write('<p style="color:blue;">'+num[i]+'</p>');
	}
	else{
		document.write('<p style="color:red;">'+num[i]+'</p>');
	}
}


// 배열명.push(추가하고싶은 요소들.. )

var a = ['A','B','C','D','E']; 
//        0  1    2    3   4  .. 
console.log("a 배열의 길이 :  " + a.length); // 5
a.push('F', 'G');
console.log("a 배열의 길이 :  " + a.length); // 7 
a[a.length] = 'H'; 
// a[7] 
a[8] = 'I'; 
console.log(a); 
delete a[2];  // C를 삭제 하고자 할때 사용 할 수 있음 
console.log(a); 
console.log("a 배열의 길이 :  " + a.length); 

// pop() 가장 마지막에 있는 요소를 삭제해줌 
//       배열의 길이에도 변화를 줌 

a.pop();
console.log( a );  // I없이 출력
console.log( a.length ); // 8 


var color = ['red','green','blue','white','black']; 
          //   0     1       2       3       4 
var color2 = color.slice(2); // n번째부터 끝까지 자른다
document.write(color +"<br>");
document.write(color2 +"<br>");
var color3 = color.slice(2,4);  // 2포함하고 4는 포함하지 않
document.write(color3 +"<br>");


var con = ['미국','영국','일본','중국','스페인'];
var lan = ['영어', '영어','일본어','중국어','스페인어'];
       //    0      1      2      3      4
// 1.각각의 리스트에 프랑스와 프랑스어를 추가해보세요

con.push('프랑스');
lan.push('프랑스어');

document.write(con+"<br>");// [미국,영국,일본,중국,스페인,프랑스]
document.write(lan+"<br>");// [영어,영어,일본어,중국어,스페인어,프랑스어]


// 2. for문을 사용해서 전체 출력

for (let i = 0 ; i < con.length ; i ++){
	document.write(con[i]+"은" + lan[i] +"를 사용합니다."+"<br>");
	
}




 
var comlan = ['c','java','python','jquery','swift','ruby']
/*
출력 : 1. c   2. java ...  6. ruby
*/ 

for (let i = 0 ; i <comlan.length ; i ++){
	document.write((i+1) + "."+ comlan[i] + "<br>");
}


var num = []
// 0 - 10 까지 num에 넣기 
/*for (let i = 0 ; i <=10 ; i++ ){
	// console.log(i);
	num.push(i);
}*/ 

// for 
// 0, 5, 10, 15, 20 을 출력. 
// push를 사용해서 배열에 넣어보세요 

for ( let i = 0 ; i < 21 ; i++ ){
	
	if(i%5==0){	// 5의 배수일때 
		// console.log(i);
		num.push(i);
	}
}




console.log(num); // [0,5,10,15,20] 










 








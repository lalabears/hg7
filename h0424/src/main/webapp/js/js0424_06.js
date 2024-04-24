
var num = [11 , 2 , 33, 4 , 55, 6,77,8,9,10];

// 1. 배열의 수를 하나씩 console.log로 출력해보기 - for사용

for (let i = 0 ; i < num.length ; i++ ){
	console.log(num[i]);
}

// 2. 배열 속에 있는 수의 합 구하기 - for 사용 
var sum = 0 ; 
for (let i = 0 ; i < num.length ; i++ ){
	sum = sum + num[i];
}
console.log(sum);

// 과일을 입력 받아서 fruits 배열을 채우기 (5개 입력 받음)

var fruits = [];
for(let i = 1 ; i <=5 ; i++){
	var f = prompt("좋아하는 과일 5개를 입력해주세요 ");
	fruits.push(f);
	
}

document.write(fruits);

// 자바스크립트는 3번째 과목입니다. 출력하기 - for , if 

var lectures =  ["html", "css", "javascript", "jQuery"];
var topic = "javascript";


for(let i = 0 ; i < lectures.length ; i ++) {
	if (lectures[i] == topic){
		document.write(lectures[i] + '는 '+ (i+1) +'번째 과목입니다');
	}
}
document.write("<hr>");
for(let i = 0 ; i < lectures.length ; i ++) {
	
	if (i == (lectures.length-1) ){
		document.write(lectures[i] + '는 마지막 과목입니다 <br>');
	}else{
		
		document.write(lectures[i] + '는 '+ (i+1) +'번째 과목입니다 <br>');
	}
	
}

/*
for 문을 사용해서 .. 
html은 1번째 과목입니다
css은 2번째 과목입니다 
javascript은 3번째 과목입니다
jquery은 4번째 과목입니다


이건 if가 필요합니다 
 (+ lectures.length 사용)  jquery은 마지막 과목입니다. 
*/












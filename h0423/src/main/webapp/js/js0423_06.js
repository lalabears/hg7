/*
조건문 - if, switch . 
반복문 - for.  while. 
for(초기식 ; 조건식 ; 증감식) {
     조건식이 만족하는 동안 반복될실행문 
}

while( 조건식 ){
      조건식이 참인 동안 반복적으로 실행하고자 하는 실행문 
}

for(;;){// 무한루프 }
while(true){// 무한루프 }
 */

var i = 1 ; 
while(i<=3){
	document.write("while <br>");
	i++;
}

for(let i = 1; i<=3; i++){
	document.write("for <br>");
}

i = 1;
while( i < 10 ){
	document.write(i+"<br>");
	i++;
	
}
/*
while(true){
	var n = prompt(".을 입력하면 프로그램을 종료합니다 ") ;
	if (n == '.') 	break;
	
}
*/

var sum = 0 ; 
var i = 1;
// 1- 5 까지의 합을 어떻게 구할까요 .. ?  
while(i<=5){
	sum += i;
	i++;
}
// i = 1 일때, sum = 0 + 1 = 1
// i = 2 일때, sum = 1 + 2 = 3 
// i = 3 일때, sum = 3 + 3 = 6 
// i = 4 일때, sum = 6 + 4 = 10 
// i = 5 일때, sum = 10 +5 = 15  

document.write(sum);


/*
do {
  조건식이 참일때 반복적으로 실행되는 실행문 
} while(조건식)

한번은 실행이 됨. */


var i = 0 ; 
do {
	i += 1 ;  // i++ 
	console.log(i);
} while(i<5)  // i 가 5보다 작지 않을때까지 반복


var i = 1, j = 1 ; 

while(i>3){
	document.write("i : " + i);
	i++;
}

do {
	document.write("j : " + j);
	j++;
	
}while( j > 3 )




document.write("<hr>");

// for 문으로 1-10까지 출력.
for(let i = 1; i<=10 ; i++){
	document.write(i + " ");
}
document.write("<br>");
// while문으로 1- 10까지 출력
var i = 0; 
while( i < 10 ){
	i++;
	document.write(i + " ");
}

// while문으로 1-10까지 3의배수만출력
document.write("<br>");
var i = 0; 
while( i < 10 ){
	i++;
	if (i % 3 == 0 ){
		document.write(i + " ");
	}
}

// while문으로 1-100 사이의 홀수를 출력 
document.write("<br>");
var i = 1; 
while( i <= 100 ){
	if ( i % 2 == 1){
		document.write(i +" ");
	}
	i++;
}

// while문으로 1-100 까지의 합 

document.write("<br>");
var i = 1; 
var sum = 0; 

while( i <= 100 ){

	sum = sum + i ;

	i++;
}
document.write("1-100까지의 합계 : " + sum);


// while문으로 1-100 까지의 합 ( 짝수 )
document.write("<br>");
var i = 1; 
var sum = 0; 

while( i <= 100 ){
	if (i % 2 == 0 )
		sum = sum + i ;

	i++;
}
document.write("1-100까지 짝수의 합계 : " + sum);










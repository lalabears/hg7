for (let i = 1 ; i <= 10 ; i++){
	// i가 1에서부터 10까지 1씩 증가하는 동안 실행되는 실행문
	document.write(i+" ");
}
document.write("<br>");
// 1. 1-100 사이의 5의 배수를 출력해보세요 (5,10,15,...)
for(let i = 5  ; i<=100 ; i += 5 ){
	document.write(i+" ");
}
document.write("<br>");
// 2. 1-100 사이의 홀수를 출력해보세요 1 3 5 7 9 ..
for(let i = 1  ; i<=100 ; i += 2 ){
	document.write(i+" ");
}
 
document.write("<br>");
/* 
3.  for (let i = 1 ; i <= 100 ; i++)
for 문과 if 문을 사용해서 (만약에 홀수일때 출력
  n % 2 == 0 이면 짝수, n %2 == 1 홀수 )
1-100 사이의 홀수를 출력해보세요
// 1 3 5 7 9 11 

*/
for (let i = 1 ; i <= 100 ; i++){
	
	if (i % 2 == 1){ // i 가 홀수 일때 
		document.write(i+" ");		
	}
	
}
document.write("<br>");
// 4. 50 에서 1 사이의 6의 배수를 역순으로 출력해보세요 (출력 : 48 42 36 30 24 18 12 6)

for (let i = 1 ; i<=10 ; i ++ ){
	// i 값을 1씩 증가 
	document.write(i+" ");	
}

document.write("<br>");

for (let i = 48 ; i>=1 ; i -= 6 ){
	// i 값을 1씩 증가 
	document.write(i+" ");	
}

document.write("<br>");
/*
1 - 5까지 합계 

sum = 1 + 2 + 3 + 4 + 5  > 15 
 i     =  1 2 3 4 5 

sum = 0 
sum = (0) + 1
       = sum + 1
sum = (0 + 1) + 2
       = sum + 2    
sum = (0 + 1 + 2) + 3
        = sum + 3
sum = ( 0 + 1+2+3) +4 
       = sum + 4
sum = (0+1+2+3+4) +5
       = sum + 5 


sum = sum + i 
sum += i 
 */

var sum = 0 ; 
var i = 1
for(i = 1; i <=5 ; i ++) {
	sum = sum + i ; 
	//document.write(i + "일때 합계 :" + sum +"<br>"); 
}
document.write("합계: " + sum);

// 1- 10까지의 합계 
sum = 0; 
for(i = 1; i <= 10 ; i ++) {
	sum += i ; 
}
document.write("<br> 1- 10까지 합계: " + sum);

// 1- 100까지의 합계 
sum = 0; 
for(i = 0; i <= 100 ; i ++) {
	sum += i ; 
}
document.write("<br> 1- 100까지 합계: " + sum);

// 1- 100까지의 홀수의 합계
sum = 0; 
for(i = 1; i <= 100 ; i ++) {
	if (i % 2 == 1){
		// 홀수 일때만 더해라 .. 
		sum += i ; 

	}
		
}
document.write("<br> 1- 100까지 홀수 합계: " + sum);



// 1- 100까지 짝수의 합계 
sum = 0; 
for(i = 1; i <= 100 ; i ++) {
	if (i % 2 == 0){
		// 짝수 일때만 더해라 .. 
		sum += i ; 
	}
}
document.write("<br> 1- 100까지 짝수 합계: " + sum);



//  숫자 하나를 입력받아 1에서부터 n까지의 합을 구하세요


var sum = 0 ; 
var i = 1
var n = Number(prompt("숫자를 입력해주세요: "));

// prompt 로 입력받은 숫자가 만약에 5 라면 
for(i = 1; i <= n ; i ++) {
	sum = sum + i ; 
}
document.write("<br> 1- "+n+"까지 합계: " + sum);

// 숫자 두개를 입력받아 n1-n2 사이 의 합계를 구해보세요


var n1 = Number(prompt("첫번째 숫자를 입력해주세요"));
var n2 = Number(prompt("두번째 숫자를 입력해주세요"));

sum = 0 ; 

for (var i = n1 ; i <= n2 ; i ++ ){
	sum = sum +i ; 
}
document.write("<br>"+ n1+"부터 "+n2+"까지의 합은 : "+sum);















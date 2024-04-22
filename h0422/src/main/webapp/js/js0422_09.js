// 1.  1-10까지의 곱 
var result = 1; 
// 1- 10까지의 합 
var sum = 0; 
for(i = 1; i <= 10 ; i ++) {
	sum = sum +i ; // 1-10까지의 합 
	result = result * i ; 
}
document.write("1-10까지의 곱: ", result);
/*
2. n번 반복하는 사칙연산기를 만드세요
 1. 반복할 숫자 입력 받기 3 이면 
 2. 계산할 숫자 2개 입력받기 ->
 2번입력출력   2개입력받고 출력   2개입력받고 출력
 10, 3              100, 25               8 2 
     4칙연산 그냥 출력하기 
 document.write(n1 +" + " +n2 +" = " + (n1+n2));
 document.write(n1 +" - " +n2 +" = " + (n1-n2));
 document.write(n1 +" * " +n2 +" = " + (n1*n2));
 document.write(n1 +" / " +n2 +" = " + (n1/n2));
*/
/*
var n = Number(prompt("반복하고싶은 수를 입력해주세요 "));
var n1 ;
var n2 ;
document.write("<br>");
for(i = 1; i <= n ; i ++) {
	n1 = Number(prompt("첫번째 숫자를 입력해주세요 "));
	n2 = Number(prompt("두번째 숫자를 입력해주세요 "));
	
	document.write(n1 +" + " +n2 +" = " + (n1+n2) +"<br>");
	document.write(n1 +" - " +n2 +" = " + (n1-n2) +"<br>");
	document.write(n1 +" * " +n2 +" = " + (n1*n2) +"<br>");
	document.write(n1 +" / " +n2 +" = " + (n1/n2) +"<br>");
}
*/
/*
3. 1-100 사이의 숫자를 출력하는데.  
5의 배수지만 7의 배수가 아닐때 빨강색 
7의 배수지만 5의 배수가 아닐때 파란색 
7과 5의 배수를 동시에 만족할때는 보라색 이 출력되게.
*/
// document.write('<p class="purple">색변경</p>');
document.write("<hr>");
for (let i = 1 ; i <= 100 ; i++){
	
	if( (i%5 == 0) && ( i%7 != 0) ){
		document.write('<p class="red">'+ i +' </p>');
	}else if ( (i%5 != 0) &&( i%7 == 0) ){
		document.write('<p class="blue">'+ i +' </p>');
	}else if((i%5 == 0) && ( i%7 == 0)){
		document.write('<p class="purple">'+ i +' </p>');
	}

}












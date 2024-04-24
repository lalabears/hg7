/*
	for (초기식; 조건식; 증감식){
		조건문이 참인 동안 반복적으로 실행하고자 하는 실행문; 
	}
	
	for( var i = 1 ; i <= 5; i ++ ){
		console.log(i) ; // i 가 1에서 5까지 1씩 증가하는 동안 i출력
	}
	
	while(조건문){		
		조건문이 참인동안 반복적으로 실행하고자 하는 실행문 
	}
	i = 1;
	while(i<=5){
		console.log(i) ; // i 가 1에서 5까지 1씩 증가하는 동안 i출력
		i++;
	}
	
	break;      - 반복문을 탈출하고자 할때 사용
	continue;   - 반복문 건너뛰기 
*/



/*
// 2의 배수와 5의 배수를 제외한 수의
 합을 출력하세요 ( 1-n 사이의 수)
(1-에서부터 입력받은 수까지) 
*/

var i = 0; 
var n = 100 ; 
var sum = 0 ; 

while( i < n ){
	i++;
	if( i%2==0 || i%5==0 ) continue;
	//console.log(i);
	sum = sum+i;
}

document.write(sum);


/*
// 20 부터 10까지 역순으로 출력하는데, 
짝수는 파랑글씨, 홀수는 빨강글씨로 출력해보기 

*/

var i = 20 ; 

while( i >= 10 ){
	
	// console.log(i);
	if ( i%2 == 0 ) {
		document.write('<p style="color:blue;">' + i + '</p>');
	}else{
		document.write('<p style="color:red;">' + i + '</p>');

	}
	 
	i--;
}

/*


while문과 if(switch)문을 사용해서,
숫자 두개를 입력 받고,
연산자를 입력 받아서 (+ - * / )
계산 결과를 무한히 출력하는 계산기를 만드는데
첫번째 입력한 숫자가 0이면
프로그램을 종료하는 코드를 만드세요

*/
var n1, n2, op; 
while(true){  // 무한히 입력받기
	
	// 변수선언 
	
	n1 = Number(prompt("첫번째 숫자를 입력해주세요 (종료 : 0) "));
	// 특정조건에서 루프 종료시키기
	if( n1 == 0 ) break; 
	n2 = Number(prompt("두번째 숫자를 입력해주세요 "));
	op = prompt("연산자를 입력해주세요 (+,-,*,/)");

	// 출력하기 
	switch(op){
		case '+':
			document.write(n1+n2);
			break;
		case '-':
			document.write(n1-n2);
			break;
		case '*':
	        document.write(n1*n2);
			break;
		case '/':
			document.write(n1/n2);
			break;
		default :
			document.write("연산자를 잘못입력하셨습니다. ");
			break;
	}
	
	
}








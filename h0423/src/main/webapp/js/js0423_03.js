/*
1-100까지 숫자에서 
3의 배수랑 5의 배수를 더한 값을 구해보세요 
1) 3의배수 5의 배수를 출력 해보세요 . 
    3 5 6 9 10 12 15 18 ..... 99 100
*/
var sum = 0 ;
for (let i = 1; i<101; i++){	
	if( (i % 3 == 0) || ( i % 5 == 0) ){
		sum = sum +i ;
		//console.log(i);
	}
}
console.log(sum);

/*
이름, 점수를 입력을 받습니다. 
60점이상이면 합격 이하면 불합격을 출력하는데 -> 조건문
(5명의 이름과 점수를 입력받습니다) -> 5번반복(반복문)
홍길동 , 90 
홍길동님 합격입니다
이순신, 50 
이순신님 불합격입니다.
 */
// 변수선언 
var name, score ;
/*
for(let i = 0; i<5;i++){ // 반복문 
	// console.log(i,'다섯번 반복시키는 반복문입니다.');
	name = prompt( (i+1) + "번째 이름을 입력하세요 ");
	score = Number(prompt("점수를 입력하세요 "));
	
	if( score >=60 ){
		document.write(name+ "님 합격입니다. <br>");
	}else{
		document.write(name+ "님 불합격입니다.<br>");
	}
	
}
*/

/**
 숫자 두개를 입력을 받습니다. (n1, n2 )
 n1부터 n2 까지의 합을 구합니다. 
n1: 1 n2 : 100 입력을하면 >  출력: 5050
for(i = 1 ; i <=100; i++) sum += i ;
         작은수    큰수 

(+만약에 n2가 n1보다 작으면.. ? 
  n1이 n2보다 작은 경우도 함께 고려하면서.. )
100, 1 5050
 */

var sum = 0; 

//n1, 부터 n2 까지 
var n1 = 1;//Number(prompt("1.숫자를 입력하세요 "));
var n2 = 10; //Number(prompt("2.숫자를 입력하세요 "));

var temp = 0 ;  // 임의의 변수 

if (n2 < n1){
	temp = n1 ; // temp에는 n1의 값이 들어있음. 
	n1 = n2 ;   // n2, n1 는 n2의 값이 들어감 
	n2 = temp;  // n2에 원래 n1의 값이 들어감 
}
// n1은 무조건 n2보다 작기때문에 아래식을 사용할 수 있음 
for(i = n1 ; i <= n2 ;  i++){
	// i = 1부터 100 까지 하나씩증가하면서 변한다. 
	sum = sum +i ; 
} 
document.write(sum);

 /*구구단 2단을 출력해보세요 
2*1 = 2
2*2 = 4
2*3 = 6
2*4 = 8
2*5 =10
2*6 =12
2*7 =14
2*8 =16
2*9 =18*/
 
 document.write("<br>");
 
 for (let i = 1 ; i <= 9 ; i++ ){
	 
	 document.write("2"+" * "+ i +" = "+ (2*i) +"<br>" );
 }
 
 
var num = 3; //Number(prompt("원하는 단을 입력하세요 ")); 

 
 for (let i = 1 ; i <= 9 ; i++ ){
	 
	 document.write(num+" * "+ i +" = "+ (num*i) +"<br>" );
 }
 
 
 
 // 원하는 단을 입력받는 것을 5번 반복하게 해서 출력을 해보세요 
 
 for ( let j = 0 ; j<3 ; j++ ){
	 // 세번반복 
	 var num = Number(prompt("원하는 단을 입력하세요 ")); 

 
 	for (let i = 1 ; i <= 9 ; i++ ){
	 	document.write(num+" * "+ i +" = "+ (num*i) +"<br>" );
 	}
	 
 }
 
 
 
 
 
 
 
 

// 객체 
// { key : value, key : value, ... } 
var person = { 
	name : '홍길동',
	age : 24, 
	eye : 1.5, 
	height : 180, 
	language : ['Ko', 'En'] 
} 

console.log(person.height);


// Number .

var n1 = 10; 
var n2 = new Number(10); // 객체인number 선언됨

console.log(n1);
console.log(n2);


console.log(n1 ==  n2); // 값이 같아서 true
console.log(n1 === n2); // 타입이 다르기 때문에 false


var n3 = 10 - "2";
var n4 = 10 - "문자열";

console.log(n3);
console.log(n4); //NaN

console.log(isNaN(n3)); // 숫자기때문에 : false
console.log(isNaN(n4)); // 숫자가아니기때문에 :true
/*
숫자를 입력받아 - prompt 
* 10 한 값을 출력하는데. alert( n * 10 ) ;
숫자가 아닌것을 입력받으면 (isNaN사용) 잘못입력하셨습니다를 출력.
		alert("잘못입력하셨습니다.");
이 작업이 무한반복되도록 만들어보세요 for(;;) while(true)
'0' 을 입력하면 반복문을 종료시키게  break; 

*/
/*
while(true){
	// 무한반복문 
	var n = prompt("숫자를 입력해주세요 ");
	// 무한반복 종료시키기 
	if( n == '0'){
		// '0' 을 입력하면 반복문을 종료시키게  break; 
		break; 
	}
	// 숫자인지 아닌지 비교해보기 
	// 입력받은 값 alert로 출력하기 
	if(isNaN(n)){
		alert("잘못입력하셨습니다.");
	}else{ // 숫자가 들어가면
		alert(10 * n);
	}
		
}*/


console.log(Math.round(10.95)); //소수 첫째자리 반올림
console.log(Math.floor(10.95)); // 버림
console.log(Math.ceil(10.01)) ; // 올림 

console.log(Math.random()); //  0 <= m < 1
console.log(Math.random()); //  0 <= m < 1
console.log(Math.random()); //  0 <= m < 1
console.log(Math.random()); //  0 <= m < 1
console.log(Math.random()); //  0 <= m < 1

console.log( Math.floor( Math.random() * 10 ) + 1);
console.log( Math.floor( Math.random() * 10 ) + 1);
console.log( Math.floor( Math.random() * 10 ) + 1);
console.log( Math.floor( Math.random() * 10 ) + 1);
console.log( Math.floor( Math.random() * 10 ) + 1);
console.log( Math.floor( Math.random() * 10 ) + 1);
/*
// 1 <=  <=10 
0 * 10 <=  Math.random() * 10  < 1 *10 
 0 + 1<=   m +1    < 10+1
 1 <=  Math.floor( Math.random() * 10 ) + 1 <11
*/
var n1 = 1234.6789 ; 
// 1. n1의 반올림, 올림, 버림 값을 구하세요 
document.write("반올림 :  " + Math.round(n1));
document.write("올림  :  " + Math.ceil(n1));
document.write("버림  :  " + Math.floor(n1));

// 2. 1과 25사이의 랜덤숫자를 5개 생성해서 배열에 넣어보세요 
/*
 0 * 25 <=  Math.random() * 25  < 1 *25 
 0 + 1<=   Math.random() * 25 + 1  < 25 +1
 1 <=  Math.floor( Math.random() * 25 ) + 1 < 26
 */
var r 
var rand = []; 

for (let i = 0 ; i < 5 ; i++ ){
	// 랜덤한 숫자를 생성시키는 Math.random()
	r =  Math.floor( Math.random() * 25 ) + 1;
	rand.push(r); // 배열에 숫자 넣는방법. push
}
document.write("rand  :  " + rand);
document.write("<hr>");
// 3. 내가 입력한 숫자가 rand 배열속에 숫자가 있으면 당첨 출력
// 없으면 배열속 숫자들 전부 출력 
// rand [ 0, 1, 2, 3, 4]
var uin = Number(prompt("숫자를 입력해주세요 >> "));
var ck = 0 ; // 0 이면 없음 1이면잇음  
for (let i = 0 ; i < rand.length ; i++ ){
	
	if( uin ==  rand[i] ) {
		document.write("<h1>당첨!!!</h1>");
		ck = 1; 
	}	
}
if(ck == 0 ){
	document.write("<h1>없네요.."+ rand + "</h1>");
}




























  

























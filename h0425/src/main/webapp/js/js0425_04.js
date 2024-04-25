/*
객체 -
여러속성을 하나의 변수에 저장 
할 수 있다록 해주는
데이터 타입 

객체는 중괄호를 사용해서 만들 수 있다 
객체는 각각 key/value에 대한 정보로 나열됨
key는 문자열 또는 기호
value는 모든 유형이 가능함 
key:value는 쉼표로 구분됨. 

객체가 아닌애들:
string, number, boolean, null, undefined 


 */

 var name = '유관순';
  
 // 키: value 
 var person1 = { 
	name : '홍길동',
	age : 23, 
	height: 175, 
	weight: 75 
	} 
 var person2 = { 
	name : '김구',
	age : 30, 
	height: 170, 
	weight: 75 
	} 
	
document.write(name +"<br>"); // 변수 출력
document.write(person1.name +"<br>"); // 객체 키값이용 출력
document.write(person2["name"] +"<br>");

var kitty = {
	name: "나비",
	family: "코리안숏헤어",
	age: 1, 
	weight: 10
}

var arr = [1,2,3,4,5];
//         0 1 2 3 4 
var arr1 = { 0 : 1,  1 : 2, 2 : 3, 	3 : 4,	4 : 5 }

console.log(typeof(kitty));
/*
우리집 고양이 이름은 나비이고 종은 코리안숏헤어야. 
나이는 1살이고 몸무게는 10키로야 
*/
document.write("<br>우리집 고양이 이름은 "+kitty.name+"이고 종은 "+kitty.family+"야. 나이는 "+kitty.age+"살이고 몸무게는 "+kitty.weight+"키로야  <br>")


// Number()

var num = 16; 

// toString(2) : 2진수 문자열로 변환 toString(8) : 8진수로 문자열 변환 
console.log(num.toString(2)); // 100000000
console.log(num.toString(8)); //  400
console.log(typeof(num.toString(10))); //  256
console.log(num.toString(16)); // 100

// Infinity 무한대 

console.log(10/0); 
console.log(Infinity * 100);
console.log(1 /Infinity ); //0 을반환

// NaN  (Not a Number )

var x = 100 - "10" ;
console.log(x);
var y = 100 - "A" ;
console.log(y);
console.log( 0 / 0 );


var a = 100;// *"a"; 

// 숫자인지 아닌지를 검사 
if(isNaN(a)){
	document.write("숫자가 아닙니다.");
}else{
	document.write("숫자 입니다.");
	a = a+10; 
	console.log(a);
}

var n1 = 100 ; 

console.log(typeof(n1)); // number

var n2 = new Number(100); // new 
console.log(typeof(n2));  // object 

console.log(n1 == n2 ); 
console.log(n1 === n2 ); 

// 첫번째 숫자 형태를 실수형태로 반환함. 
var n3 = Number.parseFloat("12");
console.log(n3);
var n4 = Number.parseFloat("12.34");
console.log(n4);
var n5 = Number.parseFloat("12문자열");
console.log(n5);
var n6 = Number.parseFloat("12 34 56");
console.log(n6);
var n7 = Number.parseFloat("문자열34");
console.log(n7);

// 첫번째 숫자 형태를 정수형태로 반환함. 
var n3 = Number.parseInt("12");
console.log(n3);
var n4 = Number.parseInt("12.34");
console.log(n4);
var n5 = Number.parseInt("12문자열");
console.log(n5);
var n6 = Number.parseInt("12 34 56");
console.log(n6);
var n7 = Number.parseInt("문자열34");
console.log(n7);

/*

Math 객체 
- 수학에서 자주 사용하는 상수와 함수들을 
미리 구현해 놓은 내장객체  

*/
Math.min() // Infinity 반환

var m1 = Math.min(1,10,-100,-10,1000,0); 
console.log(m1);
var m2 = Math.min(1,10,-100,-10,'-1000',0); 
console.log(m2);
var m3 = Math.min(1,10,-100,-10,'ABC',0); 
console.log(m3);  // NaN출력

Math.max() // -Infinity를 반환


Math.random()
// 0보다 크고 1보다 작은 랜덤한 숫자를 반환 

console.log(Math.random()); 
console.log(Math.random()); 
console.log(Math.random()); 
console.log(Math.random()); 
console.log(Math.random()); 
console.log(Math.random());

Math.round() // 소수점 첫자리에서 반올림해서 그 값을 반환 
console.log(Math.round(10.49)); // 10
console.log(Math.round(10.5));  // 11
console.log(Math.round(-10.5));  //-10
console.log(Math.round(-10.53)); // -11 

Math.floor() // 바닥
console.log(Math.floor(10.95)); //10
console.log(Math.floor(11.01));  // 11
console.log(Math.floor(-10.95)); // -11
console.log(Math.floor(-11.01)); // -12

Math.ceil() // 천장
console.log(Math.ceil(10.95)); //11
console.log(Math.ceil(11.01));  // 12
console.log(Math.ceil(-10.95)); // -10
console.log(Math.ceil(-11.01)); // -11

console.log(Math.PI );
/*
 변수를 만들어서 선언하고 변수를 출력 . 
 반올림, 올림, 버림, 출력하고,
 랜덤숫자도 한번 출력 해보고 */
var num = 12.5678;  
var rn = Math.round(num); // 반올림
var cn = Math.ceil(num) ; //올림
var fn = Math.floor(num); //버림
var randn = Math.random() ; // 랜덤한 숫자 
console.log("반올림: "+rn); 
console.log("올림: "+cn); 
console.log("버림: "+fn); 
console.log("랜덤: "+randn);
//10, 5, 8, 30 중의 최소값과 최대값도 출력을 해보세요  
var minn = Math.min (10, 5, 8, 30 ) ; 
var maxn = Math.max(10, 5, 8, 30 ) ;  
console.log("최소값: "+minn); 
console.log("최대값: "+maxn);

// num을 사용해서 125.678 의 반올림 올림 버림 


console.log(10*Math.random());
console.log(10*Math.random());
console.log(10*Math.random());
console.log(10*Math.random());
console.log(10*Math.random());
console.log(10*Math.random());

console.log(Math.floor(10*Math.random()));
console.log(Math.floor(10*Math.random()));
console.log(Math.floor(10*Math.random()));
console.log(Math.floor(10*Math.random()));
console.log(Math.floor(10*Math.random()));
console.log(Math.floor(10*Math.random()));


// 
var rndN = Math.floor(Math.random()*10)+1;
      //    1에서부터 10 사이의 랜덤한 숫자 . 
var userInput = Number(prompt("1-10사이의 숫자를 입력해주세요 "));

if (rndN == userInput){
	document.write('<h1>당첨!!!!</h1>')
}else{
	document.write('<h1>오답, 랜덤수는 '+ rndN +'</h1>');
}
/*
1 - 45 사이의 랜덤숫자를 발생시키고 ,
 
내가 입력숫자와 같으면 당첨, 아니면 
오답 랜덤수는 00이었습니다. 를 출력해보세요 
*/

var rndN = Math.floor(Math.random()*45)+1;
      //    1에서부터 10 사이의 랜덤한 숫자 . 
var userInput = Number(prompt("1-45사이의 숫자를 입력해주세요 "));

if (rndN == userInput){
	document.write('<h1>당첨!!!!</h1>')
}else{
	document.write('<h1>오답, 랜덤수는 '+ rndN +'</h1>');
}



var a = [1,2,3];
var b = [4,5,1]; 
// 같은 숫자는 ? - 1한 있음 

for(let i = 0 ; i < 3 ; i++){
	
	for(let j = 0; j<3 ; j++ ){
		// i = 0 일때 a:1일때 b[0]b[1]b[2]
		// i = 1 일때 a:2일때 b[0]b[1]b[2]
		// i = 2 일때 a: 3   b[0]b[1]b[2]
		if(a[i] == b[j]){
			document.write(b[j]); 
		}
	}
	
}
document.write("<br>")
var c = [1,2,3,5];
var d = [8,9,1,3]; 
/*두개의 배열에 공통으로 포함한 숫자를 출력해보세요 >>
1  3*/
for(let i = 0 ; i < 4 ; i++){
	for(let j = 0; j< 4 ; j++ ){
		if(c[i] == d[j]){
			document.write(d[j]); 
		}
	}
	
}







































	
	
	
	
/*
배열  - array : 요소들의 집합

배열 선언하는 방법
var 배열이름 = [ 배열요소1, 배열요소2, 배열요소3 ... ,배열요소n ];
var 배열이름 = Array(배열요소1, 배열요소2,.. , 배열요소n); 
var 배열이름 = new Array(배열요소1, 배열요소2,.. , 배열요소n); 

*/



var arr1 = [1,2,3,4,5]; 
var arr2 = ['홍길동','유관순','이순신']; 
var arr3 = [1, '홍길동', 90, true];


// 과일 
var f1 = '망고';
var f2 = '수박';
var f3 = '딸기';
var f4 = '포도';
var f5 = '사과';

var fruits = ['망고','수박','딸기','포도','사과'];
//              0     1    2     3     4

console.log(arr1);
console.log(arr2);
console.log(arr3);

// 유관순만 출력
console.log(arr2[1]);

// 수박, 사과 출력 
document.write(fruits[1] + fruits[4]);

console.log(arr1.length);

// 마지막 요소 가져오기 
console.log(fruits[fruits.length-1]);

console.log(arr3[0]); // 1
console.log(arr3[1]); // 홍길동
console.log(arr3[2]); // 90
console.log(arr3[3]); // true 


// 변수명[번째]

document.write(fruits[0]);
document.write(fruits[1]);
document.write(fruits[2]);
document.write(fruits[3]);
document.write(fruits[4]);
document.write("<hr>");

for ( let i = 0 ; i < fruits.length ; i++ ){
	
	document.write(fruits[i] +"<br>");
}


var tmp = ['A','B','C'];
   //       0   1  2     3 
console.log(tmp[2]); // C
tmp[3] = 'D';
console.log(tmp[3]); // D



var a = ['HTML']; // 요소가 1개 뿐인 배열 
//          0 
var b = a[0]; // b 'HTML'

a[1] = 'CSS';


// JAVASCRIPT를 그 다음방에 넣어주세요 
//a[2] = 'JAVASCRIPT';
// length를 사용해서 넣을 수 도 있습니다,. 
a[a.length] = 'JAVASCRIPT';
console.log(a);





var k ; 

document.write("<br>");
document.write(k);


document.write("<hr>");
var arr = [];
arr[0] = 'A' ;
arr[1] = 'B' ;

arr[5] = 'C';

document.write(arr[0]);
document.write("<br>");
document.write(arr[2]);

arr.push('D');
document.write("<br>");
document.write(arr);


/*
1. arr.push(추가할 요소);        
// push() 메소드를 이용하는 방법

2. arr[arr.length] = 추가할 요소; 
// length 프로퍼티를 이용하는 방법

3. arr[특정인덱스] = 추가할 요소;
// 특정 인덱스를 지정하여 추가하는 방법

 */



var student = [1,'홍길동',90]; 

//            번호  이름  국어  영어  수학  총점

student.push(100);
// student라는 이름을 가진 배열 안에 [1,'홍길동', 90, 100]
//                               0   1      2    3  
console.log(student);

// 배열의 길이  배열이름.length

var num = student.length; 
console.log(num);

student[student.length] = 80; 

// [1,'홍길동', 90, 100, 80]
document.write("<br>");
document.write(student);

// 3 번 방법을 사용해서 총점을 한번 넣어보세요 

var total ; 
total = student[2]+student[3]+student[4]; 
student[5] = total;

// 전체길이 출력 

document.write("<br>");
document.write(student.length);
document.write("<hr>");

for ( let i = 0 ; i < student.length ; i ++){
	document.write(student[i]);
	document.write("<br>");
}







/*
 90 뒤에 100을 배열에 넣어보세요 
 [1,'홍길동',90, 100] 이  되게 만드세요



1. 번방법을 사용해서 영어점수 100 을 넣고 push() 메소드
2. 번 방법을 사용해서 수학점수 80 을 넣고 arr[arr.length] = 추가할 요소;

// 3 번 방법을 사용해서 총점을 한번 넣어보세요 


 배열의 전체 길이를 출력해보세요  : 5 ~ 6 
 
 
 만들어서 요소 하나씩 출력해보세요 - for 문을 사용 

*/







var number = [1,2,3];  
//            0 1 2   3 4 5
number.push(4);


number[4] = 5; 

number[number.length] = 6; 
console.log(number);



var num = []; 
/*
num.push(0);
num.push(1);
num.push(2);
num.push(3);
num.push(4);
num.push(5);
*/


// for 문을 사용해서 1- 10 까지 넣어보세요 

for( let i = 1 ; i <11 ; i++){
	num.push(i);
}


document.write(num); // [1,2,3,4,5,6,7,8,9,10]




///////////////////


var stu = [2, '유관순', 89, 91, 96 ];
/*
총점이랑 평균을 넣어주세요 . 
document.write(stu);  // 2, '유관순', 100, 100, 100 ,300, 100
*/
// 총점 계산.
var t = stu[2]+stu[3]+stu[4];
// 평균 계산
var av = t/3; 
// 배열에 넣기 
stu.push(t);
stu.push(av);

// 출력해보기 
document.write("<br>"+stu);

var strhtml = '';

strhtml += '<table><tr>';
for (let i = 0 ; i <stu.length; i++){
	strhtml += '<td>'+ stu[i] + '</td>'
}	
strhtml +=	'</tr></table>';

document.write(strhtml);


// var ans = confirm("로그인하시겠습니까?");

// 확인 > ans : true

// 취소 > ans : false 

// console.log(ans);

/*
var ans = prompt("이름을 입력하세요 ","홍길동");

console.log(ans);

var ans2 = prompt('나이를 입력하세요');

console.log(typeof(ans2)); 
// 입력받은 값이 어떤 타입인지 확인 

// prompt 통해서 받는 입력은 문자열 이다. 

var result = Number(ans2)+1;

document.write( ans + "님은 "+ "내년에 "+ ( Number(ans2)+1 )+"살입니다.");
document.write( ans + "님은 "+ "내년에 "+ result +"살입니다.");


*/

/*
문자 > 숫자로 ..
Number("10"); > 숫자 10으로 사용이 가능 

숫자 > 문자로 .. 
String(1000); > "1000"

*/

// 문자 + 숫자 => 문자 + 문자로 바뀐 숫자 
/*
var 변수명 = 값; 

var age = prompt("나이");
document.write(age);

두 숫자를 입력 받아서 (prompt) 더하기 수식을 출력하세요 
입력: 5 , 3 
출력 형태 : 5 + 3 = 8 -> document.write() 사용
변수는 최소 2개 사용 
*/
// 입력 : 
//
//var n1 = prompt("첫번째 숫자를 입력하세요 : ");
//var n2 = prompt("두번째 숫자를 입력하세요 : ");
//var res = Number(n1) + Number(n2) ;

var n1 = Number(prompt("첫번째 숫자를 입력하세요 : "));
var n2 = Number(prompt("두번째 숫자를 입력하세요 : "));
var res = n1 + n2 ;



// 출력 :
document.write( n1 +" + "+ n2 +" = "+ res);


















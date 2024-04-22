
/*
var num = 10; 
console.log(num, typeof(num));
window.open("https://www.naver.com") // 새창
location.href = "https://www.naver.com"; // 현재창
*/
/*
스위치문을 사용해서 alert창을 띄워 어디에 이동한지 알려 준 뒤 
화면 이동시키기. (location.href="웹주소";)
prompt( " 
원하는 번호를 입력하세요.
(1.네이버 2.다음 3.구글  )
")
1을 선택하면 네이버입니다->네이버로이동
2를 선택하면 다음입니다  -> 다음으로 이동
3을 선택하면 구글입니다  -> 구글로 이동 
*/

// 변수 선언 
var choice = prompt("원하는 번호를 입력하세요(1.네이버, 2.다음, 3.구글)");
var url ="";
// 조건문 사용 
switch(choice){
	case "1":
		alert("네이버를 선택하셨습니다.");
		
		// 이동하시겟습니까? 
		if (confirm("이동하시겠습니까 ")){
			url = "https://www.naver.com";
		}
		break;
	case "2":
		alert("다음을 선택하셨습니다.");
		url = "https://www.daum.net";
		break;
	case "3": 
		alert("구글을 선택하셨습니다.");
		url = "https://www.google.com";
		break;
	default:
		alert("보기에 없는 값을 선택하셧어요-");
		url = "";
		break;
	
}
if (url){
	window.open(url);
}

/*
숫자 2개와 수식을 입력 받은 후 
+, - , *, /, % 값 수식 전체 출력하기
ex) 입력 10, 3, %
     10 % 3 = 1 
switch(값)
값 == +, - , *, /, %
*/

// 변수 

var n1 , n2, op; 
n1 = Number(prompt("숫자를 입력해주세요 "));
n2 = Number(prompt("숫자를 입력해주세요 "));
op = prompt("수식을 입력해주세요 (+,-,*,/,%) ");

// op == '+', op=='-'
switch (op) {
	case '+':
		document.write(n1 +" + " +n2 +" = " + (n1+n2));
		break;
	case '-':
		document.write(n1 +" - " +n2 +" = " + (n1-n2));
		break;
	case '*':
		document.write(n1 +" * " +n2 +" = " + (n1*n2));
		break;
	case '/':
		document.write(n1 +" / " +n2 +" = " + (n1/n2));
		break;
	case '%':
		document.write(n1 +" % " +n2 +" = " + (n1%n2));
		break;
	default:
		document.write("수식을 잘못입력하셨습니다. ");
		break;

}






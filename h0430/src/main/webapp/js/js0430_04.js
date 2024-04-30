/*function loginBtn(){
	alert('함수찾음!!!')
	var result = sum(10,20);
	alert(result);
}
function sum(x,y){
	return x+y;
}*/


//	alert("로그인 버튼을 클릭하셨습니다");
// 로그인 버트을 누르면 
// 아이디를 입력받는 prompt창, 
// 비밀번호를 입력받는 prompt창을 만들고.
// 입력받은 정보를 보내서 로그인 함수를 호출해서
// longin() ;
/*

function loginBtn(){
	// alert(0);
	var userId = prompt("아이디 : ");
	var userPw = prompt("비밀번호 : ");
	// 함수 호출 매개변수와 함께 
	login(userId,userPw);
}
function login(userId,userPw){
	let adminId = 'admin';
	let adminPw = '1234'; 
	// alert(userId+userPw);
	if( (userId == adminId) && (userPw==adminPw) ){
		alert("환영합니다!");
	}else{
		alert("잘못입력하셨습니다!");
	}
}*/
/*버튼을 눌렀을 때 글자는 로그인, 글자색은 빨간색으로 변경 

document.getElementById("").innerHTML = "변경내용"
document.getElementById("").style.color = "변경색"
function newBtn(){
	// 내용 변경, 스타일 변경 
	// <h1 id="idh1"> 로그인 화면입니다. </h1>
	//1 id로 가져오는 방법 
	document.getElementById("idh1").innerHTML = "로그인";
	document.getElementById("idh1").style.color = "red";
	// 2. tag 이름으로 가지고 오는 방법 
	document.getElementsByTagName("h1").item(0).innerHTML = "로그인입니다";
	document.getElementsByTagName("h1").item(0).style.color= "blue";
	var uid, upw; 
	uid = document.getElementById("uid").value; 
	console.log(uid);
	
} // newBtn()
*/
function loginBtn(){
	// alert(0);
	var userId = prompt("아이디 : ");
	var userPw = prompt("비밀번호 : ");
	// 함수 호출 매개변수와 함께 
	login(userId,userPw);
}
function login(uid, upw){
	let adminId = 'admin';
	let adminPw = '1234'; 
	if( (uid == adminId) && (upw ==adminPw) ){
		alert("로그인성공!");
	}else{
		alert("로그인실패!");
	}
}

function newBtn(){
	var uid = document.getElementById("uid").value; 
	var upw = document.getElementById("upw").value;  
	console.log(uid); // 아이디 확인
	console.log(upw); // 비밀번호 확인 
	
	login(uid,upw); // login함수 실행 매개변수 2개를 같이 보냄
} // newBtn()





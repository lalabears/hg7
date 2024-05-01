var h1s = document.getElementsByTagName('h1'); // 태그이름 . 
console.log(h1s.item(0).innerHTML);
// 태그이름으로 가져오면 여러개다 
var h1id = document.getElementById("id1"); // 아이디를 이용
console.log(h1id.innerHTML);
h1s.item(0).innerHTML = "웹사이트 주소목록";
h1id.style.color = "red";
// 클래스 c1을 가지는 글자들의 색을 navy색으로 바꿔주세요 
var clss = document.getElementsByClassName('c1');
console.log(clss);
for (let i = 0 ; i < clss.length ; i++){
	clss.item(i).style.color = "navy";
}

// <li class="c1"><a href="#" id="g">google</a></li>

var gle = document.getElementById("g"); 
gle.href = "https://www.google.com";
gle.innerHTML = "구글";
gle.style.background = "pink";

//네이버, 다음도 링크추가, 배경색 추가, 이름 한글로 바꾸기
var nav = document.getElementById("n");
nav.href = "https://www.naver.com";
nav.innerText = "네이버";
nav.style.background = "skyblue";

var dau = document.getElementById("d");
dau.href = "https://www.daum.net";
dau.innerHTML = "다음";
dau.style.background = "tomato";




//a 태그에 밑줄 없애는방법
gle.style.textDecorationLine ="none"; 
// 속성 추가하기
//  <a href="#" id="g" >google</a>

//                 속성      값 
gle.setAttribute("target","_blank"); 
gle.setAttribute("class","c2"); 

/*
<a href="https://www.google.com" id="g" 
   target="_blank" class="c2" 
    style="background: pink; text-decoration-line: none;">
구글</a>
*/

/* ------------------------------------------------*/

document.getElementById("id1").onclick = function(){
	alert("클릭하셨습니다");
}
function ABtn(){
	// alert("A버튼을 클릭하셨습니다. ");
	document.getElementById("id1").innerHTML="WEB"
}
//B 버튼을 눌렀을때 div 박스안에 '환영합니다' 라는 글씨를넣어주세요
function BBtn(){
	alert("B버튼을 클릭하셨습니다. ");
	document.getElementById("box1").innerHTML="환영합니다"
}











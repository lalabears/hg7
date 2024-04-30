/*요소 선택
1. tag이름으로.. h1, p, div,.. 
2. id로 
3. class이름으로 
4.name이라는 속성을 사용해서
5.css선택자query . # .. */

//  1. 태그이름으로 요소 선택하기. 
var h2s = document.getElementsByTagName("h2");
console.log(h2s);
// 태그이름을 사용해서 선택한 요소의 색상변경하기 
h2s.item(0).style.color = "red";

// button 을 가져와보기 . 
var btns = document.getElementsByTagName('button');
console.log(btns);
// 버튼 background 을 바꾸거나 글자색을  navy로 바꿔보기 
btns.item(0).style.background = "pink";

// td 태그를 가진 아이템들의 글자색을 violet 으로 바꿔보세요

var tds = document.getElementsByTagName('td');
console.log(tds);

for ( let i = 0 ; i < tds.length ; i ++ ){
	tds.item(i).style.color = 'violet';
}

//2. id를 사용해서 요소 선택 
var tdid = document.getElementById('id1'); 
console.log(tdid);
tdid.style.color = "green";

// id가 sal인 요소의 글자색을 빨간색으로 변경해주세요 

var tdsal  = document.getElementById('sal');
console.log(tdsal); 
tdsal.style.color = "red";

// 3. name속성을 사용해서 요소 선택하기 
// 글자색을 orange색으로 변경
var names = document.getElementsByName("name1");
console.log(names);
for(let i = 0 ; i < names.length ; i ++ ){
	names.item(i).style.color = "orange";
}
// 4. class이름을 사용해서 요소 선택하기 
// 글자색을 blue색으로 변경 
var clss = document.getElementsByClassName('c1');
for (let i = 0 ; i < clss.length ; i ++){
	clss.item(i).style.color = 'blue';
}
// 5. css 선택자를 이용한 선택 . 
// p, div, h2 class이름 같은 경우 .클래스명, 아이디는 #아이디명
var h2css = document.querySelectorAll("h2");
console.log(h2css);
var tdid2 = document.querySelectorAll("#id1") ;
console.log(tdid2)
var clsAll = document.querySelectorAll(".c1"); 
console.log(clsAll); // 5개 h2 1개 + td 4개
var clsTds = document.querySelectorAll("td.c1");
console.log(clsTds); // td 4개만 가져옴 

console.log(h2s.item(0).innerText);

// id로 버튼 btn1을 가져오기.

document.getElementById('btn1').onclick = function (){
	// id가 btn1인 요소를 클릭했을때 실행되는 함수 
	alert("버튼을 클릭하셨습니다. ");
	
} 
// id = 'btn2'를 가지는 버튼을 추가하고. 
document.write('<button id="btn2">버튼2</button>');
// 그 버튼을 눌럿을때. 
document.getElementById('btn2').onclick = function (){
	// 숫자두개를  prompt창으로 입력받아
	// 두개의 합을 alert창으로 출력해주세요
	var n1 = Number(prompt('첫번째 숫자 : '));
	var n2 = Number(prompt('두번째 숫자 : '));
	alert(n1+n2);
} 
	
// id = 'btn3'를 가지는 버튼을 추가하고. 
document.write('<button id="btn3">버튼3</button>');
// 아이디랑 비밀번호를 입력받아서 아이디가 admin 비밀번호가 1111일때 환영합니다
// 하나라도 틀렸을때 잘못입력하셧습니다.
document.getElementById("btn3").onclick = function(){
	var uid = prompt("아이디를 입력해주세요");
	var upw = prompt("비밀번호를 입력해주세요");
	var aid = 'admin', apw = '1111'; 
	if ( (uid==aid) && (upw==apw) ){
		alert('환영합니다');
	}else{
		alert('잘못입력하셨습니다.');
	}
} // "btn3" click button 
// id = 'btn4'를 가지는 버튼을 추가하고. 
document.write('<button id="btn4">버튼4</button>');	
// 문자열인 숫자들을 입력받아 prompt 입력한 수들의 합계구하기	
// ex) '1 2 3' 을 입력하면 6 출력 (alert)	
document.getElementById('btn4').onclick = function(){
	// alert("버튼4")
	var str = prompt("숫자들을 입력해 주세요 (예: 1 2 3)"); 
	var arr = str.split(" "); // 배열로 arr에 저장 
	// alert(arr);
	sum = 0 ; 
	for (let i = 0 ; i < arr.length; i ++ ){
		sum += Number(arr[i]); // Number(),	parseFloat(),parseInt()
	}
	alert("총합 : "+sum);
}
// id = 'btn5'를 가지는 버튼을 추가하고. 
document.write("<button id='btn5'>버튼5</button>");
// 버튼을 클릭했을때 id가 sal인 요소의 배경을 skyblue로 변경
document.getElementById('btn5').onclick = function(){
	// alert('버튼5');
	document.getElementById('sal').style.background = 'skyblue';
	
}











	
	
	

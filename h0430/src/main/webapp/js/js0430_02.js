
var str = document.getElementsByTagName('h2'); 
str.item(0).style.color = 'green';

/*
 id가 txt인 요소의 내용 변경하기 (innerhtml사용)
 ->  ex) 내용이 변경되었습니다.*/
 
var txt = document.getElementById('txt');
txt.innerHTML = '내용이 변경되었습니다';
/*
주의: 클래스 이름을 가지고 오는 요소는 여러개. 배열임. item사용
1. 오늘의 일정이라는 글자를 > TODAY 로 변경하기  
*/

var today = document.getElementsByClassName('today');
console.log(today)
today.item(0).innerHTML = "TODAY";
//  2. 시간 : 12시 > 얘의 글자색을 빨강색으로 변경하기 

var box = document.getElementsByClassName('box');
console.log(box)
console.log(box.item(2).innerHTML);
box.item(2).style.color ='red';

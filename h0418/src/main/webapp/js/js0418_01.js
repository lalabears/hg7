
// document.write("스크립트 파일 안에 있는 내용입니다.<br>");


/*
 자바스트립트로, html 내용을 변경, 
 속성도 변경할 수 있음. 스타일도 변경할 수 있음 

 중요: 실행문은 세미클론;으로 구분됨. 꼭 써주세요
 */

 // 화면에 출력하는 방법 
 
 /*
 document.write() 방법 
 웹페이지가 로딩될때 가장먼저 데이터를 출력 
 대부분 테스트를 위해서 사용됩니다. 
 
 */
document.write('여기는 자바 스크립트 입니다.');
document.write('여기는 자바 스크립트 입니다.');
document.write('여기는 자바 스크립트 입니다. <br>');

document.write("안녕하세요<br>");
document.write('반갑습니다<br>');

document.write("안녕하세요는 영어로 'hello' 입니다 <br>");
document.write('안녕하세요는 영어로 "hi"입니다 <br>');

document.write("<h2>h2태그로 쓴 제목입니다</h2>");
document.write('<p>p태그안에 문단을 작성한 블록입니다</p>');

// 테이블을 출력하려면 .. ? 
document.write('<table border="1">');
document.write('<tr> <td>10</td> <td>20</td> </tr>');
document.write('<tr> <td>30</td> <td>40</td> </tr>');
document.write('</table>');

// 이미지를 화면에 띄어보세요 .. 아무이미지나 .. - img 태그
document.write('<img src="images/c1.jpg" alt="내용">'+'<br>');

document.write('<br>'); // 줄바꿈

//네이버 링크를 만들어서 화면에 보여주세요 - a 태그 
document.write('<a href="https://www.naver.com">네이버</a>');



/*

console.log() 방법 -> 화면에는 출력이 안됨. 콘솔에서만 보임 
웹 브라우저의 콘솔을 통해 데이터를 출력해줌 . 
크롬 > f12 > 메뉴에서 콘솔을 클릭하면 볼 수 있습니다. 
변수 설정하거나 그 값을때 알고 싶을때 주로 사용을 합니다. 
오류가 있으면 보여주기도 함. 

*/
console.log("안녕하세요");

/*
window.alert() 방법 
-> 가장 간단하게 데이터를 출력할 수 있다. 
별도의 창을 띄워서 데이터를 보여준다. 

확인만 누를 수 있다. 
*/
window.alert("경고창입니다");

alert("경고경고");


// confirm은  확인창 출력- 확인과 취소 버튼이 있다. 

confirm("정말 페이지를 닫으시겠습니까?? "); 
// window.comfirm(); 으로도 사용이 가능

/*
프롬프트창에서 입력받기 . 
사용자 입력값을 가져와서 프로그램에서 나중에 사용할 수 있다. 
prompt(메세지, 기본값) 
*/

// window.prompt();

prompt("이름을 입력하세요");
prompt("이름을 입력하세요","홍길동");
prompt("나이를 입력하세요", 30);






document.write('<br>'); 
document.write('<br>'); 
document.write('<br>'); 
document.write('<br>'); 
document.write('<br>'); 
document.write('<br>'); 











 
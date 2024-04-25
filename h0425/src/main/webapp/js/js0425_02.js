
title= ["게시판이 오픈되었습니다.","홈페이지 공지", "새로운 이벤트 시작합니다.","이벤트 다시 시작합니다.", "업데이트 공지","신입사원모집","신제품 런칭이벤트", "주식 상장 안내","이벤트 재공지","당첨자 발표"];
//제목
names =["홍길동","유관순","이순신","강감찬","김구","윤봉길","안창호","장보고", "이이","곽재우" ];
// 작성자
hits = [3,7,1,10, 2,5,11,8,3,1];
// 조회수 
var htmlstr='';
for(let i = 0 ; i <title.length; i ++ ){

	htmlstr += 	'<tr><td>' + (i+1) + '</td><td>' + title[i] +
'</td><td>' +  names[i] +' </td><td>' + hits[i] + '</td><td>2024-04-24</td></tr>';

}



document.getElementById('tbody').innerHTML = htmlstr;
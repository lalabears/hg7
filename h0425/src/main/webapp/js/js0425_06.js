var scores = [[88,97,100],[85,63,20],
              [34,30,30],[40,49,70],[15,75,98]]

var names = ['홍길동','김민호','강동민','하현우','강백호'];

var sum = [] ; // sum 배열에 총합을 넣어주기 

var s2 = 0 ;                         
for (let i = 0 ; i < scores.length ; i ++ ){
	s2 = 0 ; // i = 0 일때 , i =1 일때 시작 합은 0이어야 하므로 ..
	for (let j = 0 ; j < scores[i].length ; j++) {
		s2 += scores[i][j]; 
	}
	sum.push(s2);
}


var tbstr = '';
tbstr += '<table><colgroup><col width="20%"><col width="20%"><col width="20%"><col width="20%"><col width="20%"></colgroup>';
tbstr += '<tr><th>이름</th><th>국어</th><th>영어</th><th>수학</th><th>총점</th></tr>';

for (let i = 0 ; i < scores.length ; i ++){
	tbstr += '<tr><td>'+names[i]+'</td>';
	for(let j = 0 ; j <scores[i].length ; j++ ){
		tbstr += '<td>'+ scores[i][j] +'</td>';
	}
	tbstr += '<td>'+sum[i]+'</td></tr>';
}
tbstr += '</table>';
document.write(tbstr);

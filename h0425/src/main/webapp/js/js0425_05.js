var rnd = []; // 랜덤한 숫자가 6개 들어있음. 
var user = []; // 내가입력한 숫자가 6개 들어 있음 . 

// 1- 45 
for(let i = 0 ; i < 6 ; i++){  // 6번 반복 
	var n = Math.floor(Math.random()*45)+1;
	// 1-45사이의 랜덤한 숫자를 만들어서 n변수에 저장.
	rnd.push(n);// n변수를 rnd배열에 넣기 
}

console.log(rnd) // 출력 확인해보기
for(let i = 0 ; i < 6 ; i++){// 6번 반복 
	var un = Number(prompt((i+1)+"번째 숫자를 입력해주세요(총6개)"));
	// prompt로 숫자 입력받아서 un변수에 저장
	user.push(un);  // un변수를 user배열에 넣기 
}
console.log(user) // 출력 확인해보기 

// 비교해서 개수 출력해보기  
// var rnd = [12,15,6,40,2,17];
// var user = [1,2,3,4,5,6];
/*
같은 숫자 몇개인지 출력해보기. > 2가 출력이 되야 함. 
갯수 1. 새로운 배열을 만들어서 당첨된 숫자를 배열에 넣어서 배열 길이 출력 
    2. var cnt = 0 를 만들어서 같은 값이 있을때 1 증가 
2랑 6 출력 
*/
var dang = [];
var cnt = 0; 
for(let i = 0 ; i < 6 ; i++){
	for(let j = 0; j< 6 ; j++ ){
		// 같으면 출력 하기 
		if(rnd[i] == user[j]){
			dang.push(user[j]);
			cnt++; 
		}
		
	}
}
document.write(dang.length);
document.write(cnt);



var money = ['꽝','오백원', '천원', '오천원', '오만원', '백만원', '천만원' ];
//            0      1      2       3      4        5       6 


document.write('당첨금 : ' + money[cnt]);

/*
['오백원', '천원', '오천원', '오만원', '백만원', '천만원' ]
1개 500원입니다. 
2개 1000원
3개 5천원
4개 5만원
5개 100만원
6개 1000만원 당첨 
출력해보기 
*/







/* 1-45 사이의 랜덤한 숫자 6개 (중복있어도 상관없음.)
출력해보기. push배열에 넣기. */

/*

내가 입력한 숫자 6자리 배열을 한개 만들어서 ->
prompt 
push 

같은 값이 있으면 그 갯수를 출력해주세요 


예)
var r1 = [12,15,6,40,2,17];
var u1 = [1,2,3,4,5,6];

결과는 2개 
*/
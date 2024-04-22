/*
반복문: 
설정한 횟수반큼 반복하여 수행하는 제어문

for 문 

for(초기식 ; 조건문 ; 증감식) {
 조건문이 참 인동안 반복적으로 실행하고자 하는 실행문
}
*/

// i++; i를 하나 증가시킨다  

for (let i = 1 ; i <= 3 ; i++){
	document.write("<h1>javascript</h1>")
}

for(let i=0; i<5 ;i++){
	console.log(i);
}


//console.log("i의 현재 값은: ",i); // i = 5


let j = 0;
for (;j<3;j++){
	document.write("안녕하세요<br>");
}
// 증감식을 생략 할 경우는 무한히 돌아간다. 
// 증감식이 조건식을 만족하는지 알수 없어서 무한루프에 빠짐 
/*
for (let j = 0 ; j<3 ; ){
	document.write("반갑습니다<br>");
}
*/ 
/*
j = 0; 
for( ; ; ){
	// 무한 반복문을 쓸때 사용한다 
}
*/
/*
i++ -> 1 더한다 
i = i+2 
i += 2
*/
// 증감식을 변환
for (let i = 0; i <10 ; i += 3){
	                  // i = i + 3
	 console.log(i);
	
}

for (let i = 1 ; i< 10 ; i *= 2 ){
	//document.write(i);	
	 console.log(i);
}

/*
for문을 사용해서
1. 
1에서부터 15까지 출력해보세요 

2. 
10을 4번 반복해서 출력해보세요 

3. 
hello world를 6번 반복해서 출력해보세요

4. 
1-100 사이의 3의 배수를 출력해보세요 
3 6 9 12 15 18 21 .... 99 
 */

// 기본 구조  : i 가 1에서 3과 같거나 작을때까지 1씩 증가
for (let i = 1 ; i <= 15 ; i++){
	// 1에서부터 15까지 출력해보세요 
	document.write(i+" ");
}

document.write("<br>");
for (let i = 1 ; i <= 4 ; i++){
	// 10을 4번 반복해서 출력해보세요 
	document.write("10<br>");
}
document.write("<br>");
for (let i = 0 ; i < 6 ; i++){
	// hello world를 6번 반복해서 출력해보세요
	document.write((i+1)+".hello world <br>");
}
document.write("<br>");
for (let i = 3 ; i <= 100 ; i += 3){
	//                      i = i + 3 
	// 1-100 사이의 3의 배수를 출력해보세요 
	// 3, 6, 9 .... 
	document.write(i +" ");
	
	// i = 3 일때 :  3 
	// 6 = 3 + 3  -> 6
	// 6 + 3 -> 9 
}


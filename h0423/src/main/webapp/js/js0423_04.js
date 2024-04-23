
/*
for(초기식 ; 조건식 ; 증감식) {
     조건식이 만족하는 동안 반복될실행문 
}
 */

/*
break;는 루프를 즉시 종료하고 외부로 빠져나가게 함. 
주로 특정 조건이 충족되었을때 루프를 종료할때 사용함 
*/
console.log("break")
for (let i = 1 ; i <= 10 ;i++){
	
	if (i > 5){
		break; 
	}
	console.log(i);
	
}

// i 값이 1에서부터 10까지 증가하는 중에 
// i가 5보다 클 경우 break문이 실행이 되어서 for문을 탈출함. 

console.log("continue");
for (let i = 1 ; i <= 10 ;i++){
	
	if (i == 5){
		continue; 
	}
	console.log(i);
	
}

// continue를 사용해서 1-10까지 짝수만 출력해보세요 
for (let i = 1 ; i <= 10 ;i++){
	if ( i % 2 == 1){  // 홀수 일때 건너뛰어야 함 
		continue; 
	}
	document.write(i + "<br>")
}
 
// continue를 사용해서 1-100까지 홀수의 합을 구해보세요 
var sum = 0; 
for (let i = 1 ; i <= 100 ;i++){
	if ( i % 2 == 0){ // 짝수일때 건너뛰어야 함. 
		continue; 
	}
	sum += i ; 
	
}
console.log(sum);
document.write("<br>")


/*
for(;;){
	var n = prompt("0을 입력하면 종료됩니다. ")
	document.write(n+"<br>");
	if(n == "0"){
		break; 
	}
}
*/
document.write("<br>" );

for(let i = 0 ; i <=3 ; i ++){
	document.write("i :" + i + "<br>");
	for(let j = 0 ; j <=5 ; j++){
		document.write("j :" + j + " ");
	}
	document.write("<hr>" );
}


/* 
중첩 for문을 사용해서 출력 : 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5
1 2 3 4 5 
 */

for (let j = 0 ; j <4 ; j++ ){
	// j값은 4번 반복한다. 

	for (let i = 1; i<=5 ; i ++){
		//i는 1-5가변하는 동안 출력한다. 
		document.write(i +" ");
	}
	document.write("<br>");

}














/*
for (초기식; 조건식; 증감식){
	
	조건문이 참인 동안 반복적으로 실행하고자 하는 실행문; 
	
}


while(조건문){
	
	조건문이 참인동안 반복적으로 실행하고자 하는 실행문 
	
}

break;      - 반복문을 탈출하고자 할때 사용
continue;   - 반복문 건너뛰기 
*/

var i, j ; 

for ( i = 1 ; i <= 10 ; i++){
	console.log("for :" + i) ;
}

i = 1;
while(i<=10){
	
	console.log("while : "+i ); 
	i++;
	
}

// i 가 5인 순간 반복문을 탈출 하려면.. ? 

for ( i = 1 ; i <= 10 ; i++){
	console.log("for :" + i) ;
	if( i == 5 ) break;
}

i = 1;
while(i<=10){
	
	console.log("while : "+i ); 
	if (i == 5) break; 
	i++;
	
}

// 1 - 10 까지 출력을 하는데 5만 빼고 출력 

for ( i = 1 ; i <= 10 ; i++){
	if( i == 5 ) continue;
	console.log("for :" + i) ;
}

i = 0;
while(i<10){
		i++;
	if (i == 5) {
		continue;
	} 
	console.log("while : "+i ); 
//	i++;	
}

///////////////////////////////////////

var i, j ; 

for (i = 1 ;  i<=5 ; i ++){
	
	document.write("for - i : "+ i + "<br>");
	
	for (j = 1 ; j<=5 ; j ++ ){
		
		document.write("for - j : "+ j + "<br>");
	}
	document.write("<hr>")
	
}

// while 중첩으로 사용해서 위와 같이 출력하기 
//while을 사용해서 "while - i : "+ i + "<br>"

i = 1;
 
while(i<=5){
	document.write("while - i : "+ i + "<br>");
	i++;
	j = 1;
	while(j<=5){
		
		document.write("while - j : "+ j + "<br>");
		j++;
	}
	document.write("<hr>")
}


     //    <p style="color: red;"> </p>.
 /*
 반복문을 사용해서 
10에서 50까지 출력을해보세요
그런데 10의 배수는 
     (10,20,30,40,50)
빨간 글씨로.
(for, while 둘중 하나만  )
 */

for (i = 10 ; i <= 50 ; i ++ ){
	
	// document.write('<p style="color: black;">'+i+' </p>');
	if( i % 10 == 0 ){
		document.write('<p style="color: red;">'+i+' </p>');
	}else{
		document.write('<p>'+i+'</p>');
	}
}

// while 문으로는 ??? 
document.write('<hr>');
i = 10;
while( i <= 50 ){
	
	if( i % 10 == 0 ){
		document.write('<p style="color: blue;">'+i+' </p>');
	}else{
		document.write('<p>'+i+'</p>');
	}
	
	
	i++;
}




































/*
for(초기식 ; 조건식 ; 증감식) {
     조건식이 만족하는 동안 반복될실행문 
}
 */

 for ( let i = 0 ; i<5 ; i++ ){
	 console.log(i); 
 }
 
 for( let i = 0;i<3;i++){
	 document.write("javascript<br>");
	 // i = 0, i=1, i=2
 }
 for( let i=1; i<=3 ;i++){
	 document.write("javascript<br>");
	 // i = 1, i=2, i=3
 }

// 1. for 문을 사용해서 0-9까지 출력해보세요 
for (let i = 0 ; i<10; i++){
	document.write(i +" ");
}
document.write('<br>');
var str ='';
for (let i = 0 ; i<10; i++){
	str = str+i; 
	// 0 
	// "0"+1 ->01
	// "01"+2 -> 012
	
}
document.write(str);
document.write('<br>');
//2. for 문을 사용해서 1-10까지의 합을 출력해보세요

var sum = 0 ; 
/*
(0)     + 1
(1)     + 2
(1+2)   + 3 
(1+2+3) + 4 
*/

for (let i = 1 ; i <101 ; i++){
	sum = sum +i ; 
	// sum += i ; 
}

document.write(sum);
document.write('<br>');

// 3. 1-100까지 홀수는 빨간색, 짝수는 파랑색으로 출력

for(let i = 1 ; i <=100 ; i++){
	
	if (i % 2 == 0 ){// 짝수 일때
		document.write("<p class='blue'>"+i+"</p>");
	}else{// 홀수 일때 
		document.write("<p class='red'>"+ i+"</p>");
	}
	
}

//4. 1-100  사이의 숫자를 출력하는데  
//    3의배수는 배경을 하늘색,
//    4의 배수는 배경을 핑크색 
//    12 배수는 배경없이 출력해주세요 


for(let i = 1 ; i <=100 ; i++){
	
	if ( (i % 3 == 0) &&  (i % 4 != 0 ) ){// 3의 배수일때, 
		document.write("<p class='skblue'>"+i+"</p>");
	}else if ( (i % 4 == 0 ) &&  (i % 3 != 0 ) ){// 4의 배수일때 
		document.write("<p class='pink'>"+ i+"</p>");
	}else if (i%12 == 0){
		document.write("<p>"+ i+"</p>"); // 배경없는 검정색 
	}
}

for(let i = 1 ; i <=10 ; i++){
	
	if ( (i % 2 == 0) &&  (i % 3 == 0 ) ){ 
		document.write("<p class='red pink'>"+i+"</p>");
	}else if(i % 2 == 0){
		document.write("<p class='red'>"+i+"</p>");
	}else if (i % 2 == 1){
		document.write("<p class='blue'>"+i+"</p>");
	}
	
	
}









/*
for(let i = 0 ; i <=5 ; i ++){
	// i 0,1,2,3,4,5 -> 6번 반복 
	document.write("여기는 i가 반복됨 <br>");
	for(let j = 0 ; j <=5 ; j++){
		document.write( j +" j <br>");
	}
	
	document.write("********j가끝나고 i반복전*******<br> ")


}*/

// i = 2 - 9  j = * 1- 9


document.write("<h1>구구단전체 출력</h1>");
for (let i = 2 ; i <=9 ;  i++ ){
	document.write( " [ " +  i + " 단] <br>")
	for (let j = 1 ; j <=9 ; j++ ){
		document.write( i + " * " + j + " = " + ( i * j ) + "<br>");
		// 1. i = 2 , j = 1,2,3,4,5,6,7,8,9
		// 2. i = 3 , j = 1,2,3,4,5,6,7,8,9
		// 3. i = 4 , j = 1,2,3,4,5,6,7,8,9
		
	}
 }
 
 
// 1. 홀수 단만 출력,      3단, 5단, 7단, 9단
document.write("<h1>홀수단만 출력</h1>");
for (let i = 2 ; i <=9 ;  i++ ){
	if(i % 2 == 1 ){ // i가 홀수인 경우만 출력 
		document.write( " [ " +  i + " 단] <br>")
		for (let j = 1 ; j <=9 ; j++ ){
			document.write( i + " * " + j + " = " + ( i * j ) + "<br>");
			
		}
	}
 }


// 2. 짝수 단만 출력       2단, 4단 6단 8단
document.write("<h1>짝수단만 출력</h1>");
for (let i = 2 ; i <=9 ;  i++ ){
	if(i % 2 == 0 ){ // i가 짝수인 경우만 출력을 해라. 
		document.write( " [ " +  i + " 단] <br>")
		for (let j = 1 ; j <=9 ; j++ ){
			document.write( i + " * " + j + " = " + ( i * j ) + "<br>");
			
		}
	}
 }
 
// 3. * 1,3,5,7,9 (곱해지는부분이 홀수)
document.write("<h1>구구단 곱하기 홀수만 출력</h1>");
for (let i = 2 ; i <=9 ;  i++ ){
	document.write( " [ " +  i + " 단] <br>")
	for (let j = 1 ; j <=9 ; j++ ){
		if( j % 2 == 1){
			
			document.write( i + " * " + j + " = " + ( i * j ) + "<br>");
		}
		
	} // for - j
 } // for - i
 
 

// 4. * 2,4,6,8 (곱해지는부분이 짝수)
document.write("<h1>구구단 곱하기 짝수만 출력</h1>");
for (let i = 2 ; i <=9 ;  i++ ){
	document.write( " [ " +  i + " 단] <br>")
	for (let j = 1 ; j <=9 ; j++ ){
		if( j % 2 == 0){
			
			document.write( i + " * " + j + " = " + ( i * j ) + "<br>");
		}
		
	}
 }
 
 
 

 
 
 
 
 
 
 
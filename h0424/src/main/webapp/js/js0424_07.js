
var arr = [1,2,3,4,5];
//         0 1 2 3 4 
document.write('arr의 길이는 '+ arr.length + '<br>' );


arr.push(6);
document.write('arr의 길이는 '+ arr.length + '<br>');

arr.push(7,8);
document.write('arr의 길이는 '+ arr.length + '<br>');
document.write(arr+ '<br>');

delete arr[1];
document.write(arr+ '<br>');
document.write('arr의 길이는 '+ arr.length + '<br>');

document.write('<hr>');


//배열에 귤이 있으면 귤이 있습니다. 없으면 귤이 없습니다 를 출력해보세요 
var fruits = ["딸기","수박","오렌지","망고","배","체리"];
var chk = false; // 있으면 0 true 없으면 1 false   

for(let i = 0 ; i < fruits.length ; i++){
	
	if( fruits[i] == "귤"){
		document.write("귤이 있습니다. ");
		chk = true; 
	}
}

if(!chk){
	document.write("귤이 없습니다. ");
}



document.write('<hr>');
/*
80 점 이상이면 합격을 출력 -> 합격이 5개 */
var aa = [100, 90, 86, 79, 72, 52, 98, 94]; 
       
for (let i = 0 ; i< aa.length ; i++){
	if(aa[i] >= 80 ) {
		document.write(aa[i]+ "점 합격 <br>");
	}
}

document.write('<hr>');
/*
홀수면 홀수 짝수면 짝수 출력 */
var num = [1,2,5,7,9,10,23,43];
 
for (let i = 0 ; i < num.length ; i++ ){
	if(	num[i] % 2 == 0 ) {
		document.write(num[i] + "은 짝수&nbsp;&nbsp;");
	}else{
		document.write(num[i] + "은 홀수&nbsp;&nbsp;");
	}
}


document.write('<hr>');
/* 
양수면 양수 음수면 음수 출력 

*/
var n = [1,-1,2,3,-4,5,6,-8,9,-10];

for (let i = 0 ; i < n.length ; i++ ){
	if(n[i]>= 0){
		document.write(n[i]+"는 양수 ");
	}else{
		document.write(n[i]+"는 음수 ");
	}
}


document.write('<hr>');
document.write('<hr>');










document.write("<h1>배열 값 가져오기 1 </h1>");

// document.write(fruits[0]+"<br>");

for ( var i = 0; i <fruits.length ; i++){
	document.write(fruits[i]+"<br>");
}


document.write("<h1>배열 값 가져오기 2 </h1>");

for ( k in fruits){
	document.write(fruits[k]+"<br>");
}


document.write("<h1>배열 값 가져오기 3 </h1>");

for( fu of fruits ){
	document.write(fu +"<br>");
}











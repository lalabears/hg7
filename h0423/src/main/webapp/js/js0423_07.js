/*
1-100 까지 출력을 하는데 
3의 배수는 건네띄고 출력해주세요 .
1 2 4 5 7 8 ... 100 
continue 를 사용해서 

*/
for (let i = 1; i<=100; i++){
	if(i%3 == 0){
		continue;
	}
	document.write(i+" ");
}

document.write("<br>")
let j = 0;
while(j<100){
	j++;
	if(j%3==0) continue;
	document.write(j+" ");
}

document.write("<hr>")
j = 1;
while(j<=100){
	
	if(j%3 == 0){
		j++;
		continue;
		
	} 
	document.write(j+" ");
	j++;
	
	// 1 2 
}
/*1 - 100까지 (7의배수는 제외한) 합을  구하세요 
 */

var sum = 0 ; 
for (let i = 1; i<=100; i++){
	if(i%7 == 0){
		continue;
	}
	sum += i; 
}
 
document.write(sum);



sum = 0 ; 
document.write("<br>")
j = 0;
while(j<100){
	j++;
	if(j%7==0) {
		continue;
	}
	sum += j ; 
}
 
document.write(sum);
 
var sum = 0;
for (let i = 1; i<=14; i++){
	
	sum += i 
	
}
document.write("<br>"+sum);

/*
1- 100 더하는데..
총합이 100이 넘으면
그때 총합과 그수를 출력해보세요
   break !! 를 사용해야함 
총합: 105, 그 수 : 14 

*/ 
var sum = 0 ;
var k = 0 ;
for (let i = 1 ; i <=100; i++){
	sum = sum + i ; 
	if(sum >= 100)
	{
		k = i; 
		break; 
	}
}

document.write("<br>"+k+"일때 : "+ sum);


var sum = 0 ;
let i = 0 ;
for ( i = 1 ; i <=100; i++){
	sum += i ; 
	if(sum >= 100)
	{
		k = i; 
		break; 
	}
}
document.write("<hr>")
document.write("<br>"+i+"일때 : "+ sum);

var total = 0 ;
 
i = 0 ; 

while ( i <100 ){
// i = 0	i = 1   i = 2
	i++;
// i = 1    i =  2  i = 3
	total = total + i ; 
// total = 0 + 1 = 1  >  1+2 =3
	if (total >= 100 ) {
		break; // total 100 이 넘으면 while종료한다. 
	} 
	
}
document.write("<br>"+i+"일때 : "+ total);











 
 
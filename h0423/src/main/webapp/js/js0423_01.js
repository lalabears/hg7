/* ==, > < 
if(조건식1){
	실행문1
}else if(조건식2){
	실행문2
}else{
	실행문3
}

-> 조건식1이 참일때 실행문1 실행
-> 조건식1이 거짓이고 조건식2가 참일때 실행문2 실행
-> 조건식1,2가 모두 거짓일때 실행문 3실행
*/ 
/*
if(조건값 == 값1 ){ 
	실행문1
}else if( 조건값 == 값2 ){
	실행문2
}else{
	실행문3
}
-> 스위치문으로 바꿀 수 있다. 
switch (조건값) {
    case 값1 : 
          실행문1;  
          break; 
    case 값2 : 
          실행문2;  
          break; 
    default:
          실행문3;
           break; 	
}


 */
/*
	점수를 입력을 받아서 
	100-80사이는 >  00점은 상입니다.
	80-60사이는 >  00점은 중입니다.
	60-40사이는 >  00점은 하입니다.
	0-40사이는 >   00점은 탈락입니다.
	그외의 숫자가 들어오면 -> 
	0-100사이의 값을 입력해주세요
	if 문을 사용해서  만들어주세요 
*/
// 변수선언 
var score = 0;
score = 100; //Number(prompt('점수를 입력해주세요 >> '));
      
if ( ( 80<= score) &&  (score <=100) ){
	document.write(score+"점은 상입니다"); 
}else if( 60<= score &&  score < 80 ){
	document.write(score+"점은 중입니다.");
}else if ( 40 <= score && score < 60 ){
	document.write(score+"점은 하입니다");
}else if (0<=score && score <40 ){
	document.write(score+"점은 탈랍입니다");
}else{
	document.write("0-100까지의 값을 입력해주세요");
}


 var brower = 'Chrome'; //prompt('사용하는 브라우저를 입력해주세요>>');
 
 switch(brower){
	case 'Edge':
		 alert('edge를 사용하고계시네요');
		 break;
	case 'Chrome':
    case 'Firefox':
	case 'Safari':
		alert('서비스가 지원되는 브라우저입니다.');
		break;
	default:
		alert('서비스가 지원되지 않습니다..');
		break; 		 
 }
 
 // if-else문으로 바꿔보기 
 
 
 
 var brower = 'Edge'; // prompt('사용하는 브라우저를 입력해주세요>>');
 
 if(brower == 'Edge' ){
	  alert('edge를 사용하고계시네요');
 }else if(brower == 'Chrome' || brower == 'Firefox' || brower == 'Safari' ){
	  alert('서비스가 지원되는 브라우저입니다.');
 }else {
	 alert('서비스가 지원되지 않습니다..');
 }
 
 /*
오렌지 -> 개당 1000원입니다. 
사과 -> 개당 2000원입니다
바나나 -> 개당 500원입니다
체리 -> 개당 1500원입니다
망고, 멜론 -> 개당 3000원입니다
그외 > 죄송합니다 00은 다 팔렸습니다

  */
 
 var fruit = prompt("원하는 과일을 입력하세요 "); 

 switch(fruit){
	 case "오렌지": 
	 	console.log('개당 1000원입니다. ');
	 	break;
	 case "사과": 
	 	console.log('개당 2000원입니다 ');
	 	break;
	 case "바나나": 
	 	console.log('개당 500원입니다 ');
	 	break;
	 case "체리": 
	 	console.log('개당 1500원입니다 ');
	 	break;
	 case "망고": case "멜론": 
	 	console.log('개당 3000원입니다 ');
	 	break;
	 default: 
	 	console.log('죄송합니다 00은 다 팔렸습니다 ');
	 	break;
	 
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
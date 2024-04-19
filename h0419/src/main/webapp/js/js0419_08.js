/*
이름과 점수를 입력 받아서
1. 60점 이상이면 [홍길동님 합격입니다. ]
미만이면 [홍길동님 불합격입니다.]
*/

// 변수선언 
var score, name; 
name = "홍길동"; // prompt("이름을 입력하세요");
score = 97; // Number(prompt("점수를 입력하세요 "));
    // 97  >= 60  
if ( score >= 60 ){
	document.write(name+"님 합겹입니다.");
}else {  // 조건문을 만족하지 않는 모든경우에.. 
	document.write(name+"님 불합겹입니다.");
}


/*2.  ------------------------------------------------
90점이상이면 홍길동님 A 학점입니다
80점이상이면 홍길동님 B 학점입니다 90<=s<=80
70점이상이면 홍길동님 C 학점입니다
60점이상이면 홍길동님 D 학점입니다
60점 미만 홍길동님 F 학점입니다
*/


// 변수 : score, name 

if(score >= 90 ){
	// 점수가 90점 이상만 참 . 
	document.write(name+"님 A 학점입니다");
} else if (score>=80){
	// 1번 조건이 점수가 90점이상 아니고, 
	// 2번 조건이 80점 이상일때.  
	document.write(name+"님 B 학점입니다");
	// 80<= score <90
} else if (score>=70){
	// 1번 조건이 점수가 90점이상 아니고, 
	// 2번 조건이 80이상이 아니고, 
	// 3번 조건으로 70점 이상일때  
	document.write(name+"님 C 학점입니다");
	
} else if (score>=60){
	// 1번 조건이 점수가 90점이상 아니고, 
	// 2번 조건이 80이상이 아니고, 
	// 3번 조건으로 70점 이상이 아니고, 
	// 4번 조건으로 60점 이상일때   
	document.write(name+"님 D 학점입니다");
} else {
	
	document.write(name+"님 F 학점입니다");
}







/*
3. -----------------------------------------------------
97점 이상은 A+, 94-96 사이는 A, 90-93 사이는 A-
87점 이상은 B+, 84-86 사이는 B, 80-83 사이는 B-
*/


if(score >= 90 ){
	// 여기 들어 올 수 있는 조건은
	// 90점과 100점 사이의 점수만 들어올 수 있음 
	if(score>=97){
		document.write("A+");
	}else if(score>=94){
		document.write("A");
	}else{
		document.write("A-");
	}
	
} else if (score>=80){
	// 여기에 들어올 수 있는 점수는
	// 80점보다크고 89점까지.. 
	if(score>=87){
		document.write("B+");
	}else if(score>=84){
		document.write("B");
	}else{
		document.write("B-");
	}
	

} else {
	
	document.write(name+"님 F 학점입니다");
}
















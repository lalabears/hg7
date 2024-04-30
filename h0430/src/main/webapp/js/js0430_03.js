// 장점: 자동완성기능 - 오타의 확률을 줄인다. 
var today = new Date(); // today에 오늘날짜. 
var toyear = today.getFullYear();
var tomonth = today.getMonth(); // 월은 0월부터 시작함 
var todate = today.getDate(); // 날짜 
console.log(today); // console.log(toyear)  //console.log(tomonth)
// year 추가 
var yearStr = '';  // '<option value="1990">1990</option>';
for (let i = 1900; i <= 2050; i++){
		if(toyear == i){
			yearStr += '<option value="'+ i +'" selected>'+ i +'</option>'
		}else{
			yearStr += '<option value="'+ i +'">'+ i +'</option>'			
		}
}
document.getElementById('year').innerHTML = yearStr; 
// month 추가 
var monthStr = '';
for (let i = 1; i <= 12; i++){
	if( (tomonth+1) == i){
		monthStr += '<option value="'+ i +'" selected>'+ i +'</option>'
	}else{
		monthStr += '<option value="'+ i +'">'+ i +'</option>'
	}
}
document.getElementById('month').innerHTML = monthStr; 

// day 추가 
var dayStr = '';
for (let i = 1; i <= 31; i++){
	if(todate == i ){
		dayStr += '<option value="'+ i +'" selected>'+ i +'</option>'
	}else{
		dayStr += '<option value="'+ i +'">'+ i +'</option>'
	}
}
document.getElementById('day').innerHTML = dayStr; 

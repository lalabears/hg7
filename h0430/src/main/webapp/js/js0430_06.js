function wBtn(){
	//alert();//1. 비만확인버튼을 누르면 alert창 뜨게 하기.
	//2. 이름, 키, 몸무게 를 입력하면 그 값을 console창에 띄우기 
	var name, height, weight; 
	name = document.getElementById("name").value; 
	height = document.getElementById("h").value;
	weight = document.getElementById("w").value; 
	// var minW = ( height - 100 ) * 0.9 - 5 
	// var maxW = ( height - 100 ) * 0.9 + 5 
	// 값을 잘 가지고 왔는지 console창에서 확인하기 
	console.log(name+height+weight);
	
	var result = ckw(height, weight);
	if(result == "체중미달" ){
		document.getElementById("txt").innerHTML= name+"님 "+ result;
		document.getElementById("txt").style.color ="blue";
		// alert("체중미달")
	}else if(result == "비만"){
		// alert("비만")
		document.getElementById("txt").innerHTML=name+"님 "+ result;
		document.getElementById("txt").style.color ="red";
	}else{
		document.getElementById("txt").innerHTML=name+"님 "+ result;
		document.getElementById("txt").style.color ="black";
		// alert("정상")
	}
	/*if(weight<=minW){
		document.getElementById("txt").innerHTML="체중미달";
		document.getElementById("txt").style.color ="blue";
		// alert("체중미달")
	}else if(weight >= maxW){
		// alert("비만")
		document.getElementById("txt").innerHTML="비만";
		document.getElementById("txt").style.color ="red";
	}else{
		document.getElementById("txt").innerHTML="정상";
		document.getElementById("txt").style.color ="black";
		// alert("정상")
	}*/
	
	// 아이디로 글자색 바꾸는 방법 
	//document.getElementById('cn').style.color = 'red'
	//태그 내에 글자색 적용 : <p style = "color:red;"></p>
	
//	document.getElementById("txt").innerHTML = "안녕"
	
}// function - wBtn()

// ckW( 몸무게, 키 ) 함수를 만들어서 
function ckw(height, weight){
	// 비만, 미달, 정상 여부를 확인하는 함수 
	var minW = ( height - 100 ) * 0.9 - 5 
	var maxW = ( height - 100 ) * 0.9 + 5 
	
	var result = '';
	if(weight<=minW){
		result = "체중미달";
	}else if(weight >= maxW){
		result = "비만";
	}else{
		result = "정상";
	}
	
	return result; 
}

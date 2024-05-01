// <button onclick="gallery(-1)"> ◀이전 </button> 
// <button onclick="gallery(1)"> 다음▶ </button>

var n = 1; // 전역변수로 사용 

function gallery(num){
	// alert(num);
	// 1. 사진의 위치에 접근한다. id로 찾기 
    //console.log('n : '+ n);
	n += num ; 
	console.log(n);
//	n이 5가 넘어갈때,다시 n을 1로 만들면되고,
	if(n>5){
		n = 1;
	} 
	// n이 1보다 작아질때 , n을 5로 만들면됨. 
	if(n<1){
		n=5;
	}
	
	// 보여주는 파트 
//	<img src="images/a1.jpg" id="photo">
	
	var imgPath = document.getElementById('photo');
	imgPath.setAttribute("src","images/a"+ n +".jpg");
	/// 사진번호를 viewNum에 보여주세요 
	//<div id="viewNum"> 1 </div>
	document.getElementById("viewNum").innerHTML = n;
	
	
	
}
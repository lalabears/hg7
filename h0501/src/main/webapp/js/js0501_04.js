var idlist = ['aaa','bbb','ccc','admin','abc'];
var useid = true; // 아이디를 사용할 수있는지. 

function idCk(){
	// alert();
//	1. 입력한 아이디값 가져오기 
	var uid = document.getElementById('id').value;
	console.log(uid);	
//	2. 아이디값이 리스트에 있는지 확인하기 
	for (let i =0 ;i<idlist.length ;i ++){
		if(uid == idlist[i]){
			// 아이디가 디비에 이미 존재함. 
			useid = false; 
			break; 
		}
	}
//	3. s01에 출력하기 사용이가능한 아이디/사용이 불가능한 아이디
	if(useid){
		// 아이디를 사용할 수 있음 
		document.getElementById("s01").innerHTML = "사용이가능한 아이디";
		document.getElementById("s01").style.color = "blue";
	}else{
		// 아이디를 사용할 수 없음
		document.getElementById("s01").innerHTML = "사용이 불가능한 아이디";
		document.getElementById("s01").style.color = "red";
	}
	
	
}
function idConfirm(){
	if(!useid){ // 사용할 수 없는 경우 
		alert("이미존재하는 아이디입니다. ")
	}else{
		if(confirm("정말로 사용하시겠습니까 ??? ")){
			alert(document.getElementById('id').value+"아이디를 사용합니다")
		}
	}
	// alert();
	//아이디사용을 클릭할 경우, confirm함수를 사용해 
	// yes인경우 alert창으로 000아이디를 사용합니다를 출력
}
var astr ='<option>A</option>';
astr = astr + '<option>B</option>';
astr = astr + '<option>C</option>';

document.getElementById("test").innerHTML = astr; 

// 1 . 태어난 연도를 1920 년부터 2024년까지 1990년을 기본값으로 설정 
var yearStr = ''
for (let i = 1920; i<=2024 ; i++ ){
	if(i == 1990){
		yearStr +='<option value ="'+ i +'"selected>'+ i + '</option>';
	}else{
		yearStr += '<option value ="'+ i +'">'+ i + '</option>';
	}
}
document.getElementById("byear").innerHTML = yearStr;

var hobbylist = ['골프','영화','테니스','책','등산']; 
// 3 .리스트를 사용해서 select문 option추가하기 
var hstr = '';
for(let i = 0; i < hobbylist.length ; i ++){
   hstr += '<option value ="'+ hobbylist[i] +'">'+ hobbylist[i] + '</option>';

}
document.getElementById("hobby").innerHTML = hstr;



// 2. 버튼을 눌렀을때, 아이디가 txt인 위치에 
// [1990년생 홍길동님이 남기시는 말씀은 000입니다. ]
function sendBtn(){
	// alert()
	//이름의 id : name
	var name = document.getElementById("name").value;
	//연도의 id : byear
	var byear = document.getElementById("byear").value;
	//코멘트 id : comt
	var commt = document.getElementById("comt").value;
	// 취미의 id :hobby
	var hoby = document.getElementById("hobby").value;
	var str = byear+'년생 '+name+'님의 취미는 '+ hoby +'입니다. 남기시는 말씀은 '+commt+'입니다';
	document.getElementById('txt').innerHTML = str; 	
} 
 
 
 
 



	
/*	
	

[1990년생 홍길동님의 취미는 테니스입니다.
남기시는 말씀은 000입니다. ] 
 라고 출력해보기 */
var popW; 
function popupOpen(){
	popW = window.open('popup.html','',
	'width=400px, height=500px, resizable=no, scrollbars=no')
}
function sendVal(){
	popW.document.getElementById("pVal").value = 
	     document.getElementById("textInput").value;
	
	popW.document.getElementById("p01").innerHTML = 
	     document.getElementById("textInput").value;
	        
	popW.focus();     
}


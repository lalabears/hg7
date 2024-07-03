<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/read.css">
  <script src="http://code.jquery.com/jquery-latest.min.js"></script>
  <script type="text/javascript">
	  $(function(){
		  $("#modiBtn").click(function(){
			  alert("수정페이지로이동합니다.");
			 // alert( $("#btitle").text()   );  alert( $("#bdate").text()   );
			 // alert( $(".article").text().trim()   );
			  location.href = "notice_modi.jsp?btitle="+ $("#btitle").text()
					  +"&bcontent="+$(".article").text().trim()
					  +"&bdate="+$("#bdate").text();
		  });// id가 modiBtn인것을 클릿햇을때 실행되는 함수 
	  }); // 여기안에서만 jquery사용이 가능함
  </script>
</head>

<body>
  <%@ include file="top.jsp" %>
  <section>
    <h1>NOTICE</h1>
    <table>
      <tr>
        <th id="btitle">JSP 수업 안내</th>
      </tr>
      <tr>
        <td id="bdate">2024-07-03</td>
      </tr>
      <tr>
        <td class="article">
        	오늘은 jsp 3번째 수업입니다.
        </td>
      </tr>
      <tr>
        <td><strong>다음글</strong> <span class="separator">|</span> [키즈잼] 2월 프로그램 안내</td>
      </tr>
      <tr>
        <td><strong>이전글</strong> <span class="separator">|</span> [키즈잼] 2020년 1분기 정기 휴관일 안내</td>
      </tr>
    </table>
    <div class="list"><a href="notice_list.jsp">목록</a></div>
    <div class="list">삭제</div>
    <div class="list" id="modiBtn">수정</div>
  </section>
	<%@ include file="foot.jsp" %>
</body>
</html>
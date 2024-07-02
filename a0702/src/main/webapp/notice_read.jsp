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
  <script  src="http://code.jquery.com/jquery-latest.min.js"></script>
  <script type="text/javascript">
  	$(function(){
  		$("#modiBtn").click(function(){
  			alert("수정페이지로 이동합니다");
  			// 페이지에서 원하는 정보 읽기 
  			// 1. 제목    2. 날짜  3.아티클안에 있는 내용 
  			// 1. 제목. 
  			//      input박스안에 입력된 값을 가져올때 > $().val();
  			//      텍스트를 가져올때 > $().text();
  			var btitle = $("#btitle").text(); 
  			//var bcontent =$(".article").html(); ;  // article 이라는 클래스
  			var bcontent =$(".article").text().trim(); ;  // article 이라는 클래스
  			var bdate = $("#bdate").text(); ;     // 아이디를 만들어줘야. bdate 
  			//alert(btitle);alert(bcontent); alert(bdate);
  			location.href = "notice_modi.jsp?btitle="+btitle+"&bcontent="+bcontent+"&bdate="+bdate;
  			//location.href = "notice_modi.jsp?btitle="+btitle+"&bdate="+bdate;
  		}); // modiBtn
  		
  		
  		
  	});// jquery
  	
  
  </script>
  
  
  
  <style>
   a{ text-decoration: none; color:black; }
  </style>
</head>
<body>
  <%@ include file = "ntop.jsp" %>
  <section>
    <h1>NOTICE</h1>
    <table>
      <tr>
        <th id="btitle">[키즈잼] 2020년 이용 시간 이용 요금 변경 안내</th>
      </tr>
      <tr>
        <td id="bdate">2019-12-11</td>
      </tr>
      <tr>
        <td class="article">
          요금과 이용시간이 변경되었습니다.   
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
    <div class="list" id ="modiBtn">수정</div>
  </section>

     <%@ include file = "nfoot.jsp" %>
</body>
</html>
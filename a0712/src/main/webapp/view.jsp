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
</head>

<body>
  <%@ include file="top.jsp" %>
  <section>
    <h1>NOTICE</h1>

    <table>
      <colgroup>
      	<col width="80%">
      	<col width="10%">
      	<col width="10%">
      </colgroup>
      <tr>
        <th colspan="3">제목</th>
      </tr>
      <tr>
        <td colspan="3">게시글의 제목이 들어갈 위치입니다</td>
      </tr>
      <tr>
        <td>아이디</td>
        <td>조회수</td>
        <td>0</td>
      </tr>
      <tr>
        <td colspan="3" class="article"> 게시글의 내용이 들어갈위치입니다</td>
      </tr>
      <tr>
        <td class="article">
          <img src="" alt="이미지대체글" width="80%">
        </td>
      </tr>
      <tr>
        <td><strong>다음글</strong> <span class="separator">|</span> [키즈잼] 2월 프로그램 안내</td>
      </tr>
      <tr>
        <td><strong>이전글</strong> <span class="separator">|</span> [키즈잼] 2020년 1분기 정기 휴관일 안내</td>
      </tr>
    </table>
	<script>
		function deleteBtn(){
			if( confirm("게시글을 삭제하시겠습니까? ")){
				location.href="delete.do?bno=";
			}
		}
	</script>
    <a href="list.do"><div class="list">목록</div></a>
    <a onclick="deleteBtn()"><div class="list">삭제</div></a>
    <a href="edit.do?bno="><div class="list">수정</div></a>
  </section>

 <%@ include file="foot.jsp" %>

</body>
</html>
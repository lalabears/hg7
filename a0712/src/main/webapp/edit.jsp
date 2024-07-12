<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Pages - Login</title>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean" rel="stylesheet">
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/write.css">
</head>

<body>
  <%@ include file="top.jsp" %>
  <section>
    <h1>글 수정하기</h1>
    <hr>
    <form action="doedit.do" name="write" method="post" 
    								enctype="multipart/form-data"	>
      <table>
        <colgroup>
          <col width="15%">
          <col width="85%">
        </colgroup>
        <tr>
          <th>작성자</th>
          <td>
            ${board.id }
            <input type="hidden" id = "id" name="id" value="${board.id }">
            <input type="hidden" id = "bno" name="bno" value="${board.bno }">
          </td>
        </tr>
        <tr>
          <th>제목</th>
          <td>
            <input type="text" name="btitle" value="${board.btitle }">
          </td>
        </tr>
        <tr>
          <th>내용</th>
          <td>
            <textarea name="bcontent" cols="50" rows="10">${board.bcontent }</textarea>
          </td>
        </tr>
        <tr>
          <th>이미지 표시</th>
          <td>
          <!-- 보여짐  -->
          	<img src="upload/${board.bfile }">
          	<!-- 원래file이름을 submit했을때 넘기고싶음. -->
            <input type="hidden" name="oldfile" id="oldfile" value="${board.bfile }">
          </td>
        </tr>
        <tr>
          <th>이미지 표시</th>
          <td>
            <input type="file" name="bfile" id="file">
          </td>
        </tr>
      </table>
      <hr>
      <div class="button-wrapper">
        <button type="submit" class="write">작성완료</button>
        <button type="button" class="cancel" 
        	onclick="javascript:history.back()">취소</button>
      </div>
    </form>
  </section>
  <%@ include file="foot.jsp" %>

</body>
</html>
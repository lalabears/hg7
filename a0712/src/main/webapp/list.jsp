<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/notice_list.css">
</head>
<body>
<%@ include file="top.jsp" %>
  <section>
    <h1>NOTICE</h1>
    <div class="wrapper">
      <form action="/search" name="search" method="post">
        <select name="category" id="category">
          <option value="0">전체</option>
          <option value="title">제목</option>
          <option value="content">내용</option>
        </select>

        <div class="title">
          <input type="text" size="16">
        </div>
  
        <button type="submit"><i class="fas fa-search"></i></button>
      </form>
    </div>

    <table>
      <colgroup>
        <col width="15%">
        <col width="40%">
        <col width="15%">
        <col width="15%">
        <col width="15%">
      </colgroup>
      <!--  thead 부분 -->
      <tr>
        <th>No.</th>
        <th>제목</th>
        <th>작성자</th>
        <th>작성일</th>
        <th>조회수</th>
      </tr>
      <!-- tbody 부분 , 디비에 있는 내용 출력할 부분 (내용부분) -->
      <c:forEach var = "b" items="${list }">
	      <tr>
	        <td><span class="table-notice"> ${b.bno }</span></td>
	        <td class="table-title"><a href="view.do?bno=${b.bno }">${b.btitle }</a></td>
	        <td>${b.id }</td>
	        <td>${b.bdate }</td>
	        <td>${b.bhit }</td>
	      </tr>
      </c:forEach>
      <!-- tbody 부분 , 디비에 있는 내용 출력할 부분 (내용부분) -->
    </table>
    <ul class="page-num">
      <li class="first"></li>
      <li class="prev"></li>
      <li class="num">
        <div>1</div>
      </li>
      <li class="next"></li>
      <li class="last"></li>
    </ul>
    <a href="write.do"><div class="write">쓰기</div></a>
  </section>
 <%@ include file="foot.jsp" %>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Date" %>
<%@ page import = "java.text.SimpleDateFormat" %>
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
        <col width="18%">
        <col width="60%">
        <col width="18%">
      </colgroup>
      <tr>
        <th>No.</th>
        <th>제목</th>
        <th>작성일</th>
      </tr>
      <% // java코드를 쓸 수 있는 공간 
      	Date today = new Date(); 
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String today_str = sdf.format(today);
      %>
      <% for(int i = 0 ; i < 10 ; i++ ) { %>
   	  <tr>
        <td> <%= i+1  %>  </td>
        <td class="table-title">
        	<a href="notice_read.jsp?bno=<%= i+1  %>" >카카오플러스 친구 오픈 </a>
        </td>
        <td> <%= today_str %>  </td>
      </tr>
      <% } // for- i    %>
    </table>

    <ul class="page-num">
      <li class="first"></li>
      <li class="prev"></li>
      <% for(int i = 1 ; i <= 10 ; i++ ){ %>
	      <li class="num">
	        <div> <a href="S01?page=<%= i %>&keyword=search"> <%= i %>  </a> </div>
	      </li>
      <% }// for-i %>
      <li class="next"></li>
      <li class="last"></li>
    </ul>

    <div class="write">쓰기</div>
  </section>

  <%@ include file="foot.jsp" %>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<header>
    <ul>
    <!--  로그인이 되지 않았을때 화면  -->
    <% if(session.getAttribute("sessionId")==null){ %>
      <li>회원가입</li> <span>|</span>
      <li><a href="login.jsp">로그인</a></li> <span>|</span>
    <% } else { %>  
    <!--  로그인이 되었을때 화면  -->
      <li> <%= (String)session.getAttribute("sessionName") %> 님</li> <span>|</span>
      <li><a href="logout.jsp">로그아웃</a></li> <span>|</span>
    <% } %>
    
      <li><a href="main.jsp">고객행복센터</a></li> <span>|</span>
      <li>배송지역검색</li> <span>|</span>
      <li>기프트카드 등록</li>
    </ul>
  </header>

  <nav>
    <div class="logo"></div>

    <div id="search">
      <div class="search"></div><br>
      <span>메뉴찾기</span>
    </div>

    <div id="cart">
      <div class="cart"></div><br>
      <span>장바구니</span>
    </div>

    <div class="nav-menu">
      <ul>
        <li>COOKIT소개</li>
        <li>COOKIT 메뉴</li>
        <li>리뷰</li>
        <li>이벤트</li>
        <li>MY쿡킷</li>
      </ul>  
    </div>
  </nav>
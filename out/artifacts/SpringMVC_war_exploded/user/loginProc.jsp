<%@ page import="com.yopy.Model.user.UserVO" %>
<%@ page import="com.yopy.Model.user.UserDAO" %>
<%@ page import="com.yopy.Model.user.UserRowMapper" %><%--
  Created by IntelliJ IDEA.
  User: yopy
  Date: 2020-02-01
  Time: 오후 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String id =request.getParameter("id");
    String pw = request.getParameter("password");
    String nick  = request.getParameter("nickname");
    UserVO vo = new UserVO();
    vo.setId(id);
    vo.setPw(pw);
    vo.setNickname(nick);
    UserDAO userDAO = new UserDAO();


%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%=request.getParameter("id")%>
<%=request.getParameter("password")%>

</body>
</html>

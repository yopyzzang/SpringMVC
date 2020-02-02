<%--
  Created by IntelliJ IDEA.
  User: yopy
  Date: 2020-02-01
  Time: 오후 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<meta charset="UTF-8">
<html>
  <head>
    <title>LoginPage</title>
  </head>
  <body>
  <h1>LOGIN..</h1><hr>
  <form action="loginProc.jsp" method="post">
  <table border="1">
    <tr>
      <td>ID</td>
      <td><input type="text" name="id"></td>
    </tr>
    <tr>
      <td>PW</td>
      <td><input type="password" name="password"></td>
    </tr>
    <tr>
      <td>NICKNAME</td>
      <td><input type="text" name="nickname"></td>
    </tr>
    <tr>
      <td colspan="2"><input type="submit" value="LOGIN"></td>
    </tr>
  </table>
  </form>
  </body>
</html>

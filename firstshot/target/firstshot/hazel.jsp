<%--
  Created by IntelliJ IDEA.
  User: bilal
  Date: 17/06/14
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<% if (session.getAttribute("isLogin") == null) { %>
<p> PLEASE LOGIN </p>
<% } else {%>
<p> WELCOME <%=(String)session.getAttribute("username")%>  </p>
<% } %>

<p> <%=(String)request.getAttribute("sessiontime")%></p>
<p>result: <%=(String)session.getAttribute("isLogin")%>
</p>

<p>username: <%=(String)session.getAttribute("username")%>
</p>

<form action="" method="get">
    name: <input type="text" name="fname"><br>

    <input type="submit"  value="set">
</form>
<button onclick="window.location.href='?action=1'">get</button>
<button onclick="window.location.href='?action=2'">del</button>
<p>result: <%=(String)session.getAttribute("todo")%>
</p>
</body>
</html>

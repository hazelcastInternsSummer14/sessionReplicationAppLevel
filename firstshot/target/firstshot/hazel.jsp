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
<div align="center">
<%

    if(session.isNew()){ out.println("session is created first time=<br>" + session.getId()+ "\n"); }
    else { out.println("this session is not new:<br>" + session.getId()); }
%>


<form action="" method="get">
    key: <input type="text" name="key" > <br>
    value: <input type="text" name="value"><br>

    <input type="submit"  name="action" value="set">
</form>


<form action="" method="get">
    key: <input type="text" name="key" > <br>
    <input type="submit" name="action" value="get" />
    <input type="submit" name="action" value="delete" />
</form>

<p>result:
<%
    if(session.getAttribute("todo")!=null){ out.println(session.getAttribute("todo"));
    }
%>
</p>
<p>key-values: <%=(String)request.getAttribute("res")%>
</p>
</div>
</body>
</html>

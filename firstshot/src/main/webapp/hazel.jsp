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
    <%@ page import="java.util.*" %>
    <%

        if(session.isNew()){ out.println("session is created first time=<br>" + session.getId()+ "\n"); }
        else { out.println("this session is not new:<br>" + session.getId()+"</br>"); }
        out.println("creation time:"  + new Date(session.getCreationTime()) + "</br>");

        out.println("last accessed time:"  + new Date(session.getLastAccessedTime()) + "</br>");

        out.println( "The SESSION TIMEOUT period is " + session.getMaxInactiveInterval() + " seconds.<br><br>");
        out.println( "Now changing it to 2 minutes.<br><br>");
        session.setMaxInactiveInterval(2 * 60);
        out.println("The SESSION TIMEOUT period is now " + session.getMaxInactiveInterval()  + " seconds.");
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
    <p>key-values: <%

        Enumeration names=session.getAttributeNames();
        StringBuilder a = new StringBuilder();

        while (names.hasMoreElements()) {

            String name = (String) names.nextElement();
            out.println(name);
            a.append("<br>");
//            if(!(name.equals("key")) && !(name.equals("todo")))

            a.append(name +" " + session.getAttribute(name) + " "+"<br>");
        }
        String res=a.toString();
            out.println(res);

    %>
    </p>
</div>

</body>
</html>

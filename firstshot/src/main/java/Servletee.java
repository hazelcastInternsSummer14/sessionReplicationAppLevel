import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by bilal on 17/06/14.
 */
public class Servletee extends HttpServlet {
    //   int syc=1;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        if(request.getParameter("key")!=null && request.getParameter("value")!=null){
            session.setAttribute("key",request.getParameter("value"));
        }
if(request.getParameter("action")!=null) {
    if (request.getParameter("action").equals("set") && request.getParameter("key") != null && request.getParameter("value") != "null") {
        session.setAttribute(request.getParameter("key"), request.getParameter("value"));
    }

    if (request.getParameter("action").equals("get") && request.getParameter("key") != null) {

        session.setAttribute("todo", session.getAttribute(request.getParameter("key")));
    }
    if (request.getParameter("action").equals("delete") && request.getParameter("key") != null) {
        session.removeAttribute("todo");
        session.removeAttribute(request.getParameter("key"));
    }
}
        Enumeration names=session.getAttributeNames();
        StringBuilder a = new StringBuilder();

        while (names.hasMoreElements()) {

            String name = (String) names.nextElement();
            a.append("<br>");
            if(!(name.equals("key")) && !(name.equals("todo")))
p
            a.append(name +" " + session.getAttribute(name) + " "+"<br>");
        }
        String res=a.toString();
        request.setAttribute("res",res);
       request.getRequestDispatcher("/hazel.jsp").forward(request, response);

    }
}

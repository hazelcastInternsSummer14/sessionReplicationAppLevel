import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by bilal on 17/06/14.
 */
public class Servletee extends HttpServlet {
    //   int syc=1;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //    response.getWriter().println(request.getParameter("user")+ "  "+request.getParameter("pwd"));
        if (request.getParameter("user").equals("hazelcast") && request.getParameter("pwd").equals("admin")) {
            response.getWriter().println("asdsad");
            HttpSession session = request.getSession();
            session.setAttribute("username", "hazelcast");
            session.setAttribute("isLogin","1");
            doGet(request, response);

        }
    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
//response.getWriter().println(session.getAttribute("username"));
        //   syc++;
        //   request.setAttribute("sayac",String.valueOf(syc));
     //   HttpSession session = request.getSession();
        if(request.getParameter("fname")!=null){
            session.setAttribute("name",request.getParameter("fname"));
        }
        if(request.getParameter("action")!=null) {
            if (request.getParameter("action").equals("1") && session.getAttribute("name")!=null) {
                session.setAttribute("todo", session.getAttribute("name"));
            }
            if (request.getParameter("action").equals("2")) {
                session.removeAttribute("name");
                session.setAttribute("todo", "");
            }
        }
  //  request.setAttribute("todo",session.getAttribute("name"));

        long  remainingTimeInMilliseconds = 60000-(System.currentTimeMillis() -
                session.getLastAccessedTime());
        request.setAttribute("sessiontime",""+remainingTimeInMilliseconds);
        request.getRequestDispatcher("/hazel.jsp").forward(request, response);

    }
}

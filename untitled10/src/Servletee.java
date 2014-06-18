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

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     //   syc++;
        //   request.setAttribute("sayac",String.valueOf(syc));
        HttpSession session = request.getSession(true);
        if(request.getParameter("fname")!=null){
            session.setAttribute("name",request.getParameter("fname"));
        }
        if(request.getParameter("action")!=null) {
            if (request.getParameter("action").equals("1")) {
                request.setAttribute("todo", session.getAttribute("name"));
            }
            if (request.getParameter("action").equals("2")) {
                session.removeAttribute("name");
                request.setAttribute("todo", "");
            }
        }
  //  request.setAttribute("todo",session.getAttribute("name"));
        request.getRequestDispatcher("/hazel.jsp").forward(request, response);

    }
}

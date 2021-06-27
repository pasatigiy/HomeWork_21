package by.tms.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "HelloServlet", value = "/hello", loadOnStartup = 0)
public class HelloServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("init");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service");
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        getServletContext().setAttribute("name", "test");
        req.setAttribute("name", "test");
        HttpSession session = req.getSession();
        session.setAttribute("name", "TEST");
        req.getRequestDispatcher("/test").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getParameter("name"));

    }
}

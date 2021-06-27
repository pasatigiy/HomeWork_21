package by.tms.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/test")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String name = (String) getServletContext().getAttribute("name");
//        System.out.println(name);
        String name = (String) req.getAttribute("name");

//        HttpSession session = req.getSession();
//        String name = (String) session.getAttribute("name");
//        System.out.println(name);
    }
}

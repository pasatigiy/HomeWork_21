package by.tms.servlet;

import by.tms.entity.User;
import by.tms.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/authorization")
public class AuthorizationServlet extends HttpServlet {

    private UserService userService = new UserService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User byUsername = userService.findByUsername(username);
        if(password.length()>0){
            if (byUsername.getPassword().equals(password)){
            req.getSession().setAttribute("user", byUsername);
            } else {
                resp.getWriter().print("Wrong password");
            }
        } else {
            resp.getWriter().print("no password entered");
        }
    }
}

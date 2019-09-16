package edu;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        String food = req.getParameter("food");

        pw.println("<html> <body>");
        if(food==null)
        {
            food="No food to eat";
            pw.println("<h1>"+ food +" </h1> ");
        }
        else
            pw.println("<h1>You can eat "+ food +"! </h1> ");
        pw.println("</body> </html> ");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}

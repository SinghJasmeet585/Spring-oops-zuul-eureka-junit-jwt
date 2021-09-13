package com.niit.servlet;

import com.niit.model.Employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SecondServlet", value = "/SecondServlet")
public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("Second Servlet");
        response.getWriter().println((String)request.getAttribute("x"));
        Employee employee =(Employee) request.getAttribute("employee");

        response.getWriter().println(employee.getName());
        response.getWriter().println(employee.getMobile());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

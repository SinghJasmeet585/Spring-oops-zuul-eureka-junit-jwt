package com.niit.servlet;

import com.niit.model.Employee;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    //Executed Only once
    public void init() {
        message = "Hello World!";
    }

    //Service will get executed for n number of request from the client(Browser)
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String mobileNumber = request.getParameter("mobileNumber");
        String salary = request.getParameter("salary");

        Employee employee = new Employee();
        employee.setName(username);
        employee.setPassword(password);
        employee.setMobile(mobileNumber);
        employee.setSalary(salary);

        message = username;
        // Hello

        if (username.equals("admin") && password.equals("admin")){
            request.setAttribute("x",username);
            request.setAttribute("y",password);
            request.setAttribute("employee",employee);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("SecondServlet");
            requestDispatcher.forward(request,response);
        }else{
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/error.html");
            requestDispatcher.forward(request,response);
        }

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Welcome " + message + " Your password is " + password +
                " , Mobile number is = " + mobileNumber + " and salary is " +
                salary + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "/FirstServlet", urlPatterns = ("/FirstServlet"));
public class FirstServlet  extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req,resp);
        System.out.println("Hi welcome");

        PrintWriter out = resp.getWriter();
        System.out.println("Serverside programming");

        resp.getWriter().println("Welcome to first servlet prorgam");
    }

}
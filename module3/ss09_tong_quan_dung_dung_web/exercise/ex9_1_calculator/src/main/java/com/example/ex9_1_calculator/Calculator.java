package com.example.ex9_1_calculator;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.ResultSet;

@WebServlet(urlPatterns = "/calculator", name = "calculator")
public class Calculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rq =  req.getRequestDispatcher("index.jsp");
        rq.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double amount =Double.parseDouble(req.getParameter("product"));
        double price = Double.parseDouble(req.getParameter("price"));
        double discount = Double.parseDouble(req.getParameter("discount"));
        double total = amount * price - price*discount/100;
        req.setAttribute("product",amount);
        req.setAttribute("price",price);
        req.setAttribute("discount",discount);
        req.setAttribute("total",total);
        req.getRequestDispatcher("/total.jsp").forward(req,resp);
    }
}

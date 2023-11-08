package com.example.ex9_1_product_discount_calculate;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/DiscountCalculate", name = "productDiscountController")
public class productDiscountController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Double productPrice = Double.parseDouble(req.getParameter("productPrice"));
        Double productDiscount = Double.parseDouble(req.getParameter("productDisc"));
        Double discountAmount = productPrice * productDiscount * 0.01;
        Double discPrice = productPrice - discountAmount;
        PrintWriter writer = resp.getWriter();
        writer.println("Discount Amount: " + discountAmount);
        writer.println("Discount Price: " + discPrice);
    }
}

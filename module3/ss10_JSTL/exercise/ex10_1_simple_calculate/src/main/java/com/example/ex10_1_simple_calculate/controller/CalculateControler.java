package com.example.ex10_1_simple_calculate.controller;

import com.example.ex10_1_simple_calculate.models.Calculater;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/CalculateControler", name = "CalculateControler")
public class CalculateControler extends HttpServlet {
    private Calculater calculater = new Calculater();
    private Double firtOperand;
    private String Oprator;
    private Double secondOperand;

    public Calculater getCalculater() {
        return calculater;
    }

    public void setCalculater(Calculater calculater) {
        this.calculater = calculater;
    }

    public Double getFirtOperand() {
        return firtOperand;
    }

    public void setFirtOperand(Double firtOperand) {
        this.firtOperand = firtOperand;
    }

    public String getOprator() {
        return Oprator;
    }

    public void setOprator(String oprator) {
        Oprator = oprator;
    }

    public Double getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(Double secondOperand) {
        this.secondOperand = secondOperand;
    }

    public CalculateControler(Calculater calculater, Double firtOperand, String oprator, Double secondOperand) {
        this.calculater = calculater;
        this.firtOperand = firtOperand;
        Oprator = oprator;
        this.secondOperand = secondOperand;
    }

    public CalculateControler() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}

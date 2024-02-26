package com.example.finaltest.controller;

import com.example.finaltest.module.testModel.TestTable;
import com.example.finaltest.service.IService;
import com.example.finaltest.service.ServiceImpl;
import com.example.finaltest.service.TestServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/testHome", name = "testHome")
public class testHome extends HttpServlet {
    private IService iService = new TestServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "getList": {
                List<TestTable> testTableList = new ArrayList<>();
                testTableList = iService.getAll();
                req.setAttribute("testTableList", testTableList);
                req.getRequestDispatcher("/testList.jsp").forward(req, resp);
                break;

            }
            case "create": {
                req.getRequestDispatcher("/testCreate.jsp").forward(req, resp);
                break;
            }
            default: {
                req.getRequestDispatcher("/").forward(req, resp);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create": {
                String date_text =req.getParameter("date_test");
                Date date_test = Date.valueOf(date_text);
                String date_time = req.getParameter("date-time-test");
                DateTimeFormatter inputFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
                DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String formattedDateTime = LocalDateTime.parse(date_time, inputFormatter).format(outputFormatter);
                Timestamp date_time_test = Timestamp.valueOf(LocalDateTime.parse(formattedDateTime, outputFormatter));
                System.out.println(date_text);
                System.out.println(date_test);
                System.out.println(date_time);
                System.out.println(date_time_test);
                TestTable testTable = new TestTable();

                testTable.setDate_test(date_test);
//                tring getDateHtml = request.getParameter("ngaynhapvien");
//                ngay_nhap_vien = java.sql.Date.valueOf(LocalDate.parse(getDateHtml, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
//                Date ngay_ra_vien = java.sql.Date.valueOf(LocalDate.parse(request.getParameter("ngayravien"),DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                break;
            }
            default: {
                req.getRequestDispatcher("/").forward(req, resp);
            }
        }
    }
}

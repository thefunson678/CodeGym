package com.example.finaltest.controller;

import com.example.finaltest.dto.ProductDTO;
import com.example.finaltest.dto.RoomDTO;
import com.example.finaltest.service.IService;
import com.example.finaltest.service.ServiceImpl;
import com.example.finaltest.service.TestServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(urlPatterns = "/Products", name = "Products")
public class Controller extends HttpServlet {
    private IService iService = new ServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null){
            action="";
        }
        switch (action){
            case "showRoom": {
                List<RoomDTO> roomDTOList = new ArrayList<>();
                roomDTOList = iService.showRoom();
                req.setAttribute("roomDTOList", roomDTOList);
                req.getRequestDispatcher("/list.jsp").forward(req, resp);
                break;
            }
            case "showProduct": {
                List<ProductDTO> productDTOList = new ArrayList<>();
                productDTOList = iService.showProduct();
                req.setAttribute("productDTOList",productDTOList);
                req.getRequestDispatcher("/list.jsp").forward(req, resp);
                break;
            }
            case "CreateProduct":{
                req.getRequestDispatcher("/create.jsp").forward(req, resp);
            }
            case "deleteOne": {

                System.out.println("Fadsf sàd");

                break;
            }
            default:{
                List<ProductDTO> productDTOList = new ArrayList<>();
                productDTOList = iService.showProduct();
                req.setAttribute("productDTOList",productDTOList);
                req.getRequestDispatcher("/list.jsp").forward(req, resp);
                break;
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null){
            action="";
        }
        switch (action){
            case "deleteOne": {
                System.out.println("post");
                String deleteID = req.getParameter("delete-one");
                System.out.println(deleteID);
                iService.deleteOne(deleteID);
                List<ProductDTO> productDTOList = new ArrayList<>();
                productDTOList = iService.showProduct();
                req.setAttribute("productDTOList",productDTOList);
                req.getRequestDispatcher("/list.jsp").forward(req, resp);
                break;
            }
            case "createProduct" : {
                List<ProductDTO> productDTOList = new ArrayList<>();
                productDTOList = iService.showProduct();
                req.setAttribute("productDTOList",productDTOList);
                req.getRequestDispatcher("/list.jsp").forward(req, resp);
                break;
            }
            default:{
                List<ProductDTO> productDTOList = new ArrayList<>();
                productDTOList = iService.showProduct();
                req.setAttribute("productDTOList",productDTOList);
                req.getRequestDispatcher("/list.jsp").forward(req, resp);
                break;
            }
        }
    }
}

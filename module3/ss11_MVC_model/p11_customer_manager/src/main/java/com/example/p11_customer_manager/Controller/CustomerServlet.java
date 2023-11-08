package com.example.p11_customer_manager.Controller;

import com.example.p11_customer_manager.Model.CustomerModel;
import com.example.p11_customer_manager.Service.CustomerServiceImpl;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet (urlPatterns = "/CustomerServlet", name = "CustomerServlet")
public class CustomerServlet extends HttpServlet {
    private CustomerServiceImpl customerService= new CustomerServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                showCreateForm(req, resp);
                break;
            case "edit":
                showEditForm(req,resp);
                break;
            case "delete":
                showDeleteForm(req,resp);
                break;
            case "view":
                viewCustomer(req,resp);
                break;
            default:
                listCustomer(req,resp);
                break;
        }
    }
    private void viewCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        CustomerModel customerModel = this.customerService.findById(id);
        RequestDispatcher dispatcher;
        if(customerModel == null){
            dispatcher = request.getRequestDispatcher("/WEB-INF/listCustomerModel/error404.js");
        } else {
            request.setAttribute("customer", customerModel);
            dispatcher = request.getRequestDispatcher("/WEB-INF/listCustomerModel/view.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        CustomerModel customerModel = this.customerService.findById(id);
        RequestDispatcher dispatcher;
        if(customerModel == null){
            dispatcher = request.getRequestDispatcher("/WEB-INF/listCustomerModel/error404.js");
        } else {
            request.setAttribute("customer", customerModel);
            dispatcher = request.getRequestDispatcher("/WEB-INF/listCustomerModel/delete.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void showCreateForm(HttpServletRequest req, HttpServletResponse resp) {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/listCustomerModel/create.jsp");
        try {
            dispatcher.forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        CustomerModel customerModel = this.customerService.findById(id);
        RequestDispatcher dispatcher;
        if(customerModel == null){
            dispatcher = request.getRequestDispatcher("/WEB-INF/listCustomerModel/error404.js");
        } else {
            request.setAttribute("customer", customerModel);
            dispatcher = request.getRequestDispatcher("/WEB-INF/listCustomerModel/edit.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void createCustomer(HttpServletRequest req, HttpServletResponse resp) {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        int id = (int)(Math.random() * 10000);

        CustomerModel customerModel = new CustomerModel(id, name, email, address);
        this.customerService.save(customerModel);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/listCustomerModel/create.jsp");
        req.setAttribute("message", "New customer was created");
        try {
            dispatcher.forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listCustomer(@org.jetbrains.annotations.NotNull HttpServletRequest req, HttpServletResponse resp) {
        List<CustomerModel> listCustomerModel= this.customerService.fillAll();
        req.setAttribute("listCustomerModel",listCustomerModel);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/listCustomerModel/list.jsp");
        try {
            dispatcher.forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null){
            action="";
        }
        switch (action){
            case "create":
                createCustomer(req,resp);
                break;
            case "edit":
                updateCustomer(req, resp);
                break;
            case "delete":
                deleteCustomer(req,resp);
                break;
            default:
                break;
        }
    }

    private void updateCustomer(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        CustomerModel customerModel = this.customerService.findById(id);
        RequestDispatcher dispatcher;
        if(customerModel == null){
            dispatcher = req.getRequestDispatcher("/WEB-INF/listCustomerModel/error404.js");
        } else {
            customerModel.setName(name);
            customerModel.setEmail(email);
            customerModel.setAddress(address);
            this.customerService.update(id, customerModel);
            req.setAttribute("customer", customerModel);
            req.setAttribute("message", "Customer information was updated");
            dispatcher = req.getRequestDispatcher("/WEB-INF/listCustomerModel/edit.jsp");
        }
        try {
            dispatcher.forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        CustomerModel customerModel = this.customerService.findById(id);
        RequestDispatcher dispatcher;
        if(customerModel == null){
            dispatcher = request.getRequestDispatcher("/WEB-INF/listCustomerModel/error404.js");
        } else {
            this.customerService.remove(id);
            try {
                response.sendRedirect("/CustomerServlet");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

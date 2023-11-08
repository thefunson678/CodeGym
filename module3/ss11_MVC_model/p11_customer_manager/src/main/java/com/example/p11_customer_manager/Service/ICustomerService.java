package com.example.p11_customer_manager.Service;

import com.example.p11_customer_manager.Model.CustomerModel;

import java.util.List;

public interface ICustomerService {
    List<CustomerModel> fillAll();
    void save(CustomerModel customerModel);
    CustomerModel findById(int id);
    void update(int id,CustomerModel customerModel);
    void remove(int id);
}

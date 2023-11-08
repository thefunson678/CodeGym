package com.example.p11_customer_manager.Service;

import com.example.p11_customer_manager.Model.CustomerModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements ICustomerService {
    private static Map<Integer, CustomerModel> customerModelMap;

    static {
        customerModelMap = new HashMap<>();
        customerModelMap.put(1, new CustomerModel(1, "John", "john@codegym.vn", "Hanoi"));
        customerModelMap.put(2, new CustomerModel(2, "Bill", "bill@codegym.vn", "Danang"));
        customerModelMap.put(3, new CustomerModel(3, "Alex", "alex@codegym.vn", "Saigon"));
        customerModelMap.put(4, new CustomerModel(4, "Adam", "adam@codegym.vn", "Beijin"));
        customerModelMap.put(5, new CustomerModel(5, "Sophia", "sophia@codegym.vn", "Miami"));
        customerModelMap.put(6, new CustomerModel(6, "Rose", "rose@codegym.vn", "Newyork"));
    }

    @Override
    public List<CustomerModel> fillAll() {
        return new ArrayList<>(customerModelMap.values());
    }

    @Override
    public void save(CustomerModel customerModel) {
        customerModelMap.put(customerModel.getId(),customerModel);
    }

    @Override
    public CustomerModel findById(int id) {
        return customerModelMap.get(id);
    }

    @Override
    public void update(int id, CustomerModel customerModel) {
        customerModelMap.put(id,customerModel);
    }

    @Override
    public void remove(int id) {
        customerModelMap.remove(id);
    }
}

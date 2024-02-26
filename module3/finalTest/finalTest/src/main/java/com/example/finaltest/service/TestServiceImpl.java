package com.example.finaltest.service;

import com.example.finaltest.dto.ProductDTO;
import com.example.finaltest.dto.RoomDTO;
import com.example.finaltest.module.testModel.TestTable;
import com.example.finaltest.repository.IRepository;
import com.example.finaltest.repository.RepositoryImpl;
import com.example.finaltest.repository.TestRepositoryImpl;

import java.util.List;

public class TestServiceImpl implements IService{
    private IRepository iRepository = new TestRepositoryImpl();
    private TestTable testTable = new TestTable();

    @Override
    public List<TestTable> getAll() {
        return iRepository.getAll();

    }

    @Override
    public List<RoomDTO> showRoom() {
        return null;
    }

    @Override
    public void deleteOne(String deleteID) {

    }

    @Override
    public List<ProductDTO> showProduct() {
        return null;
    }
}

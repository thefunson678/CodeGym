package com.example.finaltest.service;

import com.example.finaltest.dto.ProductDTO;
import com.example.finaltest.dto.RoomDTO;
import com.example.finaltest.module.testModel.TestTable;
import com.example.finaltest.repository.IRepository;
import com.example.finaltest.repository.RepositoryImpl;

import java.util.List;

public class ServiceImpl implements IService{
    private IRepository iRepository = new RepositoryImpl();


    @Override
    public List<TestTable> getAll() {
        return null;
    }

    @Override
    public List<RoomDTO> showRoom() {
        return iRepository.showRoom();
    }

    @Override
    public void deleteOne(String deleteID) {
        iRepository.deleteOnde(deleteID);
    }

    @Override
    public List<ProductDTO> showProduct() {
        return iRepository.showProduct();
    }
}

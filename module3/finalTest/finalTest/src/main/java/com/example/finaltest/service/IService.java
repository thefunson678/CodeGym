package com.example.finaltest.service;

import com.example.finaltest.dto.ProductDTO;
import com.example.finaltest.dto.RoomDTO;
import com.example.finaltest.module.testModel.TestTable;

import java.util.List;

public interface IService {

    List<TestTable> getAll();

    List<RoomDTO> showRoom();

    void deleteOne(String deleteID);

    List<ProductDTO> showProduct();
}

package com.example.finaltest.repository;

import com.example.finaltest.dto.ProductDTO;
import com.example.finaltest.dto.RoomDTO;
import com.example.finaltest.module.testModel.TestTable;

import java.util.List;

public interface IRepository {

    List<TestTable> getAll();

    List<RoomDTO> showRoom();

    void deleteOnde(String deleteID);

    List<ProductDTO> showProduct();
}

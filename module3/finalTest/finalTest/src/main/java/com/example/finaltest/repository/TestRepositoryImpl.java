package com.example.finaltest.repository;

import com.example.finaltest.dto.ProductDTO;
import com.example.finaltest.dto.RoomDTO;
import com.example.finaltest.module.testModel.TestTable;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestRepositoryImpl implements IRepository {
    private TestTable testTable = new TestTable();

    @Override
    public List<TestTable> getAll() {
        List<TestTable> testTableList = new ArrayList<>();
        TestTable testTable;
        try {
            PreparedStatement preparedStatement = BaseRepositoryConnectDB.getConnectToJavaDB().prepareStatement("Select * from testTable ");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                testTable = new TestTable();
                testTable.setDate_test(resultSet.getDate("date_test"));
                testTable.setTime_test(resultSet.getTimestamp("time_test"));
                testTable.setTest_id(resultSet.getInt("test_id"));
                testTable.setText_test(resultSet.getString("text_test"));
                testTable.setList_test(resultSet.getString("list_test"));
                testTable.setOption_test(resultSet.getString("option_test"));
                testTable.setYes_no(resultSet.getBoolean("yes_no"));
                testTableList.add(testTable);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return testTableList;
    }

    @Override
    public List<RoomDTO> showRoom() {
        return null;
    }

    @Override
    public void deleteOnde(String deleteID) {

    }

    @Override
    public List<ProductDTO> showProduct() {
        return null;
    }

}

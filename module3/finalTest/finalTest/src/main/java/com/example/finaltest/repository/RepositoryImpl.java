package com.example.finaltest.repository;

import com.example.finaltest.dto.ProductDTO;
import com.example.finaltest.dto.RoomDTO;
import com.example.finaltest.module.testModel.TestTable;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RepositoryImpl implements IRepository{
    @Override
    public List<TestTable> getAll() {
        return null;
    }
    public String getColorStr = "select colors.name_color from productcolor join colors on colors.id_color = productcolor.id_color where productcolor.id_product =";
    public String showProductStr = "select products.id_product, products.name_product, products.price_product, products.quantity_product, category.name_category from products join category on products.category_product = category.id_category";
    private static final String showRoomStr = "select rooms.room_id, humans.human_name, humans.human_main_phone, rooms.room_start_date, rooms.room_payment_method, rooms.room_note from rooms join humans on rooms.human_id = humans.human_id;";
    @Override
    public List<RoomDTO> showRoom() {
//        List<RoomDTO>  roomDTOList = new ArrayList<>();
//        RoomDTO roomDTO;
//        try {
//            PreparedStatement preparedStatement = BaseRepositoryConnectDB.getConnectToJavaDB().prepareStatement(showProductStr);
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            Integer room_NoSTT = 0;
//            while (resultSet.next()) {
////                room_NoSTT++;
////                roomDTO = new RoomDTO();
////                roomDTO.setRoom_No(room_NoSTT);
////                roomDTO.setRoom_id(resultSet.getString("room_id"));
////                roomDTO.setHuman_name(resultSet.getString("human_name"));
////                roomDTO.setHuman_main_phone(resultSet.getString("human_main_phone"));
////                roomDTO.setRoom_start_date(resultSet.getDate("room_start_date"));
////                roomDTO.setRoom_payment_method(resultSet.getString("room_payment_method"));
////                roomDTO.setRoom_note(resultSet.getString("room_note"));
////                roomDTOList.add(roomDTO);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        return null;
    }

    @Override
    public void deleteOnde(String deleteID) {
        String deleteColor;
        deleteColor = "";
        String deleteProduct;
        deleteProduct = "";
        deleteColor = "delete from productcolor where productcolor.id_product ="+ Integer.parseInt(deleteID);
        deleteProduct = "delete from products where products.id_product =" + Integer.parseInt(deleteID);
        System.out.println(deleteColor);
        System.out.println(deleteProduct);
        try {
            PreparedStatement preparedStatementColor = BaseRepositoryConnectDB.getConnectToJavaDB().prepareStatement(deleteColor);
            preparedStatementColor.execute();
            PreparedStatement preparedStatementProduct = BaseRepositoryConnectDB.getConnectToJavaDB().prepareStatement(deleteProduct);
            preparedStatementProduct.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("lỗi");
        }
    }

    @Override
    public List<ProductDTO> showProduct() {
        List<ProductDTO> productDTOList = new ArrayList<>();
        ProductDTO productDTO;
        List<String> listColor= new ArrayList<>();
        try {
            PreparedStatement preparedStatement = BaseRepositoryConnectDB.getConnectToJavaDB().prepareStatement(showProductStr);
            ResultSet resultSet = preparedStatement.executeQuery();
            Integer product_NoSTT = 0;
            String colorSQLString ;
            String colorString ;
            while (resultSet.next()) {
                colorSQLString = "";
                colorString = "";
                product_NoSTT++;
                productDTO = new ProductDTO();
                productDTO.setProduct_No(product_NoSTT);
                productDTO.setProduct_id(resultSet.getInt("id_product"));
                productDTO.setProduct_name(resultSet.getString("name_product"));
                productDTO.setProduct_price(resultSet.getDouble("price_product"));
                productDTO.setProduct_quantity(resultSet.getInt("quantity_product"));
                colorSQLString = getColorStr + productDTO.getProduct_id();
                System.out.println(colorSQLString);
                PreparedStatement preparedStatementColor = BaseRepositoryConnectDB.getConnectToJavaDB().prepareStatement(colorSQLString);
                ResultSet resultSetColor = preparedStatementColor.executeQuery();
                while (resultSetColor.next()) {
                    if(colorString == ""){
                        colorString = colorString +resultSetColor.getString("name_color");
                    } else {
                        colorString = colorString + "," + resultSetColor.getString("name_color");
                    }
                }
                productDTO.setProduct_color(colorString);
                productDTO.setProduct_category(resultSet.getString("name_category"));
                productDTOList.add(productDTO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productDTOList;
    }
}

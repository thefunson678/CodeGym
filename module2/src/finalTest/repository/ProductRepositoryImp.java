package finalTest.repository;

import finalTest.model.ProductBuy;
import finalTest.model.ProductSell;
import phoneManagerMVC.model.Phone;
import ss17_Binary_File.excercise.productStream.Product;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImp implements IProductReposity{
    public static final String FILE_BUY_PATH = "src/finalTest/data/productBuys.csv";
    public static final String FILE_SELL_PATH = "src/finalTest/data/productSells.csv";
    private static ArrayList<ProductBuy> productBuyLists = new ArrayList<>();

    private static ArrayList<ProductSell> productSellLists = new ArrayList<>();

    static {
        dataToBuyList();
    }
    @Override
    public void createProductBuy(ProductBuy productBuy) {
        productBuyLists.add(productBuy);
        buyListToFile();
    }

    @Override
    public void deleteByCodeUI(String codeUI) {
        for (int i=0; i< productBuyLists.size();i++){
            if (productBuyLists.get(i).getCodeUI().contains(codeUI)){
                productBuyLists.remove(i);
                i--;
            };
        }
        buyListToFile();
        System.out.println("Delete completed!");
    }

    @Override
    public void showProduct() {
        for (int i=0; i< productBuyLists.size();i++){
            productBuyLists.get(i).toProduct();
        }
        System.out.println("Completed!");
    }

    @Override
    public void findbyName() {

    }

    @Override
    public void findByCodeUI() {

    }
    public static void hasFile(String filePath){
        try {
            File file = new File(filePath);
            if (!file.exists()){
                file.createNewFile();
                //file.delete() xóa
                //file.length() kiểm tra kích thước file
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void dataToBuyList(){
        String line;
        hasFile(FILE_BUY_PATH);
        String[] tmp;
        try {
            File file = new File(FILE_BUY_PATH);
            FileReader fis = new FileReader(FILE_BUY_PATH);
            BufferedReader bufR = new BufferedReader(fis);
            while ((line = bufR.readLine()) != null) {
                tmp = line.split(",");
                int id = Integer.parseInt(tmp[0]);
                String codeUI = tmp[1];
                String name = tmp[2];
                double price = Double.parseDouble(tmp[3]);
                int quantity = Integer.parseInt(tmp[4]);
                String manu = tmp[5];
                double priceBuy = Double.parseDouble(tmp[6]);
                String cityBuy = tmp[7];
                Double taxFeeBuy = Double.parseDouble(tmp[8]);
                ProductBuy productBuy = new ProductBuy(id,codeUI,name,price,quantity,manu,priceBuy,cityBuy,taxFeeBuy);
                productBuyLists.add(productBuy);
            }
            bufR.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void buyListToFile(){
        String stringLine;
        try(
                FileWriter fileWriter = new FileWriter(FILE_BUY_PATH);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ) {
            for (ProductBuy p: productBuyLists) {
                stringLine = p.getId() +
                        "," + p.getCodeUI() +
                        "," + p.getName() +
                        "," + p.getPrice() +
                        "," + p.getQuantity() +
                        "," + p.getManufacturer() +
                        "," + p.getPriceBuy() +
                        "," + p.getCityBuy() +
                        "," + p.getTaxFeeBuy();
                bufferedWriter.write(stringLine);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public  int getNewBuyID(){
        int maxID = 0;
        if (productBuyLists.size() == 0){
            maxID = 0;
        } else {
            for (int i = 0; i < productBuyLists.size(); i++){
                if (i ==0){
                    maxID = productBuyLists.get(i).getId();
                } else if (productBuyLists.get(i).getId() > maxID){
                    maxID = productBuyLists.get(i).getId();
                }
            }
        }
        return maxID+1;
    }

    public static int getNewBuyID2(int typeNumber){
        int maxID = 0;
        if (typeNumber==1){
            if (productBuyLists.size() == 0){
                maxID = 0;
            } else {
                for (int i = 0; i < productBuyLists.size(); i++){
                    if (i ==0){
                        maxID = productBuyLists.get(i).getId();
                    } else if (productBuyLists.get(i).getId() > maxID){
                        maxID = productBuyLists.get(i).getId();
                    }
                }
            }
            return maxID+1;
        } else {
            if (productSellLists.size() == 0){
                maxID = 0;
            } else {
                for (int i = 0; i < productSellLists.size(); i++){
                    if (i ==0){
                        maxID = productSellLists.get(i).getId();
                    } else if (productSellLists.get(i).getId() > maxID){
                        maxID = productSellLists.get(i).getId();
                    }
                }
            }
            return maxID+1;
        }


    }
    public static void main(String[] args) {
        System.out.println(getNewBuyID2(1));
    }
}

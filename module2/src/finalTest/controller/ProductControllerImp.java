package finalTest.controller;

import finalTest.model.Product;
import finalTest.model.ProductBuy;
import finalTest.service.ProductModelImp;

import java.util.Scanner;

public class ProductControllerImp implements IProductController{
    private ProductModelImp productModelImp = new ProductModelImp();
    public static Scanner scanner = new Scanner(System.in);
    @Override
    public void createProductBuy(ProductBuy productBuy) {
        productModelImp.createProductBuy(productBuy);
    }

    @Override
    public void deleteByCodeUI(String codeUI) {
        productModelImp.deleteByCodeUI(codeUI);
    }

    @Override
    public void showProduct() {
        productModelImp.showProduct();
    }

    @Override
    public void findbyName() {
        productModelImp.findbyName();
    }

    @Override
    public void findByCodeUI() {

    }

    @Override
    public int getNewBuyID() {
        return productModelImp.getNewBuyID();
    }

    public void getMenu(){
        int choose;
        int typeNumber;
        while (true){
            System.out.println("""
                    1. Thêm mới
                    2. Xóa
                    3. Xem
                    4. Tìm kiếm
                    5. Thoát
                    Chọn chức năng:""");
            try {
                choose = Integer.parseInt(scanner.nextLine());
                typeNumber = getMenu2();
                if (typeNumber==3){
                    continue;
                }
                switch (choose){
                    case 1:
                        System.out.println("A");
                         if (typeNumber == 1){
                            ProductBuy productBuy = createBuysProduct();
                            createProductBuy(productBuy);
                        } else {
                            continue;
                        }
                        break;
                    case 2:
                        System.out.println("B");
                        break;
                    case 3:
                        System.out.println("C");
                        showProduct();
                        break;
                    case 4:
                        System.out.println("D");
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.err.println("Lỗi chọn menu, vui lòng chọn đúng!");
                }
            } catch (NumberFormatException e){
                System.err.println("Chỉ được nhập số!");
            } catch (Exception e){
                System.err.println("Lỗi chọn menu, vui lòng chọn đúng!");
            }
        }
    }

    public int getMenu2(){
        int choose = 3;
        System.out.println("""
                    1. Nhập khẩu
                    2. Xuất khẩu
                    3. Quay lại
                    Chọn chức năng:""");
        while (true) {
            try {
                choose = Integer.parseInt(scanner.nextLine());
                if (!(choose == 1 || choose==2 || choose==3)){
                    System.err.println("Lỗi chọn menu, vui lòng chọn đúng!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Chỉ được nhập số!");
            } catch (Exception e) {
                System.err.println("Lỗi chọn menu, vui lòng chọn đúng!");
            }

        }
        return choose;
    }

    public ProductBuy createBuysProduct(){
        boolean test;
        System.out.println("CodeUI:");
        String CodeUI= scanner.nextLine();
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Price:");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Quantity:");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Manufacturer:");
        String manu = scanner.nextLine();
        System.out.println("PriceBuy:");
        double priceBuy = Double.parseDouble(scanner.nextLine());
        System.out.println("Buy at City:");
        String cityBuy = scanner.nextLine();
        System.out.println("Tax Fee:");
        double taxFee = Double.parseDouble(scanner.nextLine());
        ProductBuy productBuy = new ProductBuy(getNewBuyID(), CodeUI,name,price,quantity,manu,priceBuy,cityBuy,taxFee);
        return productBuy;
    }

    public String inputNumber(boolean isInteger,String s){
        String string;
        boolean isNumber =false;
        while (true){
            string=null;
            System.out.println("Nhập " + s + " là số:");
            string = scanner.nextLine();
            try {
                if (isInteger) {
                    isNumber = string.matches("^[0-9][\\d]*$");
                } else {
                    isNumber = string.matches("^[0-9]+[.?[0-9]]*");
                }
                if (!isNumber) {
                    if (isInteger) {
                        System.err.println("Phải là một SỐ NGUYÊN.");
                    } else {
                        System.err.println("Phải là một số.");
                    }
                } else {
                        return string;
                }
            } catch (NumberFormatException e){
                System.err.println("Sai định dạng!");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

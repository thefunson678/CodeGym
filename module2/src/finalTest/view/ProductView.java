package finalTest.view;

import finalTest.controller.ProductControllerImp;
import finalTest.model.ProductBuy;
import phoneManagerMVC.controller.PhoneControlImpl;

import java.util.Scanner;

public class ProductView {
    public static Scanner scanner = new Scanner(System.in);
    private static ProductControllerImp pControllerImp = new ProductControllerImp();
    public static void main(String[] args) {
        pControllerImp.getMenu();
//        double d;
//        while (true){
//           d = Double.parseDouble(pControllerImp.inputNumber(false,"price"));
//           if (d > 50){
//               break;
//           } else {
//               System.out.println("Số phải lớn hơn 50!");
//           }
//        }
//        System.out.println(d);
    }
    private static void mainMenu () {
        System.out.println("""
                    1. Thêm mới
                    2. Xóa
                    3. Xem
                    4. Tìm kiếm
                    5. Thoát
                    Chọn chức năng""");
    }
    private static void mainMenu2 () {
        System.out.println("""
                    1. Nhập khẩu
                    2. Xuất khẩu
                    3. Quay lại
                    Chọn chức năng
                    """);
    }

    private static ProductBuy inputBuy(){
        boolean test;
        System.out.println("CodeUI:");
        String CodeUI= scanner.nextLine();
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Price:");
        double price = Double.parseDouble(scanner.nextLine());
        int quantity = 0;
        quantity = Integer.parseInt(inputNumber("Quantity"));
        System.out.println("Manufacturer:");
        String manu = scanner.nextLine();
        System.out.println("PriceBuy:");
        double priceBuy = Double.parseDouble(scanner.nextLine());
        System.out.println("Buy at City:");
        String cityBuy = scanner.nextLine();
        System.out.println("Tax Fee:");
        double taxFee = Double.parseDouble(scanner.nextLine());
        ProductBuy productBuy = new ProductBuy(pControllerImp.getNewBuyID(), CodeUI,name,price,quantity,manu,priceBuy,cityBuy,taxFee);
        return productBuy;
    }

    private  static  String inputE(String s){
        System.out.print(s+ ": ");
        String outString = scanner.nextLine();
        return outString;
    }
    private  static  String inputNumber(String s){
        boolean isOK =false;
        String outString = null;
        while (!isOK) {
            if (!isOK) {
                System.out.print(s + ": ");
                outString = scanner.nextLine();
                isOK = outString.matches("^[0-9]+") && Integer.parseInt(outString) >0;
                System.err.print("Phải là 1 số lớn hơn 0. Nhập lại:!");
            }
        }
        return outString;
    }
}

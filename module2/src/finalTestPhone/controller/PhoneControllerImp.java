package finalTestPhone.controller;


import finalTest.model.ProductBuy;
import finalTestPhone.model.PhoneAuthentic;
import finalTestPhone.model.PhoneHand;
import finalTestPhone.service.PhoneServiceImp;
import phoneManagerMVC.controller.PhoneControlImpl;

import java.util.Scanner;

public class PhoneControllerImp implements IPhoneController {
    public static Scanner scanner = new Scanner(System.in);
    private PhoneServiceImp pServiceImp = new PhoneServiceImp();
    @Override
    public int getNewID(String typeString) {
        return pServiceImp.getNewID(typeString);
    }

    @Override
    public void showPhone(String typeString) {
        pServiceImp.showPhone(typeString);
    }

    @Override
    public void createPhone(String typeString, PhoneAuthentic phoneAuthentic, PhoneHand phoneHand) {
        pServiceImp.createPhone(typeString,phoneAuthentic,phoneHand);
    }

    @Override
    public void deleteByID(String typeString, int id) {
       pServiceImp.deleteByID(typeString,id);
    }

    @Override
    public void findById(String typeString, int id) {
        pServiceImp.findById(typeString,id);
    }


    public void getMenu(){
        int choose;
        int typeNumber;
        while (true){
            System.out.println("""
                    ------------
                    MAIN MENU
                    ------------
                    1. Thêm mới
                    2. Xóa
                    3. Xem
                    4. Tìm kiếm bằng ID
                    5. Thoát
                    Chọn chức năng:""");
            try {
                choose = Integer.parseInt(scanner.nextLine());
                if (!(choose>=1 && choose <=5)){
                    System.err.println("Không có menu này, hãy chọn lại.");
                    continue;
                }
                typeNumber = getMenu2();
                if (typeNumber==3){
                    continue;
                }
                switch (choose){
                    case 1:
                        if (typeNumber == 1){
                            PhoneAuthentic pAthen = inputAuthentic();
                            createPhone("Authentic",pAthen,null);
                        } else {
                            PhoneHand pHand = inputHand();
                            createPhone("Hand",null,pHand);
                        }
                        break;
                    case 2:
                        int id = Integer.parseInt(inputNumber(true,"ID muốn xóa "));
                        if (typeNumber == 1){
                            if (id<= 0 || id >= getNewID("Authentic")){
                                System.err.println("Không có id này!");
                                break;
                            }
                            deleteByID("Authentic",id);
                        } else {
                            if (id<= 0 || id >= getNewID("Hand")){
                                System.err.println("Không có id này!");
                                break;
                            }
                            deleteByID("Hand",id);
                        }
                        break;
                    case 3:
                        System.out.println("C");
                        if (typeNumber == 1){
                            showPhone("Authentic");
                        } else {
                            showPhone("Hand");
                        }
                        break;
                    case 4:
                        int idFind = Integer.parseInt(inputNumber(true,"ID tìm "));
                        if (typeNumber == 1){
                            if (idFind<= 0 || idFind >= getNewID("Authentic")){
                                System.err.println("Không có id này!");
                                break;
                            }
                            findById("Authentic",idFind);
                        } else {
                            if (idFind<= 0 || idFind >= getNewID("Hand")){
                                System.err.println("Không có id này!");
                                break;
                            }
                            findById("Hand",idFind);
                        }
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
                    --------
                    Menu Phone:
                    --------
                    1. Authentic Phone
                    2. Hand Phone
                    3. Back Main Menu
                    Choose phone type:""");
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

    public PhoneAuthentic inputAuthentic(){
        int id = pServiceImp.getNewID("Authentic");
        System.out.print("Input name:");
        String name = scanner.nextLine();
        double price = 0;
        do {
            price = Double.parseDouble(inputNumber(false,"price"));
            if (price <=0 ){
                System.err.println("Phải là một số lớn hơn 0");
            }
        } while(price <= 0);
        int quantity;
        do {
            quantity = Integer.parseInt(inputNumber(true,"quantity"));
            if (price <=0 ){
                System.err.println("Phải là một SỐ NGUYÊN lớn hơn 0");
            }
        } while(price <= 0);
        System.out.print("Input manufacturer:");
        String manu =scanner.nextLine();
        int granYear;
        do {
            granYear = Integer.parseInt(inputNumber(true,"granYear"));
            if (price <=0 ){
                System.err.println("Phải là một SỐ NGUYÊN lớn hơn 0");
            }
        } while(price <= 0);
        System.out.print("Input Toan Quoc/Quoc Te:");
        String granCountry = scanner.nextLine();
        PhoneAuthentic p = new PhoneAuthentic(id,name,price,quantity,manu,granYear,granCountry);
        return p;
    }

    public PhoneHand inputHand(){
        int id = pServiceImp.getNewID("Hand");
        System.out.print("Input name:");
        String name = scanner.nextLine();
        double price = 0;
        do {
            price = Double.parseDouble(inputNumber(false,"price"));
            if (price <=0 ){
                System.err.println("Phải là một số lớn hơn 0");
            }
        } while(price <= 0);
        int quantity;
        do {
            quantity = Integer.parseInt(inputNumber(true,"quantity"));
            if (price <=0 ){
                System.err.println("Phải là một SỐ NGUYÊN lớn hơn 0");
            }
        } while(price <= 0);
        System.out.print("Input manufacture:");
        String manu =scanner.nextLine();
        System.out.print("Input Hand Country:");
        String handCountry = scanner.nextLine();
        System.out.print("Input status:");
        String handStatus = scanner.nextLine();
        PhoneHand pHand = new PhoneHand(id,name,price,quantity,manu,handCountry,handStatus);
        return pHand;
    }

    public static String inputString(){
        String sting = null;
        while (true) {
            try {
                sting = null;
                sting = scanner.nextLine();
                if (sting != null && !sting.isEmpty()){
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Sai định dạng hoặc không nhập gì!");
            }
        }
        return sting;
    }
    public static void main(String[] args) {
        String o = inputString();
    }
}

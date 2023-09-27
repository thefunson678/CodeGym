package phoneManagerMVC.controller;

import phoneManagerMVC.model.Phone;
import phoneManagerMVC.repository.PhoneRepositoryImpl;
import phoneManagerMVC.service.ConstantRegex;
import phoneManagerMVC.service.IPhoneService;
import phoneManagerMVC.service.PhoneServiceImpl;

import java.util.Date;
import java.util.Scanner;

public class PhoneControlImpl implements IPhoneController {
    public static Scanner scanner = new Scanner(System.in);
    private  IPhoneService iPhoneService =new PhoneServiceImpl();
    private int chooseMenu;
    private int nowActive;

    public int getChooseMenu() {
        return chooseMenu;
    }

    public void setChooseMenu(int chooseMenu) {
        this.chooseMenu = chooseMenu;
    }

    public PhoneControlImpl() {
        this.chooseMenu = -1;
        this.nowActive = -1;
    }

    public int getNowActive() {
        return nowActive;
    }

    public void setNowActive(int nowActive) {
        this.nowActive = nowActive;
    }

    @Override
    public void addPhone(Phone phone) {
        this.iPhoneService.addPhone(phone);
    }

    @Override
    public void deletePhone(int phoneId) {
        this.iPhoneService.deletePhone(phoneId);
    }

    @Override
    public void displayAll() {
        this.iPhoneService.displayAll();
    }

    @Override
    public void findByPhoneName(String phoneName) {
        this.iPhoneService.findByPhoneName(phoneName);
    }

    @Override
    public int getNewPhoneID() {
        return iPhoneService.getNewPhoneID();
    }

    public void showMenu() {
        System.out.println("--------------------");
        System.out.println("MENU");
        System.out.println("1. Add new phone");
        System.out.println("2. Delete phone by ID");
        System.out.println("3. Show List phone");
        System.out.println("4. Search phone by Name");
        System.out.println("5. Ghi file");
        System.out.println("6. Đọc file");
        System.out.println("7. Sắp xếp tăng dần theo giá");
        System.out.println("0. Exit");
        System.out.println("--------------------");
    }
    public void getMenuUserInput() {
        int choose = -1;
        System.out.println("Vui lòng chọn Menu:");
        try {
            choose = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e){
            System.err.println("Chỉ được nhập số!");
        } catch (Exception e) {
            System.err.println("Có lỗi khi chọn menu!");
            System.out.println(e.getMessage());
        }
        this.setChooseMenu(choose);
    }

    public void setNextView(){
        if (this.getChooseMenu() == 0) {
            this.setNowActive(0);
            System.exit(0);
        } else if (chooseMenu >= 0 && chooseMenu <= 7){
            this.setNowActive(-1);
            setAction(chooseMenu);
        } else {
            this.setNowActive(-1);
        }
    }

    public void setAction(int chooseMenu){
        if (chooseMenu == 1){
            this.addPhone(inputNewPhone());
        } else if (chooseMenu == 2) {
            this.deletePhone(inputDeleteID());
        } else if (chooseMenu == 3) {
            this.displayAll();
        } else if (chooseMenu == 4) {
            this.findByPhoneName(inputSearchName());
        } else if (chooseMenu == 5) {
            PhoneRepositoryImpl.phonesListTofile();
        } else if (chooseMenu == 6) {
            PhoneRepositoryImpl.fileToPhonesList().forEach(v-> System.out.println(v));
        } else if (chooseMenu ==7) {
            PhoneRepositoryImpl.sortByIncreasePrice();
        }
    }

    public String inputSearchName(){
        String searchPhoneName = "";
        System.out.print ("Enter the phone name that you want to search:");
        try {
            return scanner.nextLine();
        } catch (Exception e){
            System.err.println("Có lỗi khi nhập dữ liệu!");
        }
        return searchPhoneName;
    }

    public int inputDeleteID(){
        int searchPhoneid=0;
        System.out.print ("Enter the phone id that you want to delete:");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (Exception e){
            System.err.println("Có lỗi khi nhập dữ liệu!");
        }
        return searchPhoneid;
    }

    public Phone inputNewPhone(){
        Phone phone = null;
        try {
            String name;
            Double price;
            String manufacturer;
            int id;
            while (true){
                System.out.println("Nhập tên đúng định dạng xxx...xx-XX:");
                name = scanner.nextLine();
                if (name.matches(ConstantRegex.REGEX_NHAP_TEN)){
                    break;
                }else{
                    System.err.println("moi ban nhap dung dinh dang :");
                }
            }
            do {
                System.out.println("Nhập giá trên 50:");
                price = Double.parseDouble(scanner.nextLine());
                if (price <=50){
                    System.err.println("Giá trị không thỏa mãn!");
                }
            } while (price <= 50);

            while (true){
                System.out.println("Nhập hãng sản xuất:");
                manufacturer = scanner.nextLine();
                if (manufacturer.matches(ConstantRegex.REGEX_HANG_DIEN_THOAI)){
                    break;
                } else {
                    System.err.println("Nhập tên viết hoa!");
                }
            }
            id = this.getNewPhoneID();
            phone = new Phone(id, name, price, manufacturer);
        } catch (NumberFormatException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
        return phone;
    }
}

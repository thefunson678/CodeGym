package phoneManagerMVC.repository;

import phoneManagerMVC.model.Phone;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PhoneRepositoryImpl implements IPhoneRepository {
    private static final String FILE_PATH = "src/phoneManagerMVC/database/phone.csv";
    private static ArrayList<Phone> phonesList = new ArrayList<>();
    private static int size = 0;

    static {
        phonesList= (ArrayList<Phone>) fileToPhonesList();
        //get data file csv to phonesList
    }
    @Override
    public void addPhone(Phone phone) {
        phonesList.add(phone);
        phonesListTofile();
    }

    @Override
    public void deletePhone(int phoneId) {
        for (int i = 0; i < phonesList.size(); i++){
            if (phonesList.get(i).getId() == phoneId){
                phonesList.remove(i);
                i--;
            }
        }
        phonesListTofile();
    }

    @Override
    public void displayAll() {
        size = phonesList.size();
        if (size == 0) {
            System.out.println("Không có sản phẩm nào!");
        } else {
            for (int i=0; i<phonesList.size(); i++){
                System.out.println(phonesList.get(i).display());
            }
        }
    }

    @Override
    public void findByPhoneName(String phoneName) {
        System.out.println("Danh sách tìm thấy:");
        size = phonesList.size();
        if (size == 0){
            System.out.println("Không có sản phẩm nào!");
        } else {
            for (int i=0; i<phonesList.size(); i++){
                if (phonesList.get(i).getName().contains(phoneName)){
                    System.out.println(phonesList.get(i).toString());
                }
            }
        }
    }
    @Override
    public int getNewPhoneID(){
        int maxID = 0;
        if (phonesList.size() == 0){
            maxID = 0;
        } else {
            for (int i = 0; i < phonesList.size(); i++){
                if (i ==0){
                    maxID = phonesList.get(i).getId();
                } else if (phonesList.get(i).getId() > maxID){
                    maxID = phonesList.get(i).getId();
                }
            }
        }
        return maxID+1;
    }
    public static List<Phone> fileToPhonesList(){
        //return PhonesList by .csv;
        List<Phone> newArrayListt = new ArrayList<>();
        String line;
        String tmp[];
        try {
            File file = new File(FILE_PATH);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fis = new FileReader(FILE_PATH);
            BufferedReader bufR = new BufferedReader(fis);
            while ((line = bufR.readLine()) != null){
                tmp = line.split(",");
                Phone phone = new Phone(Integer.parseInt(tmp[0]),tmp[1],Double.parseDouble(tmp[2]),tmp[3]);
                newArrayListt.add(phone);
            }
            bufR.close();
        } catch (Exception e){
            System.out.println("Lỗi file to List!");
        }
        return newArrayListt;
    }

    public static void phonesListTofile(){
        String stringLine;
        try(
                FileWriter fileWriter = new FileWriter(FILE_PATH);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                ) {
            for (Phone p: phonesList) {
                stringLine = p.getId() + "," + p.getName() + "," + p.getPrice() +"," + p.getManufacturer() ;
                bufferedWriter.write(stringLine);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void sortByIncreasePrice(){
        Collections.sort(phonesList, new Comparator<Phone>() {
            @Override
            public int compare(Phone o1, Phone o2) {
//                if (o1.getName().compareTo(o2.getName())){
//                    return 1;
//                } else if (o1.getPrice() < o2.getPrice()){
//                    return -1;
//                } else {
//                    return 0;
//                }
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}

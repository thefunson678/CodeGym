package finalTestPhone.repository;

import finalTestPhone.model.PhoneAuthentic;
import finalTestPhone.model.PhoneHand;

import java.io.*;
import java.util.ArrayList;

public class PhoneRepositoryImp implements IPhoneRepository{
    public static final String AUTHENTIC_FILE_PATH = "src/finalTestPhone/data/authenticList.csv";
    public static final String HAND_FILE_PATH = "src/finalTestPhone/data/handList.csv";
    private static ArrayList<PhoneAuthentic> authenticList = new ArrayList<>();
    private static ArrayList<PhoneHand> handList = new ArrayList<>();
    static {
        authenticFileToList();
        handFileToList();
    }
    @Override
    public void showPhone(String typeString) {
        if (typeString.equals("Authentic")){
            showAuthentic();
        } else {
            showHand();
        }
    }
    @Override
    public void deleteByID(String typeString, int id) {
        if (typeString.equals("Authentic")){
            deleteAuthentic(id);
            listToAuthenticFile();
        } else {
            deleteHand(id);
            listToHandFile();
        }
    }

    @Override
    public void findById(String typeString, int id) {
        if (typeString.equals("Authentic")){
            showAuthenticByID(id);
            System.out.println("Search Completed!");
        } else {
            showHandByID(id);
            System.out.println("Search Completed!");
        }
    }
    public void showHandByID(int id) {
        for (int i=0; i< handList.size();i++){
            if (handList.get(i).getId() == id){
                handList.get(i).toPhone();
            };
        }
    }
    public void showAuthenticByID(int id) {
        boolean isExist = false;
        for (int i=0; i< authenticList.size();i++){
            if (authenticList.get(i).getId() == id){
                authenticList.get(i).toPhone();
                isExist = true;
            };
        }
//         if(!isExist) {
//             throw new Exception();
//         }
    }
    @Override
    public void createPhone(String typeString, PhoneAuthentic phoneAuthentic, PhoneHand phoneHand) {
        if (typeString.equals("Authentic")){
            authenticList.add(phoneAuthentic);
            listToAuthenticFile();
        } else {
            handList.add(phoneHand);
            listToHandFile();
        }
    }
    public void  deleteAuthentic(int id){
        for (int i=0; i< authenticList.size();i++){
            if (authenticList.get(i).getId() == id){
                authenticList.remove(i);
                i--;
            };
        }
        System.out.println("Completed!");
    }
    public void  deleteHand(int id){
        for (int i=0; i< handList.size();i++){
            if (handList.get(i).getId() == id){
                handList.remove(i);
                i--;
            };
        }
        System.out.println("Completed!");
    }
    public void showAuthentic() {
        for (int i=0; i< authenticList.size();i++){
            authenticList.get(i).toPhone();
        }
        System.out.println("Completed!");
    }
    public void showHand() {
        for (int i=0; i< handList.size();i++){
            handList.get(i).toPhone();
        }
        System.out.println("Completed!");
    }
    public static void authenticFileToList(){
        String line;
        hasFile(AUTHENTIC_FILE_PATH);
        String[] tmp;
        try {
            File file = new File(AUTHENTIC_FILE_PATH);
            FileReader fis = new FileReader(AUTHENTIC_FILE_PATH);
            BufferedReader bufR = new BufferedReader(fis);
            while ((line = bufR.readLine()) != null) {
                tmp = line.split(",");
                int id = Integer.parseInt(tmp[0]);
                String name = tmp[1];
                double price = Double.parseDouble(tmp[2]);
                int quantity = Integer.parseInt(tmp[3]);
                String manu = tmp[4];
                int granYear = Integer.parseInt(tmp[5]);
                String granCountry = tmp[6];
                PhoneAuthentic pAuthentic = new PhoneAuthentic(id,name,price,quantity,manu,granYear,granCountry);
                authenticList.add(pAuthentic);
            }
            bufR.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void listToAuthenticFile(){
        String stringLine;
        try(
                FileWriter fileWriter = new FileWriter(AUTHENTIC_FILE_PATH);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ) {
            for (PhoneAuthentic p: authenticList) {
                stringLine = p.getId() +
                        "," + p.getName() +
                        "," + p.getPrice() +
                        "," + p.getQuantity() +
                        "," + p.getManufacturer() +
                        "," + p.getGranYear() +
                        "," + p.getGranCountry();
                bufferedWriter.write(stringLine);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void handFileToList(){
        String line;
        hasFile(HAND_FILE_PATH);
        String[] tmp;
        try {
            File file = new File(HAND_FILE_PATH);
            FileReader fis = new FileReader(HAND_FILE_PATH);
            BufferedReader bufR = new BufferedReader(fis);
            while ((line = bufR.readLine()) != null) {
                tmp = line.split(",");
                int id = Integer.parseInt(tmp[0]);
                String name = tmp[1];
                double price = Double.parseDouble(tmp[2]);
                int quantity = Integer.parseInt(tmp[3]);
                String manu = tmp[4];
                String handCountry = tmp[5];
                String handStatus = tmp[6];
                PhoneHand pHand = new PhoneHand(id,name,price,quantity,manu,handCountry,handStatus);
                handList.add(pHand);
            }
            bufR.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void listToHandFile(){
        String stringLine;
        try(
                FileWriter fileWriter = new FileWriter(HAND_FILE_PATH);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ) {
            for (PhoneHand handPhone: handList) {
                stringLine = handPhone.getId() +
                        "," + handPhone.getName() +
                        "," + handPhone.getPrice() +
                        "," + handPhone.getQuantity() +
                        "," + handPhone.getManufacturer() +
                        "," + handPhone.getHandCountry() +
                        "," + handPhone.getHandStatus();
                bufferedWriter.write(stringLine);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e){
            e.printStackTrace();
        }
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
    public int  getNewID(String typeString){
        int maxID = 0;
        if (typeString.equals("Authentic")){
            if (authenticList.size() == 0){
                maxID = 0;
            } else {
                for (int i = 0; i < authenticList.size(); i++){
                    if (i ==0){
                        maxID = authenticList.get(i).getId();
                    } else if (authenticList.get(i).getId() > maxID){
                        maxID = authenticList.get(i).getId();
                    }
                }
            }
            return maxID+1;
        } else {
            if (handList.size() == 0){
                maxID = 0;
            } else {
                for (int i = 0; i < handList.size(); i++){
                    if (i ==0){
                        maxID = handList.get(i).getId();
                    } else if (handList.get(i).getId() > maxID){
                        maxID = handList.get(i).getId();
                    }
                }
            }
            return maxID+1;
        }
    }



    public static void main(String[] args) {
//        hasFile(AUTHENTIC_FILE_PATH);
//        hasFile(HAND_FILE_PATH);
//        PhoneAuthentic p = new PhoneAuthentic(1,"dfda",3,4,"fad",6,"Asf");
//        authenticList.add(p);
//        listToAuthenticFile();
//        PhoneHand ph = new PhoneHand(1,"dfda",3,4,"fad","Sfa","Asf");
//        handList.add(ph);
//        listToHandFile();
//        System.out.println(getNewID("Authentic"));
//        System.out.println(getNewID("Hand"));
//        showAuthentic();
    }
}

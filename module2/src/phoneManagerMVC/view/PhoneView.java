package phoneManagerMVC.view;

import phoneManagerMVC.controller.PhoneControlImpl;

import java.util.*;
import java.util.stream.Collectors;

public class PhoneView {
    public  static   PhoneControlImpl newPhoneView = new PhoneControlImpl();
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        
        do {
            newPhoneView.showMenu();
            newPhoneView.getMenuUserInput();
            newPhoneView.setNextView();
        } while (newPhoneView.getNowActive() == -1);
    }


}

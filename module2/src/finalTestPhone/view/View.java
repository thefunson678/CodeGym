package finalTestPhone.view;

import finalTestPhone.controller.PhoneControllerImp;

public class View {
    private static PhoneControllerImp pCtrl = new PhoneControllerImp();

    public static void main(String[] args) {
        pCtrl.getMenu();
    }
}

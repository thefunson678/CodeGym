package phoneManagerMVC.controller;

import phoneManagerMVC.model.Phone;

public interface IPhoneController {
    void addPhone(Phone phone);
    void deletePhone(int phoneId);
    void displayAll();
    void findByPhoneName(String phoneName);
    int getNewPhoneID();
}

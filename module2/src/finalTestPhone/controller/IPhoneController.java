package finalTestPhone.controller;

import finalTestPhone.model.PhoneAuthentic;
import finalTestPhone.model.PhoneHand;

public interface IPhoneController {
    int  getNewID(String typeString);
    void showPhone(String typeString);
    void createPhone (String typeString, PhoneAuthentic phoneAuthentic, PhoneHand phoneHand);
    void deleteByID(String typeString, int id);
    void findById(String typeString, int id);
}

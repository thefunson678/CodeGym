package finalTestPhone.repository;

import finalTestPhone.model.PhoneAuthentic;
import finalTestPhone.model.PhoneHand;

public interface IPhoneRepository {
    int  getNewID(String typeString);
    void showPhone(String typeString);

    void deleteByID(String typeString, int id);

    void findById(String typeString, int id);

    void createPhone (String typeString, PhoneAuthentic phoneAuthentic, PhoneHand phoneHand);
}

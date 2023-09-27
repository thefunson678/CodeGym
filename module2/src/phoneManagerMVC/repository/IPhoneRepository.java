package phoneManagerMVC.repository;

import phoneManagerMVC.model.Phone;

import java.util.List;

public interface IPhoneRepository {
    void addPhone(Phone phone);
    void deletePhone(int phoneId);
    void displayAll();
    void findByPhoneName(String phoneName);
    int getNewPhoneID();


}

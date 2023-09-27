package phoneManagerMVC.service;

import phoneManagerMVC.model.Phone;

import java.util.List;

public interface IPhoneService {
    void addPhone(Phone phone);
    void deletePhone(int phoneId);
    void displayAll();
    void findByPhoneName(String phoneName);
    int getNewPhoneID();

    //Validate Kiểm tra dữ liệu đầu vào

}

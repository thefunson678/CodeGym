package phoneManagerMVC.service;

import phoneManagerMVC.model.Phone;
import phoneManagerMVC.repository.IPhoneRepository;
import phoneManagerMVC.repository.PhoneRepositoryImpl;

import java.util.List;

public class PhoneServiceImpl implements IPhoneService {
    private IPhoneRepository iPhoneRepository =new PhoneRepositoryImpl();
    @Override
    public void addPhone(Phone phone) {
       iPhoneRepository.addPhone(phone);
    }

    @Override
    public void deletePhone(int phoneId) {
        iPhoneRepository.deletePhone(phoneId);
    }

    @Override
    public void displayAll() {
        iPhoneRepository.displayAll();
    }

    @Override
    public void findByPhoneName(String phoneName) {
        iPhoneRepository.findByPhoneName(phoneName);
    }

    public int getNewPhoneID(){
        return iPhoneRepository.getNewPhoneID();
    }

    //validate

}

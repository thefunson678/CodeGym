package finalTestPhone.service;

import finalTestPhone.model.PhoneAuthentic;
import finalTestPhone.model.PhoneHand;
import finalTestPhone.repository.PhoneRepositoryImp;

public class PhoneServiceImp implements IPhoneService{
    private PhoneRepositoryImp pRepositoryImp = new PhoneRepositoryImp();
    @Override
    public int getNewID(String typeString) {
        return pRepositoryImp.getNewID(typeString);
    }
    @Override
    public void showPhone(String typeString) {
        pRepositoryImp.showPhone(typeString);
    }

    @Override
    public void createPhone(String typeString, PhoneAuthentic phoneAuthentic, PhoneHand phoneHand) {
        pRepositoryImp.createPhone(typeString,phoneAuthentic,phoneHand);
    }

    @Override
    public void deleteByID(String typeString, int id) {
        pRepositoryImp.deleteByID(typeString,id);
    }

    @Override
    public void findById(String typeString, int id) {
        pRepositoryImp.findById(typeString,id);
    }


}

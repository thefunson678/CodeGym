package com.example.ex1_2_dictionary.service;

import com.example.ex1_2_dictionary.repository.DictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService {
    @Autowired
    private DictionaryRepository dictionaryRepository;

    public String getVnString(String enString){
       return dictionaryRepository.getVnString(enString);
    }
}

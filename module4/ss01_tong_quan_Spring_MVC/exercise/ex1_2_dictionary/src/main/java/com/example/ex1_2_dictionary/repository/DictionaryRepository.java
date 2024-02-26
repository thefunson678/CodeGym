package com.example.ex1_2_dictionary.repository;

import com.example.ex1_2_dictionary.model.DictionaryResult;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class DictionaryRepository {
    private static List<DictionaryResult> dictionaryListVN  = new ArrayList<>();
    static {
        dictionaryListVN.add(new DictionaryResult("một","one"));
        dictionaryListVN.add(new DictionaryResult("hai","two"));
        dictionaryListVN.add(new DictionaryResult("ba","three"));
        dictionaryListVN.add(new DictionaryResult("bốn","four"));
        dictionaryListVN.add(new DictionaryResult("năm","five"));
    }
    public String getVnString(String enString){
        String vnString = "";
        for (int i = 0; i < dictionaryListVN.size();i++){
            if(dictionaryListVN.get(i).getEnString().equals(enString)){
                vnString = dictionaryListVN.get(i).getVnString();
            }
        }
        return vnString;
    }
}

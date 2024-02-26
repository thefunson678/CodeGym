package com.example.finaltest.module.testModel;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestTable {
    private Date date_test;
    private Timestamp time_test;
    private Integer test_id;
    private String list_test;
    private  String text_test;
    private String option_test;

    private Boolean yes_no;

    public Date getDate_test() {
        return date_test;
    }
    public void setDate_test(Date date_test) {
        this.date_test = date_test;
    }

    public Timestamp getTime_test() {
        return time_test;
    }

    public void setTime_test(Timestamp time_test) {
        this.time_test = time_test;
    }
    public Integer getTest_id() {
        return test_id;
    }

    public void setTest_id(Integer test_id) {
        this.test_id = test_id;
    }

    public String getList_test() {
        return list_test;
    }

    public void setList_test(String list_test) {
        this.list_test = list_test;
    }

    public String getText_test() {
        return text_test;
    }

    public void setText_test(String text_test) {
        this.text_test = text_test;
    }

    public String getOption_test() {
        return option_test;
    }

    public void setOption_test(String option_test) {
        this.option_test = option_test;
    }

    public Boolean getYes_no() {
        return yes_no;
    }

    public void setYes_no(Boolean yes_no) {
        this.yes_no = yes_no;
    }

    public TestTable(Integer test_id, String list_test, String text_test, String option_test, Boolean yes_no) {
        this.test_id = test_id;
        this.list_test = list_test;
        this.text_test = text_test;
        this.option_test = option_test;
        this.yes_no = yes_no;
    }

    public TestTable(Date date_test, Timestamp time_test, Integer test_id, String list_test, String text_test, String option_test, Boolean yes_no) {
        this.date_test = date_test;
        this.time_test = time_test;
        this.test_id = test_id;
        this.list_test = list_test;
        this.text_test = text_test;
        this.option_test = option_test;
        this.yes_no = yes_no;
    }

    public TestTable() {
    }

    public Boolean isValidateOK(){
        Boolean isOKValidate;
        String regexTextOption = "^Option";
        Pattern pattern = Pattern.compile(regexTextOption);
        Matcher matcher = pattern.matcher(this.option_test);
        if (matcher.find()) {
            System.out.println("Pattern found: " + ((Matcher) matcher).group());
            return  true;
        } else {
            System.out.println("Pattern not found");
            return false;
        }
    }
}

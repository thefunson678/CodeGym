package com.example.ex8_1_register_form.controlles;

import com.example.ex8_1_register_form.models.LoaiCauHoi;
import com.example.ex8_1_register_form.models.QA;
import com.example.ex8_1_register_form.models.User;
import com.example.ex8_1_register_form.services.ILoaiCauHoiService;
import com.example.ex8_1_register_form.services.IQAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class QAController {
    @Autowired
    private ILoaiCauHoiService iLoaiCauHoiService;
    @Autowired
    private IQAService iqaService;
    @GetMapping("/QA")
    public String showList(Model model){
        List<QA> qaList = iqaService.findAll();
        model.addAttribute("qaList",qaList);
        return "/QA";
    }
    @GetMapping("/QACreate")
    public String showCreate(Model model){
        QA qa = new QA();
        List<LoaiCauHoi> loaiCauHoiList= iLoaiCauHoiService.findAll();
        model.addAttribute("qa",qa);
        model.addAttribute("loaiCauHoiList",loaiCauHoiList);
        return "/QACreate";
    }
    @PostMapping("/QACreate")
    public String   qaCreateSave(@ModelAttribute("qa") QA qa, BindingResult bindingResult,Model model){
        if (bindingResult.hasErrors()){
            List<QA> qaList = iqaService.findAll();
            model.addAttribute("qaList",qaList);
            return "/QA";
        }
        Boolean saveOK = iqaService.saveQA(qa);
        System.out.println(saveOK);
        List<QA> qaList = iqaService.findAll();
        model.addAttribute("qaList",qaList);
        return "/QA";
    }
}

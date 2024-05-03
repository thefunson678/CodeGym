package com.example.finaltestmodule4.controlles;

import com.example.finaltestmodule4.models.GiaoDich;
import com.example.finaltestmodule4.service.IGiaoDichService;
import com.example.finaltestmodule4.service.IKhachHangService;
import com.example.finaltestmodule4.service.ITypeDichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class NhaDatControllers {
    @Autowired
    private IGiaoDichService iGiaoDichService;
    @Autowired
    private IKhachHangService iKhachHangService;
    @Autowired
    private ITypeDichVuService iTypeDichVuService;

    @GetMapping("/list")
    public String showList(Model model) {
        List<GiaoDich> giaoDichList = iGiaoDichService.findAll();
        model.addAttribute("giaoDichList", giaoDichList);
        return "/index";
    }

    @GetMapping("/{idTrans}/detail")
    public String showDetail(@PathVariable(name = "idTrans") String idTrans,Model model) {
        GiaoDich giaoDich = iGiaoDichService.findByID(idTrans);
        model.addAttribute("giaodich",giaoDich);
        return ("/viewDetail");
    }

    @PostMapping("/delete")
    public String deleteByID(@RequestParam(name = "transCodeDelete") String transCodeDelete , Model model){
        System.out.println(transCodeDelete);
//        IGiaoDichService.deleteByID(transCode);
        List<GiaoDich> giaoDichList = iGiaoDichService.findAll();
        model.addAttribute("giaoDichList", giaoDichList);
        return "/index";
    }


}

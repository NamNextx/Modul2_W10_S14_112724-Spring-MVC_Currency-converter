package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class currencyConverter {
    @PostMapping("/currency")
    public String form(){
        return "test";
    }
    @GetMapping("/currency")

    public String currency(@RequestParam String tiGia, @RequestParam String soTien, Model model) {
        if (soTien.isEmpty() || tiGia.isEmpty()){
            String message="Sai roi";
            model.addAttribute("result",message);
            return "test";
        }
        else {
            int sotien = Integer.parseInt(soTien);
            int tigia = Integer.parseInt(tiGia);
            int tinhToan= tigia * sotien;
            model.addAttribute("result",tinhToan);
            return "test";
        }
    }
}

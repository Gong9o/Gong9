package com.gg.gong9.global.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

    @GetMapping("/") // 루트 접근 시 -> 스웨거로
    public String root() {
        return "redirect:/swagger-ui/index.html";
    }
}

package com.bostonHacks.DontTrashMyHouse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String openHome(){
        return "index";
    }
}

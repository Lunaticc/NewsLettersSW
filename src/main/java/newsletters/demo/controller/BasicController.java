package newsletters.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicController {

    @GetMapping("/")
    public String subscribe(){
        return "index";
    }

    @GetMapping("/Admin")
    public String adminPage(){
        return "admin";
    }

    @GetMapping("/Thanks")
    public String thanksPage(){
        return "thanks";
    }

}



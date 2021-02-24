package newsletters.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    @GetMapping("/PostEmail")
    public String postEmail(){
        return "Email sent!";
    }
}
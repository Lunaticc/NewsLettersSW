package newsletters.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String helloWorld(){
        return "Hello World!";
    }

    @GetMapping("Restricted")
    public String restricted(){
        return "Login to see this!";
    }
}

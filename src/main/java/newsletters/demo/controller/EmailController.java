package newsletters.demo.controller;

import newsletters.demo.entity.Subscriber;
import newsletters.demo.service.SubService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@RestController
public class EmailController {


    private SubService service;

    private Subscriber subscriber;

    @GetMapping("/subscribe/")
    //@PostMapping("/thanks")
    public String subscribeToEmail(@RequestParam("name") String name, @RequestParam("email") String email, HttpServletResponse response) throws IOException {
        subscriber = new Subscriber(name, email);
        try{
            service.save(subscriber);
        }catch (Error er){
            System.out.println(er.toString());
        }

        return "Thanks";
    }
}
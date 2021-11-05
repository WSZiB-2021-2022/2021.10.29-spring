package pl.edu.wszib.contexty.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SimpleController {

    @RequestMapping(value = "/cos", method = RequestMethod.GET)
    public String abc() {
        System.out.println("cos");
        return "cos";
    }
}

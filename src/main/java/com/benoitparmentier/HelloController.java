package com.benoitparmentier;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("==========STEP 1===========");
        return "hello";
    }

    @RequestMapping("/hellonull")
    public String hellonull() {
        System.out.println("==========STEP 1===========");
        return null;
    }

    @RequestMapping("/hellovoid")
    public String hellovoid() {
        System.out.println("==========STEP 1===========");
        return null;
    }

}

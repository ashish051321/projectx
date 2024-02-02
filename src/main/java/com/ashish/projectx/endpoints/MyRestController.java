package com.ashish.projectx.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @GetMapping("/getHello")
    public String getHello(){
        return "Whats Up, People !";
    }
}

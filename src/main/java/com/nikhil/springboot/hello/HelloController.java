package com.nikhil.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nikhil Das Nomula on 12/24/17.
 */
@RestController
public class HelloController {

    // RequestMapping maps to all HTTP methods
    @RequestMapping("/hello")
    public String sayHi() {
        return "Hi!";
    }
}

package com.francescoXX.springboothttpsexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by FrancescoXX on 17/05/2018.
 */

@RestController
@RequestMapping("/hello")
public class HelloResource {

    @GetMapping
    public String hello() {
        return "hello htps!";
    }

}

package com.store.categorycrud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/test")
public class TestController {
    
    @GetMapping
    public String test(){
        return "Works";
    }
    
}
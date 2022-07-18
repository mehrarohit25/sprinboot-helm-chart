package com.example.demoweb;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class DemowebController {

    @GetMapping("/")
    public String home() {
        RestTemplate restTemplate = new RestTemplate();
        String s= restTemplate.getForObject("http://34.171.207.92",String.class);
        System.out.println(s);
        return s+ "    Hello World New !!.";
    }

}

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
        String s= restTemplate.getForObject("http://34.136.134.200:80",String.class);
        System.out.println(s);
        return s+ "    Hello World New !!.";
    }

}

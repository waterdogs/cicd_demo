package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerTest {

    @RequestMapping("/hello")
    public String helloDocker(){

        System.out.println("--suuuuussss---- hello word");

        return "hello docker deploy by jenkins pipeline";
    }

}

package vip.macula.siegheil.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:9999")
public class REST {
    @GetMapping("/api/hello")
    public String hello() {
        return "Hello, World!";
    }
}

package com.example.uebentest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UebenController {

    @GetMapping("/random")
    public int random() {
        int value = (int) (Math.random() * 100);
        return value;
    }
}

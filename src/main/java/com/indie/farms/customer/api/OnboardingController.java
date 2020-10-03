package com.indie.farms.customer.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/onboard")
public class OnboardingController {

    @GetMapping("/test")
    public String testConnection(){
        return "Hello";
    }

}

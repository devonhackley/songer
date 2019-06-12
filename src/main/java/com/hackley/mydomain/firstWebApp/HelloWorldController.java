package com.hackley.mydomain.firstWebApp;

import org.springframework.web.bind.annotation.*;

// Mark this class as a controller
@RestController
public class HelloWorldController {

    // specify the route for this method
    @GetMapping("/")
    public String getSlash() {
        return "Hi!";
    }
    @GetMapping("/hello")
    public String getHelloWorld() {
        return "Hello World!";
    }
    @GetMapping("/capitalize/{words}")
    public String getCapitalized(@PathVariable String words){
        return words.toUpperCase();
    }
    @GetMapping("/reverse")
    @ResponseBody
    public String getReversedSentence(@RequestParam(defaultValue = "test") String sentence){
        String[] parts = sentence.split(" ");
        String rev = "";
        for(int i = parts.length - 1; i >= 0 ; i--)
        {
            rev += parts[i] + " ";
        }
        return rev.trim();
    }
}

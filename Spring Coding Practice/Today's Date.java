package com.example.date;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDate;

@RestController
public class MyController {
    @GetMapping("/") 
    public LocalDate getDate(){
        return LocalDate.now();
    }
}

package org.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vorname Nachname (vorname.nachname@dataphone.at)
 * @since ${DATE}
 */

@SpringBootApplication
@RestController
@Slf4j
public class Main {

    @GetMapping("/")
    public String getMessage(){
        return "My First Test";
    }

    public static void main(String[] args) {
        //System.out.println("Hello");
        SpringApplication.run(Main.class, args);
    }
}
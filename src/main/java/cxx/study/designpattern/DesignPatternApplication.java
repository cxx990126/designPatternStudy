package cxx.study.designpattern;

import cxx.study.designpattern._1_single.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class DesignPatternApplication {

    public static void main(String[] args) throws IOException {
        Logger logger = new Logger();
        SpringApplication.run(DesignPatternApplication.class, args);
    }

}

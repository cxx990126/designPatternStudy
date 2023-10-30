package cxx.study.designpattern;

import cxx.study.designpattern._1_single.ThreadSingle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class DesignPatternApplication {

    public static void main(String[] args) throws IOException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(ThreadSingle.getInstance());
            }
        }).start();

        System.out.println(ThreadSingle.getInstance());
        SpringApplication.run(DesignPatternApplication.class, args);
    }

}

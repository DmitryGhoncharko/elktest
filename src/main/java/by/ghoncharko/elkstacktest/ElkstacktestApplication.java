package by.ghoncharko.elkstacktest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ElkstacktestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElkstacktestApplication.class, args);
    }

}

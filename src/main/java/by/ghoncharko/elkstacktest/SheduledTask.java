package by.ghoncharko.elkstacktest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;

@Slf4j
@Component
public class SheduledTask {
    @Scheduled(fixedRate = 100)
    public void Log(){
        log.info("SHEDULED TASK " + new Random().nextInt());
    }
}

package EventReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ReaderApiApp {
    public static void main(String[] args) {
        SpringApplication.run(ReaderApiApp.class, args);
    }
}

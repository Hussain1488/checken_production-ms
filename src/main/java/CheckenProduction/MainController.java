package CheckenProduction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MainController {

    public static void main(String[] args) {
        SpringApplication.run(MainController.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to Checken Production!";
    }
}

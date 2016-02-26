import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Trial_Project {

    @RequestMapping("/")
    String home() {
        return "Frist work";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Trial_Project.class, args);
    }

}
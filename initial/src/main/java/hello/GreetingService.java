package hello;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String greet() {
        return "Hello World";
    }
}
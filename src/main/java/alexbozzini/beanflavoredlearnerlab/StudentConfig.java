package alexbozzini.beanflavoredlearnerlab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {
    @Bean(name = "students")
    public Students currentStudents(){
        return null;
    }
}

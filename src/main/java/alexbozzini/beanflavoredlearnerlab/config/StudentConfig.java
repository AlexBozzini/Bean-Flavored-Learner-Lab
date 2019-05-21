package alexbozzini.beanflavoredlearnerlab.Config;

import alexbozzini.beanflavoredlearnerlab.Models.Learner;
import alexbozzini.beanflavoredlearnerlab.Models.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {
    private List<Learner> currStudents;
    private List<Learner> prevStudents;

    @Bean(name = "students")
    public Students currentStudents(){
        return new Students(currStudents);
    }

    @Bean
    public Students previousStudents(){
        return new Students(prevStudents);
    }
}

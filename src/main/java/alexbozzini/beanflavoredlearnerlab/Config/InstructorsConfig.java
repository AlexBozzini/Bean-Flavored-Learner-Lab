package alexbozzini.beanflavoredlearnerlab.Config;

import alexbozzini.beanflavoredlearnerlab.Models.Instructor;
import alexbozzini.beanflavoredlearnerlab.Models.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import java.util.List;

public class InstructorsConfig {
    private List<Instructor> tcUsaInstructors;
    private List<Instructor> tcUkInstructors;
    private List<Instructor> zcwInstructors;

    @Bean
    public Instructors tcUsaInstructors(){
        return new Instructors(tcUsaInstructors);
    }

    @Bean
    public Instructors tcUkInstructors(){
        return new Instructors(tcUkInstructors);
    }

    @Bean(name = "instructors")
    @Primary
    public Instructors zcwInstructors(){
        return new Instructors(zcwInstructors);
    }
}

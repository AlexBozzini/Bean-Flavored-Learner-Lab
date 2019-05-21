package alexbozzini.beanflavoredlearnerlab.Config;

import alexbozzini.beanflavoredlearnerlab.Models.Classroom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;

public class ClassroomConfig {

    @Autowired
    private StudentConfig studentConfig;

    @Autowired
    private InstructorsConfig instructorsConfig;

    @Bean
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(){
        return new Classroom(instructorsConfig.zcwInstructors(), studentConfig.currentStudents());
    }

    @Bean
    @DependsOn({"instructors", "students"})
    public Classroom previousCohort(){
        return new Classroom(instructorsConfig.zcwInstructors(), studentConfig.previousStudents());
    }
}

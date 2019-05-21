package alexbozzini.beanflavoredlearnerlab.configTest;

import alexbozzini.beanflavoredlearnerlab.config.StudentConfig;
import alexbozzini.beanflavoredlearnerlab.models.Students;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = StudentConfig.class)
public class TestStudentConfig {

    @Autowired
    @Qualifier("students")
    private Students currentStudents;

    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;

    @Test
    public void testCurrentStudents(){
        // given
        String expected = "People{personList=[Student{id=0, name='Alex'}, Student{id=1, name='Will'}, " +
                "Student{id=2, name='Francisco'}, Student{id=3, name='Laxmi'}, Student{id=4, name='Charlie'}, " +
                "Student{id=5, name='Ashley'}, Student{id=6, name='Ajah'}, Student{id=7, name='Robyn'}, " +
                "Student{id=8, name='Cara'}, Student{id=9, name='Marshilla'}]}";
        // when
        String actual = currentStudents.toString();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPreviousStudents(){
        // given
        String expected = "People{personList=[Student{id=0, name='Brian'}, Student{id=1, name='Chad'}, " +
                "Student{id=2, name='Xavia'}, Student{id=3, name='Eugene'}, Student{id=4, name='Connor'}, " +
                "Student{id=5, name='Andrea'}, Student{id=6, name='David'}, Student{id=7, name='Michelle'}, " +
                "Student{id=8, name='Demetrius'}, Student{id=9, name='April'}]}";
        // when
        String actual = previousStudents.toString();
        // then
        Assert.assertEquals(expected, actual);
    }
}

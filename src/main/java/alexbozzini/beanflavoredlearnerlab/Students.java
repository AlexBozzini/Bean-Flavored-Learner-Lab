package alexbozzini.beanflavoredlearnerlab;

import java.util.Iterator;
import java.util.List;

public class Students extends People<Student> {
    private List<Learner> studentList;

    public Students(List<Learner> studentList){
        for (Learner l : studentList){
            super.add((Student) l);
        }
    }

    public List<Learner> getStudentList() {
        return studentList;
    }

    @Override
    public Iterator<Student> iterator() {
        return null;
    }
}

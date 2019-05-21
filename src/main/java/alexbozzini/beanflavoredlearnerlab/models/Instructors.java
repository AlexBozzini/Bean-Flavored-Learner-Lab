package alexbozzini.beanflavoredlearnerlab.Models;

import java.util.Iterator;
import java.util.List;

public class Instructors extends People<Instructor> {
    public Instructors(List<Instructor> instructorList){
        for (Instructor i : instructorList){
            super.add(i);
        }
    }

    @Override
    public Iterator<Instructor> iterator() {
        return null;
    }
}

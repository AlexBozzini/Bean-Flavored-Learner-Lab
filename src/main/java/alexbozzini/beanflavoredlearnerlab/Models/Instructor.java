package alexbozzini.beanflavoredlearnerlab.Models;

import java.util.List;

public class Instructor extends Person implements Teacher {
    @Override
    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(List<Learner> learners, Double numberOfHours) {
        for (Learner l : learners){
            l.learn(numberOfHours/learners.size());
        }
    }
}

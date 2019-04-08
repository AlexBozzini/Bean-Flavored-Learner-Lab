package alexbozzini.beanflavoredlearnerlab;

import java.util.List;

public interface Teacher {
    public void teach(Learner learner, Double numberOfHours);

    public void lecture(List<Learner> learners, Double numberOfHours);
}

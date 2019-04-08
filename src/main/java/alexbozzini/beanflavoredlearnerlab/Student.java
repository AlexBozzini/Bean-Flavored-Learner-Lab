package alexbozzini.beanflavoredlearnerlab;

public class Student extends Person implements Learner {
    private Double totalStudyTime;

    public Student(Double totalStudyTime){
        this.totalStudyTime = totalStudyTime;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

    @Override
    public void learn(Double numberOfHours) {
        totalStudyTime += numberOfHours;
    }
}

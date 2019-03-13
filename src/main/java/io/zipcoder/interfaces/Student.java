package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    private double totalStudyTime;
    Student(long id) {
        super(id);
        totalStudyTime =0.0;
    }

    public Student(long id, String name) {
        super(id);
        this.name = name;
    }

    public void learn(double numberOfHours) {
        totalStudyTime+=numberOfHours;

    }
    public double getTotalStudyTime(){
        return totalStudyTime;
    }
}

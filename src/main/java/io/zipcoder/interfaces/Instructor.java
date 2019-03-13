package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{

    public Instructor(long id, String name) {
        super(id,name);
    }

    public void teach(Learner learner, double numberOfHours) {
    //Instructor should have a concrete implementation of the teach
    // method which invokes the learn method on the specified Learner object.
       learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
       for(Learner learner: learners){
           learner.learn(numberOfHoursPerLearner);
       }
    }
}

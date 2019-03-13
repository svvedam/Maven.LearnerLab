package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    INSTRUCTOR1(1000L,"Kris"),
    INSTRUCTOR2(2000L, "Leon");

    private final Instructor instructorInstance;
    Double timeWorked;

    Educator(Long instructorId, String name) {
        this.instructorInstance = new Instructor(instructorId, name);
    }

    public Instructor getInstructorInstance() {
        return instructorInstance;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
         timeWorked+= numberOfHours;
         learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        timeWorked+= numberOfHours;
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for(Learner learner: learners){
            learner.learn(numberOfHoursPerLearner);
        }
    }
}

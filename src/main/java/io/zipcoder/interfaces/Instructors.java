package io.zipcoder.interfaces;

public class Instructors extends People<Instructor>{
    private static final Instructors INSTRUCTOR_INSTANCE = new Instructors();

    Instructors(){
        Instructor instructor1  = Educator.INSTRUCTOR1.getInstructorInstance();
        Instructor instructor2 = Educator.INSTRUCTOR2.getInstructorInstance();
        personList.add(instructor1);
        personList.add(instructor2);
    }

    public static Instructors getInstance(){
        return INSTRUCTOR_INSTANCE;
    }
}

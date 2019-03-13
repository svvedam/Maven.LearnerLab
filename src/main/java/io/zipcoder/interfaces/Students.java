package io.zipcoder.interfaces;

public class Students extends People<Student>{
    private static final Students INSTANCE = new Students();

    Students(){
        Student student1 = new Student(1000, "sravani");
        Student student2 = new Student(2000, "priya");

        personList.add(student1);
        personList.add(student2);
    }

    public static Students getInstance(){
        return INSTANCE;
    }
}

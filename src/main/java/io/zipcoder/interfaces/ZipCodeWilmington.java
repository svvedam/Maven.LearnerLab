package io.zipcoder.interfaces;

import java.util.ArrayList;

public class ZipCodeWilmington {

    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();
    ArrayList<Student> studentArrayList;
    ArrayList<Instructor> instructorArrayList;
    ZipCodeWilmington(){
        studentArrayList=new ArrayList<Student>();
        instructorArrayList = new ArrayList<Instructor>();
        studentArrayList = students.personList;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        //identify respective Instructor to host a lecture to the composite
        //people field in the cohort reference

        Student [] studentArrays=studentArrayList.stream().toArray(Student[]::new);
        teacher.lecture(studentArrays,numberOfHours);
    }
    public void hostLecture(Long id, double numberOfHours){
        //identify a respective Instructor to host a lecture
        //to the composite people field in the cohort reference.
        Instructor instructor = returnIdOfTeacher(id);

        Student [] studentArray=studentArrayList.stream().toArray(Student[]::new);
        instructor.lecture(studentArray,numberOfHours);
    }

    public Instructor returnIdOfTeacher(Long id){
        ArrayList<Instructor> instructorArrayList = instructors.personList;

        Instructor instructor=null;

        for(Instructor i : instructorArrayList){
            if(i.getId()==id){
                instructor = i;
            }
        }
        return instructor;
    }
}

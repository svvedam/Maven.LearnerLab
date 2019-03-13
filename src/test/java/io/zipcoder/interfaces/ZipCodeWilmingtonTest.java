package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static io.zipcoder.interfaces.Educator.INSTRUCTOR1;
import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {
    @Test
    public void testhostLecture1(){
        //Given
        Instructor instructor1  = new Instructor(1000L,"Kris");
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();

        //When
        zipCodeWilmington.hostLecture(instructor1, 10);

        //Then check students hours have changed in the cohort
        Students students = Students.getInstance();
        ArrayList<Student> studentArrayList = students.personList;

        Student student1 = studentArrayList.get(0);
        Student student2 = studentArrayList.get(1);

        Double actualResultstudent1 =student1.getTotalStudyTime();
        Double actualResultstudent2 =student2.getTotalStudyTime();

        Double expectedHoursStudent = 5.0;

        Assert.assertEquals(expectedHoursStudent,actualResultstudent1);
        Assert.assertEquals(expectedHoursStudent,actualResultstudent2);
    }

    @Test
    public void testhostLecture2(){
        //Given
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();

        //When
        zipCodeWilmington.hostLecture(1000L, 10);

        //Then check students hours have changed in the cohort
        Students students = Students.getInstance();
        ArrayList<Student> studentArrayList = students.personList;

        Student student1 = studentArrayList.get(0);
        Student student2 = studentArrayList.get(1);

        Double actualResultstudent1 =student1.getTotalStudyTime();
        Double actualResultstudent2 =student2.getTotalStudyTime();

        Double expectedHoursStudent = 5.0;

        Assert.assertEquals(expectedHoursStudent,actualResultstudent1);
        Assert.assertEquals(expectedHoursStudent,actualResultstudent2);
    }
    //Test hostLecture method by passing Educator object.
    @Test
    public void testhostLecture3(){
        //Given
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
        Instructor instructor = INSTRUCTOR1.getInstructorInstance();
        //When
        zipCodeWilmington.hostLecture(instructor, 10);

        //Then check students hours have changed in the cohort
        Students students = Students.getInstance();
        ArrayList<Student> studentArrayList = students.personList;

        Student student1 = studentArrayList.get(0);
        Student student2 = studentArrayList.get(1);

        Double actualResultstudent1 =student1.getTotalStudyTime();
        Double actualResultstudent2 =student2.getTotalStudyTime();

        Double expectedHoursStudent = 5.0;

        Assert.assertEquals(expectedHoursStudent,actualResultstudent1);
        Assert.assertEquals(expectedHoursStudent,actualResultstudent2);
    }

}
package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void testImplementation(){
        //Given
        Instructor instructor = new Instructor(20000,"Kris");
        Boolean expectedResult = true;

        //When
        Boolean actualResult = instructor instanceof Teacher;

        //Then
        Assert.assertEquals(expectedResult,actualResult);

    }
    @Test
    public void testInheritance(){
        //Given
        Instructor instructor = new Instructor(20000,"Kris");
        Boolean expectedResult = true;

        //When
        Boolean actualResult = instructor instanceof Person;

        //Then
        Assert.assertEquals(expectedResult,actualResult);

    }
    @Test
    public void testTeach() {
        //Given
        Instructor instructor = new Instructor(20000,"Kris");
        Learner student = new Student(10000);
        Double expectedResult = 20.0;

        //When
        instructor.teach(student,20.0);
        Double actualResult = ((Student) student).getTotalStudyTime();

        //Then
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testLecture() {
        //Given
        Instructor instructor = new Instructor(20000,"Kris");
        Learner student1 = new Student(10000);
        Learner student2 = new Student(11000);
        Learner [] learners = {student1,student2};
        Double expectedResult = 25.0;

        //When
        instructor.lecture(learners,50.0);
        Double actualResultStudent1 = ((Student) student1).getTotalStudyTime();
        Double actualResultStudent2 = ((Student) student2).getTotalStudyTime();


        //Then
        Assert.assertEquals(expectedResult,actualResultStudent1);
        Assert.assertEquals(expectedResult,actualResultStudent2);
    }
}
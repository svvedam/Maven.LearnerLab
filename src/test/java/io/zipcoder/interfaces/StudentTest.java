package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testImplementation(){
        //Given
        Student student= new Student(20000);
        Boolean expectedResult = true;

        //When
        Boolean actualResult = student instanceof Learner;

        //Then
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testInheritance(){
        //Given
        Student student= new Student(20000);
        Boolean expectedResult = true;

        //When
        Boolean actualResult = student instanceof Person;

        //Then
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testLearn() {
        //Given
        Student student= new Student(20000);
        Double expectedResult = 2.0;

        //When
        student.learn(2.0);
        Double actualResult = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expectedResult,actualResult);
    }
}
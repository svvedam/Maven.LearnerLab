package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void testgetInstance() {
        //Given
        Students students = Students.getInstance();

        //When
        Long actualId1 =students.personList.get(0).getId();
        Long expectedId1=1000L;
        String actualName1 =students.personList.get(0).getName();
        String expectedName1 ="sravani";
        Long actualId2=students.personList.get(1).getId();
        String actualName2 = students.personList.get(1).getName();
        Long expectedId2 =2000L;
        String expectedName2 = "priya";

        //Then
        Assert.assertEquals(expectedId1,actualId1);
        Assert.assertEquals(expectedName1,actualName1);
        Assert.assertEquals(expectedId2,actualId2);
        Assert.assertEquals(expectedName2,actualName2);
    }
}
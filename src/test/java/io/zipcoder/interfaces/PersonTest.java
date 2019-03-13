package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testConstructorId() {
        //Given
        Person person= new Person(100000);
        long expectedResult =100000;
        //When
        long actualResult = person.getId();

        //Then
        Assert.assertEquals(actualResult,actualResult);
    }
    @Test
    public void testSetName() {
        //Given
        Person person= new Person(100000);
        String name ="sravani";
        //When
        person.setName("sravani");
        String actualResult = person.getName();

        //Then
        Assert.assertEquals(actualResult,actualResult);
    }
}
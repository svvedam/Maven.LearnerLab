package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {
    private People peopleInstance;
    @Before
    public void setup(){
        peopleInstance= People.getPeopleinstanceInstance();
    }
    @After
    public void tearDown(){
        peopleInstance.removeAll();
    }

    @Test
    public void testAdd() {
        //Given
        Instructor instructor1 = new Instructor(1000,"Kris");
        Student student1 = new Student(3000);

        Integer expectedResult =2;

        //When
        peopleInstance.add(instructor1);
        peopleInstance.add(student1);

        Integer actualResult = peopleInstance.getCount();

        //Then
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testFindById() {
        //Given
        Instructor instructor1 = new Instructor(1000,"Kris");
        Instructor instructor2 = new Instructor(2000,"Leon");
        Student student1 = new Student(3000);
        Student student2 = new Student(4000);
        Long expectedResult =1000L;

        //When
        peopleInstance.add(instructor1);
        peopleInstance.add(instructor2);
        peopleInstance.add(student1);
        peopleInstance.add(student2);

        Person returnPerson;
        returnPerson = peopleInstance.findById(1000L);
        Long actualResult = returnPerson.getId();

        //Then
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testRemove() {
        //Given
        Instructor instructor1 = new Instructor(1000,"Kris");
        Instructor instructor2 = new Instructor(2000,"Leon");
        Student student1 = new Student(3000);
        Student student2 = new Student(4000);

        peopleInstance.add(instructor1);
        peopleInstance.add(instructor2);
        peopleInstance.add(student1);
        peopleInstance.add(student2);

        //When
        peopleInstance.remove(student1);
        int actualResult = peopleInstance.getCount();

        //Then
        Assert.assertEquals(3,actualResult);
    }

    @Test
    public void testgetCount() {
        //Given
        Instructor instructor1 = new Instructor(1000,"Kris");
        Instructor instructor2 = new Instructor(2000,"Leon");
        Student student1 = new Student(3000);
        Student student2 = new Student(4000);

        peopleInstance.add(instructor1);
        peopleInstance.add(instructor2);
        peopleInstance.add(student1);
        peopleInstance.add(student2);

        //When
        int actualResult = peopleInstance.getCount();

        //Then
        Assert.assertEquals(4,actualResult);
    }

}
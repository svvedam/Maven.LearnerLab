package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class InstructorsTest {

    @Test
    public void testgetInstance() {
        //Given
        Instructors instructors = Instructors.getInstance();

        //When
        Long actualId1 = instructors.personList.get(0).getId();
        Long expectedId1 = 1000L;
        Long actualId2 = instructors.personList.get(1).getId();
        Long expectedId2 = 2000L;

        //Then
        Assert.assertEquals(expectedId1, actualId1);
        Assert.assertEquals(expectedId2, actualId2);
    }

}
package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PetTest {
    private ByteArrayOutputStream byteArrOutStream = new ByteArrayOutputStream();

    @Before
    public void changeOutputStream(){
        System.setOut(new PrintStream(byteArrOutStream));
    }

    @After
    public void resetOutputStreamToSystemOut() {
        System.setOut(System.out);
    }

    @Test
    public void compareToTest() {
        // Given
        String name1 = "Spot";
        String name2 = "Cathy";

        Pet pet1 = new Dog(name1);
        Pet pet2 = new Cat(name2);




        // When

        //int expected = pet1.name1.compareTo(pet2.name2);
        int actual = pet1.compareTo(pet2);



        // Then
        Assert.assertTrue(actual>0);
    }

    @Test
    public void compareToTest2() {
        // Given
        String name1 = "Spot";
        String name2 = "Spot";

        Pet pet1 = new Dog(name1);
        Pet pet2 = new Dog(name2);




        // When

        //int expected = pet1.name1.compareTo(pet2.name2);
        int actual = pet1.compareTo(pet2);



        // Then
        Assert.assertEquals(0,actual);
    }



}
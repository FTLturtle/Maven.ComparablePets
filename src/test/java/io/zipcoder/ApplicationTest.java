package io.zipcoder;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ApplicationTest {
    private ByteArrayOutputStream byteArrOutStream = new ByteArrayOutputStream();

    @Before
    public void changeOutput(){
        System.setOut(new PrintStream(byteArrOutStream));
    }

    @Test
    public void listPetsTest1() {
        // Given
        String name1 = "Spot";
        String name2 = "Cathy";
        String name3 = "Squeaker";
        Pet pet1 = new Dog(name1);
        Pet pet2 = new Cat(name2);
        Pet pet3 = new Mouse(name3);

        String expectedOutput = String.format("%s: Meow!\n%s: Bark!\n%s: Squeak!\n", name2, name1, name3);

        // When
        Application testApplication = new Application(pet1, pet2, pet3);
        testApplication.listPets();

        String actualOutput = byteArrOutStream.toString();

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void listPetsTest2() {
        // Given
        String name1 = "Betty";
        String name2 = "Carter";
        String name3 = "Rick";
        Pet pet1 = new Dog(name1);
        Pet pet2 = new Cat(name2);
        Pet pet3 = new Mouse(name3);

        String expectedOutput = String.format("%s: Bark!\n%s: Meow!\n%s: Squeak!\n", name1, name2, name3);

        // When
        Application testApplication = new Application(pet1, pet2, pet3);
        testApplication.listPets();

        String actualOutput = byteArrOutStream.toString();

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }


}
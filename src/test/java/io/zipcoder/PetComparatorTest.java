package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class PetComparatorTest {

    @Test
    public void compareTest() {
        // Given
        String name1 = "Spot";
        String name2 = "Cathy";

        Pet pet1 = new Dog(name1);
        Pet pet2 = new Cat(name2);




        // When

        PetComparator petComparator = new PetComparator();
        int actual = petComparator.compare(pet2, pet1);



        // Then
        Assert.assertEquals(1, actual);
    }

    @Test
    public void compareTest2() {
        // Given
        String name1 = "Spot";
        String name2 = "Cathy";

        Pet pet1 = new Dog(name1);
        Pet pet2 = new Dog(name2);




        // When

        PetComparator petComparator = new PetComparator();
        int actual = petComparator.compare(pet2, pet1);
        int expected = pet2.getName().compareTo(pet1.getName());



        // Then
        Assert.assertEquals(expected, actual);
    }



}

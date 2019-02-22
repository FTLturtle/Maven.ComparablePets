package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void constructorTest() {
        // Given (dog data)
        String givenName = "Zula";


        // When (a dog is constructed)
        Dog dog = new Dog(givenName);

        // When (we retrieve data from the dog)
        String retrievedName = dog.getName();


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);

    }

    //Test for get name

    @Test

    public void getDogNameTest() {

        //Given
        String name = "Billy";


        //When
        Dog dog = new Dog(name);
        String retrieveName = dog.getName();
        //return retrieveName;


        //Then
        Assert.assertEquals(name, retrieveName);

    }

    //Test for set name

    @Test

    public void setDogNameTest() {

        //Given
        String name = "Sakura";



        //When
        Dog dog = new Dog(name);
        dog.setName(name);

        String actualName =dog.getName();

        //Then

        Assert.assertEquals(name, actualName);

    }

    @Test
    public void dogSpeakTest() {
        // Given
        String name = "Yuki";


        //When
        Dog dog = new Dog(name);
        String result = dog.speak();


        //Then


        Assert.assertEquals("Bark!", result);
    }

    @Test

    public void dogInstancePetTest (){

        //Given
        String name = "Billy";

        Boolean bool;

        //When
        Dog dog = new Dog(name);
        if (dog instanceof Pet){
            bool= true;

        }

        else bool = false;

        //Then

        Assert.assertEquals(true,bool );
    }


}

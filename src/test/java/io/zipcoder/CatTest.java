package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class CatTest {

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";


        // When (a cat is constructed)
        Cat cat = new Cat(givenName);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);

    }

    //Test for get name

    @Test

    public void getCatNameTest() {

        //Given
        String name = "Billy";


        //When
        Cat cat = new Cat(name);
        String retrieveName = cat.getName();
        //return retrieveName;


        //Then
        Assert.assertEquals(name, retrieveName);

    }

    //Test for set name

    @Test

    public void setCatNameTest() {

        //Given
        String name = "Sakura";



        //When
        Cat cat = new Cat(name);
        cat.setName(name);

        String actualName =cat.getName();

        //Then

        Assert.assertEquals(name, actualName);

    }

    @Test
    public void catSpeakTest() {
        // Given
        String givenName = "Yuki";


        //When
        Cat cat = new Cat(givenName);
        String result = cat.speak();


        //Then


        Assert.assertEquals("Meow!", result);
    }

    @Test

    public void catInstancePetTest (){

        //Given
        String name = "Billy";

        Boolean bool;

        //When
        Cat cat = new Cat(name);
        if (cat instanceof Pet){
            bool= true;

        }

        else bool = false;

        //Then

        Assert.assertEquals(true,bool );
    }



}

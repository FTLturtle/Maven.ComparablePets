package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class MouseTest {

    @Test
    public void constructorTest() {
        // Given (mouse data)
        String givenName = "Zula";


        // When (a mouse is constructed)
        Mouse mouse = new Mouse(givenName);

        // When (we retrieve data from the mouse)
        String retrievedName = mouse.getName();


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);

    }

    //Test for get name

    @Test

    public void getMouseNameTest() {

        //Given
        String name = "Billy";


        //When
        Mouse mouse = new Mouse(name);
        String retrieveName = mouse.getName();
        //return retrieveName;


        //Then
        Assert.assertEquals(name, retrieveName);

    }

    //Test for set name

    @Test

    public void setMouseNameTest() {

        //Given
        String name = "Sakura";



        //When
        Mouse mouse = new Mouse(name);
        mouse.setName(name);

        String actualName =mouse.getName();

        //Then

        Assert.assertEquals(name, actualName);

    }

    @Test
    public void mouseSpeakTest() {
        // Given
        String name = "Yuki";


        //When
        Mouse mouse = new Mouse(name);
        String result = mouse.speak();


        //Then


        Assert.assertEquals("Squeak!", result);
    }

    @Test

    public void mouseInstancePetTest (){

        //Given
        String name = "Billy";

        Boolean bool;

        //When
        Mouse mouse = new Mouse(name);
        if (mouse instanceof Pet){
            bool= true;

        }

        else bool = false;

        //Then

        Assert.assertEquals(true,bool );
    }

}

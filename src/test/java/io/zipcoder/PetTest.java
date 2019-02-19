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
    public void speak() {
    }

    @Test
    public void getName() {
    }

    @Test
    public void setName() {
    }

    @Test
    public void compareTo() {
    }

    @Test
    public void dogSpeak() {
    }

    @Test
    public void catSpeak() {
    }

    @Test
    public void mouseSpeak() {
    }
}
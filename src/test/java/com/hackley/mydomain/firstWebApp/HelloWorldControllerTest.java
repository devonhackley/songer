package com.hackley.mydomain.firstWebApp;

import com.hackley.mydomain.firstWebApp.HelloWorldController;
import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldControllerTest {
    @Test public void testGetSlash(){
        HelloWorldController testController = new HelloWorldController();
        assertEquals("Hi!", testController.getSlash());
    }
    @Test public void testGetHelloWorld(){
        HelloWorldController testController = new HelloWorldController();
        assertEquals("Hello World!", testController.getHelloWorld());
    }
    @Test public void testGetCapitalized(){
        HelloWorldController testController = new HelloWorldController();
        assertEquals("HELLO WORLD!", testController.getCapitalized("Hello World!"));
    }
    @Test public void testGetReversedSentence(){
        HelloWorldController testController = new HelloWorldController();
        assertEquals("world Hello", testController.getReversedSentence("Hello world"));
    }

}

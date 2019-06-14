package com.hackley.mydomain.firstWebApp;

import com.hackley.mydomain.firstWebApp.Controller.HelloWorldController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.containsString;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class FirstWebAppApplicationTest {

    @Autowired
    HelloWorldController helloWorldController;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testControllerIsAutowired() {
        assertNotNull(helloWorldController);
    }

    @Test
    public void testRequestToRootGivesHi() throws Exception {
        mockMvc.perform(get("/")).andExpect(content().string(containsString("Hi!")));
    }

    @Test
    public void testRequestToHello() throws Exception {
        mockMvc.perform(get("/hello")).andExpect(content().string(containsString("Hello World!")));
    }

    @Test
    public void testRequestToCapitalized() throws Exception {
        mockMvc.perform(get("/capitalize/Hello World")).andExpect(content().string(containsString("HELLO WORLD")));
    }

    @Test
    public void testRequestToReverse() throws Exception {
        mockMvc.perform(get("/reverse?sentence=Hello World")).andExpect(content().string(containsString("World Hello")));
    }


}

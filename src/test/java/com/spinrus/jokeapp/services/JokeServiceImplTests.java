package com.spinrus.jokeapp.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class JokeServiceImplTests {

    private JokeService jokeService;

    @Autowired
    public void setJokeService(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @Test
    @Repeat(5)
    public void randomJokeTest() {
        assertThat(jokeService.randomJoke(), notNullValue());
    }
}
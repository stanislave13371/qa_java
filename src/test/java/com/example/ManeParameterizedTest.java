package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ManeParameterizedTest {
    private final String sex;
    private final boolean expected;

    public ManeParameterizedTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "sex={0}, mane={1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{"Самец", true}, {"Самка", false}});
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion(sex, mock(Feline.class));
        assertEquals(expected, lion.doesHaveMane());
    }
}

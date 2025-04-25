package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FelineKittensParameterizedTest {
    private final int input;
    private final int expected;
    private final Feline feline = new Feline();

    public FelineKittensParameterizedTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "count={0}, expected={1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{0, 0}, {1, 1}, {5, 5}, {10, 10}});
    }

    @Test
    public void testGetKittens() {
        assertEquals(expected, feline.getKittens(input));
    }
}

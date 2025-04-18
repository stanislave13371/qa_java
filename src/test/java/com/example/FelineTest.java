package com.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class FelineTest {
    private Feline feline;

    @Before
    public void setUp() {
        feline = new Feline();
    }

    @Test
    public void eatMeatReturnsList() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, feline.eatMeat());
    }

    @Test
    public void getFamilyReturnsCatFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensDefaultIsOne() {
        assertEquals(1, feline.getKittens());
    }
}

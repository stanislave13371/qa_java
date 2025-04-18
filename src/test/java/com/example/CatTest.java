package com.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

public class CatTest {
    private Cat cat;
    private Feline mockFeline;

    @Before
    public void setUp() {
        mockFeline = mock(Feline.class);
        cat = new Cat(mockFeline);
    }

    @Test
    public void getSoundReturnsMeow() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodDelegatesToFeline() throws Exception {
        List<String> food = List.of("Meat1", "Meat2");
        when(mockFeline.eatMeat()).thenReturn(food);
        assertEquals(food, cat.getFood());
        verify(mockFeline, times(1)).eatMeat();
    }
}

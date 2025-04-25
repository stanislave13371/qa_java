package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

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
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        when(mockFeline.eatMeat()).thenReturn(food);

        assertEquals(food, cat.getFood());
        verify(mockFeline, times(1)).eatMeat();
    }
}

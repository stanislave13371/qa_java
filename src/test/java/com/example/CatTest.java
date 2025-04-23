package com.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

public class CatTest {
    private Cat cat;
<<<<<<< HEAD
    private Feline mockFeline;

    @Before
    public void setUp() {
        mockFeline = mock(Feline.class);
        cat = new Cat(mockFeline);
=======
    private Feline spyFeline;

    @Before
    public void setUp() {
        // spy вместо mock — будет вызывать реальную логику
        spyFeline = spy(new Feline());
        cat = new Cat(spyFeline);
>>>>>>> 9a88e9f (add jacoco report with 100% coverage)
    }

    @Test
    public void getSoundReturnsMeow() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
<<<<<<< HEAD
    public void getFoodDelegatesToFeline() throws Exception {
        List<String> food = List.of("Meat1", "Meat2");
        when(mockFeline.eatMeat()).thenReturn(food);
        assertEquals(food, cat.getFood());
        verify(mockFeline, times(1)).eatMeat();
=======
    public void getFoodReturnsRealFelineFood() throws Exception {
        // Не нужно дополнительно stub'ить: spy уже ведёт себя как реальный объект.
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, cat.getFood());
>>>>>>> 9a88e9f (add jacoco report with 100% coverage)
    }
}

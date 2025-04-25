package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class LionBehaviorTest {

    private Feline felineSpy;

    @Before
    public void initSpy() {
        felineSpy = spy(new Feline());
    }

    @Test
    public void getKittensDelegatesToFeline() throws Exception {
        doReturn(3).when(felineSpy).getKittens();

        Lion lion = new Lion("Самец", felineSpy);
        assertEquals(3, lion.getKittens());
        verify(felineSpy, times(1)).getKittens();
    }

    @Test
    public void getFoodDelegatesToFeline() throws Exception {
        Lion lion = new Lion("Самец", felineSpy);

        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, lion.getFood());
        verify(felineSpy, times(1)).getFood("Хищник");
    }

    @Test(expected = Exception.class)
    public void constructorThrowsOnInvalidSex() throws Exception {
        new Lion("не-лев", new Feline());
    }
}
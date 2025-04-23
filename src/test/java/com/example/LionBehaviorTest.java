package com.example;

import org.junit.Before;
import org.junit.Test;
<<<<<<< HEAD
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

public class LionBehaviorTest {
    private Feline felineMock;

    @Before
    public void initMock() {
        felineMock = mock(Feline.class);
=======

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class LionBehaviorTest {
    private Feline felineSpy;

    @Before
    public void initSpy() {
        // Spy на реальном объекте — все методы Feline будут вызываться «по-настоящему»
        felineSpy = spy(new Feline());
>>>>>>> 9a88e9f (add jacoco report with 100% coverage)
    }

    @Test
    public void getKittensDelegatesToFeline() throws Exception {
<<<<<<< HEAD
        when(felineMock.getKittens()).thenReturn(3);
        Lion lion = new Lion("Самец", felineMock);
        assertEquals(3, lion.getKittens());
        verify(felineMock, times(1)).getKittens();
=======
        // При этом мы можем явно подменить getKittens(), если хотим проверить именно делегирование
        doReturn(3).when(felineSpy).getKittens();

        Lion lion = new Lion("Самец", felineSpy);
        assertEquals(3, lion.getKittens());
>>>>>>> 9a88e9f (add jacoco report with 100% coverage)
    }

    @Test
    public void getFoodDelegatesToFeline() throws Exception {
<<<<<<< HEAD
        List<String> food = List.of("MeatA");
        when(felineMock.getFood("Хищник")).thenReturn(food);
        Lion lion = new Lion("Самец", felineMock);
        assertEquals(food, lion.getFood());
        verify(felineMock, times(1)).getFood("Хищник");
    }
}
=======
        Lion lion = new Lion("Самец", felineSpy);

        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, lion.getFood());
    }

    @Test(expected = Exception.class)
    public void constructorThrowsOnInvalidSex() throws Exception {
        new Lion("не-лев", new Feline());
    }
}
>>>>>>> 9a88e9f (add jacoco report with 100% coverage)

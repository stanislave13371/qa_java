package com.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

public class LionBehaviorTest {
    private Feline felineMock;

    @Before
    public void initMock() {
        felineMock = mock(Feline.class);
    }

    @Test
    public void getKittensDelegatesToFeline() throws Exception {
        when(felineMock.getKittens()).thenReturn(3);
        Lion lion = new Lion("Самец", felineMock);
        assertEquals(3, lion.getKittens());
        verify(felineMock, times(1)).getKittens();
    }

    @Test
    public void getFoodDelegatesToFeline() throws Exception {
        List<String> food = List.of("MeatA");
        when(felineMock.getFood("Хищник")).thenReturn(food);
        Lion lion = new Lion("Самец", felineMock);
        assertEquals(food, lion.getFood());
        verify(felineMock, times(1)).getFood("Хищник");
    }
}

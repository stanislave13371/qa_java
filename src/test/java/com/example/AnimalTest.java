package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AnimalTest {
    private Animal animal;

    @Before
    public void setUp() {
        animal = new Animal();
    }

    @Test
    public void getFoodReturnsHerbivoreFoods() throws Exception {
        List<String> expected = List.of("Трава", "Различные растения");
        assertEquals(expected, animal.getFood("Травоядное"));
    }

    @Test
    public void getFoodReturnsPredatorFoods() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, animal.getFood("Хищник"));
    }

    @Test(expected = Exception.class)
    public void getFoodThrowsOnUnknownKind() throws Exception {
        animal.getFood("не-существующий-тип");
    }

    @Test
    public void getFamilyReturnsListOfFamilies() {
        String family = animal.getFamily();
        // достаточно проверить, что в строке есть ключевое слово
        assertTrue(family.contains("кошачьи"));
        assertTrue(family.contains("псовые"));
    }
}

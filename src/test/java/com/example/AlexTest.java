package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class AlexTest {
    @Test
    public void alexIsMaleLion() throws Exception {
        Alex alex = new Alex();
        assertTrue(alex.doesHaveMane());
    }

    @Test
    public void alexHasNoKittens() throws Exception {
        Alex alex = new Alex();
        assertEquals(0, alex.getKittens());
    }

    @Test
    public void getFriendsReturnsList() throws Exception {
        Alex alex = new Alex();
        List<String> friends = alex.getFriends();
        assertEquals(Arrays.asList("Марти", "Глория", "Мелман"), friends);
    }

    @Test
    public void getPlaceOfLivingReturnsZoo() throws Exception {
        Alex alex = new Alex();
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }
}

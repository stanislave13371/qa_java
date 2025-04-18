package com.example;

import java.util.List;
import java.util.Arrays;

public class Alex extends Lion {
    public Alex() throws Exception {
        super("Самец", new Feline());
    }

    public List<String> getFriends() {
        return Arrays.asList("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }
}

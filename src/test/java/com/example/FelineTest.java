package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

public class FelineTest {

    @Test
    public void testGetFoodForHerbivore() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.getFood("Травоядное");
        assertEquals(List.of("Трава", "Различные растения"), food);
    }

    @Test
    public void testGetFoodForCarnivore() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.getFood("Хищник");
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        String family = feline.getFamily();
        assertEquals("Кошачьи", family);
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        int kittens = feline.getKittens();
        assertEquals(1, kittens);
    }

    @Test
    public void testGetKittensWithParameter() {
        Feline feline = new Feline();
        int kittens = feline.getKittens(3);
        assertEquals(3, kittens);
    }
}

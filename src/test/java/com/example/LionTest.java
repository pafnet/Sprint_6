package com.example;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class LionTest {

    private Lion lion;
    private boolean expectedMane;
    private int expectedKittens;

    public LionTest(Feline feline, String sex, boolean expectedMane, int expectedKittens) throws Exception {
        lion = new Lion(sex, feline);
        this.expectedMane = expectedMane;
        this.expectedKittens = expectedKittens;
    }

    @Parameters
    public static Collection<Object[]> data() throws Exception {
        return Arrays.asList(new Object[][] {
                { new Feline(), "Самец", true, 1 },
                { new Feline(), "Самка", false, 1 }
        });
    }

    @Test
    public void testDoesHaveMane() {
        assertEquals(expectedMane, lion.doesHaveMane());
    }

    @Test
    public void testGetKittens() {
        assertEquals(expectedKittens, lion.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}

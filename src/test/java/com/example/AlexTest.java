package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AlexTest {

@Test
void testGetFriends() throws Exception {
    Alex alex = new Alex();
    List<String> friends = alex.getFriends();
    assertEquals(3, friends.size());
    assertTrue(friends.contains("Марти"));
    assertTrue(friends.contains("Глория"));
    assertTrue(friends.contains("Мелман"));
}

@Test
void testGetPlaceOfLiving() throws Exception {
    Alex alex = new Alex();
    assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
}

@Test
void testGetKittens() throws Exception {
    Alex alex = new Alex();
    assertEquals(0, alex.getKittens());
}

@Test
void testDoesHaveMane() throws Exception {
    Alex alex = new Alex();
    assertTrue(alex.doesHaveMane());
}

@Test
void testGetFood() throws Exception {
    Alex alex = new Alex();
    List<String> food = alex.getFood();
    assertEquals(3, food.size());
    assertTrue(food.contains("Животные"));
    assertTrue(food.contains("Птицы"));
    assertTrue(food.contains("Рыба"));
}
}
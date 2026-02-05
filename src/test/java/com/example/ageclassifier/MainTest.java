package com.example.ageclassifier;
import example.ageclassifier.Main;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    private final Main main = new Main();
    @Test
    public void testChild() {
        assertEquals("Ребенок", Main.classifyAge(10));
    }
    @Test
    public void testAdult() {
        assertEquals("Взрослый", Main.classifyAge(30));
    }
    @Test
    public void testPensioner() {
        assertEquals("Пенсионер", Main.classifyAge(65));
    }
    @Test(expected=AssertionError.class)
    public void testInvalidInput() {
        assertEquals("Ребенок", Main.classifyAge(-5)); // должна быть ошибка
    }

}
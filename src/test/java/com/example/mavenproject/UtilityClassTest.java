package com.example.mavenproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UtilityClassTest {

    @Test
    public void testAdd() {
        assertEquals(60, UtilityClass.add(50, 10));
        assertEquals(100, UtilityClass.add(70, 30));
    }

    @Test
    public void testSub() {
        assertEquals(40, UtilityClass.sub(50, 10));
        assertEquals(-20, UtilityClass.sub(10, 30));
    }

    @Test
    public void testMul() {
        assertEquals(500, UtilityClass.mul(50, 10));
        assertEquals(0, UtilityClass.mul(100, 0));
    }

    @Test
    public void testDiv() {
        assertEquals(5, UtilityClass.div(50, 10));
        assertEquals(3, UtilityClass.div(30, 10));
    }
}

package ru.job4j.oop;


import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void maxRight() {
        int left = 1;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        assertEquals(result, expected);

    }

    @Test
    public void maxLeft() {
        int left = 4;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 4;

        assertEquals(result, expected);
    }

    @Test
    public void maxLeftRight() {
        int left = 4;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;

        assertEquals(result, expected);
    }

    @Test
    public void maxThree() {
        int left = 4;
        int right = 4;
        int third = 5;
        int result = Max.max(left, right, third);
        int expected = 5;

        assertEquals(result, expected);
    }

    @Test
    public void maxFour() {
        int left = 4;
        int right = 4;
        int third = 6;
        int fourth = 10;
        int result = Max.max(left, right, third, fourth);
        int expected = 10;

        assertEquals(result, expected);
    }
}
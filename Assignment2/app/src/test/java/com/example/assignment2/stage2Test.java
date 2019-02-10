package com.example.assignment2;

import org.junit.Test;

import static org.junit.Assert.*;

public class stage2Test {

    @Test
    public void checkrule() {
        assertEquals(1, new Validator().checkrule("password"));
        assertEquals(2, new Validator().checkrule("hello"));
        assertEquals(3, new Validator().checkrule("skefuhsukfehskufhek"));
        assertEquals(4, new Validator().checkrule(" "));
        assertEquals(5, new Validator().checkrule(""));
        assertEquals(6, new Validator().checkrule("helloworld"));
    }
}
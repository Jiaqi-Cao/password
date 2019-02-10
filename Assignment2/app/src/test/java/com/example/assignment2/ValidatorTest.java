package com.example.assignment2;

        import org.junit.Test;

        import static org.junit.Assert.*;

public class ValidatorTest {

    @Test
    public void checkrule() {
        assertEquals(1, new Validator().checkrule("password"));
        assertEquals(2, new Validator().checkrule("hello"));
    }
}
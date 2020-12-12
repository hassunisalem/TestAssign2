package main.java.sm;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringManipulationTest {
        StringManipulation sm = new StringManipulation();

    @Test
    public void testRevString() {

        String hw = "hello world";
        String result = sm.RevString(hw);

        assertEquals("dlrow olleh", result);

    }

    @Test
    public void testCapString() {
        String cap = "cap";
        String result = sm.CapString(cap);

        assertEquals("CAP",result);
    }

    @Test
    public void testLowerString() {
        String low = "LOW";
        String result = sm.LowerString(low);

        assertEquals("low", result);
    }
}
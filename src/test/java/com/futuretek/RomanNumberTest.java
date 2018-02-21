package com.futuretek;

import static org.junit.Assert.*;
import org.junit.Test;

public class RomanNumberTest {

    @Test
    public void testBasicValues(){
        RomanNumbers romanNumbers = new RomanNumbers();

        assertEquals(1, romanNumbers.convert("I"));
        assertEquals(2, romanNumbers.convert("II"));
        assertEquals(3, romanNumbers.convert("III"));
        assertEquals(4, romanNumbers.convert("IV"));
        assertEquals(5, romanNumbers.convert("V"));
        assertEquals(8, romanNumbers.convert("VIII"));
        assertEquals(9, romanNumbers.convert("IX"));
        assertEquals(10, romanNumbers.convert("X"));
        assertEquals(19, romanNumbers.convert("XIX"));
        assertEquals(50, romanNumbers.convert("L"));
        assertEquals(100, romanNumbers.convert("C"));
        assertEquals(500, romanNumbers.convert("D"));
        assertEquals(1000, romanNumbers.convert("M"));
        assertEquals(39, romanNumbers.convert("XXXIX"));

        assertEquals(14, romanNumbers.convert("XIV"));
        assertEquals(74, romanNumbers.convert("LXXIV"));
        assertEquals(99, romanNumbers.convert("XCIX"));
        assertEquals(83, romanNumbers.convert("LXXXIII"));
        assertEquals(999, romanNumbers.convert("CMXCIX"));
        assertEquals(1400, romanNumbers.convert("MCD"));
        assertEquals(1449, romanNumbers.convert("MCDXLIX"));
        assertEquals(449, romanNumbers.convert("CDXLIX"));
    }

}

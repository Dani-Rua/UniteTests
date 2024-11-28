package org.example;

import org.example.util.PasswordUtil;
import org.junit.Test;

/**
 * Se añade un static import de PasswordUtil.SecurityLevel,
 * para que en la linea 15 sea mas legible el código y no quede tantas lineas.
 */
import static org.example.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weakWhenHasLessThan8Letter(){
       assertEquals(WEAK, PasswordUtil.assessPassword("123aa!"));
    }

    @Test
    public void weakWhenHasOnlyLetter(){
        assertEquals(WEAK, PasswordUtil.assessPassword("abcdefgh"));
    }

    @Test
    public void mediumWhenHasLettersAndNumbers(){
        assertEquals(MEDIUM, PasswordUtil.assessPassword("abcd1234"));
    }

    @Test
    public void strongWhenHasLettersAndNumbersAndSymbols(){
        assertEquals(STRONG, PasswordUtil.assessPassword("abcd1234!"));
    }

}
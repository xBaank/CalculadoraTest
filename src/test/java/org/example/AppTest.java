package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @Test
    void sum() {
        assertEquals(2,App.sum(1,1));
    }

    @Test
    void sub() {
        assertEquals(0,App.sub(1,1));

        assertEquals(1,App.sub(2,1));
    }

    @Test
    void div() {
    }

    @Test
    void mul() {

    }
}

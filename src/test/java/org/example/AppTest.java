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
        assertEquals(-1,App.sum(-2,1));
    }

    @Test
    void sub() {
        assertEquals(0,App.sub(1,1));
        assertEquals(-1,App.sub(1,2));
    }

    @Test
    void div() {
        assertEquals(1,App.div(2,2));
        assertEquals(3,App.div(6,2));
        assertEquals(5,App.div(11,2));
        assertEquals(0,App.div(5,0));
    }

    @Test
    void mul() {
        assertEquals(4,App.mul(2,2));
        assertEquals(-2,App.mul(-1,2));

    }
}

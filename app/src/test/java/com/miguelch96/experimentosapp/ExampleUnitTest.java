package com.miguelch96.experimentosapp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void test01() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test02() throws Exception {
        assertEquals(5, 6 - 1);
    }

    @Test
    public void test03() throws Exception {
        assertEquals(8, 2*4);
    }

    @Test
    public void test04() throws Exception {
        assertEquals(2, 4/2);
    }
}
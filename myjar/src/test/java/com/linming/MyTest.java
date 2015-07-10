package com.linming;

import junit.framework.TestCase;

/**
 * Created by linming on 2015/7/10 0010.
 */
public class MyTest extends TestCase {
    public void testAdd() {
        assertEquals(3, MyUtils.add(1, 3));
    }
}

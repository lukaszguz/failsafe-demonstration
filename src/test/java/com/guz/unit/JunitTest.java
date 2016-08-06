package com.guz.unit;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class JunitTest {

    @Test
    public void shouldWork() {
        //given
        int a = 2, b = 3;

        // when
        int sum = a+b;

        // then
        assertSame(5, sum);
    }
}

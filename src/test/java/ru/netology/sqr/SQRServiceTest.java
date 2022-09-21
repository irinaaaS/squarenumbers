package ru.netology.sqr;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void test() {

        SQRService service = new SQRService();
        int actual = service.calculate(200, 300);
        int expected = 3;

        assertEquals(expected, actual);


    }

    @Test
    public void test2() {

        SQRService service = new SQRService();
        int actual = service.calculate(200, 200);
        int expected = 3;

        assertEquals(expected, actual);


    }

    @Test
    public void test3() {

        SQRService service = new SQRService();
        int actual = service.calculate(0, 300);
        int expected = 3;

        assertEquals(expected, actual);


    }
}

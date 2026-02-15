package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceJUnit4Test {

    @Test
    public void shouldReturn100WhenAmount900() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0WhenAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(expected, actual); // Этот упадёт
    }

    @Test
    public void shouldReturn900WhenAmount100() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(100);
        int expected = 900;
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void shouldReturn500WhenAmount1500() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1500);
        int expected = 500;
        Assert.assertEquals(expected, actual);
    }
}
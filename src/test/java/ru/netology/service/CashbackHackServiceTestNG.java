package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTestNG {

    @Test
    public void shouldReturn100WhenAmount900() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0WhenAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected); // Этот упадёт
    }

    @Test
    public void shouldReturn900WhenAmount100() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(100);
        int expected = 900;
        Assert.assertEquals(actual, expected);
    }

}
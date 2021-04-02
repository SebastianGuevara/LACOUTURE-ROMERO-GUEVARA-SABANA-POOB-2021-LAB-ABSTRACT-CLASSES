package edu.sabana.poob.sabanapayroll;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class SavingTest {

    @Test
    public void shouldGetDepositDiscount() {
        Savings account = new Savings();

        assertTrue(Double.compare(5000, account.getDepositDiscount()) == 0);
    }

    @Test
    public void shouldDepositAmount() {
        Savings account = new Savings();
        boolean result = account.deposit(10000);

        assertTrue(result);
        assertTrue(Double.compare(8000, account.getBalance()) == 0);
    }

    @Test
    public void shouldNotDepositAmount() {
        Savings account = new Savings();

        assertFalse(account.deposit(4000));
        assertFalse(account.deposit(5000));
        assertTrue(Double.compare(0, account.getBalance()) == 0);
    }

    /*
    @Test
    public void shouldProcessCheck() {
        Savings account = new Savings();
        Check check = new Check(10000, LocalDate.now().plusMonths(1));

        assertTrue(account.processCheck(check));
        assertTrue(Double.compare(5000, account.getBalance()) == 0);
    }

    @Test
    public void shouldNotProcessCheck() {
        Savings account = new Savings();

        assertFalse(account.processCheck(new Check(5000, LocalDate.now().plusMonths(1))));
        assertFalse(account.processCheck(new Check(4000, LocalDate.now().plusMonths(1))));
        assertFalse(account.processCheck(new Check(10000, LocalDate.now().minusMonths(1))));
        assertTrue(Double.compare(0, account.getBalance()) == 0);
    }

    @Test
    public void shouldKeepBalance() {
        Savings account = new Savings();

        assertTrue(account.deposit(11000)); //6000
        assertFalse(account.deposit(4000));
        assertFalse(account.deposit(5000));
        assertTrue(account.deposit(21000)); // 16000

        assertTrue(account.processCheck(new Check(15000, LocalDate.now().plusMonths(1)))); // 10000
        assertFalse(account.processCheck(new Check(5000, LocalDate.now().plusMonths(1))));
        assertFalse(account.processCheck(new Check(4000, LocalDate.now().plusMonths(1))));
        assertFalse(account.processCheck(new Check(10000, LocalDate.now().minusMonths(1))));

        assertTrue(Double.compare(32000, account.getBalance()) == 0);
    }

     */

}
package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account account;

    @BeforeEach
    void setup() {
        account = new Account("HongGilDong", "123456-1234567", "Seoul", "010-1234-5678", "ACC123", 1000);
    }

    @Test
    void testGetBalance() {
        assertEquals(1000, account.getBalance());
    }

    @Test
    void testDeposit() {
        int depositAmount = 500;
        account.deposit(depositAmount);
        assertEquals(1500, account.getBalance());
    }

    @Test
    void testWithdraw() {
        int withdrawAmount = 300;
        account.withdraw(withdrawAmount);
        assertEquals(700, account.getBalance());
    }

    @Test
    void testWithdrawOverBalance() {
        int withdrawAmount = 1100;
        account.withdraw(withdrawAmount);
        assertEquals(1000, account.getBalance());
    }

    @Test
    void testPrintInfo() {
        account.printInfo();
        assertEquals("HongGilDong", account.getName());
        assertEquals("123456-1234567", account.getJuminNo());
        assertEquals("Seoul", account.getAddr());
        assertEquals("010-1234-5678", account.getCellNo());
        assertEquals("ACC123", account.getAcc());
    }

    @Test
    void testSetAccount() {
        account.setAccount("HongGilDong", "987654-3210987", "Busan", "010-5678-1234", "ACC456", 2000);

        assertEquals("HongGilDong", account.getName());
        assertEquals("987654-3210987", account.getJuminNo());
        assertEquals("Busan", account.getAddr());
        assertEquals("010-5678-1234", account.getCellNo());
        assertEquals("ACC456", account.getAcc());
        assertEquals(2000, account.getBalance());
    }

    @Test
    void testDel() {
        account.del();
        assertEquals(AccountStatus.Inactive, account.status);
    }

    @Test
    void testSel() {
        assertTrue(account.sel("ACC123"));
        assertFalse(account.sel("ACC999"));
    }
}

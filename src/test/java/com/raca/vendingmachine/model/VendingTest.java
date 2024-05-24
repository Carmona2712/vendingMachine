package com.raca.vendingmachine.model;

import junit.framework.TestCase;

public class VendingTest extends TestCase {
    Vending v;

    public void setUp() {
        v = new Vending(5, 10);
        v.addMoney(3);
    }

    public void testAddMoney() {
        assertEquals(3.0, v.getBalance());
    }

    public void testSelect() {
        v.select("Candy");
        assertEquals(1.75,v.getBalance());
    }


}

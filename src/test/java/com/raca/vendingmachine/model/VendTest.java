package com.raca.vendingmachine.model;

import junit.framework.TestCase;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class VendTest extends TestCase {

    /*Cuando la variable v es estatica, todas las instancias comparten su valor, es por eso que sus valores pueden afectarse de una
    * prueba a otra, para solucionar este problema  se debe crear en el setup, para que cada vez que se instancie en un test,
    * su valor sea restablecido*/
    //static Vending v = new Vending(5,5);
    static Vending v ;

    public void setUp() {
        v = new Vending(5,5); //Solución al problema de la variable estatica
        v.addMoney(1.5);
    }

    public void test2() {
        log.info("balance is: " + v.getBalance());
        v.select("Gum");
        assertTrue(v.getBalance()==1);
    }

    public void test3() {
        log.info("balance is: " + v.getBalance());
        v.select("Candy");
        assertTrue(v.getBalance()==.25);

    }

    public void test4() {
        log.info("balance is: " + v.getBalance());
        v.resetBalance();
        assertTrue(v.getBalance()==0);

    }

    public void test5() {
        v.restock("Candy", 5);
        assertTrue(v.getStock("Candy")==10);
    }

    public void test6() {
        log.info("balance is: " + v.getBalance());
        v.select("Cheetos");
        assertTrue(v.getBalance()==1.5);

    }
    public void test7() {;
        assertEquals(-1, v.getStock("Cheetos"));
    }

    public void test8() {;
       v.addMoney(-1.5);
       v.select("Candy");
       assertTrue(v.getStock("Candy")==5);
    }


}



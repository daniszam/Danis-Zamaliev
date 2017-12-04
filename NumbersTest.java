/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.itis.kpfu.daniszamaliev;

import static org.junit.Assert.*;


/**
 *
 * @author danis_zam
 */
public class NumbersTest {
    private Numbers numb;

    //private Numbers numb;

    @org.junit.Before
    public void init() {
        numb = new Numbers();
    }
@org.junit.After
    public void complite() {
        numb = null;
    }

    /**
     *
     * @throws java.lang.Exception
     */
    @org.junit.Test
    public void counter() throws Exception {
      //  Numbers numb = new Numbers();
      //  int z= numb.getCounter();
        assertEquals(0, numb.getCounter());
        numb.calcFact(1);
        assertEquals(1, numb.getCounter());
        numb.calcFact(2);
        assertEquals(2, numb.getCounter());
    }

    @org.junit.Test
    public void factorial() throws Exception {
        assertTrue(numb.calcFact(3) == 6);
        assertTrue(numb.calcFact(1) == 1);
        assertTrue(numb.calcFact(2) == 2);
    }

    @org.junit.Test (expected = IllegalArgumentException.class)
    public void illegalArg()  throws Exception{
        numb.calcFact(-1);
    }

 
}

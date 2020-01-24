package com.skwqy.ocjp.z808.p024;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author skwqy
 * @Created on 2020 01 2020-01-24 13:58
 */
public class SuperTestTest {

    @Test
    public void optionA(){
        System.out.println("----------OptionA---------------");
        Square square = new Square("bar");
        square.foo("bar");
        square.foo();
    }

    @Test
    public void optionB(){
        System.out.println("----------OptionB---------------");
        Square square = new Square("bar");
        square.foo("bar");
        square.foo("bar");
    }

    @Test
    public void optionC(){
        System.out.println("----------OptionC---------------");
        Square square = new Square();
        square.foo();
        square.foo("bar");
    }

    @Test
    public void optionD(){
        System.out.println("----------OptionD---------------");
        Square square = new Square("bar");
        square.foo();
        square.foo("bar");
    }

    @Test
    public void optionE(){
        System.out.println("----------OptionE---------------");
        Square square = new Square();
        square.foo();
        square.foo();
    }

    @Test
    public void optionF(){
        System.out.println("----------OptionF---------------");
        Square square = new Square();
        square.foo("bar");
        square.foo();
    }

}
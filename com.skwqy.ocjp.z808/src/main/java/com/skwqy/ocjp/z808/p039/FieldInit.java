package com.skwqy.ocjp.z808.p039;

/**
 * @author skwqy
 * @Created on 2020 01 2020-01-25 15:06
 */
public class FieldInit {
    char c;
    boolean b;
    float f;

    void printAll(){
        System.out.println("c="+c);
        System.out.println("b="+b);
        System.out.println("f="+f);
    }

    public static void main(String[] args) {
        FieldInit f = new FieldInit();
        f.printAll();
    }
}

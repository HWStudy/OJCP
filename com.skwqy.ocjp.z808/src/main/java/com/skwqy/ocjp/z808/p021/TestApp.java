package com.skwqy.ocjp.z808.p021;

/**
 * @author skwqy
 * @Created on 2020 01 2020-01-24 11:41
 */
public class TestApp {
    public static void main(String[] args) {
        TestApp t = new TestApp();
        try {
            t.doPrint();
            t.doList();
        }catch (Exception e2){
            System.out.println("Caught "+e2);
        }
    }

    public void doList() throws Exception{
        throw new Error("Error");
    }

    public void doPrint() throws Exception{
        throw new RuntimeException("Exception");
    }
}

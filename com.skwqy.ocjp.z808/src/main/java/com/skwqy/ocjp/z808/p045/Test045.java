package com.skwqy.ocjp.z808.p045;

/**
 * @author skwqy
 * @Created on 2020 01 2020-01-26 10:19
 */
public class Test045 {
    void readCard(int cardNo) throws Exception{
        System.out.println("Reading Card");
    }

    void checkCarde(int cardNo) throws RuntimeException{
        System.out.println("Checking Card");
    }

    public static void main(String[] args){
        Test045 ex=new Test045();
        int cardNo=12344;
        ex.checkCarde(cardNo);
        //ex.readCard(cardNo);
    }
}

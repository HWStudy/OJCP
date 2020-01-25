package com.skwqy.ocjp.z808.p038;

/**
 * @author skwqy
 * @Created on 2020 01 2020-01-25 11:37
 */
public class Test1 {
    private Integer ref;

    static void doubling(Integer ref, int pv){
        ref =20;
        pv=20;
    }

    public static void main(String[] args) {
        Integer iObj = new Integer(10);
        int iVal =10;
        doubling(iObj++,iVal++);
        System.out.println(iObj+","+iVal);
    }
}

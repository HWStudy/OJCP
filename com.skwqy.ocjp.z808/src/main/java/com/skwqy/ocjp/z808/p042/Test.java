package com.skwqy.ocjp.z808.p042;

import java.util.ArrayList;
import java.util.List;

/**
 * @author skwqy
 * @Created on 2020 01 2020-01-26 10:13
 */
public class Test {
    public static void main(String[] args) {
        List<Alpha> strs=new ArrayList<>();
        strs.add(new Alpha());
        strs.add(new Beta());
        strs.add(new Gamma());
        for(Alpha t:strs){
            System.out.println(t.doStuff("Java"));
        }
    }
}

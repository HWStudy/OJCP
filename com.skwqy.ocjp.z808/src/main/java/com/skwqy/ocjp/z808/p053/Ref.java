package com.skwqy.ocjp.z808.p053;

import java.util.ArrayList;
import java.util.List;

/**
 * @author skwqy
 * @Created on 2020 01 2020-01-30 13:45
 */
public class Ref {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Hello Java!");
        String s2 = s1.toString();
        List<String> lst = new ArrayList<>();
        lst.add(s2);
        System.out.println(s1.getClass());
        System.out.println(s2.getClass());
        System.out.println(lst.getClass());
    }
}

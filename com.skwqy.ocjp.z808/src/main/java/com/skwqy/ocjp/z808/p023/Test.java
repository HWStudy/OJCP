package com.skwqy.ocjp.z808.p023;

/**
 * @author skwqy
 * @Created on 2020 01 2020-01-24 13:12
 */
public class Test {
    public static void main(String[] args) {
        try {
            String[] arr = new String[4];
            arr[1]="Unix";
            arr[2]="Linux";
            arr[3]="Solarios";
            for(String var:arr){
                System.out.print(var+" ");
            }
        }catch (Exception e){
            System.out.println(e.getClass());
        }
    }
}

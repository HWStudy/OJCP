package com.skwqy.ocjp.z808.p079;

/**
 * @author skwqy
 * @Created on 2020 01 2020-01-30 14:00
 */
public class Test079 {
    public static void main(String[] args) {
        String color = "teal";
        switch (color) {
            case "Red":
                System.out.println("Found Red");
            case "Blue":
                System.out.println("Found Blue");
                break;
            case "Teal":
                System.out.println("Found Teal");
                break;
            default:
                System.out.println("Found Default");
        }
    }
}

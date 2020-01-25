package com.skwqy.ocjp.z808.p040;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author skwqy
 * @Created on 2020 01 2020-01-25 15:11
 */
public class Test040Test {
    static String shirts[][] = new String[2][2];
    @BeforeClass
    public static void init(){
        shirts[0][0]="red";
        shirts[0][1]="blue";
        shirts[1][0]="small";
        shirts[1][1]="medium";
    }

    @Test
    public void optionA(){
        System.out.println("------------OptionA--------------");
        for(int index=1;index<2;index++){
            for(int idx=1;idx<2;idx++){
                System.out.print(shirts[index][idx]+":");
            }
        }
    }

    @Test
    public void optionB(){
        System.out.println("------------OptionB--------------");
        for(int index=1;index<2;index++){
            for(int idx=1;idx<index;idx++){
                System.out.print(shirts[index][idx]+":");
            }
        }
    }

    @Test
    public void optionC(){
        System.out.println("------------OptionC--------------");
        for(String[] c:shirts){
            for(String s:c){
                System.out.println(s+":");
            }
        }
    }

    @Test
    public void optionD(){
        System.out.println("------------OptionD--------------");
        for(int index=0;index<2;){
            for(int idx=0;idx<2;){
                System.out.print(shirts[index][idx]+":");
                idx++;
            }
            index++;
        }
    }
}
package com.skwqy.ocjp.z808.p074;

/**
 * @author skwqy
 * @Created on 2020 01 2020-01-30 13:51
 */
public class Test074 {
    class Vehicle{
        int x;
        Vehicle(){
            this(10);
        }
        Vehicle(int x){
            this.x=x;
        }
    }

    class Car extends Vehicle{
        int y;
        Car(){
            super();
            //this(20);
        }
        Car(int y){
            this.y=y;
        }
        public String toString(){
            return super.x+": "+this.y;
        }
    }
}

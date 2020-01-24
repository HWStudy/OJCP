package com.skwqy.ocjp.z808.p024;

class Square extends Shape{
        public Square(){
            super();
        }

        public Square(String lable){
            System.out.println("Square:constructor");
        }

        public void foo(){
            super.foo();
        }

        public void foo(String lable){
            System.out.println("Square:foo");
        }
    }
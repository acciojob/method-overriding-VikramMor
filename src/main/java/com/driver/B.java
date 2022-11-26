package com.driver;

public class B extends A {

    String meth(){

        A a = new A();
        System.out.println(a.meth());
        return "Method is overridden in Extendend class B";
    }
}

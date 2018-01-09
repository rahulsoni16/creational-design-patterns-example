package com.techprimers.designpatterns.singleton;

public class SingletonExample {

    public static void main(String[] args) {

        SingletonNew instance = SingletonNew.getInstance();
        System.out.println(instance);
        SingletonNew secondInstance = SingletonNew.getInstance();
        System.out.println(secondInstance);

        /*
        Examples of Singleton in general usage:

        1. Runtime.getRuntime()
        2. Spring Beans
        3. Logger
         */

    }
}

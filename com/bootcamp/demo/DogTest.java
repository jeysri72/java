package com.bootcamp.demo;

public class DogTest {
    public static void main (String[] args){
        Dog pug = new Dog("Puggy", "short");
        Dog germanShepared = new Dog ("GS");



        System.out.println(pug.getId());
        System.out.println(pug.getName());

        System.out.println(pug.getTailType());



        System.out.println(germanShepared.getId());
        System.out.println(germanShepared.getName());

        System.out.println(germanShepared.getTailType());
        germanShepared.setTailType("Long");
        System.out.println(germanShepared.getTailType());

    }
}

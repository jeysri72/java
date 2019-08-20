package com.bootcamp.demo;

import com.bootcamp.demo.Animal;

public class Dog extends Animal {
    public String getTailType() {
        return tailType;
    }

    public void setTailType(String tailType) {
        this.tailType = tailType;
    }

    String tailType;
    public Dog(String name){
        super(name);
    }

    public Dog(String name, String tailType){
        super(name);
        this.tailType = tailType;
    }
}

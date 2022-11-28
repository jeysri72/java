package com.acwd.pfs.fc2.interfaces;

public abstract class Animal {
    static int counter = 1;
    // Instance variables also known as Data Member
    private int id;
    private String name;

    public Animal(String name){
        this.name = name;
        this.id = counter;
        ++id;
    }
    // getter & setter are known as Data Member Functions
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void makeSound();
}

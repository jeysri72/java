package com.acwd.pfs.fc2.interfaces;

public class Cow extends Animal implements  Herbivore{

    public Cow(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Ma");
    }

    @Override
    public void eatPlants() {
        System.out.println("Eats Plants");
    }
}

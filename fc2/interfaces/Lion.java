package com.acwd.pfs.fc2.interfaces;

public class Lion extends Animal implements Carnivore {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }

    @Override
    public void eatMeats() {
        System.out.println("Eats Meat");
    }
}

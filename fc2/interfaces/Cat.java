package com.acwd.pfs.fc2.interfaces;

public class Cat extends Animal implements Herbivore, Carnivore{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void eatMeats() {
        System.out.println("Eat Meats");
    }

    @Override
    public void eatPlants() {
        System.out.println("Eat Plants");
    }
}

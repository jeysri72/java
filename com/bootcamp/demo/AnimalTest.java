package com.bootcamp.demo;



public class AnimalTest {
    public static void main (String[] args){
        Animal cat = new Animal("Blacky");
        Animal dog = new Animal( "Buldog");
        Animal rabbit = new Animal ( "Sweetie");
        //System.out.println(cat.name);




        System.out.println(dog.getId());
        System.out.println(dog.getName());
        System.out.println(dog.getAnimalId());

        dog.setName("Doggy");
        System.out.println(cat.getId());
        System.out.println(cat.getName());
        System.out.println(cat.getAnimalId());
        System.out.println(dog.getId());
        System.out.println(dog.getName());
        System.out.println(dog.getAnimalId());
        System.out.println(rabbit.getId());
        System.out.println(rabbit.getName());
        System.out.println(rabbit.getAnimalId());



    }
}

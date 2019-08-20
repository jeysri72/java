package com.bootcamp.demo;

public class Animal {
    static int animalId = 1;
    private int id;
    private String name;

    public  Animal(String pName){

        this.id = animalId;
        this.name = pName;
        animalId++; //animalId = animalId +1
    }

    public  Animal(int pid, String pName){

        this.id = animalId;
        this.name = pName;
        animalId++; //animalId = animalId +1
    }



    public int getId() {
        return id;
    }
/*
    public void setId(int id) {
        this.id = id;
    }
*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnimalId(){
        return animalId;
    }
}

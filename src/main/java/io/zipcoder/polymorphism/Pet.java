package io.zipcoder.polymorphism;

public abstract class Pet {
    // my class variables
    private String name;

    // Constructor
    public Pet(){
        this("");
    }
    public Pet(String name){
        this.name = name;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public abstract String speak();
}

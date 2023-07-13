package io.zipcoder.polymorphism;

public class Cat extends Pet{

    // Constructors
    public Cat(){
        super("Nyan");
    }
    public Cat(String name){
        super(name);
    }

    public String speak() {
        return "meow";
    }
}

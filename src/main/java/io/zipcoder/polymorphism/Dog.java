package io.zipcoder.polymorphism;

public class Dog extends Pet{

    // Constructors
    public Dog(){
        super("Snoop");
    }
    public Dog(String name){
        super(name);
    }

    public String speak() {
        return "woof";
    }
}

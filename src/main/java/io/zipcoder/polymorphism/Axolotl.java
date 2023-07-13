package io.zipcoder.polymorphism;

public class Axolotl extends Pet{

    // Constructors
    public Axolotl(){
        super("Issac");
    }
    public Axolotl(String name){
        super(name);
    }

    public String speak() {
        return "blub";
    }
}

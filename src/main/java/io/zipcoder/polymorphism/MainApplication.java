package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args){
        // the part 1 code
//        HashMap<String, String> listOfPets = askForPets();
//        if(!listOfPets.isEmpty()) {
//            printOut(listOfPets);
//        }

        // the part 3 version of that code
        Pet[] listOfPets = askForPets3();
        if(listOfPets.length != 0) {
            printOut(listOfPets);
        }
    }

    private static void printOut(Pet[] pets) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nYou own %d pets.", pets.length));
        for(Pet p : pets){
            sb.append(String.format("\nYou own %s that says %s when it speaks.", p.getName(), p.speak()));
        }

        System.out.println(sb.toString());
    }

    private static Pet[] askForPets3(){
        Scanner in = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();

        // ask for user input
        System.out.print("\nHow many pets do you have? ");
        int numOfPets = in.nextInt();
        in.nextLine();

        // declaring some temporary variables
        Pet p;
        int counter = 0;

        if(numOfPets <= 0){
            System.out.println("\nRIP you don't have pets :(");
        }
        while(counter < numOfPets){
            p = null;
            System.out.print("\nWhat kind of pet do you have? ");
            String tempType = in.nextLine();

            System.out.printf("What\'s your pet\'s name? ");
            String tempName = in.nextLine();

            switch (tempType.toLowerCase()){
                case "cat":
                    p = new Cat(tempName);
                    break;
                case "dog":
                    p = new Dog(tempName);
                    break;
                case "axolotl":
                    p = new Axolotl(tempName);
                    break;
                default:
                    System.out.println("\nInvalid Pet Type! Try again!");
            }
            if(p != null) {
                pets.add(p);
                counter++;
            }
        }
        return pets.toArray(new Pet[pets.size()]);
    }

    // part 1 methods
    private static void printOut(HashMap<String, String> pets) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nYou own %d number of pets.\nYou own ", pets.size()));
        for(String key : pets.keySet()){
            sb.append(String.format("a %s %s, ", pets.get(key), key));
        }
        sb.deleteCharAt(sb.lastIndexOf(","));

        System.out.println(sb.toString());
    }

    private static HashMap<String, String> askForPets(){
        Scanner in = new Scanner(System.in);
        // ask for user input
        System.out.print("\nHow many pets do you have? ");
        int numOfPets = in.nextInt();
        in.nextLine();
        String tempType;
        String tempName;
        HashMap<String, String> pets = new HashMap<>();

        if(numOfPets <= 0){
            System.out.println("\nRIP you don't have pets :(");
        }
        for(int i = 0; i < numOfPets; i++){
            System.out.print("\nWhat kind of pet do you have? ");
            tempType = in.nextLine();

            System.out.printf("What\'s your pet\'s name? ");
            tempName = in.nextLine();

            pets.put(tempName, tempType);
        }
        return pets;
    }
}

package io.zipcoder.polymorphism;

import java.util.HashMap;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args){
        HashMap<String, String> listOfPets = askForPets();
        if(!listOfPets.isEmpty()) {
            printOut(listOfPets);
        }
    }

    private static void printOut(HashMap<String, String> listOfPets) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nYou own %d number of pets.\nYou own ", listOfPets.size()));
        for(String key : listOfPets.keySet()){
            sb.append(String.format("a %s %s, ", listOfPets.get(key), key));
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

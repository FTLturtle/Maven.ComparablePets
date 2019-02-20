package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Application {
    private ArrayList<Pet> pets;
    IOConsole ioConsole = new IOConsole();

    public Application() {
        this.pets = askForPets();
    }

    public Application(Pet... pets){
        ArrayList<Pet> petArrayList = new ArrayList<Pet>(Arrays.asList(pets));
        Collections.sort(petArrayList);
        this.pets = petArrayList;
    }

    private ArrayList<Pet> askForPets() {
        ArrayList<Pet> petArrayList = new ArrayList<>();

        int numPets = ioConsole.getIntegerInput("How many pets do you have?");

        fillPetArrayList(numPets, petArrayList);

        return petArrayList;
    }

    private void fillPetArrayList(int numPets, ArrayList<Pet> petArrayList) {
        for (int i = 1; i <= numPets; i++) {

            String name = ioConsole.getStringInput("What is pet %d's name?", i);
            String petType = ioConsole.getStringInput("Is %s a 'dog', 'cat', or 'mouse'?", name).toLowerCase();

            while (!petType.equals("dog") && !petType.equals("cat") && !petType.equals("mouse")) {
                petType = ioConsole.getStringInput("Error: Please enter 'dog', 'cat', or 'mouse'.").toLowerCase();
            }

            Pet newPet = null;
            switch (petType) {
                case "dog":
                    newPet = new Dog(name);
                    break;
                case "cat":
                    newPet = new Cat(name);
                    break;
                case "mouse":
                    newPet = new Mouse(name);
            }

            petArrayList.add(newPet);
        }

        Collections.sort(petArrayList);
    }

    void listPets() {
        for (Pet p : this.pets) {
            ioConsole.println("%s: %s", p.getName(), p.speak());
        }
    }

    public static void start() {
        Application application = new Application();
        application.listPets();
    }

}
